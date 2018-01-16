fun main(args: Array<String>) {
    println(Abcd.a)
    println(Abcd.helper())
}
object Abcd{
    var a=10  //static
    fun helper():String{     //static
    return "jatin"
    }

}