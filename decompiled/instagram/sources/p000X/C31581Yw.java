package p000X;

import com.instagram.model.reels.Reel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Yw  reason: invalid class name and case insensitive filesystem */
public final class C31581Yw {
    public C37361jX A00;
    public AnonymousClass46K A01;
    public boolean A02;
    public final C31571Yv A03;
    public final Reel A04;
    public final AnonymousClass1OY A05;

    public final Set A00() {
        HashSet hashSet = new HashSet();
        C38031kc r0 = this.A04.A0C;
        if (r0 != null) {
            hashSet.addAll(r0.A04());
        }
        return hashSet;
    }

    public final boolean A01() {
        boolean z;
        Reel reel = this.A04;
        if (reel.A0X()) {
            if (reel.A0x) {
                Iterator it = reel.A0D.A07.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C38031kc) it.next()).A0W) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034 A[EDGE_INSN: B:17:0x0034->B:15:0x0034 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    public final boolean A02() {
        boolean z;
        Reel reel = this.A04;
        if (reel.A0X()) {
            if (reel.A0x) {
                Iterator it = reel.A0D.A07.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        C38051ke r1 = ((C38031kc) it.next()).A08;
                        if (r1.A01() || r1.A02()) {
                            z = true;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    return false;
                }
                return true;
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }

    public final boolean A03() {
        for (AnonymousClass2Ay r1 : this.A04.A0g) {
            if (!r1.AgQ() && !r1.ANQ()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A04() {
        if (!this.A04.A0W() || A00().isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r1.A09(r9) <= 0) goto L_0x0043;
     */
    public final boolean A05(AnonymousClass0C1 r9) {
        boolean z;
        if (!this.A04.A0U()) {
            Reel reel = this.A04;
            if (!reel.A0a()) {
                if (!reel.A0x || !reel.A0l(r9)) {
                    if (this.A05 == AnonymousClass1OY.ADS_HISTORY || (this.A04.A0l(r9) && this.A04.A0v)) {
                        return true;
                    }
                    Reel reel2 = this.A04;
                    if (reel2.A0t) {
                        z = true;
                    }
                    z = false;
                    if (z || this.A04.A0m(r9) || this.A04.A0w) {
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A06(AnonymousClass0C1 r3) {
        Reel reel = this.A04;
        if (!reel.A0x) {
            return false;
        }
        if (!reel.A0i(r3)) {
            return reel.A0p;
        }
        for (C39941no A0q : reel.A0J(r3)) {
            if (A0q.A0q()) {
                return true;
            }
        }
        return false;
    }

    public C31581Yw(Reel reel, AnonymousClass1OY r2, C31571Yv r3) {
        this.A04 = reel;
        this.A05 = r2;
        this.A03 = r3;
    }
}
