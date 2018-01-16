fun main(args : Array<String>){
var obj=Bmw()
    obj.colorbmw()
    obj.color()
    println(obj.speed)

}
 open class Car{
    var speed:Int=0
    var name:String=""

    fun color(){
        println("this is car class")
    }
}
class Bmw:Car(){
    var cost:Int=0;
    fun colorbmw(){
        println("this is bmw class")
      speed=23
    }
}