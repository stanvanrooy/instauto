package p000X;

import android.os.MessageQueue;
import android.text.TextUtils;

/* renamed from: X.0hE  reason: invalid class name and case insensitive filesystem */
public abstract class C12690hE implements MessageQueue.IdleHandler {
    public final String mName;

    public abstract boolean onQueueIdle();

    public final boolean queueIdle() {
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01(AnonymousClass000.A0E("onQueueIdle: ", this.mName), 595343043);
        }
        try {
            return onQueueIdle();
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-1172718714);
            }
        }
    }

    public C12690hE(String str) {
        AnonymousClass0a4.A09(!TextUtils.isEmpty(str));
        this.mName = str;
    }
}
