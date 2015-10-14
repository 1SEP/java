package kotlin.examples

data class User(val name: String, val age: Int)

class NotUser(val name: String, val age: Int)

fun main(args: Array<String>) {
    val  ildar = User("Ildar", 23)
    println(ildar)
    println(ildar.hashCode())

    val notUser = NotUser("fwq", 2)
    println(notUser)

}
