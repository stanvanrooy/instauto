package p000X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.DT0 */
public final class DT0 implements DT5, C38481lL {
    public final int A00;
    public final AnonymousClass1NJ A01;
    public final C30461Tx A02;
    public final C30152DSz A03;
    public final C32151ag A04;
    public final C36841ih A05;

    public final void B0a(MotionEvent motionEvent) {
        this.A02.B0e(this.A01, this.A05, this.A00, this.A04);
    }

    public final boolean B4G(MotionEvent motionEvent) {
        return this.A03.B4G(motionEvent);
    }

    public final void BA7() {
        this.A02.BA7();
    }

    public final void BA8(float f) {
        this.A02.BA8(f);
    }

    public final void BA9(float f) {
        this.A02.BA9(f);
    }

    public final void BAA(float f) {
        this.A02.BAA(f);
    }

    public final void BAB(String str) {
        this.A02.BAB(str);
    }

    public final void BKv(C38511lO r8) {
        this.A05.A0M(true);
        this.A02.BKw(r8, this.A01, this.A05, this.A00, this.A04.A07);
    }

    public final void BL0(C38511lO r3) {
        this.A05.A0M(false);
    }

    public final void BNa(MotionEvent motionEvent) {
        this.A02.BNe(this.A01, this.A05, this.A00, this.A04);
    }

    public DT0(Context context, C30461Tx r8, C32151ag r9, AnonymousClass1NJ r10, C36841ih r11, int i) {
        Context context2 = context;
        this.A03 = new C30152DSz(context2, this, r9.A0G, r9.A07, r10);
        this.A02 = r8;
        this.A04 = r9;
        this.A01 = r10;
        this.A05 = r11;
        this.A00 = i;
    }
}
