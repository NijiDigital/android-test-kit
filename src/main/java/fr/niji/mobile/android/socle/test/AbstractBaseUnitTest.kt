package fr.niji.mobile.android.socle.test

import java.io.File

abstract class AbstractBaseUnitTest {

    ///////////////////////////////////////////////////////////////////////////
    // CONST
    ///////////////////////////////////////////////////////////////////////////

    companion object {
        private const val ANSI_GREEN = "\u001B[32m"
        private const val ANSI_RED = "\u001B[31m"
        private const val ANSI_RESET = "\u001B[0m"
        private const val ANSI_BLUE = "\u001B[34m"
    }

    ///////////////////////////////////////////////////////////////////////////
    // TEST HELPERS
    ///////////////////////////////////////////////////////////////////////////

    protected fun log(vararg msgs: String, color: String = ANSI_RESET) {
        var msg = ""
        msgs.forEach { msg += it + "" }
        println("${this.javaClass.simpleName} : $color$msg$ANSI_RESET")
    }

    protected fun logRed(vararg msgs: String) {
        var msg = ""
        msgs.forEach { msg += it + "" }
        println("${this.javaClass.simpleName} : $ANSI_RED$msg$ANSI_RESET")
    }

    protected fun logGreen(vararg msgs: String) {
        var msg = ""
        msgs.forEach { msg += it + "" }
        println("${this.javaClass.simpleName} : $ANSI_GREEN$msg$ANSI_RESET")
    }

    protected fun logBlue(vararg msgs: String) {
        var msg = ""
        msgs.forEach { msg += it + "" }
        println("${this.javaClass.simpleName} : $ANSI_BLUE$msg$ANSI_RESET")
    }

    protected fun getFileAsString(filename: String): String {
        return javaClass.classLoader!!.getResourceAsStream(filename)
                .bufferedReader()
                .use { it.readText() }
    }

    protected fun getFile(filename: String): File {
        return File(javaClass.classLoader!!.getResource(filename).file)
    }
}
