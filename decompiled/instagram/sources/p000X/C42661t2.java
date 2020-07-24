package p000X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.user.model.MicroUser;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.1t2  reason: invalid class name and case insensitive filesystem */
public final class C42661t2 implements C06570Po, C06580Pp {
    public HashMap A00 = new HashMap();
    public HashMap A01 = new HashMap();
    public C06590Pq A02;

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C42661t2 A00(C06590Pq r2) {
        return (C42661t2) r2.AVA(C42661t2.class, new C42671t3(r2));
    }

    public final void A02() {
        if (!this.A01.isEmpty()) {
            HashMap hashMap = new HashMap();
            this.A01 = hashMap;
            A05(hashMap.values());
        }
    }

    public final void A03() {
        C486428w A012 = C486428w.A01(this.A02);
        HashSet hashSet = new HashSet();
        for (AccountFamily accountFamily : A012.A02.values()) {
            for (MicroUser microUser : accountFamily.A03) {
                hashSet.add(microUser.A03);
            }
        }
        Iterator it = this.A00.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!hashSet.contains(((C125505Zr) ((Map.Entry) it.next()).getValue()).A00.A01.A03)) {
                it.remove();
                z = true;
            }
        }
        if (z) {
            A04(this.A00.values());
        }
    }

    public C42661t2(C06590Pq r5) {
        this.A02 = r5;
        String string = C05760Lv.A01.A00.getString("deferred_account_data", "");
        String string2 = C05760Lv.A01.A00.getString("deferred_recovered_account_data", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                C13080hr A0A = C12890hY.A00.A0A(string);
                A0A.A0p();
                A01(ImmutableList.A09(AnonymousClass23c.parseFromJson(A0A).A00));
            }
            if (!TextUtils.isEmpty(string2)) {
                C13080hr A0A2 = C12890hY.A00.A0A(string2);
                A0A2.A0p();
                for (AnonymousClass5ZY r2 : ImmutableList.A09(C125335Za.parseFromJson(A0A2).A00)) {
                    this.A01.put(r2.A00.A03, r2);
                }
            }
        } catch (IOException e) {
            AnonymousClass0QD.A01("DeferredAccountHelper", AnonymousClass000.A0E("Malformed cached deferred accounts. Error:", e.getMessage()));
        }
    }

    private void A01(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C125505Zr r2 = (C125505Zr) it.next();
            if (((AnonymousClass5ZY) this.A01.remove(r2.A00())) != null) {
                A05(this.A01.values());
            }
            this.A00.put(r2.A00(), r2);
        }
    }

    public final void A04(Collection collection) {
        try {
            A01(collection);
            AnonymousClass23d r2 = new AnonymousClass23d(new LinkedList(this.A00.values()));
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0T();
            if (r2.A00 != null) {
                A05.A0d("account_list");
                A05.A0S();
                for (C125505Zr r22 : r2.A00) {
                    if (r22 != null) {
                        A05.A0T();
                        String str = r22.A01;
                        if (str != null) {
                            A05.A0H("main_account_id", str);
                        }
                        String str2 = r22.A02;
                        if (str2 != null) {
                            A05.A0H("one_tap_nonce", str2);
                        }
                        if (r22.A00 != null) {
                            A05.A0d("user_info");
                            C54842Zd r1 = r22.A00;
                            A05.A0T();
                            if (r1.A01 != null) {
                                A05.A0d("user");
                                C474524a.A00(A05, r1.A01);
                            }
                            A05.A0G("link_time", r1.A00);
                            A05.A0Q();
                        }
                        A05.A0Q();
                    }
                }
                A05.A0P();
            }
            A05.A0Q();
            A05.close();
            C05760Lv.A01.A00.edit().putString("deferred_account_data", stringWriter.toString()).apply();
        } catch (IOException e) {
            AnonymousClass0QD.A01("DeferredAccountHelper", AnonymousClass000.A0E("Unable to save deferred accounts. Error: ", e.getMessage()));
        }
    }

    public final void A05(Collection collection) {
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass5ZY r2 = (AnonymousClass5ZY) it.next();
                this.A01.put(r2.A00.A03, r2);
            }
            C125345Zb r22 = new C125345Zb(new LinkedList(this.A01.values()));
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0T();
            if (r22.A00 != null) {
                A05.A0d("account_list");
                A05.A0S();
                for (AnonymousClass5ZY r3 : r22.A00) {
                    if (r3 != null) {
                        A05.A0T();
                        String str = r3.A01;
                        if (str != null) {
                            A05.A0H("one_tap_nonce", str);
                        }
                        if (r3.A00 != null) {
                            A05.A0d("user");
                            C474524a.A00(A05, r3.A00);
                        }
                        A05.A0I("is_one_tap_opted_in", r3.A02);
                        A05.A0Q();
                    }
                }
                A05.A0P();
            }
            A05.A0Q();
            A05.close();
            C05760Lv.A01.A00.edit().putString("deferred_recovered_account_data", stringWriter.toString()).apply();
        } catch (IOException e) {
            AnonymousClass0QD.A01("DeferredAccountHelper", AnonymousClass000.A0E("Unable to save deferred accounts. Error: ", e.getMessage()));
        }
    }
}
