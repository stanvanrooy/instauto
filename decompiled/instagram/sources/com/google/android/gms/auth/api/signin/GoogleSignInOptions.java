package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000X.C228479tj;
import p000X.C228799vm;
import p000X.C229279xP;
import p000X.C229289xV;
import p000X.C229319xY;
import p000X.C229349xg;

public class GoogleSignInOptions extends AbstractSafeParcelable implements C229349xg, ReflectedParcelable {
    public static Comparator A0A = new C229289xV();
    public static final GoogleSignInOptions A0B;
    public static final GoogleSignInOptions A0C;
    public static final Scope A0D = new Scope(1, "profile");
    public static final Scope A0E = new Scope(1, IgReactPurchaseExperienceBridgeModule.EMAIL);
    public static final Scope A0F = new Scope(1, "openid");
    public static final Scope A0G = new Scope(1, "https://www.googleapis.com/auth/games_lite");
    public static final Scope A0H = new Scope(1, "https://www.googleapis.com/auth/games");
    public static final Parcelable.Creator CREATOR = new C228799vm();
    public Account A00;
    public String A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;
    public Map A05;
    public final ArrayList A06;
    public final boolean A07;
    public final boolean A08;
    public final int A09;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r5.A00 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (android.text.TextUtils.isEmpty(r5.A01) != false) goto L_0x0050;
     */
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.A03.size() <= 0 && googleSignInOptions.A03.size() <= 0 && this.A06.size() == new ArrayList(googleSignInOptions.A06).size() && this.A06.containsAll(new ArrayList(googleSignInOptions.A06))) {
                Account account = this.A00;
                if (account != null) {
                    if (account.equals(googleSignInOptions.A00)) {
                    }
                }
                if (!TextUtils.isEmpty(this.A01)) {
                    if (this.A01.equals(googleSignInOptions.A01)) {
                    }
                }
                if (this.A07 == googleSignInOptions.A07 && this.A04 == googleSignInOptions.A04 && this.A08 == googleSignInOptions.A08) {
                    return true;
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    static {
        C229279xP r2 = new C229279xP();
        r2.A01.add(A0F);
        r2.A01.add(A0D);
        A0C = r2.A00();
        C229279xP r3 = new C229279xP();
        r3.A01.add(A0G);
        r3.A01.addAll(Arrays.asList(new Scope[0]));
        A0B = r3.A00();
    }

    public static Map A00(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.A00), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.A06;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).A00);
        }
        Collections.sort(arrayList);
        C229319xY r3 = new C229319xY();
        r3.A00(arrayList);
        r3.A00(this.A00);
        r3.A00(this.A01);
        return (31 * ((31 * ((31 * r3.A00) + (this.A07 ? 1 : 0))) + (this.A04 ? 1 : 0))) + (this.A08 ? 1 : 0);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map) {
        this.A09 = i;
        this.A06 = arrayList;
        this.A00 = account;
        this.A04 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = new ArrayList(map.values());
        this.A05 = map;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A09);
        C228479tj.A0C(parcel, 2, new ArrayList(this.A06), false);
        C228479tj.A09(parcel, 3, this.A00, i, false);
        C228479tj.A0D(parcel, 4, this.A04);
        C228479tj.A0D(parcel, 5, this.A08);
        C228479tj.A0D(parcel, 6, this.A07);
        C228479tj.A0A(parcel, 7, this.A01, false);
        C228479tj.A0A(parcel, 8, this.A02, false);
        C228479tj.A0C(parcel, 9, this.A03, false);
        C228479tj.A02(parcel, A002);
    }
}
