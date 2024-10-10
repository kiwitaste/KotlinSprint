package sprintlesson_4

fun main() {

    val weightMin = 35
    val weightMax = 100
    val volumeMax = 100

    val weightGood1 = 20
    val volumeGood1 = 80

    val weightGood2 = 50
    val volumeGood2 = 100

    println("Груз с весом $weightGood1 кг и объемом $volumeGood1 л соответствует категории 'Average': " +
            "${weightMin < weightGood1 && weightGood1 <= weightMax && volumeGood1 < volumeMax}")

    println("Груз с весом $weightGood2 кг и объемом $volumeGood2 л соответствует категории 'Average': " +
            "${weightMin < weightGood2 && weightGood2 <= weightMax && volumeGood2 < volumeMax}")

}