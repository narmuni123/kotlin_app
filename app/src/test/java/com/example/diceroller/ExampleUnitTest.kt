package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_function() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of the result is not between 1 and 6", rollResult in 1..6)
    }
}