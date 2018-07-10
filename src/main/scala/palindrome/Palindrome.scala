package palindrome

trait Palindrome {

  def getPalindromes(input: String): List[String] = {
    val substrings = generateSubstrings(input)
    val palindromes = substrings.filter(isPalindrome)
    val sorted = palindromes.sortBy(_.length)(Ordering[Int].reverse)
    val unique = sorted.filter(x => isUnique(sorted, x))
    unique
  }

  def getTopPalindromes(input: String, top: Int): List[String] = getPalindromes(input).take(top)

  private def generateSubstrings(input: String): List[String] = input.inits.flatMap(_.tails).filterNot(_.isEmpty).toList
  private def isPalindrome(input: String): Boolean = input == input.reverse
  private def isUnique(input: List[String], check: String): Boolean = input.forall(p => p == check || !p.contains(check))
}

