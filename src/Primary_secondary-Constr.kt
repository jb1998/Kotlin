fun main(args: Array<String>) {
var obj=B("classA","classB")

}
open class A(name : String){
init {
    println(name)
}
}
class B(name: String,name2: String):A(name){
init {
    println(name2)
}
}