package com.binar.rps


class Controller(private val callback: Callback) : InterfaceController {

    override fun cekSuit(pemain1: String, com: String) {
        if (pemain1 == com) {
            callback.hasil("HASIL: DRAW")
        } else if (pemain1 == "batu" && com == "gunting" || pemain1 == "gunting" && com == "kertas" || pemain1 == "kertas" && com == "batu") {
            callback.hasil("HASIL: SELAMAT PEMAIN 1 MENANG")
        } else {
            callback.hasil("HASIL: SELAMAT COMPUTER uwu MENANG")
        }
    }
}
