package audit

interface Paymentable{
    fun makePayment(): Double
}

class Student2: Paymentable{
    override fun makePayment(): Double {
        val dormitoryFee = 10000.0
        val anotherFee = 2000.0

        val totalFee = dormitoryFee + anotherFee
        return totalFee
    }
}

fun main(){
    val stundent = Student2()
    println(stundent.makePayment())
}