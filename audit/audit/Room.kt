package audit

class Room(val number: Int, val capacity: Int) {
    private var studentList: MutableList<Student> = mutableListOf()

    fun isFull(): Boolean {
        return studentList.size  == capacity
    }

    fun addStudent(student: Student) {
        studentList.add(student)
    }
}
