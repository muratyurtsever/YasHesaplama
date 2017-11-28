import java.util.*

fun main(args: Array<String>){

    //girdi
    println("Hangi yıl doğdun")
    var dyili:Int = readLine()!!.toInt()
    //işlem
    var buyil=Calendar.getInstance().get(Calendar.YEAR)
    var yas=buyil-dyili
    //çıktı
    println("$yas yaşındasınız.")
}