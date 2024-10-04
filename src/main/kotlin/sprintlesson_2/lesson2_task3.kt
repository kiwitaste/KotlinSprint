package sprintlesson_2

fun main() {

    val departureTimeHour = 9 * 60 // преобразую часы в минуты, вопрос как лучше назвать переменную в таком случае?
    val departureTimeMinute = 39
    val travelTimeMinutes = 457
    val arrivalTimeMinutes = departureTimeHour + departureTimeMinute + travelTimeMinutes
    val resultHour = arrivalTimeMinutes / 60
    val resultMinute = arrivalTimeMinutes % 60
    val totalResult = ("$resultHour:$resultMinute")

        println(totalResult)

}