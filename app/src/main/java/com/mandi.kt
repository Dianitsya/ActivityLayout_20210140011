fun main(){

    var mandi: Char
    var ulangi = true

    while (ulangi) {
        println("Apakah kamu mau mandi?(y/n) :")
        mandi = readLine()!!.single()

        if (mandi == 'y' || mandi == 'Y') {
            println("Berdiri")
            println("Jalan ke arah pintu")
            println("Buka Pintu kamar")
            println("Jalan ngambil Handuk")
            println("Tutup Pintu Kamar")
            println("Berjalan Ke Kamar Mandi")
            println("Nyalan Lampu Kamar Mandi")
            println("Buka Pintu Kamar Mandi")
            println("Masuk Kamar Mandi")
            println("Mandi")
            println("Keluar dari kamar mandi")
            println("Tutup Pintu Kamar Mandi")
            println("Matikan Lampu Kamar Mandi")
            println("Berjalan ke rak handuk")
            println("Taruh handuk di raknya")
            println("Buka Pintu Kamar")
            println("Masuk Kamar")
            println("Siap siap buat kuliah")
        } else {
            println("Mager")
            ulangi = false
        }
        readLine()
    }
}

