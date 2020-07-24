package com.instagram.common.p004ui.widget.adapterlayout;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1zR;
import p000X.C29241Pd;
import p000X.C712439p;
import p000X.C712539q;
import p000X.C712639r;

/* renamed from: com.instagram.common.ui.widget.adapterlayout.AdapterLinearLayout */
public class AdapterLinearLayout extends LinearLayout {
    public static final Object A06 = new Object();
    public ListAdapter A00;
    public boolean A01;
    public boolean A02;
    public final DataSetObserver A03 = new C712539q(this);
    public final C29241Pd A04 = new C712639r(this);
    public final C712439p A05 = new C712439p();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r2.getTag().equals(A06) == false) goto L_0x0058;
     */
    public static void A00(AdapterLinearLayout adapterLinearLayout) {
        boolean z;
        if (!adapterLinearLayout.A02) {
            List list = adapterLinearLayout.A05.A00;
            list.clear();
            if (adapterLinearLayout.A00 != null) {
                for (int i = 0; i < adapterLinearLayout.A00.getCount(); i++) {
                    list.add(Integer.valueOf(adapterLinearLayout.A00.getItemViewType(i)));
                }
            }
            AnonymousClass1zR.A00(adapterLinearLayout.A05, true).A02(adapterLinearLayout.A04);
            AnonymousClass11J.A00(adapterLinearLayout.A00);
            for (int i2 = 0; i2 < adapterLinearLayout.A00.getCount(); i2++) {
                View childAt = adapterLinearLayout.getChildAt(i2);
                if (childAt instanceof ViewStub) {
                    z = true;
                }
                z = false;
                if (z) {
                    View view = adapterLinearLayout.A00.getView(i2, (View) null, adapterLinearLayout);
                    adapterLinearLayout.removeViewAt(i2);
                    adapterLinearLayout.addView(view, i2);
                } else {
                    adapterLinearLayout.A00.getView(i2, childAt, adapterLinearLayout);
                }
            }
            C712439p r2 = adapterLinearLayout.A05;
            r2.A01.clear();
            r2.A01.addAll(r2.A00);
            adapterLinearLayout.A01 = false;
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.A00;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.A03);
            this.A00 = null;
        }
        removeAllViews();
        this.A00 = listAdapter;
        listAdapter.registerDataSetObserver(this.A03);
        A00(this);
    }

    public void setIgnoreAdapterUpdates(boolean z) {
        this.A02 = z;
        if (this.A01 && !z) {
            A00(this);
        }
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-571349493);
        super.onDetachedFromWindow();
        ListAdapter listAdapter = this.A00;
        if (listAdapter != null) {
            listAdapter.unregisterDataSetObserver(this.A03);
            this.A00 = null;
        }
        removeAllViews();
        AnonymousClass0Z0.A0D(-1466344005, A062);
    }

    public AdapterLinearLayout(Context context) {
        super(context);
    }

    public AdapterLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdapterLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
