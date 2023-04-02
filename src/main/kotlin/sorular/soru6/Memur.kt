package sorular.soru6
class Memur() : Personel {

        var maas=1000
    override fun maasHesapla(ekSaat: Int): Double {

        return maas + (ekSaat * 0.3)
    }
}
