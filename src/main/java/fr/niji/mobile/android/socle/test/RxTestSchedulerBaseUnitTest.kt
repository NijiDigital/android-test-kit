package fr.niji.mobile.android.socle.test

import fr.niji.mobile.android.socle.test.rule.RxAndroidSchedulersRule
import io.reactivex.schedulers.TestScheduler
import org.junit.Rule

open class RxTestSchedulerBaseUnitTest : BaseUnitTest() {

    ///////////////////////////////////////////////////////////////////////////
    // DATA
    ///////////////////////////////////////////////////////////////////////////

    protected val testScheduler: TestScheduler = TestScheduler()

    ///////////////////////////////////////////////////////////////////////////
    // RULES
    ///////////////////////////////////////////////////////////////////////////

    @JvmField
    @Rule
    var rule = RxAndroidSchedulersRule(testScheduler)
}
