//2. Write a Kotlin class named `Room` that has a property named `number` (Int) and a
//property named `capacity` (Int). Provide a function named `isFull()` that returns true
//if the room is full (i.e., the number of students in the room is equal to the capacity).
class Room(
    private val number: Int,
    private val capacity: Int
) {
 fun isFull(): Boolean{
     return number == capacity
 }
}