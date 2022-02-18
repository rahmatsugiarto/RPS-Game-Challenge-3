package com.binar.rps

import kotlin.jvm.JvmStatic

object Main : Callback {
    @JvmStatic
    fun main(args: Array<String>) {

        do {
            println("""
            ===========================
            GAME SUIT TERMINAL VERSION
            ===========================
            1. Mulai Game
            2. Keluar

            
        """.trimIndent())
            print("Silakan  pilih :")
            val pilihan = readLine().toString().trim().toIntOrNull()
            toIntOrNullSafe(pilihan.toString())


            when (pilihan) {
                1 -> playGame()
                2 -> println("""
                    ===========================
                      Sampai jumpa lagi yaa :)
                    ==========================
                """.trimIndent())
                else -> println("""
                    ===========================
                          ANDA SALAH INPUT
                    ===========================
                """.trimIndent())
            }

        } while (pilihan == 1 || pilihan == null || pilihan > 2)
    }

    private fun playGame() {
        println("""
        ===========================
        ------------PLAY-----------
        ===========================
               MASUKAN PILIHAN
           GUNTING, BATU & KERTAS
    """.trimIndent())
        print("Pemain 1: ")
        val input1 = readLine().toString().lowercase().trim()
        print("Computer uwu: ")
        if (input1 != "batu" && input1 != "gunting" && input1 != "kertas") {
            println("Pilih yang bener dong :(")
            playGame()
        } else {
            val com = arrayListOf("batu", "gunting", "kertas")
            val inputCom = com.random()
            println(inputCom)
            println()
            val controller = Controller(this)
            controller.cekSuit(input1, inputCom)
        }

    }


    override fun hasil(hasil: String) {
        println(hasil)
    }
}

private fun toIntOrNullSafe(value: String): Boolean {
    return when (value.toIntOrNull()) {
        null -> false
        else -> true
    }
}


