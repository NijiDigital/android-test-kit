package fr.niji.mobile.android.socle.test;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lfr/niji/mobile/android/socle/test/RxTestSchedulerBaseUnitTest;", "Lfr/niji/mobile/android/socle/test/BaseUnitTest;", "()V", "rule", "Lfr/niji/mobile/android/socle/test/rule/RxAndroidSchedulersRule;", "testScheduler", "Lio/reactivex/rxjava3/schedulers/TestScheduler;", "getTestScheduler", "()Lio/reactivex/rxjava3/schedulers/TestScheduler;", "test-kit_debug"})
public class RxTestSchedulerBaseUnitTest extends fr.niji.mobile.android.socle.test.BaseUnitTest {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.rxjava3.schedulers.TestScheduler testScheduler = null;
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public fr.niji.mobile.android.socle.test.rule.RxAndroidSchedulersRule rule;
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.rxjava3.schedulers.TestScheduler getTestScheduler() {
        return null;
    }
    
    public RxTestSchedulerBaseUnitTest() {
        super();
    }
}