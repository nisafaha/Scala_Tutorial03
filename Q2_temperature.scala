//20000065

object temperature{
    def main(args: Array[String]) = {

        def celsiusToFahrenheit(Celsius: Double) = {
            val farhenheit = Celsius*1.80 + 32.00
            println(farhenheit)
        }
        celsiusToFahrenheit(35)
    }
}