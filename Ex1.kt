class Student(val name: String, val age: Int, val roomNumber: Int, val gradeLevel: Int) : Resident()  {
    fun displayInfo() {
        println("Name: $name")
        println("Age: $age")
        println("Room Number: $roomNumber")
        println("Grade Level: $gradeLevel")
    }

    override fun checkIn() {
        println("Student checked in")
    }
}

class Room(val number: Int, val capacity: Int) {
    var numberOfStudent = 0
    fun isFull(): Boolean {
        return numberOfStudent == capacity
    }
}

open class Resident() {
    open fun checkIn() {
        println("Resident checked in")
    }
}

interface Paymentable{
    fun makePayment(){


    }
}

class Dormitory(){
    fun getTotalOccupancy(){

    }
}

fun main() {
    val student = Student("Hoang Anh", 22, 1, 1)
    val room = Room(120,120)
    println("${room.isFull()}")
    student.displayInfo()
    student.checkIn()
}
