package public.user.colection

fun main() {
   val names = Array(size = 4) {""}
    names[0] = "adir"
    names[1] = "evandro"
    names[2] = "borba"
    names[3] = "santos"

    for (name in names) {
        println(name)
    }
    println("------------------")

    names.sort()
    names.forEach { println(it) }
}