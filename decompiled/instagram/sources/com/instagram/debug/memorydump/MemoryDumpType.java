package com.instagram.debug.memorydump;

import java.util.Locale;

public enum MemoryDumpType {
    CRASH(1, "crash"),
    LEAK(2, "leak"),
    DAILY(3, "daily");
    

    /* renamed from: id */
    public final int f162id;
    public final String patternPrefix;

    /* access modifiers changed from: public */
    MemoryDumpType(int i, String str) {
        this.f162id = i;
        this.patternPrefix = str;
    }

    public int getId() {
        return this.f162id;
    }

    public String getPatternPrefix() {
        return this.patternPrefix;
    }

    public String getString() {
        return name().toLowerCase(Locale.US);
    }
}
