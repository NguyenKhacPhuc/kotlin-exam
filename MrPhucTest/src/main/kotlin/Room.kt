class Room ( var number:Int, var studentNumber:Int, var capacity:Int) {

    fun isFull(): Boolean {
        if (studentNumber == capacity){
            return true
        }else{
            return false
        }
    }
}