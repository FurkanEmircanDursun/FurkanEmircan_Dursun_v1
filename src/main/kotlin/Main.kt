import sorular.*
import sorular.soru6.Memur
import sorular.soru6.Mudur

fun main(args: Array<String>) {


    var soru1 = Soru1();

    soru1.basamakTopla(sayi = 123);

    var soru2 = Soru2();

    soru2.sayiyiTerstenYazdir(123)

    var soru3 = Soru3();

    soru3.seriToplami(4)

    var soru4 = Soru4();

    soru4.getSumOfAllPrimes(10)

    var soru5 = Soru5();

    println(soru5.isPrime(5))


    var soru6=Memur()
    println("Soru 6")
    println(soru6.maasHesapla(20))

}

