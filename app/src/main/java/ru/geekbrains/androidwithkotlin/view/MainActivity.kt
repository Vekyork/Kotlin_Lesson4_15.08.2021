package ru.geekbrains.androidwithkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.geekbrains.androidwithkotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}