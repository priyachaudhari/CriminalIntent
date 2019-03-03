package com.bignerdranch.android.crimeapp;

import android.support.v4.app.Fragment;

import com.bignerdranch.android.crimeapp.SingleFragmentActivity;

public class CrimeListActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
