package p000X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Qi  reason: invalid class name and case insensitive filesystem */
public final class C29551Qi extends C27591Il implements AnonymousClass19r {
    public AnonymousClass1ZD A00;
    public int A01 = 0;
    public final C29181Ox A02;
    public final AnonymousClass0RN A03;
    public final List A04;
    public final Map A05;

    public final void Ar3(int i, int i2, Intent intent) {
    }

    public final void AyU() {
    }

    public final void Azd() {
    }

    public final void BE0() {
    }

    public final void BJx() {
    }

    public final void BKp(Bundle bundle) {
    }

    public final void BP6() {
    }

    public final void BVf(View view, Bundle bundle) {
    }

    public final void BVv(Bundle bundle) {
    }

    public final void onStart() {
    }

    public static C29551Qi A00(Context context, AnonymousClass0C1 r3, AnonymousClass0RN r4, boolean z) {
        return new C29551Qi(context, r4, C29181Ox.A00(context, r3), z);
    }

    public final void A0A(AnonymousClass1PL r3) {
        if (!this.A04.contains(r3)) {
            C29591Qm r1 = new C29591Qm(this, r3);
            this.A04.add(r1);
            this.A05.put(r3, r1);
        }
    }

    public final void Ayk(View view) {
        AnonymousClass1ZD r1 = new AnonymousClass1ZD(view.getContext());
        this.A00 = r1;
        r1.A01 = this.A03.getModuleName();
        ((ViewGroup) view).addView(this.A00, new ViewGroup.LayoutParams(1, 1));
        this.A00.setVisibility(8);
    }

    public final void Azh() {
        AnonymousClass1ZD r2 = this.A00;
        if (r2 != null) {
            r2.A02.clear();
            AnonymousClass1GK r1 = r2.A00;
            if (r1 != null) {
                r2.A00 = null;
                r1.A03();
            }
        }
        this.A05.clear();
        this.A00 = null;
    }

    public C29551Qi(Context context, AnonymousClass0RN r4, C29181Ox r5, boolean z) {
        this.A03 = r4;
        this.A02 = r5;
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A05 = new HashMap();
        if (z) {
            arrayList.add(new C29561Qj(this, context));
        } else {
            arrayList.add(new C481526v(this, context));
        }
    }

    public final void A08(C255119b r10, int i) {
        Adapter adapter;
        int A032 = AnonymousClass0Z0.A03(1251231249);
        ViewGroup AaK = r10.AaK();
        if (r10.AgC()) {
            adapter = ((AbsListView) AaK).getAdapter();
        } else {
            adapter = (Adapter) ((RecyclerView) AaK).A0J;
        }
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        int ALs = r10.ALs();
        int i2 = this.A01;
        if (ALs > i2) {
            for (int i3 = 0; i3 < this.A04.size(); i3++) {
                ((C29581Ql) this.A04.get(i3)).A01(adapter, r10.AOh());
            }
        } else if (ALs < i2) {
            for (int i4 = 0; i4 < this.A04.size(); i4++) {
                ((C29581Ql) this.A04.get(i4)).A02(adapter, ALs);
            }
        }
        this.A01 = ALs;
        AnonymousClass1ZD r0 = this.A00;
        if (r0 != null) {
            if (z) {
                r0.setEnabled(true);
                this.A00.A00();
            } else {
                r0.setEnabled(false);
            }
        }
        AnonymousClass0Z0.A0A(-285889366, A032);
    }
}
