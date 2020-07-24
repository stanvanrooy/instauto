package p000X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.1bs  reason: invalid class name and case insensitive filesystem */
public final class C32801bs {
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();
    public final C28041Ke A02;
    public final WeakReference A03;
    public final List A04 = new LinkedList();

    public C32801bs(View view, C28041Ke r3) {
        this.A03 = new WeakReference(view);
        this.A02 = r3;
    }

    public final void A00(List list) {
        list.clear();
        this.A04.clear();
        View view = (View) this.A03.get();
        if (view != null && view.getGlobalVisibleRect(this.A01) && !this.A01.isEmpty()) {
            this.A04.add(this.A01);
            for (C32781bq AIG : this.A02) {
                AIG.AIG(this.A00);
                ListIterator listIterator = this.A04.listIterator();
                while (listIterator.hasNext()) {
                    Rect rect = (Rect) listIterator.next();
                    if (Rect.intersects(this.A00, rect)) {
                        listIterator.remove();
                        int i = this.A00.top;
                        int i2 = rect.top;
                        if (i > i2) {
                            listIterator.add(new Rect(rect.left, i2, rect.right, i));
                        }
                        int i3 = this.A00.bottom;
                        int i4 = rect.bottom;
                        if (i3 < i4) {
                            listIterator.add(new Rect(rect.left, i3, rect.right, i4));
                        }
                        Rect rect2 = this.A00;
                        int i5 = rect2.left;
                        int i6 = rect.left;
                        if (i5 > i6) {
                            listIterator.add(new Rect(i6, Math.max(rect.top, rect2.top), i5, Math.min(rect.bottom, rect2.bottom)));
                        }
                        Rect rect3 = this.A00;
                        int i7 = rect3.right;
                        int i8 = rect.right;
                        if (i7 < i8) {
                            listIterator.add(new Rect(i7, Math.max(rect.top, rect3.top), i8, Math.min(rect.bottom, rect3.bottom)));
                        }
                    }
                }
            }
            list.addAll(this.A04);
        }
    }
}
