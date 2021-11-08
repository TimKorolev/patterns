package coroutines.start

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


//https://kotlinlang.org/docs/coroutines-basics.html#your-first-coroutine"

fun main () = runBlocking{
    launch{
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!")
    }
    println("Hello ")
}