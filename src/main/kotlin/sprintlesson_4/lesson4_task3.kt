package sprintlesson_4

fun main() {

    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val humidity: Int = 20
    val yearSeason: String = "зима"

    val comparisonResult = isSunny && isAwningOpen && (humidity == EXPECTED_HUMIDITY) && (yearSeason != WRONG_SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? $comparisonResult")

}


const val EXPECTED_HUMIDITY: Int = 20
const val WRONG_SEASON: String = "зима"


