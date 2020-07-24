package com.instagram.direct.fragment.quickreply.manager;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0O9;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass4KF;
import p000X.AnonymousClass4ND;
import p000X.AnonymousClass4NE;
import p000X.AnonymousClass4PD;
import p000X.AnonymousClass4PE;
import p000X.AnonymousClass4PF;
import p000X.C05700Lp;
import p000X.C06570Po;
import p000X.C12670hC;
import p000X.C12890hY;
import p000X.C13460iZ;
import p000X.C15300mf;
import p000X.C23300zv;

public final class QuickReplyTextManager implements C06570Po {
    public AnonymousClass4NE A00;
    public String A01 = "";
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SharedPreferences A05;
    public final C23300zv A06;
    public final AnonymousClass0C1 A07;
    public final Map A08 = new HashMap();
    public final AnonymousClass0O9 A09 = new AnonymousClass4PD(this);

    public static QuickReplyTextManager A00(AnonymousClass0C1 r2) {
        return (QuickReplyTextManager) r2.AVA(QuickReplyTextManager.class, new AnonymousClass4PE(r2));
    }

    public static void A01(QuickReplyTextManager quickReplyTextManager) {
        AnonymousClass4PF r2 = new AnonymousClass4PF(new ArrayList(quickReplyTextManager.A08.values()), quickReplyTextManager.A01);
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A052 = C12890hY.A00.A05(stringWriter);
            A052.A0T();
            String str = r2.A00;
            if (str != null) {
                A052.A0H("modification_token", str);
            }
            if (r2.A01 != null) {
                A052.A0d("quick_replies");
                A052.A0S();
                for (AnonymousClass4ND r22 : r2.A01) {
                    if (r22 != null) {
                        A052.A0T();
                        String str2 = r22.A02;
                        if (str2 != null) {
                            A052.A0H("shortcut", str2);
                        }
                        String str3 = r22.A01;
                        if (str3 != null) {
                            A052.A0H("text", str3);
                        }
                        String str4 = r22.A00;
                        if (str4 != null) {
                            A052.A0H("uuid", str4);
                        }
                        A052.A0Q();
                    }
                }
                A052.A0P();
            }
            A052.A0Q();
            A052.close();
            String stringWriter2 = stringWriter.toString();
            SharedPreferences.Editor edit = quickReplyTextManager.A05.edit();
            edit.putString("quickRepliesCollection", stringWriter2);
            edit.apply();
            quickReplyTextManager.A06.BXT(new AnonymousClass4KF());
        } catch (IOException e) {
            AnonymousClass0QD.A08("quick_replies_serialization", "failed to serialize", e, 1);
        }
    }

    public static void A02(QuickReplyTextManager quickReplyTextManager, List list) {
        quickReplyTextManager.A08.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass4ND r2 = (AnonymousClass4ND) it.next();
            quickReplyTextManager.A08.put(r2.A00(), r2);
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A07.BbT(QuickReplyTextManager.class);
    }

    public QuickReplyTextManager(AnonymousClass0C1 r2, C23300zv r3, SharedPreferences sharedPreferences) {
        this.A07 = r2;
        this.A06 = r3;
        this.A05 = sharedPreferences;
    }

    public final AnonymousClass4ND A03(String str) {
        C12670hC.A02();
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(C15300mf.A03());
            for (AnonymousClass4ND r1 : this.A08.values()) {
                if (r1.A02.equals(lowerCase)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public final void A04() {
        C12670hC.A02();
        if (!this.A02) {
            this.A02 = true;
            C05700Lp.A00().ADc(this.A09);
        }
    }
}
