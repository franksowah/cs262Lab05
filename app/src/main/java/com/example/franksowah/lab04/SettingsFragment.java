package com.example.franksowah.lab04;


import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by FrankSowah on 10/5/16.
 */
public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Load preferences from XML file
        addPreferencesFromResource(R.xml.preferences);
    }
}
