/*
* lab05- Intents
*
* @author: Emmanuel Boye
* @version: Fall 2017
*
 */

package com.example.franksowah.lab04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class lab04 extends AppCompatActivity {

    Menu mainMenu = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab04);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_menu_lab04, menu);
        mainMenu = menu;
        return true;
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
