package coroutines.suspend_fun

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        doWorld()
    }
    println("Hello ")
    //doWorld2
//    doWorld3()
}

suspend fun doWorld() { // suspend functions work only on CoroutineScope
    delay(1000L)
    println("World!")
}

suspend fun doWorld2() = coroutineScope {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}

suspend fun doWorld3() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2") //3
    }
    launch {
        delay(1000L)
        println("World 1") //2
    }
    println("Hello World!") //1
}