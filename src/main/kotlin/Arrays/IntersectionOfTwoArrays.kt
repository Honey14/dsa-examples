package Arrays
// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

fun main(args: Array<String>) {
    val nums1 = intArrayOf(1,2,2,1, 4, 5, 6, 4)
    val nums2 = intArrayOf(2,2,2,2)
    val outputArray = ArrayList<Int>()

    val map = HashMap<Int, Int>()
    for(x in nums1) {
        if(map.containsKey(x)) {
           map[x] = map[x]!!.plus(1)
        } else {
            map[x] = 1
        }
    }

    for (y in nums2) {
        if(map.containsKey(y) && map[y]!! > 0) {
            outputArray.add(y)
            map[y] = map[y]!!.minus(1)
        }
    }
    println(map)
    println(outputArray)
}
