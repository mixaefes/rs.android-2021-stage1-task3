package subtask2

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        val myNumLong = number.toLong()
        var remainder: Long = 0
        val decomposeList = mutableListOf(myNumLong)
        while (!decomposeList.isNullOrEmpty()) {
            val lastElement = decomposeList[decomposeList.size - 1]
            decomposeList.indexOfLast {
                decomposeList.remove(it)
            }
            remainder += lastElement * lastElement
            for (i in lastElement - 1 downTo 0) {
                if (remainder - i * i >= 0) {
                    remainder -= i * i
                    decomposeList.add(i)
                    println("reminder: $remainder")
                    println("lastEl: ${decomposeList.last()}")
                    if (remainder == 0L) {
                        decomposeList.sort()
                        return decomposeList.map { it.toInt() }.toTypedArray()
                    }
                }
            }
        }
        return null
    }
}
