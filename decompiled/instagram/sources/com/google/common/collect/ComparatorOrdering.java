package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import p000X.AnonymousClass0a4;
import p000X.C25909Bbx;

public final class ComparatorOrdering extends C25909Bbx implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator comparator;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) obj).comparator);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }

    public ComparatorOrdering(Comparator comparator2) {
        AnonymousClass0a4.A06(comparator2);
        this.comparator = comparator2;
    }
}
