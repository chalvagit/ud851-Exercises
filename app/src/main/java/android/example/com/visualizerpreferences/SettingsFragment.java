package android.example.com.visualizerpreferences;

import android.example.com.visualizerpreferences.R;
import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by DiTi on 2018-01-14.
 */

// COMPLETED (2) Create a class called android.example.com.visualizerpreferences.SettingsFragment that extends PreferenceFragmentCompat
public class SettingsFragment extends PreferenceFragmentCompat {

    // COMPLETED (5) In android.example.com.visualizerpreferences.SettingsFragment's onCreatePreferences method add the preference file using the
    // addPreferencesFromResource method
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
