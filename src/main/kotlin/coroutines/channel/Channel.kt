package coroutines.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.runBlocking

//fun main() = runBlocking {
//    val channel = Channel<Int>()
//
//    launch {
//        // this might be heavy CPU-consuming computation or async logic, we'll just send five squares
//        for (x in 1..5) channel.send(x * x) // channel.close() // for (y in channel) println(y)
//    }
//// here we print five received integers:
//    repeat(5) { println(channel.receive()) }
//    println("Done!")
//}

//fun main() = runBlocking {
//
//    val channel = Channel<Int>()
//    channel.close()
//
////    val squares = produceSquares()
//    squares.consumeEach { println(it) }
//    println("Done!")
//}