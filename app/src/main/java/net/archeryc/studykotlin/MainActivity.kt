package net.archeryc.studykotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_basic.setOnClickListener { startActivity(Intent(this,BasicActivity::class.java)) }
    }

}

    fun CLog(msg: String){

    }