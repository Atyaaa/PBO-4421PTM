class Buku(var judul: String, var pengarang: String, var penerbit: String, var tahun: Int)

fun main() {
    val c1 = Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007)
    val c2 = Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004)

    println("Judul      :"+c1.judul)
    println("Pengarang  :"+c1.pengarang)
    println("Penerbit   :"+c1.penerbit)
    println("Tahun      :"+c1.tahun)

    println("Judul      :"+c2.judul)
    println("Pengarang  :"+c2.pengarang)
    println("Penerbit   :"+c2.penerbit)
    println("Tahun      :"+c2.tahun)
}