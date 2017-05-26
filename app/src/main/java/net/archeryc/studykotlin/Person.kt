package net.archeryc.studykotlin

/**
 * 一句话功能简述
 * 功能详细描述
 * @author 杨晨 on 2017/5/26 16:16
 * @e-mail 247067345@qq.com
 * @see [相关类/方法](可选)
 */
class Person(val name: String) {

    init {
        println("name is $name")
    }

    constructor(name: String, parent: Person) : this(name) {
        println("次构造函数")
    }
}