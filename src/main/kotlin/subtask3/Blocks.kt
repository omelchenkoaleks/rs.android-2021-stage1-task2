package subtask3

import kotlin.reflect.KClass


fun main() {
    val blocks = Blocks()
    val blockA = arrayOf(1, "3", 4, "3")
    blocks.getData(blockA, String::class)
}

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        TODO("Not realization")
    }
}
