package p000X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.0f7  reason: invalid class name and case insensitive filesystem */
public final class C11530f7 extends C11540f8 {
    public C11720fR A00;
    public C14330kH A01;
    public int A02;
    public C11730fS A03;
    public C14790lj A04;
    public C15290me A05;
    public C11670fM A06;
    public final Context A07;
    public final C11570fB A08;

    public final C14800ll A01() {
        return this.A04;
    }

    public final void A02() {
        Context context = this.A07;
        Resources resources = context.getResources();
        C11670fM r5 = this.A06;
        C11720fR r6 = this.A00;
        C14320kG r7 = new C14320kG(this.A08);
        if (C14330kH.A0A == null) {
            synchronized (C14330kH.class) {
                try {
                    if (C14330kH.A0A == null) {
                        C14330kH.A0A = new C14330kH(context, resources, r5, r6, r7);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        }
        C14330kH r52 = C14330kH.A0A;
        this.A01 = r52;
        Context context2 = this.A07;
        C11730fS r3 = this.A03;
        int i = this.A02;
        if (C14790lj.A03 == null) {
            synchronized (C14790lj.class) {
                try {
                    if (C14790lj.A03 == null) {
                        C14790lj.A03 = new C14790lj(context2, r52, r3, i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        this.A04 = C14790lj.A03;
        C15290me r1 = new C15290me(this.A01);
        this.A05 = r1;
        AnonymousClass0QA.A00.A00(r1);
    }

    public C11530f7(Context context, C11570fB r4, AnonymousClass0QT r5, int i) {
        this.A07 = context;
        this.A08 = r4;
        C11670fM r1 = new C11670fM(r4, new C11660fL());
        this.A06 = r1;
        this.A00 = new C11720fR(r5);
        this.A03 = new C11730fS(r5, r1);
        this.A02 = i;
    }
}
