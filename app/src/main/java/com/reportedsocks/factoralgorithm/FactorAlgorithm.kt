package com.reportedsocks.factoralgorithm

fun factor(x: Int): List<Int> {
  var number = x
  var currentMultiplier = 2
  val multipliersList = mutableListOf<Int>()

  // in case the number is 0 or not a natural one return -1
  if (number <= 0) {
    multipliersList.add(-1)
    return multipliersList
  }

  // equivalent to looping while multiplier is <= sqrt of number
  while (currentMultiplier * currentMultiplier <= number) {
    if( number % currentMultiplier == 0 ) {
      multipliersList.add(currentMultiplier)
      number /= currentMultiplier
    } else if ( currentMultiplier == 2 ) {
      // when looping with multiplier 2 is finished, make it odd by adding 1
      currentMultiplier++
    } else {
      // then check only the odd numbers
      currentMultiplier += 2
    }
  }
  // if resulted number isn't equal to 1, then it's prime so its added to the list
  if (number != 1) {
    multipliersList.add(number)
  }

  return multipliersList
}