package p000X;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.os.PowerManager;

/* renamed from: X.06t  reason: invalid class name and case insensitive filesystem */
public final class C033806t {
    public PowerManager.WakeLock A00;
    public AnonymousClass06Y A01;
    public final int A02;
    public final Context A03;
    public final Bundle A04;
    public final Messenger A05;
    public final AnonymousClass06W A06;
    public final C033506q A07;
    public final String A08;

    public static C033806t A00(Bundle bundle, Context context) {
        C033506q r11;
        Bundle bundle2 = bundle;
        Messenger messenger = (Messenger) bundle2.getParcelable("_messenger");
        Bundle bundle3 = bundle2.getBundle("_extras");
        String string = bundle2.getString("_hack_action");
        int i = bundle2.getInt("_job_id", -1);
        if (i != -1) {
            Bundle bundle4 = bundle2.getBundle("_fallback_config");
            AnonymousClass06W r9 = new AnonymousClass06W(bundle2.getBundle("_upload_job_config"));
            if (bundle4 != null) {
                r11 = new C033506q(bundle4.getLong("min_delay_ms", -1), bundle4.getLong("max_delay_ms", -1), bundle4.getString("action"));
            } else {
                r11 = null;
            }
            return new C033806t(messenger, bundle3, string, r9, i, r11, context);
        }
        throw new C031305p("_job_id is " + bundle2.get("_job_id"));
    }

    public C033806t(Messenger messenger, Bundle bundle, String str, AnonymousClass06W r4, int i, C033506q r6, Context context) {
        this.A05 = messenger;
        this.A04 = bundle;
        this.A08 = str;
        this.A06 = r4;
        this.A02 = i;
        this.A03 = context;
        this.A07 = r6;
    }
}
