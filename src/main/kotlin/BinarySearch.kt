fun binarySearch(arr: IntArray, key: Int): Int {
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
fun main() {
    val arr = intArrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90)
    val key = 50

    val index = binarySearch(arr, key)
    if (index != -1) {
        println("Element found at index $index")
    } else {
        println("Element not found")
    }
}