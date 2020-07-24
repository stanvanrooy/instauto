package com.instagram.common.p004ui.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1Xv;
import p000X.AnonymousClass1ZN;
import p000X.C31291Xl;

/* renamed from: com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat */
public class LinearLayoutManagerCompat extends LinearLayoutManager {
    public int A00 = -1;
    public int A01 = -1;
    public boolean A02 = false;

    public final int A14(int i, C31291Xl r3, AnonymousClass1Xv r4) {
        this.A00 = -1;
        this.A01 = -1;
        return super.A14(i, r3, r4);
    }

    public final AnonymousClass1ZN A1F() {
        return new AnonymousClass1ZN(-1, -2);
    }

    public final void A1Q(C31291Xl r3, AnonymousClass1Xv r4) {
        int A03 = AnonymousClass0Z0.A03(1132530470);
        this.A00 = -1;
        this.A01 = -1;
        super.A1Q(r3, r4);
        AnonymousClass0Z0.A0A(-1557554311, A03);
    }

    public final int A1g() {
        int i;
        int i2;
        int A03 = AnonymousClass0Z0.A03(-1136396328);
        if (!this.A02) {
            i = super.A1g();
            i2 = 1558381145;
        } else {
            if (this.A00 == -1) {
                this.A00 = super.A1g();
            }
            i = this.A00;
            i2 = -792683111;
        }
        AnonymousClass0Z0.A0A(i2, A03);
        return i;
    }

    public final int A1h() {
        int i;
        int i2;
        int A03 = AnonymousClass0Z0.A03(-489409562);
        if (!this.A02) {
            i = super.A1h();
            i2 = -567197391;
        } else {
            if (this.A01 == -1) {
                this.A01 = super.A1h();
            }
            i = this.A01;
            i2 = 1158809412;
        }
        AnonymousClass0Z0.A0A(i2, A03);
        return i;
    }

    public LinearLayoutManagerCompat() {
    }

    public LinearLayoutManagerCompat(int i) {
        super(i, false);
    }

    public LinearLayoutManagerCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
