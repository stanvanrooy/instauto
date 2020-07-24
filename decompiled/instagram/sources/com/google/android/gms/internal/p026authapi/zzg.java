package com.google.android.gms.internal.p026authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import p000X.AnonymousClass0Z0;
import p000X.BIC;

/* renamed from: com.google.android.gms.internal.auth-api.zzg */
public class zzg extends zzv {
    public void Bvb(Status status) {
        if (this instanceof zzo) {
            int A03 = AnonymousClass0Z0.A03(871766891);
            ((zzo) this).A00.BkF(status);
            AnonymousClass0Z0.A0A(445238823, A03);
        } else if (!(this instanceof zzk)) {
            int A032 = AnonymousClass0Z0.A03(1383060588);
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            AnonymousClass0Z0.A0A(-702558537, A032);
            throw unsupportedOperationException;
        } else {
            int A033 = AnonymousClass0Z0.A03(-47507639);
            ((zzk) this).A00.A09(new BIC(status, (Credential) null));
            AnonymousClass0Z0.A0A(-87818054, A033);
        }
    }

    public void Bvc(Status status, Credential credential) {
        if (!(this instanceof zzk)) {
            int A03 = AnonymousClass0Z0.A03(558492153);
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            AnonymousClass0Z0.A0A(-1750966561, A03);
            throw unsupportedOperationException;
        }
        int A032 = AnonymousClass0Z0.A03(-524362398);
        ((zzk) this).A00.A09(new BIC(status, credential));
        AnonymousClass0Z0.A0A(375129465, A032);
    }

    public zzg() {
        AnonymousClass0Z0.A0A(1836090767, AnonymousClass0Z0.A03(1613804925));
    }

    public final void Bvd(Status status, String str) {
        int A03 = AnonymousClass0Z0.A03(1776756099);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        AnonymousClass0Z0.A0A(-994970170, A03);
        throw unsupportedOperationException;
    }
}
