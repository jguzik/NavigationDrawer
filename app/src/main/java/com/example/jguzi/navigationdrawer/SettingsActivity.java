package com.example.jguzi.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ArrayList<SettingsActivity> settings = new ArrayList<>();



        Toast.makeText(SettingsActivity.this, "settings panel",Toast.LENGTH_SHORT).show();
    }
}
