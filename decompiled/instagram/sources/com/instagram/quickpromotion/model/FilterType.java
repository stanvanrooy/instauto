package com.instagram.quickpromotion.model;

import java.util.HashMap;
import java.util.Map;

public enum FilterType {
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (FilterType filterType : values()) {
            A01.put(filterType.A00, filterType);
        }
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FilterType(String str) {
        this.A00 = str;
    }
}
