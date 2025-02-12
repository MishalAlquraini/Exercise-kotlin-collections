

val fruitMList = mutableListOf("Apple","Mango","Orange")


fun main() {

    fruitMList.add("Grapes")
    println(fruitMList)
    fruitMList.removeAt(1)
    println(fruitMList)
}