package Arrays
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

fun main(args: Array<String>) {
    val listOfIntegers = intArrayOf(2,7,11,15)
    twoSum(listOfIntegers, 9)
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashMapListSet = hashMapOf<Int, Int>()

    // check which numbers from these sum up to target
    for (i in nums.indices) {
        val listValues = nums[i]
        val checkIfItExists = target - listValues
        if (hashMapListSet.containsKey(checkIfItExists)) {
            return intArrayOf(hashMapListSet[checkIfItExists]!!, i)
        } else {
            hashMapListSet.put(listValues, i)
        }
    }
    return intArrayOf()
}




