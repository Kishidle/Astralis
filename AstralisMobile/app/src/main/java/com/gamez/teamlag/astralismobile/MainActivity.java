package com.gamez.teamlag.astralismobile;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.preference.PreferenceFragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Intent settings = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);
    }

    public void viewSettings(View view){
//          getFragmentManager().beginTransaction()
//                  .replace(android.R.id.content,
//                          new MainSettingsFragment()).commit();
        if(settings==null){
            settings = new Intent(this, SettingsActivity.class);
            startActivity(settings);
        }

    }

    public void launchGame(View view){
        Intent intent = new Intent(this, GameMainActivity.class);
        startActivity(intent);
    }

    public void exitApp(View view){
        ((Activity)this).finish();
    }
}
