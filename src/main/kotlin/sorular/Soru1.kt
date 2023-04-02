package sorular

class Soru1 {


    fun basamakTopla(sayi: Int): Int? {
        println("Soru 1")
        if (sayi < 999 && sayi > 99) {


            var toplam = 0
            var tempSayi = sayi

            while (tempSayi != 0) {
                toplam += tempSayi % 10
                tempSayi /= 10
            }
                println(toplam)
            return toplam

        } else {
            println("basamak sayısı 3 değil ")

            return 0

        }


    }


}