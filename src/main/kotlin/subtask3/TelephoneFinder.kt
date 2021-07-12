package subtask3


class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
      //  throw NotImplementedError("Not implemented")
        if(Integer.parseInt(number)<0) return null
        val listOfNumbers = mutableListOf<String>()
number.forEachIndexed { index, c ->
    val response:Set<Char> = findNeighbours(c)
    val stringBuilder = StringBuilder(number)
    for(el in response){
        stringBuilder[index] = el
        listOfNumbers.add(stringBuilder.toString())
        println(stringBuilder.toString())
    }
}
        return listOfNumbers.toTypedArray()
    }
   private fun findNeighbours(number: Char):Set<Char> {
       return when (number) {
           '1' -> setOf('2', '4')
           '2' -> setOf('1', '3', '5')
           '3' -> setOf('2', '6')
           '4' -> setOf('1', '7', '5')
           '5' -> setOf('2', '4', '6', '8')
           '6' -> setOf('3', '5', '9')
           '7' -> setOf('4', '8')
           '8' -> setOf('5', '7', '9','0')
           '9' -> setOf('6', '8')
           else -> setOf('8')
       }
   }

}
