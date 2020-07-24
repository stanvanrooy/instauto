package p000X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.1l6  reason: invalid class name and case insensitive filesystem */
public final class C38331l6 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ TextView A03;
    public final /* synthetic */ TextView A04;
    public final /* synthetic */ boolean A05;

    public C38331l6(ViewGroup viewGroup, TextView textView, boolean z, TextView textView2, View view, View view2) {
        this.A02 = viewGroup;
        this.A04 = textView;
        this.A05 = z;
        this.A03 = textView2;
        this.A01 = view;
        this.A00 = view2;
    }

    public final boolean onPreDraw() {
        this.A02.getViewTreeObserver().removeOnPreDrawListener(this);
        C31821a1 r3 = (C31821a1) this.A02.getTouchDelegate();
        r3.A00.clear();
        Rect rect = new Rect();
        this.A04.getHitRect(rect);
        rect.top = 0;
        rect.right = this.A02.getRight();
        if (this.A05) {
            Rect rect2 = new Rect();
            this.A03.getHitRect(rect2);
            rect2.bottom = this.A02.getHeight();
            r3.A00.add(new TouchDelegate(rect2, this.A03));
        } else {
            rect.bottom = this.A02.getHeight();
        }
        r3.A00.add(new TouchDelegate(rect, this.A04));
        Rect rect3 = new Rect();
        this.A01.getHitRect(rect3);
        r3.A00.add(new TouchDelegate(rect3, this.A00));
        return true;
    }
}
