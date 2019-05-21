package com.apps.kunalfarmah.kunalfarmah;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class second_screen extends AppCompatActivity {

    private TextView mTextMessage;
    private FrameLayout upper,lower;
    private LinearLayout welcome;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    welcome.setVisibility(View.VISIBLE);
                    upper.setVisibility(View.GONE);
                    lower.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_dashboard:
                    welcome.setVisibility(View.GONE);
                    setFragments();
                    return true;
                case R.id.navigation_notifications:
                    finish();
                    startActivity(new Intent(second_screen.this, LoginActivity.class));
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        getSupportActionBar().setTitle("Kunal Farmah");

        upper= findViewById(R.id.upper_frag);
        lower = findViewById(R.id.lower_frag);
        welcome =  findViewById(R.id.message);

        upper.setVisibility(View.GONE);
        lower.setVisibility(View.GONE);

        Upper img= new Upper();
        Lower info = new Lower();

        getSupportFragmentManager().beginTransaction().replace(R.id.upper_frag,img).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.lower_frag,info).commit();

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void setFragments(){

        upper.setVisibility(View.VISIBLE);
        lower.setVisibility(View.VISIBLE);

    }

}
