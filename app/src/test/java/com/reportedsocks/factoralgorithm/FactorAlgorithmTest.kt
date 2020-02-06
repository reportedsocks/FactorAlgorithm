package com.reportedsocks.factoralgorithm

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import kotlin.system.measureNanoTime

class FactorAlgorithmTest {

  @Test
  fun factorizationOf_3_isCorrect() {
    val result = factor(3)
    assertThat(result).isEqualTo( listOf( 3 ) )
    println("factor(3) returned 3")
  }

  @Test
  fun factorizationOf_45_isCorrect() {
    val result = factor(45)
    assertThat(result).isEqualTo( listOf( 3, 3, 5 ) )
    println("factor(45) returned [3, 3, 5]")
  }

  @Test
  fun factorizationOf_341231_isCorrect() {
    val result = factor(341231)
    assertThat(result).isEqualTo( listOf( 11, 67, 463 ) )
    println("factor(341231) returned [11, 67, 463]")
  }

  @Test
  fun factorizationOf_0_isCorrect() {
    val result = factor(0)
    assertThat(result).isEqualTo( listOf( -1 ) )
    println("factor(0) returned [-1]")
  }

  @Test
  fun factorizationOfNegative_isCorrect() {
    val result = factor(-5324)
    assertThat(result).isEqualTo( listOf( -1 ) )
    println("factor(-5324) returned [-1]")
  }

  // execution time is much lower when executed together with all tests
  // so execute this one on its own
  @Test
  fun performanceTest() {
    val x = 764999997
    val execTimeNanos = measureNanoTime { factor(x) }
    val execTimeMillis = execTimeNanos.toDouble() / 1000000
    println("factor($x) executed in $execTimeMillis ms")
  }

}