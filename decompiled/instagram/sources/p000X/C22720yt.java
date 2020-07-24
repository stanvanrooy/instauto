package p000X;

import java.util.Arrays;
import java.util.HashSet;

/* 'enum' modifier removed */
/* renamed from: X.0yt  reason: invalid class name and case insensitive filesystem */
public final class C22720yt extends C22680yp {
    public C22720yt(Class cls) {
        super("SET_STRINGS", 3, cls, "set_strings");
    }

    public final Object A00(String str) {
        return new HashSet(Arrays.asList(str.substring(1, str.length() - 1).split(", ")));
    }
}
