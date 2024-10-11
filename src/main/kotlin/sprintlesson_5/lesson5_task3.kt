package sprintlesson_5

fun main() {

    val firstNumber = 11
    val secondNumber = 27

    println("Для участия в лотерее нужно угадать два числа от 0 до 42")
    println("Первое число")
    val userFirstNumber = readln()!!.toInt()
    println("Второе число")
    val userSecondNumber = readln()!!.toInt()

    if (
        (userFirstNumber == firstNumber) && (userSecondNumber == secondNumber)
        || (userFirstNumber == secondNumber) && (userSecondNumber == firstNumber)
        )
        println("Поздравляем! Вы выиграли главный приз!")
    else if (
        (userFirstNumber == firstNumber) && (userSecondNumber != secondNumber)
        || (userSecondNumber == secondNumber) && (userFirstNumber != firstNumber)
        || (userFirstNumber == secondNumber) && (userSecondNumber != firstNumber)
        || (userSecondNumber == firstNumber) && (userFirstNumber != secondNumber)
        )
        println("Вы выиграли утешительный приз!")
    else {
        (userFirstNumber != firstNumber) && (userSecondNumber != secondNumber)
        || (userSecondNumber != firstNumber) && (userFirstNumber != secondNumber)
        println("Неудача!")
    }

    println("Загаданные числа: $firstNumber и $secondNumber")

}