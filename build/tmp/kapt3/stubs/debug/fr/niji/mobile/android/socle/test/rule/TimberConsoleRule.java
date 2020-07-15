package fr.niji.mobile.android.socle.test.rule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lfr/niji/mobile/android/socle/test/rule/TimberConsoleRule;", "Lorg/junit/rules/TestRule;", "()V", "apply", "Lfr/niji/mobile/android/socle/test/rule/TimberConsoleRule$TimberConsoleStatement;", "base", "Lorg/junit/runners/model/Statement;", "description", "Lorg/junit/runner/Description;", "TimberConsoleStatement", "test-kit_debug"})
public final class TimberConsoleRule implements org.junit.rules.TestRule {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public fr.niji.mobile.android.socle.test.rule.TimberConsoleRule.TimberConsoleStatement apply(@org.jetbrains.annotations.NotNull()
    org.junit.runners.model.Statement base, @org.jetbrains.annotations.NotNull()
    org.junit.runner.Description description) {
        return null;
    }
    
    public TimberConsoleRule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lfr/niji/mobile/android/socle/test/rule/TimberConsoleRule$TimberConsoleStatement;", "Lorg/junit/runners/model/Statement;", "baseStatement", "(Lorg/junit/runners/model/Statement;)V", "consoleTree", "Lfr/niji/mobile/android/socle/test/rule/tree/ConsoleTree;", "evaluate", "", "test-kit_debug"})
    public static final class TimberConsoleStatement extends org.junit.runners.model.Statement {
        private final fr.niji.mobile.android.socle.test.rule.tree.ConsoleTree consoleTree = null;
        private final org.junit.runners.model.Statement baseStatement = null;
        
        @java.lang.Override()
        public void evaluate() {
        }
        
        public TimberConsoleStatement(@org.jetbrains.annotations.NotNull()
        org.junit.runners.model.Statement baseStatement) {
            super();
        }
    }
}