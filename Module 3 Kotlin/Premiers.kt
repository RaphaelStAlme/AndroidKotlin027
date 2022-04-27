fun main() {
    repeat(1000){
        if(isPremier(it))
            println(it)
    }
}

fun isPremier(nombre : Int) : Boolean {
    var compteur:Int = 0
    for (i in 1..nombre) {
        if(nombre % i == 0) {
            compteur++
        }
    }
    return (compteur == 2)
}