package secondTask

fun countElements(array: IntArray) {
    val elementCounts = mutableMapOf<Int, Int>()

    for (element in array) {
        val count = elementCounts[element]
        if (count == null) {
            elementCounts[element] = 1
        } else {
            elementCounts[element] = count + 1
        }
    }

    for ((element, count) in elementCounts) {
        println("Элемент: $element, Количество: $count")
    }
}

fun main() {
    val array = intArrayOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
    countElements(array)
}
