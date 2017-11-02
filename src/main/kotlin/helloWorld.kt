package hello

class Greeter() {
    fun sayHello(): String {
        return "Hello World!"
    }
}

fun main(args: Array<String>) {
    val greeter = Greeter()
    
    println(greeter.sayHello())
}