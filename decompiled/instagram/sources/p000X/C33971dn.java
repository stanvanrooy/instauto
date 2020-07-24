package p000X;

import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1dn  reason: invalid class name and case insensitive filesystem */
public final class C33971dn extends C28691Ms {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C57792em A04;
    public AnonymousClass1NJ A05;
    public AnonymousClass1NJ A06;
    public C92873zr A07;
    public C30781Djv A08;
    public AnonymousClass2B1 A09;
    public AnonymousClass30F A0A;
    public C469121m A0B;
    public C30782Djw A0C;
    public AnonymousClass172 A0D;
    public AnonymousClass9G0 A0E;
    public AnonymousClass9G1 A0F;
    public AnonymousClass9G2 A0G;
    public C51242Jv A0H;
    public C44351w1 A0I;
    public DjR A0J;
    public Venue A0K;
    public AnonymousClass22C A0L;
    public C35981hF A0M;
    public C13300iJ A0N;
    public Boolean A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Long A0V;
    public Long A0W;
    public Long A0X;
    public Long A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public List A0h;
    public List A0i;
    public List A0j;
    public List A0k;
    public List A0l;
    public List A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;

    public final long A00() {
        Long l = this.A0X;
        if (l == null) {
            return -9223372036854775807L;
        }
        return l.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r3 == p000X.Constants.A0C) goto L_0x0032;
     */
    public final C249916w A01(AnonymousClass0C1 r5) {
        boolean z;
        C51242Jv r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        C44351w1 r02 = this.A0I;
        if (r02 != null) {
            return r02;
        }
        C13300iJ r1 = this.A0N;
        if (r1 != null) {
            return new C249816v(r1);
        }
        Integer num = this.A0P;
        if (num == Constants.ONE) {
            AnonymousClass1NJ r03 = this.A05;
            if (r03 != null) {
                return new C249816v(r03.A0c(r5));
            }
            return null;
        }
        if (num != Constants.ZERO) {
            z = false;
        }
        z = true;
        if (z) {
            return null;
        }
        throw new UnsupportedOperationException("Reel response item should have either a user or multi-author reel owner");
    }

    public final String A02(AnonymousClass0C1 r4) {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0b);
        sb.append(" ");
        sb.append(A01(r4));
        sb.append(" ");
        List list = this.A0j;
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "EMPTY";
        }
        sb.append(obj);
        return sb.toString();
    }

    public final List A03() {
        AnonymousClass1NJ r1;
        if (this.A0j == null && this.A0P == Constants.ONE && (r1 = this.A05) != null) {
            ArrayList arrayList = new ArrayList();
            this.A0j = arrayList;
            arrayList.add(r1);
        }
        return this.A0j;
    }

    public final boolean A04(AnonymousClass0C1 r3) {
        Integer AZG;
        String id;
        if (this.A0b != null) {
            if (A01(r3) == null) {
                AZG = null;
            } else {
                AZG = A01(r3).AZG();
            }
            if (AZG == Constants.ONE) {
                if (A01(r3) == null) {
                    id = null;
                } else {
                    id = A01(r3).getId();
                }
                if (id == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
