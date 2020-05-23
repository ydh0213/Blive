package com.makeus.blive.src;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.makeus.blive.R;
import com.makeus.blive.src.tab_home.HomeFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setView();

        // TODO: test code. Remove it later
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        Log.d("BLIVE", "density: " + metrics.density);
        Log.d("BLIVE", "densityDpi: " + metrics.densityDpi);
    }

    private void setView() {
        BottomNavigationView botNav = findViewById(R.id.main_bot_nav);
        botNav.setItemIconTintList(null);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_frame_layout_main_screen,
                HomeFragment.newInstance()).commitAllowingStateLoss();

        botNav.setOnNavigationItemSelectedListener(new MainBotNavItemSelectedListener());
    }

    private class MainBotNavItemSelectedListener
            implements BottomNavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.item_home: {
                    transaction.replace(R.id.main_frame_layout_main_screen,
                            HomeFragment.newInstance()).commitAllowingStateLoss();
                    break;
                }
            }
            return true;
        }
    }
}
