package p000X;

import android.app.AppOpsManager;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;

/* renamed from: X.B5C */
public final class B5C extends Handler {
    public final ComponentName A00;
    public final /* synthetic */ B5B A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B5C(B5B b5b, Looper looper, ComponentName componentName) {
        super(looper);
        this.A01 = b5b;
        this.A00 = componentName;
    }

    public final void handleMessage(Message message) {
        if (message != null) {
            try {
                ((AppOpsManager) this.A01.getApplicationContext().getSystemService("appops")).checkPackage(message.sendingUid, "com.google.android.gms");
                int i = message.what;
                if (i == 1) {
                    Bundle data = message.getData();
                    Messenger messenger = message.replyTo;
                    String string = data.getString(B5B.INTENT_PARAM_TAG);
                    if (messenger == null || string == null) {
                        AnonymousClass0DB.A0S();
                        return;
                    }
                    B5D createJob = B5B.createJob(this.A01, string, new B5E(messenger, string, this.A00), data.getBundle(B5B.INTENT_PARAM_EXTRAS));
                    if (createJob != null) {
                        createJob.A01();
                    }
                } else if (i != 2 && i != 4) {
                    AnonymousClass0DB.A0J(B5B.TAG, "Unrecognized message received: %s", message);
                }
            } catch (SecurityException e) {
                AnonymousClass0DB.A0G(B5B.TAG, "Message was not sent from GCM.", e);
            }
        }
    }
}
