package coroutines.composing_suspend_fun

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


//https://kotlinlang.org/docs/composing-suspending-functions.html

//fun main(): Unit = runBlocking {
//    val t = measureTimeMillis {
//        val one = doSomethingUsefulOne()
//        val two = doSomethingUsefulTwo()
//        println("The answer is ${one + two}")
//    }
//
//    println("Time = $t")
//}

//fun main(): Unit = runBlocking {
//    val t = measureTimeMillis {
//        val one = async {doSomethingUsefulOne()}
//        val two = async{doSomethingUsefulTwo()}
//        println("The answer is ${one.await() + two.await()}") //await!!!!!
//    }
//
//    println("Time = $t")
//}

fun main(): Unit = runBlocking {
    val t = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) {doSomethingUsefulOne()}
        val two = async(start = CoroutineStart.LAZY) {doSomethingUsefulTwo()}
        one.start()
        two.start()
        println("The answer is ${one.await() + two.await()}") //await!!!!!
    }

    println("Time = $t")
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}