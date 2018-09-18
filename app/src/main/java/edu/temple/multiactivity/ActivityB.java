package edu.temple.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    //create button
    private Button buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        //change title
        setTitle("Activity B");

        //create intent
        final Intent myIntent = new Intent(this, ActivityA.class);

        //set buttons context
        buttonB = findViewById(R.id.buttonb);

        //create on click for button
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start activity
                ActivityB.this.startActivity(myIntent);

            }
        });
    }
}
