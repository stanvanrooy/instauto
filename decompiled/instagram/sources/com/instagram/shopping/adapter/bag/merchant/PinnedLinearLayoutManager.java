package com.instagram.shopping.adapter.bag.merchant;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1Xv;
import p000X.AnonymousClass1ZK;
import p000X.C223359jd;
import p000X.C31291Xl;
import p000X.C31391Ya;
import p000X.C470021w;

public class PinnedLinearLayoutManager extends LinearLayoutManager {
    public Class A00;
    public Class A01;
    public String A02;
    public String A03;
    public final float A04 = 100.0f;
    public final Context A05;
    public final C470021w A06;
    public final C223359jd A07;

    public PinnedLinearLayoutManager(Context context, C223359jd r5) {
        super(1, false);
        this.A05 = context;
        this.A07 = r5;
        this.A06 = new C470021w(this, context);
    }

    public final void A1Z(RecyclerView recyclerView, AnonymousClass1Xv r3, int i) {
        C470021w r0 = this.A06;
        r0.A00 = i;
        A0t(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r5 != null) goto L_0x0089;
     */
    public final void A1Q(C31291Xl r13, AnonymousClass1Xv r14) {
        int i;
        String str;
        int i2;
        int A032 = AnonymousClass0Z0.A03(-801377600);
        super.A1Q(r13, r14);
        if (!(this.A01 == null || (str = this.A03) == null || r14.A08)) {
            View A0Z = A0Z(this.A07.AFZ(str));
            View view = null;
            String str2 = this.A02;
            if (!(str2 == null || this.A00 == null)) {
                view = A0Z(this.A07.AFZ(str2));
            }
            if (A0Z == null) {
                if (r14.A0C && (r14.A0A || r14.A0B)) {
                    List<AnonymousClass1ZK> list = r13.A07;
                    long AO9 = this.A07.AO9(this.A01, this.A03);
                    long AO92 = this.A07.AO9(this.A00, this.A02);
                    for (AnonymousClass1ZK r1 : list) {
                        long j = r1.mItemId;
                        if (j == AO9) {
                            A0Z = r1.itemView;
                        } else if (j == AO92) {
                            view = r1.itemView;
                        }
                    }
                }
                i = -50262808;
            }
            if (!A10(A0Z, true)) {
                i = 2127063779;
            } else {
                if (view != null) {
                    i2 = C31391Ya.A0F(view);
                } else {
                    i2 = 0;
                }
                int i3 = this.A03 - i2;
                int A0V = A0V(A0Z);
                if (A0V >= i3) {
                    i = -1050009751;
                } else {
                    int i4 = i3 - A0V;
                    A0Z.offsetTopAndBottom(i4);
                    if (view != null) {
                        view.offsetTopAndBottom(i4);
                    }
                }
            }
            AnonymousClass0Z0.A0A(i, A032);
        }
        i = 851351676;
        AnonymousClass0Z0.A0A(i, A032);
    }
}
