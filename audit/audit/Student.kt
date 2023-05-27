package audit

class Student(private val name: String, private val age: Int, private val roomNumber: Int, private val gradeLevel: Int) {
    fun displayInfo() {
        println("Name: $name")
        println("Age: $age")
        println("Room Number: $roomNumber")
        println("Grade Level: $gradeLevel")
    }
}

