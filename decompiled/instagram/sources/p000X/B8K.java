package p000X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.B8K */
public final class B8K extends AnonymousClass1BT {
    public final Intent A0B(Intent intent, Context context, String str) {
        return intent;
    }

    public final Intent A0A(Intent intent, Context context, String str) {
        this.A00.Bbw("AnyIntentScope", AnonymousClass000.A0E("Any_UNSAFE scope used for launching activity: ", AnonymousClass1BT.A02(intent)), (Throwable) null);
        return intent;
    }

    public final Intent A0C(Intent intent, Context context, String str) {
        this.A00.Bbw("AnyIntentScope", AnonymousClass000.A0E("Any_UNSAFE scope used for launching service: ", AnonymousClass1BT.A02(intent)), (Throwable) null);
        return intent;
    }

    public final B8L A0D() {
        return B8L.ANY;
    }

    public B8K(AnonymousClass0XO r1, AnonymousClass0XP r2, AnonymousClass1BN r3) {
        super(r1, r2, r3);
    }
}
