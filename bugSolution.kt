fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val listCopy = list.toList() // Create a copy to avoid index issues
    list.removeIf { listCopy.contains(it) && it % 2 == 0 }
    println(list)
}

Alternatively, using an iterator provides a safer approach.

fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list)
} 