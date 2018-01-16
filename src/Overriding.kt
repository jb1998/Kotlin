fun main(args: Array<String>) {
var obj=Bmw1()
    obj.color()
}
open class Car1{
    var speed:Int=0
    var name:String=""

  open  fun color(){
        println("this is car class")
    }
}
class Bmw1:Car1(){
    var cost:Int=0;
   override fun color(){
      super<Car1>.color()
        println("this is bmw class")
        speed=23
    }
}