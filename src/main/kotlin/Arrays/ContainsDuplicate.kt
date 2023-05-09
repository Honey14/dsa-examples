package Arrays

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

fun main(args: Array<String>) {
    val listOfItems = intArrayOf(1,2,3,1)

    println(containsDuplicate(listOfItems))
}

// Solved with array
fun containsDuplicate0(nums: IntArray): Boolean {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                return true
            }
        }
    }
    return false
}

// solved with hash set algorithm
fun containsDuplicate(nums: IntArray): Boolean {
    val stack = hashSetOf<Int>()
    for (i in nums.indices) {
        val numItem = nums[i]
        if(stack.contains(numItem)) {
            return true
        } else {
            stack.add(numItem)
        }
    }
    return false
}
