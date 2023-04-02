package sorular

class Soru2 {



    fun sayiyiTerstenYazdir(sayi :Int):Int{

        println("Soru 2")
        var a: Int
        var b: Int
        var c: Int

        if (sayi>99&&sayi<999){

            //sayi abc---> cba

            a=sayi/100
            b=(sayi%100)/10
            c=sayi%10

            var cba=c*100+b*10+a;

            println(cba)
            return cba
        }else
        {

            println("sayı 3 haneli değil")
            return 0

        }

    }
}