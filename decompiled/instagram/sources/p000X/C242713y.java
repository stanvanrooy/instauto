package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.13y  reason: invalid class name and case insensitive filesystem */
public final class C242713y implements AnonymousClass0C2 {
    public final Context A00;
    public final SharedPreferences A01;
    public final AnonymousClass0C1 A02;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C242713y A00(Context context, AnonymousClass0C1 r3) {
        return (C242713y) r3.AVA(C242713y.class, new C242813z(context, r3));
    }

    public final ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> value : this.A01.getAll().entrySet()) {
            arrayList.add((String) value.getValue());
        }
        return arrayList;
    }

    public C242713y(Context context, AnonymousClass0C1 r2, SharedPreferences sharedPreferences) {
        this.A00 = context;
        this.A02 = r2;
        this.A01 = sharedPreferences;
    }

    public final AutofillData A01(AutofillData autofillData) {
        String str = (String) autofillData.A01().get("id");
        SharedPreferences.Editor edit = this.A01.edit();
        if (str == null) {
            if (!this.A01.getAll().isEmpty()) {
                edit.clear();
            }
            HashMap hashMap = new HashMap(autofillData.A01());
            str = UUID.randomUUID().toString();
            hashMap.put("id", str);
            autofillData = new AutofillData((Map) hashMap);
        }
        edit.putString(str, autofillData.A02().toString()).apply();
        return autofillData;
    }

    public final void A03(AutofillData autofillData) {
        AutofillData A012 = A01(autofillData);
        AnonymousClass0C1 r2 = this.A02;
        try {
            B7Q b7q = new B7Q(StringFormatUtil.formatStrLocaleSafe("{\"request\": %s}", (Object) B05.A00(B06.A00(r2, A012))));
            AnonymousClass25V A002 = AnonymousClass25V.A00(r2);
            A002.A03(b7q);
            A002.A04(Constants.ZERO);
            B06.A01(A002.A02(Constants.ONE));
        } catch (IOException e) {
            AnonymousClass0QD.A05("AutofillGraphQLRequest", "Error creating save autofill request", e);
        }
    }

    public final void onUserSessionStart(boolean z) {
        long j;
        int A03 = AnonymousClass0Z0.A03(1181148644);
        if (((Boolean) AnonymousClass0L6.A03(this.A02, AnonymousClass0L7.IAB_AUTOFILL, "is_server_storage_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass0O3 A002 = AnonymousClass0O3.A00();
            AnonymousClass2EL r2 = new AnonymousClass2EL(this);
            if (z) {
                j = ArLinkScanControllerImpl.ERROR_DELAY_MS;
            } else {
                j = 0;
            }
            A002.A01(r2, j);
        }
        AnonymousClass0Z0.A0A(1490059671, A03);
    }
}
