package p000X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.APQ */
public final class APQ implements View.OnTouchListener {
    public GestureDetector A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C224729lw A02;
    public final /* synthetic */ C2103495h A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public APQ(C2103495h r4, long j, boolean z, boolean z2, boolean z3, C224729lw r10, boolean z4, String str) {
        this.A03 = r4;
        this.A01 = j;
        this.A07 = z;
        this.A05 = z2;
        this.A08 = z3;
        this.A02 = r10;
        this.A06 = z4;
        this.A04 = str;
        this.A00 = new GestureDetector(r4.A01.getContext(), new APP(this));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00.onTouchEvent(motionEvent);
    }
}
