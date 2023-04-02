package sorular

class Soru3 {


    fun seriToplami(n:Int):Double{
        println("Soru 3")
        var toplam:Double= 0.0;
        var faktor:Double= 1.0;
        for (i in 1..n){
            faktor *= i;
            toplam=i+ i/faktor;

        }
        println(toplam)
        return toplam

    }




}