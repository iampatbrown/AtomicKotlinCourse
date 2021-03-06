// ResourceCleanup/ForEachLine.kt
package resourcecleanup
import checkinstructions.DataFile
import atomictest.*

private val trace = Trace()

fun main() {
  DataFile("Results.txt").forEachLine {
    if (it.startsWith("#"))
      trace("$it")
  }
  trace eq "# ok"
}