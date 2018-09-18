package edu.temple.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    //create button
    private Button buttonA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        //change title
        setTitle("Activity A");

        //set buttons context
        buttonA = findViewById(R.id.buttona);

        //create Intent
        final Intent myIntent = new Intent(this, ActivityB.class);

        //set on click
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start activity
                ActivityA.this.startActivity(myIntent);

            }
        });
    }
}
