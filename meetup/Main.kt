package meetup

class Foo {
    fun hello() = "hello from Foo"
}

object Bar {
    init{
        println("Bar is constructed")
    }

    fun hello() = "hello from Bar"
}

class DataClass(val bar: String)

class NullableTypes {
    val nullableString: String? = "qwer"
    fun cat(a: String, b: String): String = a + b
}

fun main(args: Array<String>) {
    println("Hello World!")

    var foo = Foo()
    println(foo.hello())
    println(Bar.hello())

    var dataClassInstance = DataClass("dataClassInstance")
    println(dataClassInstance.bar)

    val nullableTypes = NullableTypes()
    println(nullableTypes.nullableString)

    println(nullableTypes.cat("1234", "qwer"))
    // println(nullableTypes.cat(nullableTypes.nullableString, "qwer"))
}