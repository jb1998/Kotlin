@file:JvmName("Kotlinfile")

fun main(args: Array<String>) {
//var obj=Java_kotlin();
    println(Java_kotlin.rectangle_java(5,9))
}
fun kotlin_rectangle(a:Int , b:Int) : Int{
    println("kotlin function")
    return a*b;
}