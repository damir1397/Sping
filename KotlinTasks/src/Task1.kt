class Task1{
    fun main(args:Array<String>){

    }

}
open class Task2{
    fun sub(num:Int,num2:Int):Int{
        return num-num2
    }
    fun pluss( num:Int,num2: Int):Int{
        return num+num2
    }
    fun mul( num:Int,num2: Int):Int{
        return num*num2
    }
    fun del( num:Int,num2: Int):Int{
        return num/num2
    }

}
interface Add{
    fun calculator();
}
class Col:Add{
    override fun calculator() {

    }


}