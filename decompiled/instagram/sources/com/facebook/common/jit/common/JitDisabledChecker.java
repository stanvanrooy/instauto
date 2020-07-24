package com.facebook.common.jit.common;

import android.text.SpannedString;

public final class JitDisabledChecker {
    public static final boolean sIsJitDisabled = false;

    static {
        throw new IllegalStateException("ApplicationHolder#set never called");
    }

    public static boolean testCompileMethod(int i) {
        if (new SpannedString("Test").length() > i) {
            return true;
        }
        return false;
    }
}
