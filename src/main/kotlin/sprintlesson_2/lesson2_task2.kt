package sprintlesson_2

fun main() {

    val employees = 50
    val employeesSalary = 30000
    val interns = 30
    val internsSalary = 20000

    val employeeCosts = employees * employeesSalary
    val internsCosts = interns * internsSalary
    val allCosts = employeeCosts + internsCosts
    val allPeople = employees + interns
    val averageSalary =  allCosts / allPeople

    println(employeeCosts)
    println(allCosts)
    println(averageSalary)

}