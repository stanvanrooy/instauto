package p000X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.1Qa  reason: invalid class name and case insensitive filesystem */
public final class C29471Qa implements C29481Qb {
    public int A00;
    public int A01;
    public boolean A02 = true;
    public boolean A03;
    public final C29491Qc A04 = new C29491Qc(this);
    public final List A05 = new ArrayList();
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final NavigableMap A08 = new TreeMap();

    public static void A00(C29471Qa r10, Object obj, Object obj2, C29131Os r13, int i, boolean z) {
        Object obj3 = obj2;
        Object obj4 = obj;
        C29131Os r7 = r13;
        boolean z2 = z;
        int i2 = i;
        if (r10.A01 < r10.A05.size()) {
            AnonymousClass1Z7 r0 = (AnonymousClass1Z7) r10.A05.get(r10.A01);
            r0.A02 = obj;
            r0.A03 = obj2;
            r0.A01 = r13;
            r0.A00 = i;
            r0.A04 = z;
        } else if (r10.A01 == r10.A05.size()) {
            r10.A05.add(new AnonymousClass1Z7(obj4, obj3, r7, i2, z2));
        } else {
            throw new RuntimeException("Adding new view model on invalid position");
        }
        r10.A01++;
        boolean z3 = false;
        if (!r10.A07.containsKey(obj)) {
            r10.A07.put(obj, new int[]{r10.A01 - 1, 0});
        }
        int[] iArr = (int[]) r10.A07.get(obj);
        iArr[1] = iArr[1] + 1;
        if (r10.A02 && z) {
            z3 = true;
        }
        r10.A02 = z3;
    }

    public final int A01(int i) {
        int i2 = this.A01;
        if (i >= i2) {
            AnonymousClass0QD.A01("BinderGroupCombinator", "position: " + i + ", mViewModelSize: " + i2 + ", mRowSpecs: " + this.A05.size() + ", mAsyncVM: " + this.A03);
        }
        return ((Integer) this.A06.get(((AnonymousClass1Z7) this.A05.get(i)).A01)).intValue() + ((AnonymousClass1Z7) this.A05.get(i)).A00;
    }

    public final View A02(int i, View view, ViewGroup viewGroup) {
        AnonymousClass1Z7 r2 = (AnonymousClass1Z7) this.A05.get(i);
        View AaJ = r2.A01.AaJ(r2.A00, view, viewGroup, r2.A02, r2.A03);
        if (AaJ == null) {
            AnonymousClass0QD.A03("BinderGroupCombinator null view", "View is null for BinderGroup: " + r2.A01.getClass().getSimpleName() + ", with ViewType: " + r2.A00 + ", position: " + i + ", mViewModelSize: " + this.A01 + ", mRowSpecs: " + this.A05.size() + ", mAsyncVM: " + this.A03, 1);
        }
        return AaJ;
    }

    public final AnonymousClass1Z7 A03(int i) {
        return (AnonymousClass1Z7) this.A05.get(i);
    }

    public final void A04(int i, View view) {
        AnonymousClass1Z7 r0 = (AnonymousClass1Z7) this.A05.get(i);
        r0.A01.A6f(r0.A00, view, r0.A02, r0.A03);
    }

    public final void A05(Object obj, Object obj2, C29131Os r6) {
        if (this.A06.get(r6) != null) {
            C29491Qc r0 = this.A04;
            r0.A01 = obj;
            r0.A02 = obj2;
            r0.A00 = r6;
            r6.A72(r0, obj, obj2);
            return;
        }
        throw new RuntimeException("Binder group not registered: " + r6.getClass());
    }

    public C29471Qa(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C29131Os r2 = (C29131Os) it.next();
            Map map = this.A06;
            Integer valueOf = Integer.valueOf(i);
            map.put(r2, valueOf);
            this.A08.put(valueOf, r2);
            i += r2.getViewTypeCount();
        }
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ C29481Qb A3a(Object obj, Object obj2, C29131Os r3) {
        A05(obj, obj2, r3);
        return this;
    }
}
