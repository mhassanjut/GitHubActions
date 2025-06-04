package com.example.mviarchitecture

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(3, 5 - 2) // ✅ Will pass
    }

/*    @Test
    fun multiplication_fails_on_purpose() {
        assertEquals(10, 2 * 3) // ❌ Will fail (2*3 is 6)
    }*/

    @Test
    fun string_equality() {
        val expected = "Hello, World"
        val actual = "Hello, " + "World"
        assertEquals(expected, actual) // ✅ Will pass
    }

    @Test
    fun list_contains_element() {
        val fruits = listOf("apple", "banana", "cherry")
        assertTrue(fruits.contains("banana")) // ✅ Will pass
    }

    @Test
    fun list_does_not_contain_element() {
        val numbers = listOf(1, 2, 3)
        assertFalse(numbers.contains(5)) // ✅ Will pass
    }

 /*   @Test
    fun null_check_fails_on_purpose() {
        val value: String? = null
        assertNotNull(value) // ❌ Will fail
    }*/
}