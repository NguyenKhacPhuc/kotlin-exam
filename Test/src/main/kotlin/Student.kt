class Student(
    private val name: String,
    private val age: Int,
    val roomNumber: Int,
    private val gradeLevel: Int
){
    fun displayInfo(): Unit {
        println("$name $age $roomNumber $gradeLevel")
    }
}