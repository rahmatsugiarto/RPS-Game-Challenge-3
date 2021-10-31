package com.binar.rps

class Controller(private val callback : Callback) : InterfaceController {

    override fun cekSuit(pemain1: String, pemain2: String) {
        when {

            //salah input
            pemain1 != "batu" && pemain1 != "gunting" && pemain1 != "kertas" -> callback.hasil(
                "ANDA SALAH INPUT!!!")
            pemain2 != "batu" && pemain2 != "gunting" && pemain2 != "kertas" -> callback.hasil(
                "ANDA SALAH INPUT!!!")
            //DRAW
            pemain1 == pemain2 -> callback.hasil("HASIL: DRAW")
            //logic pemain 1
            pemain1 == "batu" && pemain2 == "gunting" -> callback.hasil("HASIL: SELAMAT PEMAIN 1 MENANG")
            pemain1 == "gunting" && pemain2 == "kertas" -> callback.hasil("HASIL: SELAMAT PEMAIN 1 MENANG")
            pemain1 == "kertas" && pemain2 == "batu" -> callback.hasil("HASIL: SELAMAT PEMAIN 1 MENANG")
            //logic pemain 2
            pemain2 == "batu" && pemain1 == "gunting" -> callback.hasil("HASIL: SELAMAT PEMAIN 2 MENANG")
            pemain2 == "gunting" && pemain1 == "kertas" -> callback.hasil("HASIL: SELAMAT PEMAIN 2 MENANG")
            pemain2 == "kertas" && pemain1 == "batu" -> callback.hasil("HASIL: SELAMAT PEMAIN 2 MENANG")
        }

    }
}