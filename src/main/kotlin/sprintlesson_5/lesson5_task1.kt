package sprintlesson_5

fun main() {

    val firstNumber = 9
    val secondNumber = 5
    println("Чтобы подтвердить, что вы не бот, введите сумму двух чисел ${firstNumber} и ${secondNumber}")
    val result = readln().toInt()

    if (result == firstNumber + secondNumber)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")

}