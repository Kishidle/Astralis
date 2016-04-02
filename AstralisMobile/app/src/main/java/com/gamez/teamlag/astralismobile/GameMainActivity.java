package com.gamez.teamlag.astralismobile;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameMainActivity extends AppCompatActivity {

    TextView bombConfig;
    TextView touchSens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);

//        boolean parentExplorerPref = sharedPreferences
//                .getBoolean(PARENT_EXPLORER_PREFERENCE, true);
        setContentView(R.layout.game_main);

        bombConfig = (TextView)findViewById(R.id.bombConfigTxt);
        bombConfig.setText(sharedPreferences.getString("bombconfig", "DefaultValue"));
        touchSens = (TextView)findViewById(R.id.touchSensTxt);
        touchSens.setText(sharedPreferences.getString("touchsens", "DefaultValue"));
    }

    public void exitApp(View view){
        ((Activity)this).finish();
    }
}
