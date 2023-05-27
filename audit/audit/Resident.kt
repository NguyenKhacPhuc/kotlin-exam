package audit

open class Resident {
    open fun checkIn(){
        println("Resident checked in")
    }
}

class Student1: Resident(){
    override fun checkIn(){
        println("Resident checked in")
    }
}

fun main() {
    val student = Student1()
    student.checkIn()
}