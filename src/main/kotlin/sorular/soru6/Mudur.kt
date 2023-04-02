package sorular.soru6

class Mudur() : Personel {
    var maas=3000;
     override fun maasHesapla(ekSaat: Int): Double {

        return maas + (ekSaat * 0.6)
    }
}