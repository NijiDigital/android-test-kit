package fr.niji.mobile.android.socle.test;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\u0006H\u0017J\b\u0010\b\u001a\u00020\u0006H\u0004J\b\u0010\t\u001a\u00020\u0006H\u0004J\b\u0010\n\u001a\u00020\u0006H\u0004J\b\u0010\u000b\u001a\u00020\u0006H\u0004R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lfr/niji/mobile/android/socle/test/BaseUnitTest;", "Lfr/niji/mobile/android/socle/test/AbstractBaseUnitTest;", "()V", "timberRule", "Lfr/niji/mobile/android/socle/test/rule/TimberConsoleRule;", "afterEachTest", "", "beforeEachTest", "mockCrashlytics", "mockKtp", "unmockCrashlytics", "unmockKtp", "test-kit_debug"})
public abstract class BaseUnitTest extends fr.niji.mobile.android.socle.test.AbstractBaseUnitTest {
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public fr.niji.mobile.android.socle.test.rule.TimberConsoleRule timberRule;
    
    @androidx.annotation.CallSuper()
    @org.junit.Before()
    public void beforeEachTest() {
    }
    
    @org.junit.After()
    public void afterEachTest() {
    }
    
    protected final void mockCrashlytics() {
    }
    
    protected final void unmockCrashlytics() {
    }
    
    protected final void mockKtp() {
    }
    
    protected final void unmockKtp() {
    }
    
    public BaseUnitTest() {
        super();
    }
}