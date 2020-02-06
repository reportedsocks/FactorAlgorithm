package com.reportedsocks.factoralgorithm

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val x = 289372918
    Log.d("Result", "The multipliers of $x are: ${factor(x)}")
  }
}
