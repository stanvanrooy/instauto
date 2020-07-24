package p000X;

/* renamed from: X.C1m */
public abstract class C1m extends C0L implements C59402hW {
    public volatile transient String A00;

    public String A0Q() {
        StringBuilder sb;
        String str;
        if (!(this instanceof C0w)) {
            if (this instanceof C27188C0m) {
                C27188C0m c0m = (C27188C0m) this;
                sb = new StringBuilder();
                sb.append(c0m.A00.getName());
                C0L c0l = c0m.A00;
                if (c0l != null) {
                    sb.append('<');
                    sb.append(c0l.A01());
                    sb.append(',');
                    str = c0m.A01.A01();
                }
                return sb.toString();
            } else if (!(this instanceof C27193C0t)) {
                return ((C0b) this).A00.getName();
            } else {
                C27193C0t c0t = (C27193C0t) this;
                sb = new StringBuilder();
                sb.append(c0t.A00.getName());
                C0L c0l2 = c0t.A00;
                if (c0l2 != null) {
                    sb.append('<');
                    str = c0l2.A01();
                }
                return sb.toString();
            }
            sb.append(str);
            sb.append('>');
            return sb.toString();
        }
        C0w c0w = (C0w) this;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0w.A00.getName());
        C0L[] c0lArr = c0w.A00;
        if (c0lArr != null && (r4 = c0lArr.length) > 0) {
            sb2.append('<');
            boolean z = true;
            for (C0L c0l3 : c0lArr) {
                if (z) {
                    z = false;
                } else {
                    sb2.append(',');
                }
                sb2.append(c0l3.A01());
            }
            sb2.append('>');
        }
        return sb2.toString();
    }

    public final void BfQ(C13460iZ r2, C06 c06) {
        r2.A0g(A01());
    }

    public final void BfV(C13460iZ r1, C06 c06, C27204C1t c1t) {
        c1t.A03(this, r1);
        BfQ(r1, c06);
        c1t.A06(this, r1);
    }

    public C1m(Class cls, int i, Object obj, Object obj2, boolean z) {
        super(cls, i, obj, obj2, z);
    }
}
