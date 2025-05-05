import kotlinx.coroutines.*

fun main() = runBlocking {


    // bel join
    val job1 = launch {
        repeat(5) {
            println("Job 1: Working... $it")
            delay(1000)
        }
    }

    delay(3000)
    println("Job 1: Waiting for completion using join()...")
    job1.join() //ba2ol lel courotine aw el running block to wait until job is finished but its not cancelled w hatkamel el 5 repeats bto3ha, momken a2ol en el courotine suspends l7ad ma el job bt5alas
    println("Job 1: Completed with join().")

//bel cancelAndJoin
val job2 = launch {
        repeat(5) {
            println("Job 2: Working... $it")
            delay(1000)
        }
    }

    delay(3000)
    println("Job 2: Canceling job and waiting for completion using cancelAndJoin()...")
    job2.cancelAndJoin() //ba cancel el job ba3d kda bastana el corotine t5alas
    println("Job 2: Cancelled and joined.")
}
