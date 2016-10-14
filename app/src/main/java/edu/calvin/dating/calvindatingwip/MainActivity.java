package edu.calvin.dating.calvindatingwip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


//This will eventually be the entire dating app.
public class MainActivity extends AppCompatActivity {

    @Override
    //Initialization
    protected void onCreate(Bundle savedInstanceState) {
        //Show the app as it was last time
        super.onCreate(savedInstanceState);
        //Display the app
        setContentView(edu.calvin.dating.calvindatingwip.R.layout.activity_main);

        //This is supposed to get the user name and show it on the mainactivity
        String username = getIntent().getStringExtra("USERNAME");
        TextView view = (TextView) findViewById(edu.calvin.dating.calvindatingwip.R.id.nameTextView);
        view.setText(username);
    }
}