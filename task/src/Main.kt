

val fruitMList = mutableListOf("Apple","Mango","Orange")
val numSet = setOf(1, 2, 3, 3, 4, 5, 5)
val addNumber = numSet + 6
fun main() {

    fruitMList.add("Grapes")
    println(fruitMList)
    fruitMList.removeAt(1)
    println(fruitMList)
    println(addNumber)
}