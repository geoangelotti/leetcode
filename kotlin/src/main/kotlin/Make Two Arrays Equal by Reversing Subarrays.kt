package o.mg

fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
   val frequency1 = target.toList().groupingBy { it }.eachCount()
   val frequency2 = arr.toList().groupingBy { it }.eachCount()
   return frequency1 == frequency2
}