package com.example.zhivototekrug3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;


public class Adult extends AppCompatActivity implements View.OnClickListener{


    private Button addNewActivity, viewActivities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult);

        addNewActivity = findViewById(R.id.addActivity);
        addNewActivity.setOnClickListener(this);

        viewActivities = findViewById(R.id.viewActivity);
        viewActivities.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.addActivity:
                startActivity(new Intent(this, AdultAdd.class));
                break;
            case R.id.viewActivity:
                startActivity(new Intent(this, AdultView.class));
                break;
        }
    }


    public void logout(android.view.View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }
}