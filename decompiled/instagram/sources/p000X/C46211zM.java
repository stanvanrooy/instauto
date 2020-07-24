package p000X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.1zM  reason: invalid class name and case insensitive filesystem */
public abstract class C46211zM {
    public boolean A00;
    public final int A01;
    public final AnonymousClass0RN A02;
    public final AnonymousClass0C1 A03;
    public final HashSet A04;
    public final Set A05 = new HashSet();
    public final Set A06;
    public final Stack A07;

    public abstract boolean A03();

    public final void A01(AnonymousClass1WG r4, int i, int i2, C46201zK r7) {
        if (i >= 0 && i2 >= i) {
            ArrayList arrayList = new ArrayList();
            while (i <= i2) {
                Object ATo = r4.ATo(i);
                if (ATo instanceof Reel) {
                    arrayList.add((Reel) ATo);
                }
                i++;
            }
            A02(arrayList, r7);
        }
    }

    public C46211zM(AnonymousClass0C1 r2, int i, AnonymousClass0RN r4) {
        this.A03 = r2;
        this.A01 = i;
        this.A06 = new HashSet();
        this.A04 = new HashSet();
        this.A07 = new Stack();
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5.A06.isEmpty() != false) goto L_0x0010;
     */
    public static void A00(C46211zM r5, C46201zK r6) {
        boolean z;
        boolean z2 = true;
        if (r5.A03()) {
            z = true;
        }
        z = false;
        if (r5.A06.size() < r5.A01) {
            z2 = false;
        }
        if ((z || z2) && !r5.A00) {
            r5.A00 = true;
            r5.A04.clear();
            ArrayList arrayList = new ArrayList();
            while (!r5.A07.isEmpty() && r5.A04.size() < r5.A01) {
                String str = (String) r5.A07.pop();
                r5.A06.remove(str);
                r5.A04.add(str);
                arrayList.add(str);
            }
            C59292hL r3 = new C59292hL(r5, r6, arrayList);
            r5.A05.add(r3);
            C17020pY.A00().A0M(r5.A03).A09(arrayList, 0, r3, r5.A02.getModuleName());
        }
    }

    public final void A02(List list, C46201zK r5) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                if (!reel.A0i(this.A03) && !reel.A0t) {
                    String id = reel.getId();
                    if (!this.A06.contains(id) && !this.A04.contains(id)) {
                        this.A06.add(id);
                        this.A07.push(id);
                    }
                }
            }
            A00(this, r5);
        }
    }
}
