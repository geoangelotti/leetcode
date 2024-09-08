package o.mg

import kotlin.math.max

fun maxProfitAssignment(difficulty: IntArray, profit: IntArray, worker: IntArray): Int {
   val indices = profit.indices.sortedBy { difficulty[it] }
   var maxProfit = 0
   var i = 0
   return worker.sorted().sumOf { d ->
      while (i < indices.size && difficulty[indices[i]] <= d)
         maxProfit = max(maxProfit, profit[indices[i++]])
      maxProfit
   }
}