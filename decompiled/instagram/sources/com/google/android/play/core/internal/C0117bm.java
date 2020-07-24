package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;
import p000X.C120125Dh;
import p000X.C25198B6j;

/* renamed from: com.google.android.play.core.internal.bm */
public abstract class C0117bm extends C0120j implements C0118bn {
    public C0117bm() {
        AnonymousClass0Z0.A0A(135474985, AnonymousClass0Z0.A03(1892453886));
    }

    public final boolean A00(int i, Parcel parcel) {
        boolean z;
        int i2;
        int A03 = AnonymousClass0Z0.A03(1286236638);
        switch (i) {
            case 2:
                ABM(parcel.readInt(), (Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            case 3:
                A6D(parcel.readInt(), (Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            case 4:
                A2A(parcel.readInt(), (Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            case 5:
                A7E(parcel.readInt(), (Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            case 6:
                AEo((Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            case 7:
                A2F(parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 8:
                ACk((Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            case 9:
                A6E((Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            case 10:
                ADv((Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            case C120125Dh.VIEW_TYPE_BANNER:
                A2B((Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            case C120125Dh.VIEW_TYPE_SPINNER:
                A7F((Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            case C120125Dh.VIEW_TYPE_BADGE:
                ABN((Bundle) C25198B6j.A00(parcel, Bundle.CREATOR));
                break;
            default:
                z = false;
                i2 = -1717432059;
                break;
        }
        z = true;
        i2 = -1706046742;
        AnonymousClass0Z0.A0A(i2, A03);
        return z;
    }
}
