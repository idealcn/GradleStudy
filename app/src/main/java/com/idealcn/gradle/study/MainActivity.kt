package com.idealcn.gradle.study

import android.content.Context
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val tvVersionName = findViewById<TextView>(R.id.tvVersionName)

        val packageInfo =
            packageManager.getPackageInfo(packageName,0)

        tvVersionName.text = packageInfo.versionName
    }
}
