package fr.niji.mobile.android.socle.test

import fr.niji.mobile.android.socle.test.rule.RxAndroidSchedulersRule
import io.reactivex.rxjava3.schedulers.Schedulers
import org.junit.Rule

open class RxTrampolineBaseUnitTest : BaseUnitTest() {

    ///////////////////////////////////////////////////////////////////////////
    // RULES
    ///////////////////////////////////////////////////////////////////////////

    @JvmField
    @Rule
    var rule = RxAndroidSchedulersRule(Schedulers.trampoline())
}
