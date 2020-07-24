package com.facebook.cameracore.instagram.ardelivery.networkconsentmanager;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage;
import com.facebook.common.util.TriState;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0a4;
import p000X.C06570Po;
import p000X.C14190ju;
import p000X.C25457BLh;
import p000X.C25458BLi;
import p000X.C25459BLj;
import p000X.C25905Bbt;

public class IgNetworkConsentStorage implements C06570Po, NetworkConsentStorage {
    public static final int MAX_ENTRIES = 1000;
    public static final String TAG = "IgNetworkConsentStorage";
    public final SharedPreferences mAccessTsPrefs;
    public final SharedPreferences mUserConsentPrefs;

    public void onUserSessionWillEnd(boolean z) {
    }

    public static IgNetworkConsentStorage getInstance(AnonymousClass0C1 r2) {
        return (IgNetworkConsentStorage) r2.AVA(IgNetworkConsentStorage.class, new C25459BLj(r2));
    }

    private void maybeTrimEntries() {
        Map<String, ?> all = this.mAccessTsPrefs.getAll();
        if (all.size() > 1000) {
            C25458BLi bLi = new C25458BLi(new C25457BLh(this));
            int size = all.size() - 1000;
            boolean z = false;
            if (size > 0) {
                z = true;
            }
            AnonymousClass0a4.A09(z);
            bLi.A00 = size;
            Set<Object> emptySet = Collections.emptySet();
            C25905Bbt bbt = new C25905Bbt(bLi, C25905Bbt.initialQueueSize(-1, bLi.A00, emptySet));
            for (Object offer : emptySet) {
                bbt.offer(offer);
            }
            bbt.addAll(all.entrySet());
            Iterator it = bbt.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                this.mAccessTsPrefs.edit().remove((String) entry.getKey()).apply();
                this.mUserConsentPrefs.edit().remove((String) entry.getKey()).apply();
            }
        }
    }

    public void clearAllUserConsent() {
        this.mUserConsentPrefs.edit().clear().apply();
        this.mAccessTsPrefs.edit().clear().apply();
    }

    public TriState getUserConsent(String str) {
        if (!this.mUserConsentPrefs.contains(str)) {
            return TriState.UNSET;
        }
        this.mAccessTsPrefs.edit().putLong(str, System.currentTimeMillis()).apply();
        return TriState.valueOf(this.mUserConsentPrefs.getBoolean(str, false));
    }

    public IgNetworkConsentStorage(AnonymousClass0C1 r3) {
        C14190ju A01 = C14190ju.A01(r3);
        this.mUserConsentPrefs = A01.A03(Constants.A0r);
        this.mAccessTsPrefs = A01.A03(Constants.A0s);
    }

    public void saveUserConsent(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            AnonymousClass0DB.A0F(TAG, "saveUserConsent() called with empty cache key!");
            return;
        }
        this.mUserConsentPrefs.edit().putBoolean(str, z).apply();
        this.mAccessTsPrefs.edit().putLong(str, System.currentTimeMillis()).apply();
        maybeTrimEntries();
    }
}
