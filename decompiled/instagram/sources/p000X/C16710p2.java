package p000X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0p2  reason: invalid class name and case insensitive filesystem */
public final class C16710p2 {
    public Map A00 = new LinkedHashMap();
    public Set A01 = new HashSet();
    public boolean A02;
    public final SharedPreferences A03;
    public final C16720p3 A04;
    public final C16690p0 A05;
    public final String A06;

    public static synchronized void A00(C16710p2 r2) {
        synchronized (r2) {
            if (!r2.A02) {
                throw new IllegalStateException("notification category not initialized");
            }
        }
    }

    public final synchronized void A02() {
        if (!this.A02) {
            if (!this.A00.isEmpty() || !this.A01.isEmpty()) {
                throw new IllegalStateException("attempted to initialize twice");
            }
            for (Map.Entry next : this.A03.getAll().entrySet()) {
                String str = (String) next.getKey();
                int indexOf = str.indexOf("|");
                if (indexOf != -1) {
                    String substring = str.substring(0, indexOf);
                    String substring2 = str.substring(indexOf + 1);
                    if ("showing".equals(substring2)) {
                        this.A01.add(substring);
                    } else {
                        List list = (List) this.A00.get(substring);
                        if (list == null) {
                            list = new ArrayList();
                            this.A00.put(substring, list);
                        }
                        try {
                            int parseInt = Integer.parseInt(substring2);
                            while (parseInt >= list.size()) {
                                list.add((Object) null);
                            }
                            list.set(parseInt, this.A05.ABo((String) next.getValue()));
                        } catch (NumberFormatException e) {
                            AnonymousClass0QD.A01("NotificationCategoryController", "Failed to parse location info: Key = " + str + ", Exception: " + e);
                        }
                    }
                }
            }
            this.A02 = true;
        }
    }

    public final void A03(C06590Pq r7, String str, List list, boolean z, Runnable runnable) {
        String str2;
        String A002 = C145536Ka.A00(this.A06, str);
        C59722i7 A71 = this.A05.A71(C05210Iq.A03(r7), str, list, z);
        if (!this.A01.contains(str)) {
            this.A01.add(str);
            this.A03.edit().putBoolean(C24489AoW.A00(str), true).apply();
        }
        this.A04.A00.A02(A002, 64278, A71.A00);
        AnonymousClass0P4 A012 = C49452Ch.A01("notification_displayed", A71.A02);
        List unmodifiableList = Collections.unmodifiableList(A71.A03);
        String str3 = A71.A01;
        if (unmodifiableList.isEmpty()) {
            str2 = null;
        } else {
            str2 = (String) unmodifiableList.get(unmodifiableList.size() - 1);
        }
        A012.A0I("push_ids", unmodifiableList);
        if (str2 != null) {
            A012.A0G("pi", str2);
        }
        if (str3 != null) {
            A012.A0G("push_category", str3);
        }
        AnonymousClass0WN.A01(r7).BcG(A012);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final String toString() {
        AnonymousClass7GH r1 = new AnonymousClass7GH(C36681iR.A01("\n"));
        return AnonymousClass000.A0R("\nmCategoryName: ", this.A06, "\nmAggregateMode: ", "\nmData: \n", r1.A00(this.A00.entrySet()), "\nmShowing: \n", this.A01.toString(), "\nmPreferences: \n", r1.A00(this.A03.getAll().entrySet()));
    }

    public C16710p2(C16720p3 r3, C16690p0 r4) {
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = r4.AVy();
        String AHw = this.A05.AHw();
        this.A06 = AHw;
        if (AHw.contains("|")) {
            throw new IllegalArgumentException("category cannot contain delimiter");
        }
    }

    public final void A01() {
        A00(this);
        this.A04.A00(this.A06, (Runnable) null);
        this.A03.edit().remove("aggregated").apply();
    }

    public final void A04(String str) {
        A00(this);
        this.A04.A00(C145536Ka.A00(this.A06, str), (Runnable) null);
        this.A01.remove(str);
        this.A03.edit().remove(C24489AoW.A00(str)).apply();
    }

    public final void A05(String str) {
        A00(this);
        SharedPreferences.Editor edit = this.A03.edit();
        List list = (List) this.A00.remove(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                edit.remove(C24489AoW.A01(str, i));
            }
        }
        this.A04.A00(C145536Ka.A00(this.A06, str), (Runnable) null);
        this.A01.remove(str);
        edit.remove(C24489AoW.A00(str));
        edit.apply();
    }
}
