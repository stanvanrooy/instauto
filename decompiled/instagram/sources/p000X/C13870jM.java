package p000X;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0jM  reason: invalid class name and case insensitive filesystem */
public final class C13870jM {
    public long A00 = 0;
    public String A01;
    public String A02;
    public String A03;
    public List A04;
    public final AtomicLong A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C13870jM r5 = (C13870jM) obj;
            if (!Objects.equals(this.A01, r5.A01) || !Objects.equals(this.A02, r5.A02) || !Objects.equals(this.A03, r5.A03) || !Objects.equals(this.A04, r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A01, this.A02, this.A03, this.A04});
    }

    public C13870jM(String str, String str2, String str3, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = list;
        this.A05 = new AtomicLong(Long.MIN_VALUE);
    }
}
