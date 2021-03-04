package public.user.colection

fun main() {
    val joao = officer( name = "joao", salary = 1000.0 )
    val adir = officer( name = "adir", salary = 9000.0 )
    val pedro = officer( name = "pedro", salary = 5000.0 )

    val officers = listOf(joao, adir, pedro)

    officers.forEach { println(it) }
    println("-----------------------------")
    println(officers.find { it.name == "adir"})

    println("-----------------------------")

    officers.sortedBy { it.salary }.forEach { println(it) }
}

data class officer(
    val name: String,
    val salary: Double
){
    override fun toString(): String =
        """
        name:   $name
        salary: $salary
        """.trimIndent()
    }
