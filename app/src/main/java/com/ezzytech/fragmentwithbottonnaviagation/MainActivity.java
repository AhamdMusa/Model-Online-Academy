package com.ezzytech.fragmentwithbottonnaviagation;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.ezzytech.fragmentwithbottonnaviagation.fragments.DashboardFragment;
import com.ezzytech.fragmentwithbottonnaviagation.fragments.HomeFragment;
import com.ezzytech.fragmentwithbottonnaviagation.fragments.ProfileFragment;
import com.ezzytech.fragmentwithbottonnaviagation.fragments.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;
    private ActionBar toolbar;

    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        toolbar.setTitle("Home");



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.navigation_home:
                        toolbar.setTitle("Courses Length");
                        HomeFragment homeFragment = new HomeFragment();
                        loadFragment(homeFragment);
                     //   Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.navigation_dashboard:
                        toolbar.setTitle("Category");
                        DashboardFragment dashboardFragment = new DashboardFragment();
                        loadFragment(dashboardFragment);
                     //   Toast.makeText(MainActivity.this, "Dashboard", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.navigation_notifications:
                        toolbar.setTitle("Exam");
                        SettingFragment settingFragment = new SettingFragment();
                        loadFragment(settingFragment);
                    ///    Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.profile:
                        toolbar.setTitle("Profile");
                        ProfileFragment profileFragment = new ProfileFragment();
                        loadFragment(profileFragment);
                       // Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        return true;

                }
                return false;
            }
        });
    }

    private void init() {
        toolbar = getSupportActionBar();
        bottomNavigationView = findViewById(R.id.nav_view);
        frameLayout = findViewById(R.id.frame_container);
    }

    public void loadFragment(Fragment fragment) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.frame_container, fragment);
        ft.commit();
    }

}
