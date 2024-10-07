package sprintlesson_2

const val TIME_IN_MINUTES = 60

fun main() {

    val departureTimeHour = 9
    val departureHourTimeInMinutes = departureTimeHour * TIME_IN_MINUTES // преобразую часы в минуты, вопрос как лучше назвать переменную в таком случае?
    val departureTimeMinute = 39
    val travelTimeMinutes = 457
    val arrivalTimeMinutes = departureHourTimeInMinutes + departureTimeMinute + travelTimeMinutes
    val resultHour = arrivalTimeMinutes / TIME_IN_MINUTES
    val resultMinute = arrivalTimeMinutes % TIME_IN_MINUTES
    val totalResult = ("$resultHour:$resultMinute")

        println(totalResult)

}