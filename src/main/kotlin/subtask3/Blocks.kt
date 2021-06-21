package subtask3

import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        when (blockB.qualifiedName) {
            is String -> {
                val stringBuilder: StringBuilder = java.lang.StringBuilder()
                blockA.forEach {
                    if (it is String) {
                        println(it)
                        stringBuilder.append(it)
                    }
                }
                return stringBuilder.toString()
            }
        }
        return ""
    }
}
