package p000X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1cD  reason: invalid class name and case insensitive filesystem */
public abstract class C33001cD {
    public long A00 = 1000;
    public long A01 = 0;
    public C33021cF A02 = new C33021cF();
    public long A03 = 0;
    public final Handler A04 = new Handler(Looper.getMainLooper());

    public abstract void A06(List list, C215759Rq r2, List list2);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1.A00.get(r4) == p000X.C33081cL.A05) goto L_0x0015;
     */
    public final C33081cL A01(View view) {
        boolean z;
        C33021cF r1 = this.A02;
        if (r1.A00.get(view) != null) {
            z = true;
        }
        z = false;
        if (z) {
            return (C33081cL) this.A02.A00.get(view);
        }
        C33081cL r12 = new C33081cL();
        this.A02.A00.put(view, r12);
        return r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r8.A00.get(r10) == p000X.C33081cL.A05) goto L_0x0034;
     */
    public final void A03(View view, C33071cK r11) {
        boolean z;
        C33081cL r1;
        C38241kx r0;
        C38241kx r02;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (r11 != null) {
            arrayList2.add(r11);
        }
        ArrayList arrayList3 = new ArrayList();
        C33021cF r8 = this.A02;
        HashSet hashSet = new HashSet();
        while (view != null && (view instanceof View)) {
            if (r8.A00.get(view) != null) {
                z = true;
            }
            z = false;
            if (z && (r1 = (C33081cL) r8.A00.get(view)) != null) {
                if (r1.A04 == null && (r02 = r1.A03) != null) {
                    r1.A04 = r02.AEt();
                }
                String str = r1.A04;
                C33071cK r2 = r1.A02;
                if (r1.A01 == null && (r0 = r1.A03) != null) {
                    r1.A01 = r0.AEp();
                }
                C215759Rq r12 = r1.A01;
                if (str != null && !hashSet.contains(str)) {
                    arrayList.add(str);
                    hashSet.add(str);
                }
                if (r2 != null) {
                    arrayList2.add(r2);
                }
                if (r12 != null) {
                    arrayList3.add(r12);
                }
            }
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
        }
        if (!arrayList3.isEmpty()) {
            A06(arrayList, (C215759Rq) arrayList3.get(0), arrayList2);
        }
    }

    public final void A02() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A03 > this.A00) {
            C33021cF r9 = this.A02;
            long j = this.A01;
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis2 = System.currentTimeMillis();
            for (Map.Entry entry : new HashSet(r9.A00.entrySet())) {
                View view = (View) entry.getKey();
                C33081cL r0 = (C33081cL) entry.getValue();
                if (r0 != null) {
                    long j2 = currentTimeMillis2 - r0.A00;
                    if (view != null) {
                        if (!view.isShown()) {
                            if (j2 <= j) {
                            }
                        }
                    }
                }
                arrayList.add(view);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r9.A00.remove((View) it.next());
            }
            this.A03 = currentTimeMillis;
        }
    }

    public void A04(View view, C38241kx r5) {
        C33081cL A012 = A01(view);
        A012.A04 = null;
        A012.A01 = null;
        A012.A03 = r5;
        A012.A00 = System.currentTimeMillis();
    }

    public void A05(View view, C33071cK r5) {
        C33081cL A012 = A01(view);
        A012.A02 = r5;
        A012.A00 = System.currentTimeMillis();
    }
}
