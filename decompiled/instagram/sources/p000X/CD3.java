package p000X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CD3 */
public final class CD3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public CFS A07 = new CFS();
    public C27452CDu A08 = C27452CDu.A07;
    public CGD A09 = new CGD();
    public CCf A0A;
    public CCf A0B;
    public CCN A0C;
    public CCN A0D;
    public C27481CEx A0E = new C27481CEx();
    public CGJ A0F;
    public CGB A0G;
    public C27431CCz A0H = new C27431CCz();
    public C26905BuU A0I;
    public C27514CGe A0J;
    public CG4 A0K;
    public C27408CCb A0L;
    public CFT A0M;
    public CGV A0N;
    public CC7 A0O;
    public ImageUrl A0P;
    public AnonymousClass0C1 A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public Currency A0f;
    public List A0g;
    public List A0h;
    public List A0i;
    public List A0j;
    public List A0k;
    public Map A0l = new HashMap();
    public Map A0m;
    public Map A0n;
    public Map A0o = new HashMap();
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;

    public final CFW A00() {
        CFW cfw = (CFW) this.A0l.get(this.A0d);
        AnonymousClass11J.A01(cfw, "Audience not found in local data storage");
        return cfw;
    }

    public final List A01() {
        ArrayList arrayList = new ArrayList();
        for (CC7 cc7 : this.A0o.keySet()) {
            if (((Boolean) this.A0o.get(cc7)).booleanValue()) {
                arrayList.add(cc7.A01);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final boolean A02() {
        CG4 cg4 = this.A0K;
        if (cg4 == null || cg4.A00 <= 0) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        CGP cgp;
        CG4 cg4 = this.A0K;
        if (cg4 == null || (cgp = cg4.A02) == null || cgp.A00 == null) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        CG4 cg4 = this.A0K;
        if (cg4 == null || !A02() || (cg4.A00 - cg4.A01) - ((long) this.A06) > 0) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        if (!A03()) {
            return false;
        }
        CGB cgb = this.A0G;
        if (cgb == null || cgb.A00.A00 != Constants.ZERO) {
            return true;
        }
        return false;
    }
}
