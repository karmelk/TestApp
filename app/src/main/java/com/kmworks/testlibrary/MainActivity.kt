package com.kmworks.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kmworks.mylibrary.TestClassForUpdate
import com.kmworks.mylibrary.aaaaaaaa

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestClassForUpdate()
    }
}