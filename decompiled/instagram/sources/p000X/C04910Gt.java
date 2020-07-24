package p000X;

import android.content.Context;
import com.instagram.reliability.InstacrashSessionProvider;
import java.util.HashMap;

/* renamed from: X.0Gt  reason: invalid class name and case insensitive filesystem */
public final class C04910Gt extends AnonymousClass0O9 {
    public final /* synthetic */ Context A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C04910Gt(Context context) {
        super(313, 3, false, true);
        this.A00 = context;
    }

    public final void run() {
        AnonymousClass0Kk A002 = new InstacrashSessionProvider().A00(this.A00);
        if (A002 != null) {
            Context context = this.A00;
            boolean z = false;
            if (C05760Lv.A01.A00.getString("current", (String) null) != null) {
                z = true;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "app_did_startup");
            hashMap.put("user_is_logged_in", Boolean.valueOf(z));
            C05420Kl.A00(context, A002, hashMap);
        }
    }
}
