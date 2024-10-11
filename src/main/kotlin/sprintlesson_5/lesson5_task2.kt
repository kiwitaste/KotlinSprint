package sprintlesson_5

fun main() {

    val currentYear = 2024

    println("Введите год рождения")

    val userBirthYear = readln()!!.toInt()

    if (currentYear - userBirthYear >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }

}

const val AGE_OF_MAJORITY = 18