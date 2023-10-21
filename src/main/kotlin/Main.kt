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






}