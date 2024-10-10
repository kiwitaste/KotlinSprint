package sprintlesson_4

fun main() {

    val weightGood1 = 20
    val volumeGood1 = 80

    val weightGood2 = 50
    val volumeGood2 = 100

    println("Груз с весом $weightGood1 кг и объемом $volumeGood1 л соответствует категории 'Average': " +
            "${WEIGHT_MIN < weightGood1 && weightGood1 <= WEIGHT_MAX && volumeGood1 < VOLUME_MAX}")

    println("Груз с весом $weightGood2 кг и объемом $volumeGood2 л соответствует категории 'Average': " +
            "${WEIGHT_MIN < weightGood2 && weightGood2 <= WEIGHT_MAX && volumeGood2 < VOLUME_MAX}")

}

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME_MAX = 100