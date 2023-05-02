fun main() {
    val arr = arrayOf<Int>(10, 40, 70, 30, 60, 50, 80)
    val key = 50
    for (i in arr.indices){
        if (key == arr[i]){
            println(arr[i])
            break
        }
    }
}