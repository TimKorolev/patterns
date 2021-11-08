package coroutines.`context_&_dispatchers`

import kotlinx.coroutines.*

//https://kotlinlang.org/docs/coroutine-context-and-dispatchers.html#dispatchers-and-threads

//fun main(): Unit = runBlocking {
//    launch { // context of the parent, main runBlocking coroutine
//        println("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(Dispatchers.Unconfined) { // not confined -- will work with main thread coroutine .Dispatcher starts a coroutine in the caller thread, but only until the first suspension point
//        println("Unconfined            : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(Dispatchers.Default) { // will get dispatched to DefaultDispatcher
//        println("Default               : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(newSingleThreadContext("MyOwnThread")) { // will get its own new thread
//        println("newSingleThreadContext: I'm working in thread ${Thread.currentThread().name}")
//    }
//}

//launch(Dispatchers.Default + CoroutineName("test")) {
//    println("I'm working in thread ${Thread.currentThread().name}")
//}

//context jumping
//fun main(): Unit = runBlocking {
//    newSingleThreadContext("Ctx1").use { ctx1 ->
//        newSingleThreadContext("Ctx2").use { ctx2 ->
//            runBlocking(ctx1) {
//                println("Started in ctx1")
//                withContext(ctx2) {
//                    println("Working in ctx2")
//                }
//                println("Back to ctx1 ${coroutineContext[Job]}")
//            }
//        }
//    }
//}

//fun main(): Unit = runBlocking {
//    val request = launch {
//        // it spawns two other jobs
//        launch(Job()) { // not child of top launch
//            println("job1: I run in my own Job and execute independently!")
//            delay(1000)
//            println("job1: I am not affected by cancellation of the request")
//        }
//        // and the other inherits the parent context
//        launch { // child of top launch
//            delay(100)
//            println("job2: I am a child of the request coroutine")
//            delay(1000)
//            println("job2: I will not execute this line if my parent request is cancelled")
//        }
//    }
//    delay(500)
//    request.cancel() // cancel processing of the request
//    delay(1000) // delay a second to see what happens
//    println("main: Who has survived request cancellation?")
//}

fun main() {
    val mainScope = MainScope()
    mainScope.launch {
        repeat(10) {
            println("main scope")
        }
    }
}