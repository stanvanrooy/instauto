package com.instagram.contacts.ccu.impl;

import android.content.Context;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass28I;
import p000X.AnonymousClass28M;

public class CCUPluginImpl extends AnonymousClass28I {
    public void initScheduler(Context context, AnonymousClass0C1 r5) {
        Class<AnonymousClass28M> cls = AnonymousClass28M.class;
        if (((AnonymousClass28M) r5.AV9(cls)) == null) {
            AnonymousClass28M r1 = new AnonymousClass28M(context, r5);
            AnonymousClass0Q7.A03().A0B(r1);
            r5.BYi(cls, r1);
        }
    }
}
