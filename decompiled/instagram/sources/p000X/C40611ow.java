package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LruCache;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.1ow  reason: invalid class name and case insensitive filesystem */
public final class C40611ow {
    public static final LruCache A02 = new LruCache(50);
    public static final C40621ox A03 = new C40621ox();
    public static final AbstractMap.SimpleEntry[] A04 = {new AbstractMap.SimpleEntry("x-fb-fna-hit", "fna"), new AbstractMap.SimpleEntry("x-fb-edge-hit", "edge"), new AbstractMap.SimpleEntry("x-fb-origin-hit", "origin")};
    public final Map A00;
    public final C29610D1p[] A01;

    public static void A00(Context context) {
        Context applicationContext;
        C40621ox r3 = A03;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        if (r3.A00 == null) {
            if (applicationContext != null) {
                SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("livetrace", 0);
                String string = sharedPreferences.getString("player_id", (String) null);
                r3.A00 = string;
                if (string == null) {
                    r3.A00 = C40621ox.A00();
                    sharedPreferences.edit().putString("player_id", r3.A00).apply();
                }
            }
            if (r3.A00 == null) {
                r3.A00 = C40621ox.A00();
            }
            String str = r3.A00;
            AnonymousClass000.A0E("PLY:AND:DL:", str);
            AnonymousClass000.A0E("PLY:AND:DIS:", str);
            r3.A01 = AnonymousClass000.A0E("PLY:AND:", str);
        }
    }

    public C40611ow(C29610D1p[] d1pArr, Map map) {
        this.A01 = d1pArr;
        this.A00 = map;
    }
}
