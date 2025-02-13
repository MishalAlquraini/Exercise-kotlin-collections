

val fruitMList = mutableListOf("Apple","Mango","Orange")
val numSet = setOf(1, 2, 3, 3, 4, 5, 5)
val addNumber = numSet + 6
val countryMap = mutableMapOf("USA" to "Washington", "France" to "Paris","Germany" to "Berlin")
val carBrands = arrayListOf("Chevy","Toyota","Tesla","Honda")
fun main() {

    fruitMList.add("Grapes")
    println(fruitMList)
    fruitMList.removeAt(1)
    println(fruitMList)
    println(addNumber)

    countryMap["Canada"] = "Ottawa"
    println("Countries: ${countryMap.keys}")
    println("Countries: ${countryMap.values}")


    countryMap.remove("Germany")
    println("Updated Map: $countryMap")

    carBrands.add("Ford")
    carBrands.add("BMW")
    println(carBrands)

    carBrands.remove("Ford")
    println(carBrands)

}
