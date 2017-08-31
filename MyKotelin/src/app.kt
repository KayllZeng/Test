fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
//indices目录的意思   index的复数
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}
