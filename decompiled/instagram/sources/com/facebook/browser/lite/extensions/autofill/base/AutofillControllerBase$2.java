package com.facebook.browser.lite.extensions.autofill.base;

import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.C24075AhV;
import p000X.C24076AhX;
import p000X.C24096Ai0;
import p000X.C24097Ai2;

public final class AutofillControllerBase$2 extends BrowserLiteJSBridgeCallback.Stub {
    public final /* synthetic */ C24075AhV A00;
    public final /* synthetic */ AutofillSharedJSBridgeProxy A01;
    public final /* synthetic */ AutofillData A02;
    public final /* synthetic */ RequestAutofillJSBridgeCall A03;

    public AutofillControllerBase$2(C24075AhV ahV, AutofillData autofillData, AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, RequestAutofillJSBridgeCall requestAutofillJSBridgeCall) {
        this.A00 = ahV;
        this.A02 = autofillData;
        this.A01 = autofillSharedJSBridgeProxy;
        this.A03 = requestAutofillJSBridgeCall;
        AnonymousClass0Z0.A0A(1456504774, AnonymousClass0Z0.A03(-1687562056));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ff, code lost:
        if (p000X.C24096Ai0.A08((com.facebook.browser.lite.extensions.autofill.model.AutofillData) r4.get(0), r8) == false) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0214  */
    public final void AuE(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, int i, Bundle bundle) {
        Integer num;
        int i2;
        AutofillData autofillData;
        int i3;
        AutofillData autofillData2;
        boolean z;
        int A032 = AnonymousClass0Z0.A03(469809050);
        List A05 = C24096Ai0.A05(bundle.getStringArrayList("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"));
        AutofillData autofillData3 = this.A02;
        C24075AhV ahV = this.A00;
        String AJc = ahV.A04.AJc();
        Map map = ahV.A04;
        Map map2 = ahV.A06;
        String str = ahV.A03;
        String A012 = C24096Ai0.A01(AJc);
        if (map.containsKey(A012)) {
            if (((Boolean) map.get(A012)).booleanValue()) {
                AutofillData autofillData4 = (AutofillData) map2.get(AJc);
                if (autofillData4 != null && C24096Ai0.A08(autofillData4, autofillData3)) {
                    Map A013 = autofillData4.A01();
                    Iterator it = autofillData3.A01().entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str2 = (String) A013.get(entry.getKey());
                        if (str2 != null && !str2.equals(entry.getValue())) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        HashSet hashSet = new HashSet();
                        Map A014 = autofillData4.A01();
                        for (Map.Entry entry2 : autofillData3.A01().entrySet()) {
                            String str3 = (String) A014.get(entry2.getKey());
                            if (str3 != null && !str3.equals(entry2.getValue())) {
                                hashSet.add(entry2.getKey());
                            }
                        }
                        C24096Ai0.A07(new C24097Ai2("EDITED_AUTOFILLED_FIELD", str, (String) null, (String) null, (String) null, (String) null, (String) null, AJc, (String) null, C24096Ai0.A02(hashSet), 0, 0, 0, 0));
                    }
                    num = Constants.ZERO;
                    C24076AhX A033 = this.A00.A03();
                    switch (num.intValue()) {
                        case 1:
                            C24075AhV ahV2 = this.A00;
                            C24096Ai0.A07(new C24097Ai2("PROMPTED_SAVE", ahV2.A03, (String) null, (String) null, (String) null, (String) null, (String) null, AJc, ahV2.A01, (String) null, 0, 0, 0, 0));
                            i2 = 1;
                            break;
                        case 2:
                            HashMap hashMap = new HashMap(((AutofillData) A05.get(0)).A01());
                            hashMap.putAll(autofillData3.A01());
                            autofillData3 = new AutofillData((Map) hashMap);
                            if (!A05.isEmpty()) {
                                autofillData2 = (AutofillData) A05.get(0);
                            } else {
                                autofillData2 = new AutofillData((Map) new HashMap());
                            }
                            C24075AhV ahV3 = this.A00;
                            C24096Ai0.A07(new C24097Ai2("PROMPTED_UPDATE", ahV3.A03, (String) null, (String) null, (String) null, C24096Ai0.A02(autofillData2.A01().keySet()), C24096Ai0.A02(C24096Ai0.A06(autofillData2.A01(), autofillData3.A01())), AJc, ahV3.A01, (String) null, 0, 0, 0, 0));
                            i2 = 2;
                            break;
                        case 3:
                            C24075AhV ahV4 = this.A00;
                            C24096Ai0.A07(new C24097Ai2("PROMPTED_OVERWRITE", ahV4.A03, (String) null, (String) null, (String) null, (String) null, (String) null, AJc, ahV4.A01, (String) null, 0, 0, 0, 0));
                            i2 = 3;
                            break;
                        default:
                            i3 = -419849338;
                            break;
                    }
                    if (A05.size() <= 0) {
                        autofillData = (AutofillData) A05.get(0);
                    } else {
                        autofillData = new AutofillData((Map) new HashMap());
                    }
                    AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy = this.A01;
                    RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = this.A03;
                    C24075AhV ahV5 = this.A00;
                    String str4 = ahV5.A03;
                    A033.A01 = autofillSharedJSBridgeProxy;
                    A033.A04 = requestAutofillJSBridgeCall;
                    A033.A02 = autofillData3;
                    A033.A03 = autofillData;
                    A033.A00 = i2;
                    A033.A06 = str4;
                    A033.A05 = AJc;
                    A033.A07 = A05;
                    A033.show(ahV5.A03.getFragmentManager(), "AutofillBottomSheetDialogFragment");
                    i3 = 1135733029;
                    AnonymousClass0Z0.A0A(i3, A032);
                }
            } else {
                num = Constants.A0N;
                C24076AhX A0332 = this.A00.A03();
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                if (A05.size() <= 0) {
                }
                AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy2 = this.A01;
                RequestAutofillJSBridgeCall requestAutofillJSBridgeCall2 = this.A03;
                C24075AhV ahV52 = this.A00;
                String str42 = ahV52.A03;
                A0332.A01 = autofillSharedJSBridgeProxy2;
                A0332.A04 = requestAutofillJSBridgeCall2;
                A0332.A02 = autofillData3;
                A0332.A03 = autofillData;
                A0332.A00 = i2;
                A0332.A06 = str42;
                A0332.A05 = AJc;
                A0332.A07 = A05;
                A0332.show(ahV52.A03.getFragmentManager(), "AutofillBottomSheetDialogFragment");
                i3 = 1135733029;
                AnonymousClass0Z0.A0A(i3, A032);
            }
        } else if (A05.isEmpty()) {
            num = Constants.ONE;
            C24076AhX A03322 = this.A00.A03();
            switch (num.intValue()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            if (A05.size() <= 0) {
            }
            AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy22 = this.A01;
            RequestAutofillJSBridgeCall requestAutofillJSBridgeCall22 = this.A03;
            C24075AhV ahV522 = this.A00;
            String str422 = ahV522.A03;
            A03322.A01 = autofillSharedJSBridgeProxy22;
            A03322.A04 = requestAutofillJSBridgeCall22;
            A03322.A02 = autofillData3;
            A03322.A03 = autofillData;
            A03322.A00 = i2;
            A03322.A06 = str422;
            A03322.A05 = AJc;
            A03322.A07 = A05;
            A03322.show(ahV522.A03.getFragmentManager(), "AutofillBottomSheetDialogFragment");
            i3 = 1135733029;
            AnonymousClass0Z0.A0A(i3, A032);
        }
        num = Constants.A0C;
        C24076AhX A033222 = this.A00.A03();
        switch (num.intValue()) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        if (A05.size() <= 0) {
        }
        AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy222 = this.A01;
        RequestAutofillJSBridgeCall requestAutofillJSBridgeCall222 = this.A03;
        C24075AhV ahV5222 = this.A00;
        String str4222 = ahV5222.A03;
        A033222.A01 = autofillSharedJSBridgeProxy222;
        A033222.A04 = requestAutofillJSBridgeCall222;
        A033222.A02 = autofillData3;
        A033222.A03 = autofillData;
        A033222.A00 = i2;
        A033222.A06 = str4222;
        A033222.A05 = AJc;
        A033222.A07 = A05;
        A033222.show(ahV5222.A03.getFragmentManager(), "AutofillBottomSheetDialogFragment");
        i3 = 1135733029;
        AnonymousClass0Z0.A0A(i3, A032);
    }
}
