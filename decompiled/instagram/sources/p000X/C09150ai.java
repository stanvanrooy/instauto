package p000X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0ai  reason: invalid class name and case insensitive filesystem */
public final class C09150ai extends C09790c1 {
    public final Context A00;
    public final C11290ej A01;
    public final C11310el A02;

    public C09150ai(Context context, C11290ej r2, C11310el r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A06() {
        super.A06();
        this.A04.add(AnonymousClass05N.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e2, code lost:
        if (r4 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ce A[SYNTHETIC] */
    public final void A07() {
        int i;
        String str;
        int A03 = AnonymousClass0Z0.A03(220952689);
        C256819v.A00 = new C256719u();
        C11290ej.A00 = this.A01;
        C11310el.A00 = this.A02;
        Context context = this.A00;
        if (C257219z.A01 == null) {
            C257219z.A01 = new C257219z(context);
        }
        AnonymousClass1A0.A02 = new AnonymousClass1A0(this.A00.getApplicationContext());
        AnonymousClass0k6 r3 = new AnonymousClass0k6(this.A00);
        synchronized (AnonymousClass0k5.class) {
            AnonymousClass0k5.A00 = r3;
        }
        Context context2 = this.A00;
        String str2 = (String) C05640Lj.A00(AnonymousClass0L7.SECURITY_INTENT_SWITCHOFF, "switch_offs", "null");
        String[] split = Build.VERSION.RELEASE.split("\\.");
        if (split.length == 0) {
            i = -1;
        } else {
            try {
                i = Integer.parseInt(split[0]);
            } catch (NumberFormatException unused) {
                i = -1;
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] split2 = str2.split("\\^\\^\\^");
            int length = split2.length;
            if (length % 2 == 1) {
                AnonymousClass0DB.A0J("SwitchOffConfiguration", "Multi-version criteria odd-number of parts: %d", Integer.valueOf(length));
                length--;
            }
            if (length != 0) {
                ArrayList arrayList = new ArrayList(length >> 1);
                for (int i2 = 0; i2 < length; i2++) {
                    String str3 = split2[i2];
                    boolean z = true;
                    try {
                        String[] split3 = str3.split("-");
                        if (split3.length == 2) {
                            int parseInt = Integer.parseInt(split3[0]);
                            int parseInt2 = Integer.parseInt(split3[1]);
                            if (parseInt <= 0 || parseInt2 <= 0 || parseInt > parseInt2) {
                                AnonymousClass0DB.A0J("SwitchOffConfiguration", "Invalid version values: %s", str3);
                            } else if (parseInt <= i && i <= parseInt2) {
                                if (!z) {
                                    arrayList.add(split2[i2 + 1]);
                                }
                            }
                        }
                    } catch (NumberFormatException e) {
                        AnonymousClass0DB.A0P("SwitchOffConfiguration", e, "Invalid version format: %s", str3);
                    }
                    z = false;
                    if (!z) {
                    }
                }
                str = C06360Ot.A04("^^^", arrayList);
            }
        }
        str = "";
        AnonymousClass0XZ[] A002 = AnonymousClass0XZ.A00(str, context2);
        AnonymousClass1A1[] r32 = new AnonymousClass1A1[0];
        HashMap hashMap = new HashMap();
        synchronized (AnonymousClass0XY.class) {
            AnonymousClass0XY.A00 = new C09960cQ(A002, r32, hashMap);
            context2.getSharedPreferences("com.facebook.secure.switchoff", 0).edit().putString("last_criteria", str).putString("last_custom_config", "").putString("last_deeplink_config", "").apply();
        }
        if (AnonymousClass1A2.A00 == null) {
            AnonymousClass1A2 r1 = new AnonymousClass1A2();
            AnonymousClass1A2.A00 = r1;
            AnonymousClass0QA.A00.A00(r1);
        }
        AnonymousClass0Z0.A0A(-1268645005, A03);
    }
}
