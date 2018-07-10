package palindrome

import org.scalatest.{FlatSpec, Matchers}

class PalindromeSpec extends FlatSpec with Matchers with Palindrome {
  "The Palindrome trait" should "produce a list of unique palindromes when given the example input " in {
    getTopPalindromes("sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop", 3) should be(List("hijkllkjih", "defggfed", "abccba"))
  }

  it should "produce a singleton list of unique palindromes when given an input with only one palindrome " in {
    getPalindromes("123454321") should be(List("123454321"))
  }

  it should "produce a list of unique palindromes when given an input with at least one non-unique palindrome" in {
    getPalindromes("123454321x2345432") should be(List("123454321", "x"))
  }

  it should "produce a list of the unique palindromes when given an input with multiple non-unique palindromes separated by unique strings" in {
    getPalindromes("123454321x2345432y34543") should be(List("123454321", "y", "x"))
  }
}
