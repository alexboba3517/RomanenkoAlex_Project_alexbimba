import java.lang.Math.pow

fun main() {
  print("Вас приветствует Console Cals ver/0/1/1")
    print("Введите первое число: ")
    var number1 = readLine()!!.toDouble()
    print("Выберете второе число: ")
    var number2 = readLine()!!.toDouble()
    print("Выберете опирацию: ")
    var operation = readLine()

    when(operation)
    {
        "+" -> print("$number1$operation$number2=${number1+number2}")
        "-" -> print("$number1$operation$number2=${number1-number2}")
        "*" -> print("$number1$operation$number2=${number1*number2}")
        "/" -> print("$number1$operation$number2=${number1/number2}")
        "rt" -> print("$number1$operation$number2=${pow(number1,1/number2)}")
        "st" -> print("$number1$operation$number2=${pow(number1,number2)}")

                else -> print("Такой операции не предусмотрено!")
    }
}
