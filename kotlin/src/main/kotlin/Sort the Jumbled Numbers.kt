package o.mg

import kotlin.streams.toList


fun sortJumbled(mapping: IntArray, nums: IntArray): IntArray {
    return nums.map { it.toString() }
        .map { it.chars().map { c -> mapping[c - 48] }.toList().joinToString(separator = "") }
        .map { it.toInt() }.zip(nums.toList()).sortedBy { it.first }.map { it.second }.toIntArray()
}