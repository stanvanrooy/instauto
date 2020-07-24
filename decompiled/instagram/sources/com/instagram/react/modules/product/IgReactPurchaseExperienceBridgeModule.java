package com.instagram.react.modules.product;

import com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.A1e;
import p000X.A44;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass6Z0;
import p000X.AnonymousClass6Z1;
import p000X.AnonymousClass9T4;
import p000X.Bg0;
import p000X.C13300iJ;
import p000X.C206278sK;
import p000X.C2102594w;
import p000X.C214089Ky;
import p000X.C223009j1;
import p000X.C228039ra;
import p000X.C23043A0y;
import p000X.C23300zv;
import p000X.C26162Bgg;
import p000X.DGc;

@ReactModule(name = "IGPurchaseExperienceBridgeModule")
public class IgReactPurchaseExperienceBridgeModule extends NativeIGPurchaseExperienceBridgeModuleSpec {
    public static final String BOTTOM_SHEET_CONTENT_SUBTITLE = "bottomSheetContentSubtitle";
    public static final String BOTTOM_SHEET_CONTENT_TITLE = "bottomSheetContentTitle";
    public static final String BOTTOM_SHEET_PRIMARY_BUTTON_TEXT = "bottomSheetPrimaryButtonText";
    public static final String BOTTOM_SHEET_SECONDARY_BUTTON_TEXT = "bottomSheetSecondaryButtonText";
    public static final String BOTTOM_SHEET_TITLE = "bottomSheetTitle";
    public static final String CREDENTIALS_MAP = "credentials";
    public static final String CREDENTIAL_TYPE = "credentialType";
    public static final String EMAIL = "email";
    public static final String FULL_NAME = "fullName";
    public static final String LAST4_CARD_NUM = "last4CardNum";
    public static final String MODULE_NAME = "IGPurchaseExperienceBridgeModule";
    public static final String RN_AUTH_KEY = "auth";
    public static final String RN_AUTH_LOGGING_ID = "loggingSessionId";
    public static final String RN_AUTH_PTT_CAPS = "caps";
    public static final String RN_AUTH_PTT_DATA_KEY = "ptt_data";
    public static final String RN_AUTH_PTT_DATA_PAYLOAD_KEY = "payload";
    public static final String RN_PAYMENT_TYPE_KEY = "paymentType";
    public static final String RN_TICKET_TYPE = "authTicketType";
    public static final String UPSELL_ACCOUNTS_MAP = "upsellAccounts";
    public List mProducts;
    public C214089Ky mSurveyController;
    public AnonymousClass0C1 mUserSession;

    public void checkoutConfirmationWillDismiss() {
    }

    public String getName() {
        return MODULE_NAME;
    }

    public void authenticate(double d, C23043A0y a0y, C2102594w r12) {
        try {
            C23043A0y map = a0y.getMap(RN_AUTH_KEY);
            AnonymousClass0a4.A06(map);
            AnonymousClass0a4.A06(map.getString(RN_TICKET_TYPE));
            String string = map.getString(RN_PAYMENT_TYPE_KEY);
            AnonymousClass0a4.A06(string);
            String string2 = map.getString(RN_AUTH_LOGGING_ID);
            AnonymousClass0a4.A06(string2);
            ArrayList arrayList = new ArrayList();
            A1e array = map.getArray(RN_AUTH_PTT_CAPS);
            if (array != null) {
                for (int i = 0; i < array.size(); i++) {
                    arrayList.add(array.getString(i));
                }
            }
            C23043A0y map2 = a0y.getMap(RN_AUTH_PTT_DATA_KEY);
            String str = null;
            if (map2 != null && map2.hasKey(RN_AUTH_PTT_DATA_PAYLOAD_KEY)) {
                C23043A0y map3 = map2.getMap(RN_AUTH_PTT_DATA_PAYLOAD_KEY);
                AnonymousClass0a4.A06(map3);
                str = new JSONObject(map3.toHashMap()).toString();
            }
            C228039ra.A01(new Bg0(this, new C26162Bgg(string, string2, Collections.unmodifiableList(arrayList), str), r12));
        } catch (IllegalArgumentException | NullPointerException e) {
            r12.reject(e);
        }
    }

    public void dismissCheckout(double d, boolean z) {
        C228039ra.A01(new AnonymousClass6Z1(this));
    }

    public void onPaymentSuccess(String str, boolean z, String str2, A1e a1e, A1e a1e2) {
        AnonymousClass0C1 r2 = this.mUserSession;
        if (r2 != null) {
            C13300iJ r1 = r2.A06;
            r1.A0r = true;
            r1.A0F(r2);
            if (z && str2 != null) {
                ArrayList arrayList = new ArrayList();
                if (a1e2 != null) {
                    Iterator it = a1e2.toArrayList().iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof String) {
                            arrayList.add((String) next);
                        }
                    }
                }
                C23300zv.A00(this.mUserSession).BXT(new AnonymousClass9T4(str2, Collections.unmodifiableList(arrayList)));
            }
        }
        C214089Ky r12 = this.mSurveyController;
        if (r12 != null) {
            r12.A01 = true;
        }
    }

    public void openConnectFlow(double d, C23043A0y a0y, C2102594w r5) {
        C228039ra.A01(new C206278sK(this, a0y, r5));
    }

    public void sharePurchaseToStory(double d, String str, String str2) {
        C228039ra.A01(new AnonymousClass6Z0(this, str, str2));
    }

    public void getCheckoutInformation(C2102594w r4) {
        DGc dGc = C223009j1.A00().A00;
        if (dGc != null) {
            synchronized (dGc) {
                if (dGc.A01 != null) {
                    try {
                        r4.resolve(DGc.A00(dGc));
                        dGc.A03.A02 = true;
                    } catch (IOException | JSONException e) {
                        r4.reject(e);
                    }
                } else {
                    Throwable th = dGc.A02;
                    if (th != null) {
                        r4.reject(th);
                        dGc.A02 = null;
                    } else {
                        dGc.A00 = r4;
                    }
                }
            }
        }
    }

    public IgReactPurchaseExperienceBridgeModule(A44 a44) {
        super(a44);
    }

    public void setProducts(List list) {
        this.mProducts = list;
    }

    public void setSurveyController(C214089Ky r1) {
        this.mSurveyController = r1;
    }

    public void setUserSession(AnonymousClass0C1 r1) {
        this.mUserSession = r1;
    }
}
