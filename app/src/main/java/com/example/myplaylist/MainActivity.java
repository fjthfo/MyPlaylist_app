package com.example.myplaylist;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
public class MainActivity extends AppCompatActivity {
    final String TAG = this.getClass().getSimpleName();

    LinearLayout home_ly;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init(); //객체 정의
        SettingListener(); //리스너 등록

        //맨 처음 시작할 탭 설정
        bottomNavigationView.setSelectedItemId(R.id.item_fragment1);
    }

    private void init() {
        home_ly = findViewById(R.id.home_ly);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
    }

    private void SettingListener() {
        //선택 리스너 등록
        bottomNavigationView.setOnItemSelectedListener(new TabSelectedListener());
    }

    class TabSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @SuppressLint("NonConstantResourceId")
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.item_fragment1: {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.home_ly, new FragmentPage1())
                            .commit();
                    return true;
                }
                case R.id.item_fragment2: {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.home_ly, new FragmentPage2())
                            .commit();
                    return true;
                }
                case R.id.item_fragment3: {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.home_ly, new FragmentPage3())
                            .commit();
                    return true;
                }
            }

            return false;
        }
    }
}