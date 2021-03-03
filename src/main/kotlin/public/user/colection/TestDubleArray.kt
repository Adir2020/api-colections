package public.user.colection

fun main() {
    val salary = DoubleArray(size = 3)
    salary[0] = 1000.0
    salary[1] = 2000.0
    salary[2] = 500.0

    salary.forEach { println(it) }

    println("---------------------------")

    salary.forEachIndexed { index, salarys ->
      salary[index] = salarys + 1.1
    }
    salary.forEach { println(it) }

    println("---------------------------")

    val salary2 = doubleArrayOf(1500.0, 1000.0, 500.0)
    salary2.sort()

    salary2.forEach { println(it) }
}