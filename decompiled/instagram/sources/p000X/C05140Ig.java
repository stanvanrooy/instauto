package p000X;

import android.content.Intent;

/* renamed from: X.0Ig  reason: invalid class name and case insensitive filesystem */
public final class C05140Ig implements C11180eY {
    public final Intent A00;
    public final Runnable A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C05140Ig(String str, Intent intent, String str2) {
        this.A02 = str;
        this.A04 = null;
        this.A00 = intent;
        this.A03 = str2;
        this.A05 = false;
        this.A01 = null;
    }

    public C05140Ig(String str, String str2, Runnable runnable) {
        this.A02 = str;
        this.A04 = str2;
        this.A00 = null;
        this.A03 = null;
        this.A05 = true;
        this.A01 = runnable;
    }
}
