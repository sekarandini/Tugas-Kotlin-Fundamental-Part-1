fun main() {
    val score = 90
    val peringkat : String
    peringkat = if (score > 90 && score <= 100){
        "A"
    } else if (score > 80 && score <= 90){
        "B"
    } else if (score > 70 && score <= 80){
        "C"
    } else if (score > 60 && score <= 70){
        "D"
    } else if (score <= 60){
        "E"
    } else{
        "Error."
    }
    println(peringkat)
}