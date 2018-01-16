fun main(args: Array<String>) {
    println(Abcd.a)
    println(Abcd.helper())
    print(Abcd.P.a)
}
object Abcd{
    var a=10  //static
    fun helper():String{     //static
    return "jatin"
    }
class P{
    companion object {
        var a=10  //static
        fun helper():String{     //static
            return "jatin"
        }
    }

}
}