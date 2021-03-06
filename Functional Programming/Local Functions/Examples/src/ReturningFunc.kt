// LocalFunctions/ReturningFunc.kt
package lambdawithreceiver
import atomictest.eq

fun first(): (Int) -> Int {
  val func = fun (i: Int): Int {
    return i + 1
  }
  func(1) eq 2
  return func                // [1]
}

fun second(): (String) -> String {
  val func2 = { s: String -> "$s!" }
  func2("abc") eq "abc!"
  return func2               // [1]
}

fun third(): () -> String {
  fun greet() = "Hi!"
  return ::greet             // [1]
}

fun main() {
  val firstFun: (Int) -> Int = first()
  val secondFun: (String) -> String = second()
  val thirdFun: () -> String = third()

  firstFun(42) eq 43            // [2]
  secondFun("xyz") eq "xyz!"    // [3]
  thirdFun() eq "Hi!"           // [4]
}