package fr.niji.mobile.android.socle.test.rule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lfr/niji/mobile/android/socle/test/rule/RxAndroidSchedulersRule;", "Lorg/junit/rules/TestRule;", "scheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "(Lio/reactivex/rxjava3/core/Scheduler;)V", "getScheduler", "()Lio/reactivex/rxjava3/core/Scheduler;", "apply", "Lorg/junit/runners/model/Statement;", "base", "description", "Lorg/junit/runner/Description;", "test-kit_debug"})
public final class RxAndroidSchedulersRule implements org.junit.rules.TestRule {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.rxjava3.core.Scheduler scheduler = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.junit.runners.model.Statement apply(@org.jetbrains.annotations.NotNull()
    org.junit.runners.model.Statement base, @org.jetbrains.annotations.NotNull()
    org.junit.runner.Description description) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Scheduler getScheduler() {
        return null;
    }
    
    public RxAndroidSchedulersRule(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Scheduler scheduler) {
        super();
    }
}