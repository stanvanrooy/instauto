package p000X;

import android.view.View;
import java.util.Arrays;

/* renamed from: X.1bX  reason: invalid class name and case insensitive filesystem */
public final class C32601bX extends C256219o {
    public final /* synthetic */ C32591bW A00;

    public C32601bX(C32591bW r1) {
        this.A00 = r1;
    }

    public final void A08(C255119b r3, int i) {
        AnonymousClass0Z0.A0A(-1231062177, AnonymousClass0Z0.A03(-1523581385));
    }

    public final void A09(C255119b r10, int i, int i2, int i3, int i4, int i5) {
        int A03 = AnonymousClass0Z0.A03(-826318008);
        C32591bW r4 = this.A00;
        int[] iArr = r4.A02;
        if (!(iArr == null || iArr.length == 0)) {
            int i6 = 0;
            while (true) {
                if (i6 >= r10.AI5()) {
                    break;
                } else if (((float) r10.AI1(i6).getBottom()) > r4.A00) {
                    i += i6;
                    break;
                } else {
                    i6++;
                }
            }
            int binarySearch = Arrays.binarySearch(r4.A02, i);
            if (binarySearch != -1) {
                if (binarySearch < 0) {
                    binarySearch = Math.abs(binarySearch + 2);
                }
                int[] iArr2 = r4.A02;
                int i7 = iArr2[binarySearch];
                int i8 = Integer.MAX_VALUE;
                if (binarySearch < iArr2.length - 1) {
                    i8 = iArr2[binarySearch + 1];
                }
                int itemViewType = r4.A06.getItemViewType(i7);
                View view = r4.A06.getView(i7, (View) r4.A04.get(itemViewType), r4.A05);
                r4.A04.put(itemViewType, view);
                View view2 = r4.A01;
                if (view2 != view) {
                    if (view2 != null) {
                        AnonymousClass0ZA.A0E(r4.A03, new AnonymousClass2KE(r4), 467657659);
                    }
                    AnonymousClass0ZA.A0E(r4.A03, new AnonymousClass2KF(r4, view), -1431199918);
                }
                View AI1 = r4.A07.AI1(1);
                int i9 = i + 1;
                float f = r4.A00;
                if (r4.A01 != null) {
                    if (i9 < ((AnonymousClass1PI) r4.A06).getCount() && AI1 != null && i9 == i8) {
                        f = (float) Math.min(AI1.getTop() - r4.A01.getMeasuredHeight(), 0);
                    }
                    r4.A01.setTranslationY(f);
                }
                AnonymousClass0Z0.A0A(-2067539083, A03);
            }
        }
        if (r4.A01 != null) {
            AnonymousClass0ZA.A0E(r4.A03, new AnonymousClass2KE(r4), 467657659);
        }
        AnonymousClass0Z0.A0A(-2067539083, A03);
    }
}
