package com.google.common.collect;

import java.io.Serializable;
import p000X.AnonymousClass0a4;
import p000X.C25909Bbx;

public final class ReverseOrdering extends C25909Bbx implements Serializable {
    public static final long serialVersionUID = 0;
    public final C25909Bbx forwardOrder;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public final String toString() {
        return this.forwardOrder + ".reverse()";
    }

    public ReverseOrdering(C25909Bbx bbx) {
        AnonymousClass0a4.A06(bbx);
        this.forwardOrder = bbx;
    }
}
