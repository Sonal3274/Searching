fun binarySearch(arr: IntArray, key: Int): Int {
    if (!arr.isSorted()) {
        throw IllegalArgumentException("Array must be sorted for binary search.")
    }

    var low = 0
    var high = arr.size - 1

    while (low <= high) {
        val mid = (low + high) / 2
        when {
            arr[mid] == key -> return mid
            arr[mid] < key -> low = mid + 1
            else -> high = mid - 1
        }
    }

    return -1
}

fun IntArray.isSorted(): Boolean {
    for (i in 1 until size) {
        if (this[i] < this[i - 1]) {
            return false
        }
    }
    return true
}

fun main() {
    val arr = intArrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90)
    val key = 50

    if (arr.isSorted()) {
        val index = binarySearch(arr, key)
        if (index != -1) {
            println("Element found at index $index")
        } else {
            println("Element not found")
        }
    } else {
        println("Array must be sorted for binary search.")
    }
}
