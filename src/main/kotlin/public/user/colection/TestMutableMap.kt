package public.user.colection

fun main() {
    val joao = officer(name = "joao", salary = 1000.0, typeContract = "CLT")
    val adir = officer(name = "adir", salary = 9000.0, typeContract = "PJ")
    val pedro = officer(name = "pedro", salary = 5000.0, typeContract = "CLT")

    val repositorio = Repositorio<officer>()

    repositorio.create(joao.name, joao)
    repositorio.create(adir.name, adir)
    repositorio.create(pedro.name, pedro)

    println(repositorio.findById(joao.name))

    println("-------------------------------------------")
    repositorio.findAll().forEach { println(it) }

    println("-------------------------------------------")
    repositorio.remove(joao.name)
    repositorio.findAll().forEach { println(it) }



}