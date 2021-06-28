package subtask3

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        when (blockB.simpleName) {
            "String" -> {
                println("Sting")
                val stringBuilder: StringBuilder = java.lang.StringBuilder()
                blockA.forEach {
                    if (it is String) {
                        stringBuilder.append(it)
                    }
                }
                return stringBuilder.toString()
            }
            "Int" -> {
                println("Int")
                var sum = 0
                blockA.forEach {
                    if (it is Int) {
                        sum += it
                    }
                }
                return sum

            }
            "LocalDate" -> {
                val arrayDate = getListLocalDate(blockA)
                var nearestDate = arrayDate[0]
                for (i in arrayDate.indices - 2) {
                    if (arrayDate[i] > arrayDate[i + 1]) {
                        nearestDate = arrayDate[i]
                    }
                }
                return formatDate(nearestDate)
            }
        }
        return ""
    }

    private fun formatDate(date: LocalDate): String {
        val year = date.year
        val month = date.monthValue
        val dayOfMonth = date.dayOfMonth
        return "$dayOfMonth.$month.$year"
    }

    private fun getListLocalDate(block: Array<*>): Array<LocalDate> {
        val arrayDate = mutableListOf<LocalDate>()
        block.forEach {
            if (it is LocalDate) {
                arrayDate.add(it)
            }
        }
        return arrayDate.toTypedArray()
    }
}
