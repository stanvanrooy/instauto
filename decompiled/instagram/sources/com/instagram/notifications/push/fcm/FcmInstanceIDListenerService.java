package com.instagram.notifications.push.fcm;

import com.google.firebase.iid.FirebaseInstanceIdService;
import p000X.AnonymousClass0Z0;
import p000X.C254018q;
import p000X.C41941rE;
import p000X.C92803zk;

public class FcmInstanceIDListenerService extends FirebaseInstanceIdService {
    public final void A04() {
        C41941rE.A01();
    }

    public final void onCreate() {
        C92803zk r0;
        int A04 = AnonymousClass0Z0.A04(-1185224357);
        super.onCreate();
        synchronized (C254018q.class) {
            C254018q.A00();
            r0 = C254018q.A00;
        }
        r0.get();
        AnonymousClass0Z0.A0B(200440222, A04);
    }
}
