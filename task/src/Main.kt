

val fruitMList = mutableListOf("Apple","Mango","Orange")
val numSet = setOf(1, 2, 3, 3, 4, 5, 5)
val addNumber = numSet + 6
val countryMap = mutableMapOf("USA" to "Washington", "France" to "Paris","Germant" to "Berlin")

fun main() {

    fruitMList.add("Grapes")
    println(fruitMList)
    fruitMList.removeAt(1)
    println(fruitMList)
    println(addNumber)

    countryMap["Canada"] = "Ottawa"
    println("Countries: ${countryMap.keys}")
    println("Countries: ${countryMap.values}")
    countryMap.remove("Germany","Berlin")
    println("Updated Map: $countryMap")

}
