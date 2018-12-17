fun main(args: Array<String>) {
    var obj1=Abc(45,"jatin")
    var obj2=Abc(45,"jatin")
    if(obj1==obj2){
        println("equal")
    }
    println(obj1)
    println(obj2)

    var obj=obj1.copy(b="jatin bindra")
  println(obj)

    var obj11=Abc2(45,"jatin")
    var obj22=Abc2(45,"jatin")
    if(obj11==obj22){
        println("equal")
    }
    println(obj11)
    println(obj22)
}
data class Abc(var a:Int,var b:String){

}
class Abc2(var a:Int,var b:String){

}
