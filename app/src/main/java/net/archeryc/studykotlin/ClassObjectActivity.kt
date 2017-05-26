package net.archeryc.studykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_class_object.*

class ClassObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_object)
        btn_1.setOnClickListener {
            var person = Person("yangchen")
        }
    }
}
