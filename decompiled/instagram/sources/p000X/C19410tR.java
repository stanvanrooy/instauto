package p000X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0tR  reason: invalid class name and case insensitive filesystem */
public abstract class C19410tR extends C17090pf {
    public String A00;
    public List A01;
    public long A02;
    public Long A03;

    public C99424Rp A02() {
        return null;
    }

    public abstract C58022fB A03();

    public abstract Object A04();

    public final String A05() {
        String str = this.A00;
        if (str == null) {
            return this.A03;
        }
        return str;
    }

    public List A06() {
        return this.A01;
    }

    public C19410tR() {
    }

    public C19410tR(AnonymousClass3LQ r2, DirectThreadKey directThreadKey, Long l, long j) {
        super(r2);
        this.A01 = Collections.singletonList(directThreadKey);
        this.A03 = l;
        this.A02 = j;
    }

    public C19410tR(AnonymousClass3LQ r1, List list, Long l, long j) {
        super(r1);
        this.A01 = list;
        this.A03 = l;
        this.A02 = j;
    }
}
