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
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myplaylist.FragmentPage1
import com.example.myplaylist.FragmentPage2
import com.example.myplaylist.FragmentPage3

class FragmentPage3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_page_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}