package audit

class Dormitory {
    private val residents: MutableList<Student> = mutableListOf()

    fun getTotalOccupancy(): Int {
        return residents.size
    }

    fun addResident(student: Student) {
        residents.add(student)
    }
}

fun main() {
    val dormitory = Dormitory()
    dormitory.addResident(Student("Hai", 22, 1, 12))
    dormitory.addResident(Student("Hai", 22, 1, 12))
    dormitory.addResident(Student("Hai", 22, 1, 12))

    val totalOccupancy = dormitory.getTotalOccupancy()
    println("Total occupancy: $totalOccupancy")
}