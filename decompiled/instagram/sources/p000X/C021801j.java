package p000X;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.io.IOException;

/* renamed from: X.01j  reason: invalid class name and case insensitive filesystem */
public final class C021801j {
    public C022301o A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final Handler A05;
    public final C022501q A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A = ".stacktrace";
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public C021801j(Context context, String str, C022501q r5, C022301o r6, Handler handler, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, boolean z5, String str2, String str3, String str4, int i3, boolean z6) {
        this.A04 = context;
        this.A09 = str;
        this.A06 = r5;
        this.A00 = r6;
        this.A05 = handler;
        this.A01 = i;
        this.A0H = z;
        this.A0F = z2;
        this.A0E = z3;
        this.A03 = i2;
        this.A0G = z4;
        this.A0C = z5;
        this.A07 = str2;
        this.A08 = str3;
        this.A0B = str4;
        this.A02 = i3;
        this.A0D = z6;
    }

    public final String A00() {
        try {
            return new File(this.A04.getDir("sigquit", 0), this.A09.replace('.', '_').replace(':', '_')).getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }
}
