# turbo-octo-invention

Write an application that finds the 3 longest unique palindromes in a supplied string. For the 3 longest palindromes, report the palindrome, start index and length, in descending order of length.

Given the input string: `sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop`, the output should be:

```
Text: hijkllkjih, Index: 23, Length: 10
Text: defggfed, Index: 13, Length: 8
Text: abccba, Index: 5 Length: 6
```

## Approach

Before starting to solve this task I can see a naive solution, and potential for a more sophisticated solution.

The naive solution involves generating all substrings of the input strings, finding the palindromes, sorting by size, finding the unique palindromes (and removing the smaller duplicates) and selecting the top 3.

1. Start with naive implementation and write tests
2. Flesh out test suite and implement command-line app
3. Explore potential improvements to the solution

## Setup

The application can be run using __sbt__.

Start an interactive sbt session using:
```
sbt
```
Then to run:
```
run sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop
```
And to test:
```
sbt test
```