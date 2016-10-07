/*
* lab05- Intents
*
* @author: Emmanuel Boye
* @version: Fall 2017
*
 */

package com.example.franksowah.lab04;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class lab04 extends AppCompatActivity {

    private SharedPreferences prefs;
    private boolean preference = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab04);
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        showPreferences();

    }

    private void showPreferences() {
        TextView preferenceTextView = (TextView) findViewById(R.id.preferenceTextView);
        preferenceTextView.setText("Preference: " + prefs.getBoolean("preference", false));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_menu_lab04, menu);
        return true;
    }

    @Override
    public void onPause() {
        //save th instance variables
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("preference", preference);
        editor.commit();
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        preference = prefs.getBoolean("preference", false);
        showPreferences();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    // swtich statement using intents to switch to new activity
        switch (item.getItemId()) {
            case R.id.menu_about:
                Intent intent = new Intent(lab04.this, AboutUSActivity.class);
                startActivity(intent);
                return true;
            case R.id.menu_settings:
                Intent intent1 = new Intent(lab04.this, SettingsActivity.class);
                startActivity(intent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
