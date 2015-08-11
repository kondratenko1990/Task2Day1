package com.example.android.task2day1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btnTime;
    private Button btnDate;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = (Button) findViewById(R.id.btnTime);
        btnDate = (Button) findViewById(R.id.btnDate);
    }

    public void onClickShowTime(View v){
        intent = new Intent("showtime");
        startActivity(intent);
    }

    public void onClickShowDate(View v){
        intent = new Intent("showdate");
        startActivity(intent);
    }
}
