package fr.niji.mobile.android.socle.test.rule

import fr.niji.mobile.android.socle.test.rule.tree.ConsoleTree
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement
import timber.log.Timber

class TimberConsoleRule : TestRule {

    ///////////////////////////////////////////////////////////////////////////
    // SPECIALIZATION
    ///////////////////////////////////////////////////////////////////////////

    override fun apply(base: Statement, description: Description) =
        TimberConsoleStatement(base)

    ///////////////////////////////////////////////////////////////////////////
    // HELPER
    ///////////////////////////////////////////////////////////////////////////

    class TimberConsoleStatement constructor(private val baseStatement: Statement) : Statement() {

        ///////////////////////////////////////////////////////////////////////////
        // DATA
        ///////////////////////////////////////////////////////////////////////////

        private val consoleTree = ConsoleTree()

        ///////////////////////////////////////////////////////////////////////////
        // SPECIALIZATION
        ///////////////////////////////////////////////////////////////////////////

        override fun evaluate() {
            Timber.plant(consoleTree)
            try {
                baseStatement.evaluate()
            } finally {
                Timber.uproot(consoleTree)
            }
        }
    }
}
