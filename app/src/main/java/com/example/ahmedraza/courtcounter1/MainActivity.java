package com.example.ahmedraza.courtcounter1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int s1 = 0;
    int s2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset1(View v) {
        s1 = 0;
        s2 = 0;
        TextView scoreView = (TextView) findViewById(R.id.sa);
        scoreView.setText(String.valueOf(s1));

        TextView scoreView1 = (TextView) findViewById(R.id.sb);
        scoreView1.setText(String.valueOf(s2));

    }

    public void add3toa(View v) {
        s1 += 3;
        TextView scoreView = (TextView) findViewById(R.id.sa);
        scoreView.setText(String.valueOf(s1));


    }

    public void add2toa(View v) {
        s1 += 2;
        TextView scoreView = (TextView) findViewById(R.id.sa);
        scoreView.setText(String.valueOf(s1));

        //  TextView tf = new (TextView)findViewById(R.Layout.id.sa);

    }

    public void add1toa(View v) {
        s1++;
        TextView scoreView = (TextView) findViewById(R.id.sa);
        scoreView.setText(String.valueOf(s1));
        // TextView tf = new (TextView)findViewById(R.Layout.id.sa);

    }

    public void add3tob(View v) {
        s2 += 3;
        TextView scoreView1 = (TextView) findViewById(R.id.sb);
        scoreView1.setText(String.valueOf(s2));
        // TextView tf = new (TextView)findViewById(R.Layout.id.sa);

    }

    public void add2tob(View v) {
        s2 += 2;
        TextView scoreView1 = (TextView) findViewById(R.id.sb);
        scoreView1.setText(String.valueOf(s2));

        // TextView tf = new (TextView)findViewById(R.Layout.id.sa);

    }

    public void add1tob(View v) {
        s2++;
        TextView scoreView1 = (TextView) findViewById(R.id.sb);
        scoreView1.setText(String.valueOf(s2));
    }
}