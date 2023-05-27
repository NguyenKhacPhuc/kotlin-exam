fun main(args: Array<String>) {
    //Ex1
    val student = Student("nam", 18, 2, 12).displayInfo()

    //Ex2
    val listOfStudent = mutableListOf<Student>()
    for (i in (0..4)){
        val student = Student("nam", 18, 2, 12)
        listOfStudent.add(student)
    }
    val listRoom = mutableListOf<Int>()
    for(i in 0..listOfStudent.size)
        listRoom.add(0)
    for (i in 0..listOfStudent.size){
        var studentTemp = listOfStudent[i]
        listRoom[studentTemp.roomNumber]+=1
    }

    Room(listRoom[12],4).isFull()

    //Ex3

}