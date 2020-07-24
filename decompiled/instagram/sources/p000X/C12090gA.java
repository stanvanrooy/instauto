package p000X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.0gA  reason: invalid class name and case insensitive filesystem */
public final class C12090gA extends C12100gB {
    public static C12090gA A0B;
    public AnonymousClass293 A00;
    public C486128t A01;
    public C30757DjC A02;
    public AnonymousClass291 A03;
    public boolean A04;
    public boolean A05 = false;
    public final C12520gs A06;
    public final C12360gc A07 = new C12360gc();
    public final C12500gq A08;
    public final C12490gp A09 = new C12490gp();
    public final C12510gr A0A;

    public final long A03() {
        return 567067343352427L;
    }

    public final boolean A0C() {
        return true;
    }

    public static synchronized C12090gA A00(Context context) {
        C12090gA r0;
        synchronized (C12090gA.class) {
            if (A0B == null) {
                A0B = new C12090gA(context, new C12130gE());
            }
            r0 = A0B;
        }
        return r0;
    }

    public final AnonymousClass291 A05() {
        return this.A03;
    }

    public final void A06() {
        AnonymousClass293 r0 = this.A00;
        if (r0 != null) {
            ArrayList arrayList = new ArrayList();
            for (Integer intValue : r0.A00.keySet()) {
                arrayList.add(new AnonymousClass299(intValue.intValue()));
            }
            A02(7, arrayList);
        }
    }

    public final boolean A09() {
        C486128t r0 = this.A01;
        if (r0 == null || !r0.A04) {
            return false;
        }
        return true;
    }

    public final boolean A0A() {
        C486128t r0 = this.A01;
        if (r0 == null || !r0.A05) {
            return false;
        }
        return true;
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final boolean A0D(int i) {
        if (this.A04) {
            return true;
        }
        return super.A0D(i);
    }

    public C12090gA(Context context, C12130gE r3) {
        super(context, r3);
        this.A08 = new C12500gq(context);
        this.A0A = new C12510gr();
        this.A06 = new C12520gs();
    }
}
