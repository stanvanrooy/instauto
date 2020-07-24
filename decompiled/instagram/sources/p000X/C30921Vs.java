package p000X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Vs  reason: invalid class name and case insensitive filesystem */
public final class C30921Vs extends C30931Vt {
    public LinkedHashSet A00;
    public final LinkedHashSet A01;
    public final Map A02;
    public final Map A03;
    public final boolean A04;
    public final boolean A05;

    public final synchronized AnonymousClass438 A00(String str) {
        AnonymousClass438 r0;
        C37461jh r02 = (C37461jh) this.A02.get(str);
        if (r02 == null) {
            r0 = AnonymousClass438.UNKNOWN;
        } else if (this.A00.contains(r02.A02)) {
            r0 = AnonymousClass438.A02;
        } else {
            r0 = AnonymousClass438.OFFSCREEN;
        }
        return r0;
    }

    public final synchronized C37461jh A01(String str) {
        return (C37461jh) this.A03.get(str);
    }

    public final synchronized C37461jh A02(String str) {
        return (C37461jh) this.A02.get(str);
    }

    public final synchronized LinkedHashSet A03() {
        return new LinkedHashSet(this.A01);
    }

    public final synchronized void A04() {
        this.A02.clear();
        this.A03.clear();
        this.A01.clear();
        if (this.A04) {
            this.A00.clear();
        }
    }

    public final synchronized void A05(C37461jh r3) {
        this.A01.add(r3);
        this.A02.put(r3.A01.A02, r3);
        this.A03.put(r3.A01.A00.A04.A00, r3);
    }

    public final synchronized boolean A06() {
        boolean z;
        z = false;
        if (this.A00 != null) {
            z = true;
        }
        return z;
    }

    public final synchronized boolean A07(String str) {
        boolean z;
        C37461jh r0 = (C37461jh) this.A02.get(str);
        if (r0 != null) {
            Object obj = r0.A02;
            if (!this.A00.contains(obj)) {
                z = this.A00.add(obj);
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean A08(String str) {
        boolean z;
        C37461jh r0 = (C37461jh) this.A02.get(str);
        if (r0 != null) {
            z = this.A00.remove(r0.A02);
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized Set A09() {
        LinkedHashSet linkedHashSet;
        if (this.A05) {
            linkedHashSet = new LinkedHashSet(this.A00);
        } else {
            linkedHashSet = this.A00;
        }
        return linkedHashSet;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass000.A00(this.A00.size(), " items\n"));
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            sb.append("  ");
            sb.append(next.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public C30921Vs(AnonymousClass0C1 r6) {
        boolean z = AnonymousClass1F6.A00(r6).A08.A08.A03;
        this.A02 = new HashMap();
        this.A03 = new HashMap();
        this.A01 = new LinkedHashSet();
        this.A00 = new LinkedHashSet();
        this.A05 = ((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.LAUNCHER_PREFETCH_SCHEDULE_DEDUP_QUEUE_WITH_HOLDOUT, "copy_list_module_active_items", false, (AnonymousClass04H) null)).booleanValue();
        this.A04 = z;
    }

    public C30921Vs(C37461jh r2, AnonymousClass0C1 r3) {
        this.A02 = new HashMap();
        this.A03 = new HashMap();
        this.A01 = new LinkedHashSet();
        this.A00 = new LinkedHashSet();
        this.A05 = false;
        this.A04 = false;
        A05(r2);
        A07(r2.A01.A02);
    }
}
