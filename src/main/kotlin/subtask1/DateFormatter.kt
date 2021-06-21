package subtask1

import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {

        return if (isValidDate("$month/$day/$year")) {
            day + " ${getMonthStr(month)}, ${getDayOfWeek(day, month, year)}"
        } else {
            "Такого дня не существует"
        }

    }

    private fun getMonthStr(num: String): String {
         return when (num.toInt()) {
            1 -> {
                return "января"
            }
            2 -> {
                return "февраля"
            }
            3 -> {
                return "марта"
            }
            4 -> {
                return "апреля"
            }
            5 -> {
                return "мая"
            }
            6 -> {
                return "июня"
            }
            7 -> {
                return "июля"
            }
            8 -> {
                return "августа"
            }
            9 -> {
                return "сентября"
            }
            10 -> {
                return "октября"
            }
            11 -> {
                return "ноября"
            }
            12 -> {
                return "декабря"
            }
             else -> "такого месяца не существует"
         }
    }

    private fun getDayOfWeek(day: String, month: String, year: String): String {
        val formatDay = "$day/$month/$year"
        val simpleDateFormat: SimpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
        val date = simpleDateFormat.parse(formatDay)
        val dateFormat: DateFormat = SimpleDateFormat("EEEE")

        return dateFormat.format(date)
    }

    private fun isValidDate(input: String): Boolean {
        val formatString = "MM/dd/yyyy"
        try {
            val format = SimpleDateFormat(formatString)
            format.isLenient = false
            format.parse(input)
        } catch (e: ParseException) {
            return false
        } catch (e: IllegalArgumentException) {
            return false
        }
        return true
    }
}
