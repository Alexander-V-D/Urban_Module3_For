import kotlin.math.pow

fun main() {

}

//Функция для задачи 1
fun printArithmeticMeanOfTwoNumbers(a: Double, b: Double) {
    println("Ответ к задаче 1: ${a * b / 2}")
}

//Функция для задачи 2
fun printLengthAndDiameterOfCircle(area: Double) {
    val diameter = (area * 4 / 3.14).pow(0.5)
    val length = diameter * 3.14
    println("Ответ к задаче 2: \n| Диаметр: $diameter\n| Длина: $length")
}

//Функция для задачи 3
fun printPerimeterAndAreaOfRectangle() {
    val x1 = 1
    val y1 = 1
    val x2 = 2
    val y2 = 2
    val a = x2 - x1
    val b = y2 - y1
    val perimeter = 2 * (a + b)
    val area = a * b
    println("Ответ к задаче 3: \n| Периметр: $perimeter\n| Площадь: $area")
}

//Функция для задачи 4:
fun printSomeDegreesOfTwo() {
    println("Ответ к задаче 4:")
    for (i in 0..9) {
        println((2.0.pow(i).toInt()))
    }
}

//Функция для задачи 5:
fun printEvenNumbersFrom20DownTo0() {
    println("Ответ к задаче 5:")
    for (i in 20 downTo 0) {
        if (i % 2 == 0) println(i)
    }
}