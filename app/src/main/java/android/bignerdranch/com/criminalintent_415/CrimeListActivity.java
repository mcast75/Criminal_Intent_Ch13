package android.bignerdranch.com.criminalintent_415;

import android.support.v4.app.Fragment;


public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
