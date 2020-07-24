package p000X;

import android.content.SharedPreferences;
import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1rE  reason: invalid class name and case insensitive filesystem */
public final class C41941rE {
    public static final long A00 = TimeUnit.HOURS.toMillis(5);

    public static void A02() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (PushChannelType pushChannelType : PushChannelType.values()) {
            arrayList.add(pushChannelType.A01);
        }
        SharedPreferences.Editor edit = C05760Lv.A01.A00.edit();
        for (String A0E : arrayList) {
            edit.remove(AnonymousClass000.A0E("push_reg_date", A0E));
        }
        edit.apply();
    }

    public static String A00(PushChannelType pushChannelType) {
        if (C05770Lw.A00().A00.getBoolean("push_debug_enabled", false)) {
            return pushChannelType.A00;
        }
        return null;
    }

    public static void A01() {
        A02();
        C41951rF.A00().BZU();
    }
}
