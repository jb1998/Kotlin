fun main(args : Array<String>)
{
      var s=Student(23,"jatin")
    println(s.a)
}
class Student(a : Int)
{
    var a:Int=0
    init {
        println(a)
    }
    constructor(a:Int,b :String):this(10){
      println(b)
        this.a=a;
    }
}