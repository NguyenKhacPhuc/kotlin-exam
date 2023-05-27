fun main(args: Array<String>) {


    val list = ArrayList<Student>()

    val student = Student("Tien",22,2001,100)
    val student2 = Student("Hải",22,2001,100)
    val student3 = Student("Hoang Anh",22,2002,101)
    val student4 = Student("Nam",22,2002,1001)

    list.add(student)
    list.add(student2)
    list.add(student3)
    list.add(student4)
    student.disPlayInfo()



    val room = Room(2001,list.size, 20)

    list.forEach(list-> if())

    room.isFull()

    val otherStudent = OtherStudent()
    otherStudent.checkLn()

    val domitoryStudent = DomitoryStudent(20)
    domitoryStudent.makePayment()
    println("The money is ${domitoryStudent.makePayment()}")

    val domitory = Dormitory(list)
    domitory.getTotalOcuppation()

}




