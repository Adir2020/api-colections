package public.user.colection

fun main() {
    val salarys = doubleArrayOf(1000.0, 2000.0, 5000.0)

    for (salary in salarys) {
        println(salary)
    }
    println("---------------------------")

    println("big salary: ${salarys.max()}")
    println("small salary: ${salarys.min()}")
    println("big salary: ${salarys.average()}")

    val salarysBig1500 = salarys.filter { it > 1500.0 }
    println("---------------------------")

    salarysBig1500.forEach { println(it) }
}