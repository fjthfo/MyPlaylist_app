package com.example.myplaylist

import android.view.LayoutInflater
import android.os.Bundle
import com.example.myplaylist.R
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.content.Intent
import com.example.myplaylist.RegisterPage
import android.widget.Toast
import com.example.myplaylist.MainActivity
import org.json.JSONException
import com.example.myplaylist.LoginRequest
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.android.volley.toolbox.StringRequest
import com.android.volley.AuthFailureError
import android.widget.LinearLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.myplaylist.MainActivity.TabSelectedListener
import android.annotation.SuppressLint
import android.view.MenuItem
import com.example.myplaylist.FragmentPage1
import com.example.myplaylist.FragmentPage2
import com.example.myplaylist.FragmentPage3

class MainActivity : AppCompatActivity() {




    val TAG = this.javaClass.simpleName
    private var home_ly: LinearLayout? = null
    private var bottomNavigationView: BottomNavigationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init() //객체 정의
        SettingListener() //리스너 등록

        //맨 처음 시작할 탭 설정
        bottomNavigationView!!.selectedItemId = R.id.item_fragment1
    }

    private fun init() {
        home_ly = findViewById(R.id.home_ly)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
    }

    private fun SettingListener() {
        //선택 리스너 등록
        bottomNavigationView!!.setOnItemSelectedListener(TabSelectedListener())
    }

    internal inner class TabSelectedListener :
        BottomNavigationView.OnNavigationItemSelectedListener {
        @SuppressLint("NonConstantResourceId")
        override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
            when (menuItem.itemId) {
                R.id.item_fragment1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.home_ly, FragmentPage1())
                        .commit()
                    return true
                }
                R.id.item_fragment2 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.home_ly, FragmentPage2())
                        .commit()
                    return true
                }
                R.id.item_fragment3 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.home_ly, FragmentPage3())
                        .commit()
                    return true
                }
            }
            return false
        }
    }
}