package p000X;

import android.util.Log;

/* renamed from: X.0Kh  reason: invalid class name and case insensitive filesystem */
public abstract class C05400Kh implements AnonymousClass0CI {
    public int mMinimumLoggingLevel;

    public abstract void wtf(String str, String str2);

    public abstract void wtf(String str, String str2, Throwable th);

    public int getMinimumLoggingLevel() {
        return this.mMinimumLoggingLevel;
    }

    public boolean isLoggable(int i) {
        if (this.mMinimumLoggingLevel <= i) {
            return true;
        }
        return false;
    }

    public void setMinimumLoggingLevel(int i) {
        this.mMinimumLoggingLevel = i;
    }

    public void log(int i, String str, String str2) {
        Log.println(i, str, str2);
    }

    /* renamed from: d */
    public void mo917d(String str, String str2) {
    }

    /* renamed from: d */
    public void mo918d(String str, String str2, Throwable th) {
    }

    /* renamed from: e */
    public void mo919e(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: e */
    public void mo920e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    /* renamed from: i */
    public void mo1388i(String str, String str2) {
    }

    /* renamed from: i */
    public void mo1389i(String str, String str2, Throwable th) {
    }

    /* renamed from: v */
    public void mo925v(String str, String str2) {
    }

    /* renamed from: v */
    public void mo926v(String str, String str2, Throwable th) {
    }

    /* renamed from: w */
    public void mo927w(String str, String str2) {
        Log.w(str, str2);
    }

    /* renamed from: w */
    public void mo928w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }
}
