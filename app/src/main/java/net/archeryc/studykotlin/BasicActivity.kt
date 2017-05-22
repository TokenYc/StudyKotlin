package net.archeryc.studykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basic.*

class BasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)
        btn_fun.setOnClickListener { btn_fun.text=sum(2,3).toString() }
    }

    fun sum(a: Int, b: Int): Int {
        var c=a+b
        return c
    }

}
