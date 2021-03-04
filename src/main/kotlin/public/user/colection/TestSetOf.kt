package public.user.colection

fun main() {
    val joao = officer(name = "joao", salary = 1000.0, typeContract = "CLT")
    val adir = officer(name = "adir", salary = 9000.0, typeContract = "PJ")
    val pedro = officer(name = "pedro", salary = 5000.0, typeContract = "CLT")

    val officers1 = setOf(joao, pedro)
    val officers2 = setOf(adir)

    val resultUnion = officers1.union(officers2)
    resultUnion.forEach { println(it) }

    println("---------------------------------")

    val officers3 = setOf(joao, pedro, adir)
    val resultSubtract = officers3.subtract(officers2)
    resultSubtract.forEach { println(it) }

    println("---------------------------------")


    val resultIntersect = officers3.intersect(officers2)
    resultIntersect.forEach { println(it) }
}
