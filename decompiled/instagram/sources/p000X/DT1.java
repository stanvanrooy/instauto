package p000X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.DT1 */
public final class DT1 implements DT5, C38481lL {
    public final int A00;
    public final AnonymousClass1U8 A01;
    public final AnonymousClass24E A02;
    public final AnonymousClass1NJ A03;
    public final C30152DSz A04;
    public final C36841ih A05;

    public final void B0a(MotionEvent motionEvent) {
        this.A01.B0d(this.A03, this.A05, this.A00, this.A02);
    }

    public final boolean B4G(MotionEvent motionEvent) {
        return this.A04.B4G(motionEvent);
    }

    public final void BA7() {
        this.A01.BA7();
    }

    public final void BA8(float f) {
        this.A01.BA8(f);
    }

    public final void BA9(float f) {
        this.A01.BA9(f);
    }

    public final void BAA(float f) {
        this.A01.BAA(f);
    }

    public final void BAB(String str) {
        this.A01.BAB(str);
    }

    public final void BKv(C38511lO r8) {
        this.A05.A0M(true);
        this.A01.BKw(r8, this.A03, this.A05, this.A00, this.A02.A0A);
    }

    public final void BL0(C38511lO r3) {
        this.A05.A0M(false);
    }

    public final void BNa(MotionEvent motionEvent) {
        this.A01.BNd(this.A03, this.A05, this.A00, this.A02);
    }

    public DT1(Context context, AnonymousClass1U8 r8, AnonymousClass24E r9, AnonymousClass1NJ r10, C36841ih r11, int i) {
        Context context2 = context;
        this.A04 = new C30152DSz(context2, this, r9.ANP(), r9.A0A, r10);
        this.A01 = r8;
        this.A02 = r9;
        this.A03 = r10;
        this.A05 = r11;
        this.A00 = i;
    }
}
