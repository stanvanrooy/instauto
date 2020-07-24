package p000X;

import android.content.Context;
import android.view.View;

/* renamed from: X.ADT */
public final class ADT extends ADW {
    public static final int[] A01 = new int[2];
    public final ADU A00 = new ADU(this);

    public final void onMeasure(int i, int i2) {
        boolean z;
        ADU adu = this.A00;
        int[] iArr = A01;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            adu.A02 = true;
            iArr[0] = size;
            iArr[1] = size2;
            z = true;
        } else {
            ADR adr = adu.A00;
            if (adr != null) {
                adr.A01(i, i2, iArr);
                adu.A02 = false;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            setMeasuredDimension(iArr[0], iArr[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setRenderState(ADR adr) {
        C23161AAp aAp;
        ADU adu = this.A00;
        ADR adr2 = adu.A00;
        if (adr2 != adr) {
            if (adr2 != null) {
                adr2.A09 = null;
            }
            adu.A00 = adr;
            if (adr != null) {
                ADU adu2 = adr.A09;
                if (adu2 == null || adu2 == adu) {
                    adr.A09 = adu;
                    C23159AAn aAn = adr.A06;
                    if (aAn != null) {
                        aAp = aAn.A03;
                    } else {
                        aAp = null;
                    }
                    adu.A00(aAp);
                    return;
                }
                throw new RuntimeException("Must detach from previous host listener first");
            }
            adu.A00((C23161AAp) null);
        }
    }

    public ADT(Context context) {
        super(context);
    }

    public static void A00(ADW adw) {
        int childCount = adw.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = adw.getChildAt(i);
            if (childAt.isLayoutRequested()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), C25913Bc3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(childAt.getHeight(), C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
            if (childAt instanceof ADW) {
                A00((ADW) childAt);
            }
        }
    }
}
