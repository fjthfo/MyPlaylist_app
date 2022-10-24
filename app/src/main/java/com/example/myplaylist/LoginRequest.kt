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
import com.android.volley.Response
import com.example.myplaylist.FragmentPage1
import com.example.myplaylist.FragmentPage2
import com.example.myplaylist.FragmentPage3
import java.util.HashMap

class LoginRequest(userID: String, userPassword: String, listener: Response.Listener<String?>?) :
    StringRequest(
        Method.POST, URL, listener, null
    ) {
    private val map: MutableMap<String, String>

    init {
        map = HashMap()
        map["userID"] = userID
        map["userPassword"] = userPassword
    }

    @Throws(AuthFailureError::class)
    override fun getParams(): Map<String, String>? {
        return map
    }

    companion object {
        private const val URL = "http://fjthfo.ivyro.net/Login.php"
    }
}