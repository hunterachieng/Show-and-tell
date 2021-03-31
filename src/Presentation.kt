import java.util.*

fun main (){
condition("Hunter",24)
    arrays()
    println(Arrays.toString(studentAges(20,30,12,24,19)))
    //objects created from a class template
    var ochiengs = FamilyMembers("Synthia Hunter",24,"student","female")
    println(ochiengs.birthYear(2021))
    ochiengs.movingOut()
    ochiengs.aboutMe()
}
//Using conditions with operators
fun condition (name:String,age:Int){
if (name == name && age >= 18){
    println("You are an adult")
}else {
    println("Please stay at home")
}
}
// arrays and inbuilt array methods
fun arrays (){
    var items = arrayOf(34,"Mother", "k",4.56,7.6f)
    println(items.get(0))
    println(items.indexOf(7.6f))
    //setting new value at specified index
    items.set(2,"t")
    println(Arrays.toString(items))
    //adding a new element into an array
    var newItems = items.plus("Sister")
    println(Arrays.toString(newItems))
    //looping through an array
    for (item in items){
        println(item)
    }
}
//returning arrays
fun studentAges (age1:Int,age2:Int, age3:Int, age4:Int, age5:Int):Array<Int>{
    return arrayOf(age1,age2,age3,age4,age5)
    }
class FamilyMembers (var intro:String,var ages:Int, var occupation:String,var gender:String){
    //behavior functions within a class
    fun birthYear(year:Int):Int{
        var birthday =year - ages
        return birthday
    }
    fun movingOut(){
        if (gender == "female"){
            println("Stay home until married")
        }
        else{
            println("Move out by 20")
        }
    }
    fun aboutMe(){
        println("I am $intro aged $ages years old. Currently, I am a $occupation." )
    }
}