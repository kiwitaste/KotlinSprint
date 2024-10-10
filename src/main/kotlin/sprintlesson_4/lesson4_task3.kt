package sprintlesson_4

fun main() {

    val sunnyWetter: Boolean = true
    val openTent: Boolean = true
    val humidity: Int = 20
    val yearSeason: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${sunnyWetter && openTent && humidity == 20 && yearSeason != "зима"}")

}



