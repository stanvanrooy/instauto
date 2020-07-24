package p000X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.22o  reason: invalid class name and case insensitive filesystem */
public final class C471822o extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass1LY A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C471822o(AnonymousClass1LY r2, List list, boolean z) {
        super(162);
        this.A00 = r2;
        this.A01 = list;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r4.A0B.isEmpty() != false) goto L_0x0013;
     */
    public final void run() {
        int i;
        AnonymousClass1LY r4 = this.A00;
        List list = this.A01;
        boolean z = this.A02;
        synchronized (r4.A0A) {
            if (!z) {
                try {
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            r4.A0B.addFirst(new ArrayList());
            ((List) r4.A0B.getFirst()).addAll(list);
        }
        AnonymousClass1LY r42 = this.A00;
        synchronized (r42.A0A) {
            int i2 = 0;
            while (i2 < r42.A0B.size()) {
                try {
                    List A022 = r42.A02((List) r42.A0B.get(i2));
                    A022.size();
                    r42.A0B.set(i2, A022);
                    i2++;
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
        }
        AnonymousClass1LY r43 = this.A00;
        synchronized (r43.A0A) {
            try {
                synchronized (r43.A0A) {
                    Iterator it = r43.A0B.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        i += ((List) it.next()).size();
                    }
                }
                while (i > r43.A00 && r43.A0B.size() > 1) {
                    if (((List) r43.A0B.getLast()).size() <= i - r43.A00) {
                        i -= ((List) r43.A0B.removeLast()).size();
                    } else {
                        List list2 = (List) r43.A0B.removeLast();
                        while (i - r43.A00 > 0 && !list2.isEmpty()) {
                            list2.remove(list2.size() - 1);
                            i--;
                        }
                        r43.A0B.addLast(list2);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
        AnonymousClass1LY r0 = this.A00;
        AnonymousClass1LW r44 = r0.A04;
        if (r44 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (r0.A0A) {
                try {
                    Iterator it2 = r0.A0B.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll((List) it2.next());
                    }
                } catch (Throwable th4) {
                    while (true) {
                        th = th4;
                        break;
                    }
                }
            }
            r44.BCs(new ArrayList(linkedHashSet));
        }
    }
}
