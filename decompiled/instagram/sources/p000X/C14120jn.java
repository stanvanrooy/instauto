package p000X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.0jn  reason: invalid class name and case insensitive filesystem */
public final class C14120jn {
    public static C14120jn A05;
    public static final Object A06 = new Object();
    public final Context A00;
    public final ArrayList A01 = new ArrayList();
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final Handler A04;

    public static C14120jn A00(Context context) {
        C14120jn r0;
        synchronized (A06) {
            if (A05 == null) {
                A05 = new C14120jn(context.getApplicationContext());
            }
            r0 = A05;
        }
        return r0;
    }

    public final void A01(Intent intent) {
        synchronized (this.A03) {
            Intent intent2 = intent;
            String action = intent2.getAction();
            String resolveTypeIfNeeded = intent2.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent2.getData();
            String scheme = intent2.getScheme();
            Set<String> categories = intent2.getCategories();
            if ((intent2.getFlags() & 8) != 0) {
            }
            ArrayList arrayList = (ArrayList) this.A02.get(intent2.getAction());
            if (arrayList != null) {
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    C24720AsN asN = (C24720AsN) arrayList.get(i);
                    if (!asN.A00 && asN.A01.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(asN);
                        asN.A00 = true;
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C24720AsN) arrayList2.get(i2)).A00 = false;
                    }
                    this.A01.add(new C92763zg(intent2, arrayList2));
                    if (!this.A04.hasMessages(1)) {
                        AnonymousClass0ZA.A0B(this.A04, 1);
                    }
                }
            }
        }
    }

    public C14120jn(Context context) {
        this.A00 = context;
        this.A04 = new C14130jo(this, context.getMainLooper());
    }
}
