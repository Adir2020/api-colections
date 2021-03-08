package public.user.colection

fun main() {
    val joao = officer( name = "joao", salary = 1000.0, typeContract = "CLT"  )
    val adir = officer( name = "adir", salary = 9000.0, typeContract = "PJ" )
    val pedro = officer( name = "pedro", salary = 5000.0, typeContract = "CLT")

    println("--------------------------")
    val officers = mutableListOf(joao, pedro)
    officers.forEach { println(it) }

    println("--------------------------")
    officers.add(adir)
    officers.forEach { println(it) }

    println("--------------------------")
    officers.remove(joao)
    officers.forEach { println(it) }

    println("-------------set-------------")
    val officersSet = mutableSetOf(joao)
    officersSet.forEach { println(it) }
    println("--------------------------")

    officersSet.add(adir)
    officersSet.add(pedro)
    officersSet.forEach { println(it) }
    println("--------------------------")

    officersSet.remove(pedro)
    officersSet.forEach { println(it) }
}