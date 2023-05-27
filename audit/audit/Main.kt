import audit.Room
import audit.Student

fun main() {
    val student1 = Student("Hai", 22, 1, 12)
    val student2 = Student("Nam", 22, 2, 12)

    val room = Room(1, 2)
    room.addStudent(student1)
    room.addStudent(student2)

    room.isFull()

    student1.displayInfo()
    student2.displayInfo()
}
