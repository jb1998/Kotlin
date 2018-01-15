import java.util.*

fun main(args: Array<String>) {
    var sc=Scanner(System.`in`)
    var a=sc.nextInt()
    var b=sc.nextInt()
    var ans=if(a>b)
             {
                  "a is greater"
             }else{
         "b is greater"
    }
    print(ans)

   var ans2= when(a){
        1 ->"a is one"
        2 ->"a is two"
       else ->{
           "a is >=3"
       }
    }
    print(ans2)
}