class Student(
    val name: String,
    val age: Int,
    val roomNumber: Int,
    val gradeLevel: Int
): Resident(){
    fun displayInfo(): Unit {
        println("$name $age $roomNumber $gradeLevel")
    }
    override fun checkIn(){
        println("Student checked in")
    }
}