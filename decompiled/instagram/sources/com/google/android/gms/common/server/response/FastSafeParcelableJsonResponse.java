package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000X.C228469tV;

public abstract class FastSafeParcelableJsonResponse extends C228469tV implements SafeParcelable {
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().isInstance(obj)) {
                C228469tV r7 = (C228469tV) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : A05().values()) {
                    if (A06(fastJsonResponse$Field)) {
                        if (r7.A06(fastJsonResponse$Field) && A03(fastJsonResponse$Field).equals(r7.A03(fastJsonResponse$Field))) {
                        }
                    } else if (r7.A06(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : A05().values()) {
            if (A06(fastJsonResponse$Field)) {
                i = (i * 31) + A03(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }
}
