package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BXX */
public final class BXX {
    public Long A00;
    public String A01;
    public String A02;
    public List A03 = new ArrayList();
    public List A04 = new ArrayList();
    public List A05 = new ArrayList();
    public List A06 = new ArrayList();
    public List A07 = new ArrayList();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BXX bxx = (BXX) obj;
            if (!this.A02.equals(bxx.A02) || !this.A01.equals(bxx.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (this.A02.hashCode() * 31) + this.A01.hashCode();
    }

    public static void A00(List list) {
        list.add(Long.valueOf(System.currentTimeMillis()));
    }

    public BXX() {
    }

    public BXX(BXX bxx) {
        synchronized (bxx) {
            this.A01 = bxx.A01;
            this.A02 = bxx.A02;
            this.A05 = bxx.A05;
            this.A06 = bxx.A06;
            this.A04 = bxx.A04;
            this.A00 = bxx.A00;
            this.A03 = bxx.A03;
        }
    }

    public BXX(String str, String str2, long j) {
        AnonymousClass0a4.A06(str);
        this.A02 = str;
        AnonymousClass0a4.A06(str2);
        this.A01 = str2;
        this.A00 = Long.valueOf(j);
    }
}
