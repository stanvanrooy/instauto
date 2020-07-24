package p000X;

import android.graphics.Rect;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1bo  reason: invalid class name and case insensitive filesystem */
public final class C32761bo {
    public long A00;
    public final C32771bp A01 = new C32771bp();
    public final C32771bp A02 = new C32771bp();
    public final List A03 = new ArrayList(1);
    public final Map A04 = new HashMap();

    public static Rect A00(C37301jR r2) {
        if (r2 != null) {
            Rect rect = r2.A02;
            if (!(rect.top == Integer.MIN_VALUE || rect.left == Integer.MIN_VALUE || rect.right == Integer.MIN_VALUE || rect.bottom == Integer.MIN_VALUE)) {
                return rect;
            }
        }
        throw new IllegalStateException("This viewpoint has not been measured or is a group which will never return a measurement since it's made up of subviews that could be offscreen");
    }

    private void A01(C32771bp r5) {
        for (AnonymousClass1TY r2 : r5.A00.values()) {
            C37301jR r1 = (C37301jR) this.A04.get(r2.A03);
            r1.A01 = Constants.A0C;
            r1.A03.clear();
            r2.A01(this);
        }
    }

    public final float A02(AnonymousClass1TY r6) {
        C37301jR r1 = (C37301jR) this.A04.get(r6.A03);
        if (r1 == null) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        Rect A002 = A00(r1);
        int height = A002.height() * A002.width();
        int i = 0;
        for (Rect rect : r1.A03) {
            i += rect.height() * rect.width();
        }
        return ((float) i) / ((float) height);
    }

    public final long A03(AnonymousClass1TY r5) {
        C37301jR r0 = (C37301jR) this.A04.get(r5.A03);
        if (r0 == null) {
            return 0;
        }
        return this.A00 - r0.A00;
    }

    public final Integer A04(AnonymousClass1TY r3) {
        return ((C37301jR) this.A04.get(r3.A03)).A01;
    }

    public final void A05() {
        for (AnonymousClass1TY A012 : this.A02.A01) {
            A012.A01(this);
        }
        A01(this.A02);
        for (AnonymousClass1TY A013 : this.A01.A01) {
            A013.A01(this);
        }
        A01(this.A01);
    }

    public final void A06(long j, List list) {
        this.A00 = j;
        this.A03.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A03.add(new Rect((Rect) it.next()));
        }
        for (AnonymousClass1TY r0 : this.A02.A00.values()) {
            this.A04.remove(r0.A03);
        }
        for (AnonymousClass1TY r02 : this.A01.A00.values()) {
            this.A04.remove(r02.A03);
        }
        for (C37301jR r03 : this.A04.values()) {
            r03.A03.clear();
        }
        C32771bp.A00(this.A02);
        C32771bp.A00(this.A01);
    }

    public final void A07(AnonymousClass1TY r3, Rect rect) {
        rect.set(A00((C37301jR) this.A04.get(r3.A03)));
    }

    public final void A08(AnonymousClass1TY r3, Rect rect) {
        rect.setEmpty();
        for (Rect union : ((C37301jR) this.A04.get(r3.A03)).A03) {
            rect.union(union);
        }
    }
}
