//20000065

object volume{
    def main(args: Array[String]) = {

        def volume(radius: Double) = {
           val v = 4*math.Pi*radius*radius*radius/3
           println(v)
        }
        volume(5)
    }
}