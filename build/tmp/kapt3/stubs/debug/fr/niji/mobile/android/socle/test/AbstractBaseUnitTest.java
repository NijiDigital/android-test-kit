package fr.niji.mobile.android.socle.test;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0004J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0004J+\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0004\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0004\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0004\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0011\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0004\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lfr/niji/mobile/android/socle/test/AbstractBaseUnitTest;", "", "()V", "getFile", "Ljava/io/File;", "filename", "", "getFileAsString", "log", "", "msgs", "", "color", "([Ljava/lang/String;Ljava/lang/String;)V", "logBlue", "([Ljava/lang/String;)V", "logGreen", "logRed", "Companion", "test-kit_debug"})
public abstract class AbstractBaseUnitTest {
    private static final java.lang.String ANSI_GREEN = "\u001b[32m";
    private static final java.lang.String ANSI_RED = "\u001b[31m";
    private static final java.lang.String ANSI_RESET = "\u001b[0m";
    private static final java.lang.String ANSI_BLUE = "\u001b[34m";
    public static final fr.niji.mobile.android.socle.test.AbstractBaseUnitTest.Companion Companion = null;
    
    protected final void log(@org.jetbrains.annotations.NotNull()
    java.lang.String[] msgs, @org.jetbrains.annotations.NotNull()
    java.lang.String color) {
    }
    
    protected final void logRed(@org.jetbrains.annotations.NotNull()
    java.lang.String... msgs) {
    }
    
    protected final void logGreen(@org.jetbrains.annotations.NotNull()
    java.lang.String... msgs) {
    }
    
    protected final void logBlue(@org.jetbrains.annotations.NotNull()
    java.lang.String... msgs) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getFileAsString(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.io.File getFile(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
        return null;
    }
    
    public AbstractBaseUnitTest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lfr/niji/mobile/android/socle/test/AbstractBaseUnitTest$Companion;", "", "()V", "ANSI_BLUE", "", "ANSI_GREEN", "ANSI_RED", "ANSI_RESET", "test-kit_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}