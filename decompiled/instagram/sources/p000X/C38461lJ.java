package p000X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.1lJ  reason: invalid class name and case insensitive filesystem */
public final class C38461lJ implements View.OnTouchListener {
    public final C38481lL A00;
    public final /* synthetic */ AnonymousClass1NJ A01;
    public final /* synthetic */ C32151ag A02;
    public final /* synthetic */ AnonymousClass1VL A03;
    public final /* synthetic */ C36841ih A04;

    public C38461lJ(AnonymousClass1VL r10, AnonymousClass1NJ r11, boolean z, C32151ag r13, C36841ih r14, int i) {
        C38481lL r2;
        this.A03 = r10;
        AnonymousClass1NJ r6 = r11;
        this.A01 = r11;
        C32151ag r5 = r13;
        this.A02 = r13;
        C36841ih r7 = r14;
        this.A04 = r14;
        int i2 = i;
        if (!r11.AiO() || !z) {
            r2 = new C38471lK(r10.A02, r10.A03, r5, r6, r7, i2);
        } else {
            r2 = new DT0(r10.A02, r10.A03, r5, r6, r7, i2);
        }
        this.A00 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00.B4G(motionEvent);
    }
}
