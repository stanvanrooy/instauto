package com.facebook.p002ui.emoji.model;

import android.os.Parcelable;
import p000X.AnonymousClass1Q6;

/* renamed from: com.facebook.ui.emoji.model.Emoji */
public abstract class Emoji implements Parcelable {
    public static final AnonymousClass1Q6 A00 = new AnonymousClass1Q6(2);
    public static final AnonymousClass1Q6 A01 = new AnonymousClass1Q6(2);

    public abstract String A00();

    public final String toString() {
        String A002 = A00();
        StringBuilder sb = new StringBuilder(11);
        int i = 0;
        boolean z = true;
        while (i < A002.length()) {
            if (z) {
                z = false;
            } else {
                sb.append('_');
            }
            int codePointAt = Character.codePointAt(A002, i);
            sb.append(Integer.toHexString(codePointAt));
            i += Character.charCount(codePointAt);
        }
        return sb.toString();
    }
}
