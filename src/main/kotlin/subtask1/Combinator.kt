package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        // throw NotImplementedError("Not implemented")
        var countCombinations = 0
        var combinations: Long = 0
        while (true) {
            countCombinations++
            if (countCombinations > array[1]) return null
            combinations =
                fctrl(array[1]) / fctrl(array[1] - countCombinations) / fctrl(countCombinations)
            if (combinations == array[0].toLong()) return countCombinations
        }
    }

    private fun fctrl(n: Int): Long {
        var factorial = 1L
        for (e in 1..n) {
            factorial *= e
        }
        return factorial
    }
}
