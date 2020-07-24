package p000X;

import com.instagram.model.venue.Venue;

/* renamed from: X.CBE */
public final class CBE {
    public BVH A00;
    public Venue A01;
    public String A02;
    public String A03;
    public String A04;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CBE) && this.A01.equals(((CBE) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return this.A01.A06;
    }
}
