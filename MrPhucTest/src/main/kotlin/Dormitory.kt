class Dormitory(val resident: List<Student>) {



    fun getTotalOcuppation(): Int {
        return resident.size
    }
}