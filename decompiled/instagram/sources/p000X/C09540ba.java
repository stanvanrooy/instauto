package p000X;

import android.os.MessageQueue;

/* renamed from: X.0ba  reason: invalid class name and case insensitive filesystem */
public final class C09540ba implements MessageQueue.IdleHandler {
    public final /* synthetic */ AnonymousClass0SV A00;

    public C09540ba(AnonymousClass0SV r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.SHORTCUTS_2019, "is_enabled", false)).booleanValue()) {
            C42181rp.A01(this.A00.A00);
            return false;
        }
        C42181rp.A00(this.A00.A00);
        return false;
    }
}
