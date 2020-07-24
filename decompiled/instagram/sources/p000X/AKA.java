package p000X;

import com.instagram.model.reels.Reel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.AKA */
public final class AKA extends C30484Dd9 {
    public final /* synthetic */ AKB A00;

    public AKA(AKB akb) {
        this.A00 = akb;
    }

    public final void A00(int i, int i2) {
        C38031kc r0;
        C23375AKa aKa;
        AKB akb = this.A00;
        AnonymousClass0C1 r2 = akb.A0I;
        Reel A0G = C17020pY.A00().A0Q(r2).A0G(akb.A07);
        if (A0G != null) {
            r0 = A0G.A0C;
        } else {
            r0 = null;
        }
        if (r0 != null) {
            r0.A03 = i;
            C72063Dm r1 = this.A00.A0O.A00;
            AnonymousClass30C r02 = r1.A07;
            if (r02 != null) {
                r02.A06.setText(AnonymousClass23g.A00(Integer.valueOf(Math.max(1, i)), r1.A0W.getResources(), false));
            }
            AKC akc = this.A00.A0M.A0I.A0G;
            AnonymousClass0C1 r4 = akc.A06;
            AnonymousClass0L7 r3 = AnonymousClass0L7.LIVE_REALTIME_COMMENTS;
            int intValue = ((Integer) AnonymousClass0L6.A03(r4, r3, "realtime_comments_viewer_threshold", 10, (AnonymousClass04H) null)).intValue();
            C23375AKa aKa2 = akc.A01;
            if (aKa2 == akc.A09 && i > intValue) {
                aKa2.BqP();
                aKa = akc.A08;
            } else if (aKa2 == akc.A08 && i <= intValue && ((Boolean) AnonymousClass0L6.A02(akc.A06, r3, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                akc.A01.BqP();
                aKa = akc.A09;
            } else {
                return;
            }
            akc.A01 = aKa;
            aKa.Bpd(akc.A02);
        }
    }

    public final void A01(C38051ke r4) {
        C38031kc r0;
        AKB akb = this.A00;
        AnonymousClass0C1 r2 = akb.A0I;
        Reel A0G = C17020pY.A00().A0Q(r2).A0G(akb.A07);
        if (A0G != null) {
            r0 = A0G.A0C;
        } else {
            r0 = null;
        }
        if (r0 != null) {
            r0.A08 = r4;
            C72063Dm r1 = this.A00.A0O.A00;
            if (C72063Dm.A0C(r1)) {
                C224759lz r22 = r1.A0I;
                if ((r22.A02 == C38051ke.UNKNOWN && r4.A00()) || r4 == C38051ke.HARD_STOPPED) {
                    r22.A08 = true;
                }
                r22.A02 = r4;
                C224759lz.A00(r22);
            }
        }
    }

    public final void A04(String str, String str2) {
        AOG aog = this.A00.A0O.A00.A0D;
        if (aog != null) {
            aog.A01(str, str2);
        }
    }

    public final void A05(Set set, int i) {
        C227679qt r2 = this.A00.A0O;
        C72063Dm r1 = r2.A00;
        if (r1.A07 != null && set != null && !r1.A0L.equals(set)) {
            r2.A00.A0L = new HashSet();
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C13300iJ A02 = C13510ie.A00(r2.A00.A0X).A02(str);
                if (A02 == null) {
                    AnonymousClass9FM.A02.A00(r2.A00.A0X, str, (AnonymousClass9FQ) null);
                } else {
                    r2.A00.A0L.add(str);
                    hashSet.add(A02);
                }
            }
            if (!hashSet.equals(r2.A00.A01.A04())) {
                C38031kc r12 = r2.A00.A01;
                r12.A0V.clear();
                r12.A0V.addAll(hashSet);
                long AFH = ((long) (i * 1000)) - r2.A00.A0Z.AFH();
                C72063Dm r0 = r2.A00;
                AnonymousClass0ZA.A08(r0.A0U, r0.A0b);
                C72063Dm r02 = r2.A00;
                AnonymousClass0ZA.A09(r02.A0U, r02.A0b, AFH, -493821697);
            }
        }
    }

    public final void A06(boolean z) {
        AK9 ak9 = this.A00.A0L;
        if (ak9.A0A && !z) {
            C23346AIx aIx = ak9.A07;
            Integer num = Constants.A0j;
            Iterator it = aIx.A02.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                if (((AKX) it.next()).AP6() == num) {
                    it.remove();
                    z2 = true;
                }
            }
            if (z2) {
                aIx.A01();
            }
        }
        ak9.A0A = z;
    }

    public final void A08(boolean z, String str) {
        C72063Dm r1 = this.A00.A0O.A00;
        r1.A0K = str;
        r1.A0P = z;
        if (z && "ssi_reason".equals(str)) {
            C224759lz r12 = r1.A0I;
            r12.A07 = true;
            C224759lz.A00(r12);
        }
    }
}
