package net.archeryc.studykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basic.*

class BasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)
        btn_fun_1.setOnClickListener { btn_fun_1.text = sum(2, 3).toString() }
        btn_fun_2.setOnClickListener { printSum(2, 3) }
        btn_fun_3.setOnClickListener { btn_fun_3.text = "max of 2 and 3 is ${maxof1(2, 3)}" }
        btn_fun_4.setOnClickListener { btn_fun_4.text = parseInt("a").toString() }
        btn_fun_5.setOnClickListener {
            val str = "yc12345"
            btn_fun_5.text = "$str length is ${getStringLength(str)} "
        }
        btn_fun_6.setOnClickListener { printList() }
        btn_fun_7.setOnClickListener { btn_fun_7.text = "Int 10 and Long 10 ${baseNumber()}" }
        btn_fun_8.setOnClickListener { printArray() }
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
    fun printSum(a: Int, b: Int) {
        val c = 3
        val d: Int = 4
        println("sum of $a + $b + $c + $d is ${a + b + c + d}")
    }

    /**
     * 条件语句 省略版
     */
    fun maxof(a: Int, b: Int) = if (a > b) a else b

    /**
     * 条件语句，与java类似
     */
    fun maxof1(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }


    /**
     * 空判断
     */
    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }


    /**
     * 自动类型转换
     * 在 is 判断为某一类型后，作用域内即为那种类型
     */
    fun getStringLength(obj: Any): Int? = if (obj is String) obj.length else null

    /**
     * for循环
     */
    fun printList() {
        val items = listOf("apple", "acfun", "bilibili")
        for (item in items) {
            println(item)
        }
        for (index in items.indices) {
            println(index)
        }
    }

    /**
     * kotlin中 Int和Long不能直接比较，必须先转换
     */
    fun baseNumber(): Boolean {
        val a: Int = 10
        val b: Long = 10
        return b.toInt() == a
    }

    fun printArray(){
        val array= arrayOf(1,2,3)
        for (a in array){
            println(a.toString())
        }
        println("array position 2 is ${array[1]}")
    }
}
