package p000X;

import android.view.View;
import java.util.List;

/* renamed from: X.1dp  reason: invalid class name and case insensitive filesystem */
public class C33991dp {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06 = true;
    public int A07;
    public int A08;
    public int A09 = 0;
    public int A0A;
    public List A0B = null;

    public final View A00(C31291Xl r7) {
        List list = this.A0B;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                View view = ((AnonymousClass1ZK) this.A0B.get(i)).itemView;
                AnonymousClass1ZK r2 = ((AnonymousClass1ZN) view.getLayoutParams()).A01;
                if (r2.isRemoved() || this.A08 != r2.getLayoutPosition()) {
                    i++;
                } else {
                    A01(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = r7.A02(this.A08, Long.MAX_VALUE).itemView;
        this.A08 += this.A0A;
        return view2;
    }

    public final void A01(View view) {
        int layoutPosition;
        int size = this.A0B.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AnonymousClass1ZK) this.A0B.get(i2)).itemView;
            AnonymousClass1ZN r0 = (AnonymousClass1ZN) view3.getLayoutParams();
            if (view3 != view) {
                AnonymousClass1ZK r1 = r0.A01;
                if (!r1.isRemoved() && (layoutPosition = (r1.getLayoutPosition() - this.A08) * this.A0A) >= 0 && layoutPosition < i) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    }
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.A08 = -1;
        } else {
            this.A08 = ((AnonymousClass1ZN) view2.getLayoutParams()).A01.getLayoutPosition();
        }
    }
}
