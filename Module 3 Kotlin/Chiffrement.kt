fun main() {
    val mot = "INFORMATIQUE"
    val cle = "INRACI"

    fun Char.position() = this.code-64

    for((index,value) in mot.withIndex())
    {
        var valueCle = cle[index%cle.length]
        var position = value.position()
        var positionCle = valueCle.position()
        var somme = position + positionCle - 1
        var modulo = somme%26;

        modulo = if (modulo==0) 26 else modulo
        modulo += 64
        println("$value => $valueCle => $modulo => ${modulo.toChar()}")
    }
}