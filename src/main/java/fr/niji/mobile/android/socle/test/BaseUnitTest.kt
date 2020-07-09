package fr.niji.mobile.android.socle.test

import android.app.Application
import androidx.annotation.CallSuper
import fr.niji.mobile.android.socle.test.rule.TimberConsoleRule
import com.google.firebase.crashlytics.FirebaseCrashlytics
import io.mockk.Runs
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.mockkStatic
import io.mockk.unmockkAll
import io.mockk.unmockkObject
import org.junit.After
import org.junit.Before
import org.junit.Rule
import toothpick.ktp.KTP

abstract class BaseUnitTest : AbstractBaseUnitTest() {

    ///////////////////////////////////////////////////////////////////////////
    // RULE
    ///////////////////////////////////////////////////////////////////////////

    @JvmField
    @Rule
    var timberRule = TimberConsoleRule()

    ///////////////////////////////////////////////////////////////////////////
    // LIFE CYCLE
    ///////////////////////////////////////////////////////////////////////////

    @Before
    @CallSuper
    open fun beforeEachTest() {
        // Should be empty
    }

    // PB with clearallmock unmockall
    // Is it necessary, either redundant ! Maybe just do it at end of suite !
    @After
    open fun afterEachTest() {
        clearAllMocks()
        unmockkAll()
    }

    ///////////////////////////////////////////////////////////////////////////
    // HELPER
    ///////////////////////////////////////////////////////////////////////////

    protected fun mockCrashlytics() {
        mockkStatic(FirebaseCrashlytics::class)
        every { FirebaseCrashlytics.getInstance().log(any()) } just Runs
    }

    protected fun unmockCrashlytics() {
        mockkStatic(FirebaseCrashlytics::class)
    }

    protected fun mockKtp() {
        mockkObject(KTP)
        every { KTP.openRootScope() } returns mockk()
        every { KTP.openRootScope().getInstance(Application::class.java) } returns mockk()
    }

    protected fun unmockKtp() {
        unmockkObject(KTP)
    }
}
