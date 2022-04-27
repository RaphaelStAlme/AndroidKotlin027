import java.text.Normalizer

fun main() {
    fun String.stopAuxAccents() = Normalizer.normalize(this, Normalizer.Form.NFD).replace("\\p{Mn}+".toRegex(), "")

    fun String.stopAuxSurplus() = this.lowercase().replace("[^a-z]".toRegex(), "")

    fun String.isPalindrome()  = (this.stopAuxAccents().stopAuxSurplus() == this.reversed().stopAuxAccents().stopAuxSurplus())

    var proposition = "bob éKayakebob!!!";

    if(proposition.isPalindrome())
        println("C'est un palindrome")
    else
        println("Ce n'est pas un palindrome")
}