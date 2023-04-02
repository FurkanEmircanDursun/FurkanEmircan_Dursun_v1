package sorular.soru6

class GenelMudur() : Personel {
    var maas=5000
    override fun maasHesapla(ekSaat: Int): Double {
        return maas + (ekSaat * 0.8)
    }
}