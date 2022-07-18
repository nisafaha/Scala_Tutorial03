//20000065

object cost{
    def main(args: Array[String]) = {

        def bookPrice(x:Int): Double = x*24.95
        def discount(value:Double): Double = value*0.4
        def shippingCost(count:Int):Double = 3*count + (count-50)*0.75

        //wholesale cost for 60 books
        val wholesale_cost = bookPrice(60) - discount(bookPrice(60)) + shippingCost(60)
        println(wholesale_cost)
    }
}