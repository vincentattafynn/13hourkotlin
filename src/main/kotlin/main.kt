fun main(){
    val numbers = setOf(1,2,3,4,5)
    println(numbers.map{if (it == 3) it * 100 else it * 10})
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4)
    println(numbersMap.mapKeys{ it.key.uppercase()})
    println(numbersMap.mapValues{ it.value + it.key.length})
}