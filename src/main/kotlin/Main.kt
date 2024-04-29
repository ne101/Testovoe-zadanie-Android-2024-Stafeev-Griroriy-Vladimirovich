fun findDuplicate(numbers: IntArray): Int {
    var duplicate = -1
    val seen = HashSet<Int>()

    for (num in numbers) {
        if (seen.contains(num)) {
            duplicate = num
            break
        }
        seen.add(num)
    }
    return duplicate
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10)
    val duplicate = findDuplicate(numbers)
    if (duplicate == -1) {
        println("В массиве нет Дублированных элементов")
    } else {
        println("Дублированный элемент в массиве: $duplicate")
    }
}
