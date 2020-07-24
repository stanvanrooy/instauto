package com.instagram.arlink.util;

import android.content.Intent;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0EY;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass2ZU;
import p000X.AnonymousClass2ZV;
import p000X.C05210Iq;
import p000X.C05760Lv;
import p000X.C06590Pq;
import p000X.C12810hQ;
import p000X.C15890nh;
import p000X.C17850qu;

public class ArLinkModelDownloadService extends AnonymousClass0EY {
    public static final long A00 = TimeUnit.HOURS.toMillis(1);

    public static boolean A00() {
        if (TextUtils.isEmpty(C05760Lv.A01.A00.getString("arlink_model_checksum", (String) null)) || TextUtils.isEmpty(C05760Lv.A01.A00.getString("arlink_model_version", (String) null))) {
            return false;
        }
        return true;
    }

    public final void onHandleWork(Intent intent) {
        long currentTimeMillis = System.currentTimeMillis() - C05760Lv.A01.A00.getLong("arlink_model_last_check_timestamp", 0);
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        if (A01.AgN()) {
            AnonymousClass0C1 A02 = C05210Iq.A02(A01);
            String string = C05760Lv.A01.A00.getString("arlink_model_version", (String) null);
            if (!A00() || !TextUtils.equals(string, "2.2.1") || currentTimeMillis > A00) {
                C15890nh r2 = new C15890nh(A02);
                r2.A09 = Constants.A0N;
                r2.A0C = "users/arlink_download_info/";
                r2.A09("version_override", "2.2.1");
                r2.A06(AnonymousClass2ZU.class, false);
                C17850qu A03 = r2.A03();
                A03.A00 = new AnonymousClass2ZV(this, A02);
                C12810hQ.A01(A03);
            }
        }
    }
}
