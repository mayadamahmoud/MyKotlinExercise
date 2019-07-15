
import java.util.Random

enum class Color{ BLUE, ORANGE, YELLOW,RED}

fun main(args: Array<String>) {

    val rand = Random()
    val magicNum = rand.nextInt(50) + 1
    var guess = 0

    while (magicNum != guess) {
        guess += 1
    }
    println(guess)

    val str1 = "A random string"
    println("Index 2-7 : ${str1.subSequence(2, 8)}")
    println("Contains random?  ${str1.contains("random")}")

    val alpha = "A".."Z"
    println("R in alpha : ${"R" in alpha}")

    val tenTo1 = 10.downTo(10)
    for (x in tenTo1.reversed()) println("$x")

    val age = 8
    when (age) {
        0, 1, 2, 3, 4 -> println("Preschool")
        in 5..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }
        else -> println("Go to College")
    }

    fun add(num1: Int, num2: Int): Int = num1 + num2
    println("8 + 4 = ${add(8, 4)}")

    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }
    println(max(4, 2))

    fun min(a: Int, b: Int) = if (a > b) b else a
    println(min(2, 4))

    val list = listOf("a", "b", "c")
    for ((index, ele) in list.withIndex()) {
        println("$index: $ele")
    }

    // println("Kotlin" in "Java".."Scala")

    val myDate = "1998-02-02"
    if (myDate in "1990-01-01".."1997-12-12") println("cool")

    fun isValidIdentifier(s: String): Boolean {
        // A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters, digits and underscores.
        if (s.isEmpty() || !(s[0] == '_' || (s[0] in 'a'..'z'))) return false
        return true

    }
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false

    fun List<Int>.sum(): Int {
        var result = 0
        for (i in this) {
            result += i
        }
        return result
    }

    val medolist = listOf(1, 2, 3)
    println(medolist.sum())    // 6

    fun String.mastermind(s: String): Pair<Int, Int>? {
        if (s.length != length) return null
        var shared = 0
        var exact = 0
        for ((index, c) in withIndex()) {
            if (c == s[index]) {
                exact++
            }
        }
        var copy = s
        for (c in this) {
            if (copy.contains(c)) {
                shared++
                copy = copy.replace(c.toString(), "")
            }
        }

        return exact to shared
    }
    println("ABCD".mastermind("ABFC"))
}



