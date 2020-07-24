package p000X;

import java.util.Iterator;

/* renamed from: X.1vQ  reason: invalid class name and case insensitive filesystem */
public abstract class C43991vQ implements Iterator, AnonymousClass1B8 {
    public AnonymousClass1AG A00;
    public AnonymousClass1AG A01;

    public abstract AnonymousClass1AG A00(AnonymousClass1AG r1);

    public abstract AnonymousClass1AG A01(AnonymousClass1AG r1);

    public final void Bqs(AnonymousClass1AG r3) {
        AnonymousClass1AG r0;
        if (this.A00 == r3 && r3 == this.A01) {
            this.A01 = null;
            this.A00 = null;
        }
        AnonymousClass1AG r02 = this.A00;
        if (r02 == r3) {
            this.A00 = A00(r02);
        }
        AnonymousClass1AG r1 = this.A01;
        if (r1 == r3) {
            AnonymousClass1AG r03 = this.A00;
            if (r1 == r03 || r03 == null) {
                r0 = null;
            } else {
                r0 = A01(r1);
            }
            this.A01 = r0;
        }
    }

    public final boolean hasNext() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        AnonymousClass1AG r0;
        AnonymousClass1AG r1 = this.A01;
        AnonymousClass1AG r02 = this.A00;
        if (r1 == r02 || r02 == null) {
            r0 = null;
        } else {
            r0 = A01(r1);
        }
        this.A01 = r0;
        return r1;
    }

    public C43991vQ(AnonymousClass1AG r1, AnonymousClass1AG r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
