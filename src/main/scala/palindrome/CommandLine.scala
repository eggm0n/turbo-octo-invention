package palindrome

object CommandLine extends Palindrome with App {
  if (args.length != 1) {
    println("Please provide input string as a single argument")
  } else {
    getResults(args(0)).foreach(
      result =>
        println(
          s"Text: ${result.text}, Index: ${result.index}, Length: ${result.length}")
    )
  }

  def getResults(input: String): List[Result] = {
    getTopPalindromes(input, 3).map(x => Result(x, input.indexOf(x), x.length))
  }
}

final case class Result(
    text: String,
    index: Int,
    length: Int
)
