package com.example.androiddogapp.view

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.androiddogapp.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }

}