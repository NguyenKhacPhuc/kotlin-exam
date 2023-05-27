//1. Write a Kotlin class named `Student` that has the following properties: `name`
//(String), `age` (Int), `roomNumber` (Int), and `gradeLevel` (Int). Provide a function
//named `displayInfo()` that prints the student's information.
class Student(
    private val name, private val age,
    private val roomNumber,
    private val gradeLevel
){
    fun displayInfo() {
        prinln("$name $age $roomNumber $gradeLevel")
    }
}

fun main(args: Array<String>) {
    val student = Student("nam", 18, 12, 12)
    student.displayInfo()
}
