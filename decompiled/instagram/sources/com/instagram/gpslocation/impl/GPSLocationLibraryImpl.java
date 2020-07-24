package com.instagram.gpslocation.impl;

import android.app.Activity;
import android.os.Bundle;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.BIZ;
import p000X.C161906vV;
import p000X.C25448BKr;

public class GPSLocationLibraryImpl extends C161906vV {
    public final AnonymousClass0C1 A00;

    public BIZ createGooglePlayLocationSettingsController(Activity activity, AnonymousClass0C1 r8, C25448BKr bKr, String str, String str2) {
        return new BIZ(activity, this.A00, bKr, str, str2);
    }

    public GPSLocationLibraryImpl(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        this.A00 = AnonymousClass0J1.A06(bundle);
    }
}
