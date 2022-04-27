
fun main() {
    var nbGrains = 1f;
    var total = 1f;

    repeat(64)
    {
        println("case ${it+1} : $nbGrains")
        total += nbGrains;
        nbGrains *= 2
    }
    println("Total : $total")
}