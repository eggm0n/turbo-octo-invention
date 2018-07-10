package palindrome

trait Palindrome {

  def getPalindromes(input: String): List[String] = {
    val substrings = generateSubstrings(input)
    val palindromes = substrings.filter(isPalindrome)
    val sortedLongest = palindromes.sortBy(_.length)(Ordering[Int].reverse)
    val unique = sortedLongest.filter(str => isUnique(sortedLongest, str))
    unique
  }

  def getTopPalindromes(input: String, top: Int): List[String] =
    getPalindromes(input).take(top)

  private def generateSubstrings(input: String): List[String] =
    input.inits.flatMap(_.tails).filterNot(_.isEmpty).toList

  private def isPalindrome(input: String): Boolean =
    input == input.reverse

  private def isUnique(palindromes: List[String], check: String): Boolean =
    palindromes.forall(p => p == check || !p.contains(check))
}
