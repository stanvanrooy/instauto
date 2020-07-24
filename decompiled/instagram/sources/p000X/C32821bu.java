package p000X;

import android.graphics.Rect;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1bu  reason: invalid class name and case insensitive filesystem */
public final class C32821bu {
    public boolean A00 = false;
    public final Rect A01 = new Rect();
    public final Rect A02 = new Rect();
    public final Handler A03;
    public final C04140Cp A04;
    public final C32801bs A05;
    public final C32811bt A06;
    public final C32761bo A07;
    public final Runnable A08;
    public final List A09 = new ArrayList();
    public final List A0A = new ArrayList();

    public C32821bu(C32801bs r2, C04140Cp r3, C32761bo r4, C32811bt r5, Handler handler) {
        this.A05 = r2;
        this.A04 = r3;
        this.A07 = r4;
        this.A06 = r5;
        this.A03 = handler;
        this.A08 = new C32831bv(this);
    }
}
