fun main(args : Array<String>){

    var a=helper()
    a+=8;
    print(a)

    var obj=student()
            println("${obj.rollno}" + " ${obj.str}"+" ${obj.student()}")

}
fun helper(): Int{
    var a=10
    return a
}
class student{
    var rollno=10
    var str=45
   fun student(){
      println("constructor executed")
   }

}