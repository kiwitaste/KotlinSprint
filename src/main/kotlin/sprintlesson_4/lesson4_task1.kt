package sprintlesson_4

fun main() {

    val tablesToday = 13
    val tablesTomorrow = 9

    val tablesAvailabilityToday = tablesToday < TABLES
    val tablesAvailabilityTomorrow = tablesTomorrow < TABLES

    println("[Доступность столиков на сегодня: $tablesAvailabilityToday]")
    println("[Доступность столиков на сегодня: $tablesAvailabilityTomorrow]")

}

const val TABLES = 13