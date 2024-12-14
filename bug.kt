fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

This code snippet attempts to remove even numbers from a list using `removeIf`. While seemingly straightforward, it has a subtle issue. The `removeIf` function modifies the list in place, and iterating over the modified list while removing elements can lead to unexpected results if not handled carefully. For example, removing an element shifts the indices of subsequent elements, which might cause some elements to be skipped during the removal process. 