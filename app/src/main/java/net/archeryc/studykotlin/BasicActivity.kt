package net.archeryc.studykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basic.*

class BasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)
        btn_fun_1.setOnClickListener { btn_fun_1.text = sum(2, 3).toString() }
        btn_fun_2.setOnClickListener { printSum(2,3) }
    }

    /**
     * 参数名称：参数类型
     * 返回值名称：参数类型
     * return 返回值
     * 表达式为函数体时返回值自动推断
     */
    fun sum(a: Int, b: Int) = a + b

    /**
     * 输出String中的值用$+参数名，$+{表达式}
     */
    fun printSum(a: Int,b: Int){
        println("sum of $a and $b is ${a+b}")
    }

}
