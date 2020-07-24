package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1s9  reason: invalid class name and case insensitive filesystem */
public final class C42311s9 {
    public int A00;
    public C202418lL A01;
    public String A02 = Long.toString(System.currentTimeMillis());
    public List A03 = new ArrayList();
    public boolean A04 = false;

    public final List A00() {
        ArrayList arrayList = new ArrayList();
        for (C201718kD r0 : this.A03) {
            arrayList.add(r0.A05);
        }
        return arrayList;
    }

    public final List A01() {
        return new ArrayList(this.A03);
    }

    public final void A03() {
        C202418lL r0 = this.A01;
        if (r0 != null) {
            try {
                r0.A05();
            } catch (Exception e) {
                AnonymousClass0QD.A0A("seg_up_job_cancel_err", e);
            }
        }
        this.A01 = null;
        this.A02 = Long.toString(System.currentTimeMillis());
    }

    public final boolean A05() {
        for (C201718kD r0 : this.A03) {
            if (r0.A07) {
                return true;
            }
        }
        return false;
    }

    public final void A02() {
        A00();
        this.A03.clear();
        this.A00 = 0;
        A03();
    }

    public final void A04(C201718kD r2) {
        AnonymousClass0a4.A0A(!A05());
        this.A03.add(r2);
    }
}
