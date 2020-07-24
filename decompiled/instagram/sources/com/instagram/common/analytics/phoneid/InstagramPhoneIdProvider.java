package com.instagram.common.analytics.phoneid;

import android.content.Context;
import p000X.AnonymousClass0QD;
import p000X.StoredPreferences;
import p000X.B8d;
import p000X.C06590Pq;
import p000X.C06860Qt;
import p000X.C17570qS;
import p000X.C25217B8f;
import p000X.C25219B8h;

public class InstagramPhoneIdProvider extends B8d implements C25219B8h {
    public final C25219B8h A01() {
        return this;
    }

    public final C25217B8f A02(Context context) {
        return null;
    }

    public final C17570qS A00(Context context) {
        return C06860Qt.A00(StoredPreferences.A00).A01((C06590Pq) null);
    }

    public final void Bbw(String str, String str2, Throwable th) {
        AnonymousClass0QD.A05(str, str2, th);
    }
}
