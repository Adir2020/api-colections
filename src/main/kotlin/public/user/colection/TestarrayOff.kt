package public.user.colection

fun main() {
    val values = intArrayOf(2, 3, 4, 10, 1)

    values.forEach {
      println(it)
    }
    println("----------------------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}