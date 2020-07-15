package fr.niji.mobile.android.socle.test.rule.tree

import android.util.Log
import org.intellij.lang.annotations.Language
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.Date
import java.util.regex.Pattern

class ConsoleTree : Timber.DebugTree() {

    ///////////////////////////////////////////////////////////////////////////
    // DATA
    ///////////////////////////////////////////////////////////////////////////

    @Language("RegExp")
    private val anonymousClassPattern = Pattern.compile("""(\$\d+)+$""")

    private val dateTimeFormatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")

    ///////////////////////////////////////////////////////////////////////////
    // SPECIALIZATION
    ///////////////////////////////////////////////////////////////////////////

    override fun log(priority: Int, tag: String?, message: String, throwable: Throwable?) {
        val dateTime = dateTimeFormatter.format(Date())
        val priorityChar = when (priority) {
            Log.VERBOSE -> 'V'
            Log.DEBUG -> 'D'
            Log.INFO -> 'I'
            Log.WARN -> 'W'
            Log.ERROR -> 'E'
            Log.ASSERT -> 'A'
            else -> '?'
        }

        println("$dateTime $priorityChar/$tag: $message")
    }

    override fun createStackElementTag(element: StackTraceElement): String? {
        val matcher = anonymousClassPattern.matcher(element.className)
        val tag = when {
            matcher.find() -> matcher.replaceAll("")
            else -> element.className
        }
        return tag.substringAfterLast('.')
    }
}
