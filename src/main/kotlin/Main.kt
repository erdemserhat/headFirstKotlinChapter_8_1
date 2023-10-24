import jdk.jshell.spi.ExecutionControl.ExecutionControlException
import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.IllegalArgumentException
import javax.swing.text.BadLocationException

fun main(args: Array<String>) {

    //Setting default values for null values by using if expression

    data class Password(
        val passwordTitle: String? = "Example Password Title",
        val passwordContent: String? = "Example Password Content"
    )

    var myInstagramPassword: Password? = Password("Instagram", "abcdefgh")

   // myInstagramPassword = null
    var a = if (myInstagramPassword != null) myInstagramPassword.passwordTitle else "12345"
    //This is like saying, if myInstagramPassword is not null ;
    //return myInstagramPassword.passwordTitle property
    //otherwise return "12345"
    //because myInstagramPassword is null, a is going to be assigned "12345"
    println(a)

    //Let's do the same thing by using Elvis operator

    println(myInstagramPassword?.passwordContent?:"it was null")
    //It is like saying if myInstagramPassword is not null and
    //myInstagramPassword.passwordContent is not null return its value
    //otherwise returns "it was null"
    //it does same thing the code below;
    println(if (myInstagramPassword!=null && myInstagramPassword.passwordContent!=null )
        myInstagramPassword.passwordContent else "it was null"
    )
    //*   myInstagramPassword?.passwordContent?:"it was null"
    //Basically  The Elvis Operator ?: is a safe version of an if expression.
    //It returns the value of its left if that is not null. [myInstagramPassword.passwordContent]
    //Otherwise , it returns the value on its right. ["it was null"]

    data class Person(
        val name:String?,
        val surname:String?
    )
    val person:Person?=Person("Ali","Erdem")

    var name:String?

    //if person and person's name are not null assign person's name property (it) to name variable
    person?.name?.let {
        name=it
    }

    //NOT-NULL ASSERTION OPERATOR
    //The !! operator deliberately throws a NullPointerException
    //it is a good tool to test your code

    var x:String?=null
    //It is clear that x variable refers nothing so it is null.
    //and of course, if you want to call a function of null object
    //compiler gets upset like this;
   // println(x.length)

    //But if you want to take responsibility of error you can assert it is not null
    //by using not-null assertion operator (!!)

    //println(x!!.length)
    //So because it is null you are going to see NullPointerException
    val q: Nothing? =null


    fun fail():Nothing{
        throw Exception("12")
    }

    //Important Notes;
    //If there is a error in try block below code after the error will not be tried..
    //finally block will be work whether there is an exception or not.


/**

    try{
        var a:Int?=1/0

    }catch (ex:ArithmeticException){
        ex.printStackTrace()
    }finally {
        System.err.println("Finally block has been started")
    }
    */

    //as? keyword

    data class MyPerson(
    var name:String?,
    val surname:String,
    val age:Int
    )


    var myPerson:MyPerson? = MyPerson("Serhat","Erdem",22);

    //In the below code, we make a type casting error intentionally

    var myName:String?= myPerson as? String?
    //this is like saying if myPerson is String then return myPerson
    //but if it is not, return null...

  //If
    fun exampleFun(x:Int){
        if( x !in 0..100){
            println(x)
        }
    }

    exampleFun(1212)


    myPerson?.name=null
    try {

        //Super :)
        var myStringVariable:String?=myPerson?.name?:throw IllegalArgumentException("Error.....")
    }catch (ex:IllegalArgumentException){
        ex.printStackTrace()
    }finally {
        println("executed")
    }


























}