package p000X;

import android.graphics.Rect;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Og  reason: invalid class name and case insensitive filesystem */
public final class C06230Og implements View.OnLayoutChangeListener {
    public final Rect A00;
    public final List A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ boolean A04 = true;
    public final /* synthetic */ boolean A05;

    public C06230Og(View view, boolean z, View view2) {
        this.A03 = view;
        this.A05 = z;
        this.A02 = view2;
        Rect rect = new Rect();
        this.A00 = rect;
        this.A01 = Collections.singletonList(rect);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A03.getDisplay().getRectSize(this.A00);
        Rect rect = this.A00;
        if (this.A04) {
            i = rect.left;
        }
        if (this.A05) {
            i3 = rect.right;
        }
        rect.set(i, i2, i3, i4);
        AnonymousClass1E1.A0g(this.A02, this.A01);
    }
}
