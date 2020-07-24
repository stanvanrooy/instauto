package p000X;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.1Yu  reason: invalid class name and case insensitive filesystem */
public final class C31561Yu {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C31561Yu r5 = (C31561Yu) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A00, this.A01});
    }

    public final List A00() {
        LinkedList linkedList = new LinkedList();
        for (AnonymousClass2KB r6 : this.A01) {
            boolean z = false;
            if (r6.A01 < System.currentTimeMillis()) {
                z = true;
            }
            if (!z) {
                linkedList.add(r6.A04);
            }
        }
        return linkedList;
    }

    public final List A01() {
        LinkedList linkedList = new LinkedList();
        for (AnonymousClass2KB r6 : this.A01) {
            boolean z = false;
            if (r6.A01 < System.currentTimeMillis()) {
                z = true;
            }
            if (!z) {
                linkedList.add(r6.A06);
            }
        }
        return linkedList;
    }

    public final boolean A02() {
        for (AnonymousClass2KB r0 : this.A01) {
            boolean z = false;
            if (r0.A01 < System.currentTimeMillis()) {
                z = true;
                continue;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "DirectStatusModel{userId='" + this.A00 + '\'' + ", statuses=" + this.A01 + '}';
    }

    public C31561Yu(String str, List list) {
        this.A00 = str;
        this.A01 = Collections.unmodifiableList(list);
        Collections.sort(list, AnonymousClass41S.A00);
    }
}
