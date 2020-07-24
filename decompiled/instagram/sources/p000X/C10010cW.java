package p000X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.rti.push.service.FbnsService;

/* renamed from: X.0cW  reason: invalid class name and case insensitive filesystem */
public final class C10010cW implements AnonymousClass0X2 {
    public static final AnonymousClass0X2 A01 = new C10010cW(Constants.ONE);
    public static final AnonymousClass0X2 A02 = new C10010cW(Constants.A06);
    public static final AnonymousClass0X2 A03 = new C10010cW(Constants.A0j);
    public final Integer A00;

    public final Bundle ACN(FbnsService fbnsService, Bundle bundle) {
        SharedPreferences A002 = AnonymousClass0T9.A00(fbnsService, this.A00);
        Bundle bundle2 = new Bundle();
        for (String str : bundle.keySet()) {
            try {
                C08400Ww r0 = (C08400Ww) Enum.valueOf(C08400Ww.class, str);
                C08390Wv r3 = r0.A00;
                try {
                    r3.A04(bundle2, r0.name(), r3.A01(A002, r0.A01, (Object) null));
                } catch (ClassCastException e) {
                    AnonymousClass0DB.A0G("KeyValueWrapper", "sharedPrefsToBundle got ClassCastException", e);
                }
            } catch (IllegalArgumentException e2) {
                AnonymousClass0DB.A0P("SharedPreferencesBasedStateHelper", e2, "aidlBundleKey: %s not exist in FbnsAIDLConstants", str);
            }
        }
        return bundle2;
    }

    public final void ACQ(FbnsService fbnsService, Bundle bundle) {
        SharedPreferences.Editor edit = AnonymousClass0T9.A00(fbnsService, this.A00).edit();
        for (String str : bundle.keySet()) {
            try {
                C08400Ww r0 = (C08400Ww) Enum.valueOf(C08400Ww.class, str);
                C08390Wv r3 = r0.A00;
                String name = r0.name();
                try {
                    r3.A03(edit, r0.A01, r3.A02(bundle, name, (Object) null));
                } catch (ClassCastException e) {
                    AnonymousClass0DB.A0G("KeyValueWrapper", "bundleToSharedPrefs got ClassCastException", e);
                }
            } catch (IllegalArgumentException e2) {
                AnonymousClass0DB.A0P("SharedPreferencesBasedStateHelper", e2, "aidlBundleKey: %s not exist in FbnsAIDLConstants", str);
            }
        }
        edit.apply();
    }

    public C10010cW(Integer num) {
        this.A00 = num;
    }
}
