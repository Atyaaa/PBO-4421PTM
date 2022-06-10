fun main(args: Array<String>) {
    print("Berapa detik yang ingin anda konversikan : ");
    var konversi = readLine()!!.toInt()

    val jam     = konversi/3600
    val menit   = (konversi%3600)/60
    val detik   = (konversi%3600)%60

    println("Konversi dari $konversi Adalah : ")
    println("$jam jam : $menit menit : $detik detik")
}

