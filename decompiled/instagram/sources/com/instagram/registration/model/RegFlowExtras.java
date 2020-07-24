package com.instagram.registration.model;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass2VL;
import p000X.C05860Mt;
import p000X.C06590Pq;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C132395lE;
import p000X.C132405lF;
import p000X.C134605oq;
import p000X.C13460iZ;
import p000X.C134775p8;
import p000X.C134955pR;
import p000X.C15890nh;

public class RegFlowExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(451);
    public long A00;
    public CountryCodeData A01;
    public C134775p8 A02;
    public UserBirthDate A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public List A0S;
    public List A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d = false;
    public boolean A0e = false;
    public boolean A0f;
    public boolean A0g = false;
    public boolean A0h;
    public boolean A0i;

    public final C134605oq A03() {
        try {
            String str = this.A0M;
            if (str != null) {
                return C134605oq.valueOf(str);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final Integer A04() {
        try {
            String str = this.A0N;
            if (str != null) {
                if (str.equals("EMAIL")) {
                    return Constants.ZERO;
                }
                if (str.equals("PHONE_REG")) {
                    return Constants.ONE;
                }
                if (str.equals("MAIN_ACCOUNT")) {
                    return Constants.A0C;
                }
                if (str.equals("SIMPLE_SAC")) {
                    return Constants.A0N;
                }
                if (str.equals("ADD_PHONE")) {
                    return Constants.A0Y;
                }
                if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
                    return Constants.A0j;
                }
                throw new IllegalArgumentException(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("RegFlowExtras.EXTRA_KEY", this);
        return bundle;
    }

    public final List A05() {
        if (this.A0T == null) {
            this.A0T = new ArrayList();
        }
        return this.A0T;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr;
        ArrayList arrayList;
        int i2;
        String str;
        parcel.writeParcelable(this.A01, 0);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0P);
        parcel.writeLong(this.A00);
        parcel.writeByte(this.A0Y ? (byte) 1 : 0);
        parcel.writeByte(this.A0h ? (byte) 1 : 0);
        parcel.writeByte(this.A0V ? (byte) 1 : 0);
        parcel.writeByte(this.A0Z ? (byte) 1 : 0);
        parcel.writeByte(this.A0a ? (byte) 1 : 0);
        parcel.writeByte(this.A0U ? (byte) 1 : 0);
        parcel.writeByte(this.A0i ? (byte) 1 : 0);
        parcel.writeByte(this.A0b ? (byte) 1 : 0);
        parcel.writeByte(this.A0W ? (byte) 1 : 0);
        parcel.writeParcelable(this.A03, 0);
        parcel.writeStringList(this.A0S);
        List list = this.A0T;
        if (list != null) {
            strArr = new String[list.size()];
            for (int i3 = 0; i3 < this.A0T.size(); i3++) {
                C132395lE r5 = (C132395lE) this.A0T.get(i3);
                try {
                    StringWriter stringWriter = new StringWriter();
                    C13460iZ A052 = C12890hY.A00.A05(stringWriter);
                    A052.A0T();
                    String str2 = r5.A01;
                    if (str2 != null) {
                        A052.A0H("username", str2);
                    }
                    String str3 = r5.A00;
                    if (str3 != null) {
                        A052.A0H("prototype", str3);
                    }
                    A052.A0Q();
                    A052.close();
                    str = stringWriter.toString();
                } catch (IOException unused) {
                    str = null;
                }
                strArr[i3] = str;
            }
        } else {
            strArr = null;
        }
        parcel.writeStringArray(strArr);
        C134775p8 r0 = this.A02;
        if (r0 != null) {
            arrayList = new ArrayList();
            for (C134955pR r02 : r0.A00) {
                arrayList.add(r02.A00);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            i2 = arrayList.size();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = arrayList.get(i4);
            AnonymousClass0a4.A06(obj);
            parcel.writeList((List) obj);
        }
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A0X ? (byte) 1 : 0);
        parcel.writeByte(this.A0c ? (byte) 1 : 0);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A09);
        parcel.writeString(this.A04);
    }

    public static RegFlowExtras A00(RegFlowExtras regFlowExtras) {
        Parcel obtain = Parcel.obtain();
        regFlowExtras.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        RegFlowExtras regFlowExtras2 = (RegFlowExtras) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return regFlowExtras2;
    }

    public static void A01(RegFlowExtras regFlowExtras, C06590Pq r6, Context context, C15890nh r8, boolean z) {
        AnonymousClass0a4.A06(context);
        if (!TextUtils.isEmpty(regFlowExtras.A08)) {
            String str = regFlowExtras.A08;
            if (str == null) {
                str = "";
            }
            r8.A09(IgReactPurchaseExperienceBridgeModule.EMAIL, str);
        }
        String str2 = regFlowExtras.A0R;
        if (str2 == null) {
            str2 = "";
        }
        r8.A09("username", str2);
        String str3 = regFlowExtras.A0O;
        if (str3 == null) {
            str3 = "";
        }
        r8.A09("suggestedUsername", str3);
        AnonymousClass2VL r1 = new AnonymousClass2VL(r6);
        String str4 = regFlowExtras.A0J;
        if (str4 == null) {
            str4 = "";
        }
        r8.A09("enc_password", r1.encodePassword(str4));
        if (!TextUtils.isEmpty(regFlowExtras.A0K)) {
            String str5 = regFlowExtras.A0K;
            if (str5 == null) {
                str5 = "";
            }
            r8.A09("phone_number", str5);
        }
        String A002 = C05860Mt.A00(context);
        if (A002 == null) {
            A002 = "";
        }
        r8.A09("device_id", A002);
        String A052 = C05860Mt.A02.A05(context);
        if (A052 == null) {
            A052 = "";
        }
        r8.A09("guid", A052);
        String str6 = regFlowExtras.A0I;
        if (str6 == null) {
            str6 = "";
        }
        r8.A09("first_name", str6);
        String str7 = regFlowExtras.A0A;
        if (str7 == null) {
            str7 = "";
        }
        r8.A09("force_sign_up_code", str7);
        if (!TextUtils.isEmpty(regFlowExtras.A05)) {
            String str8 = regFlowExtras.A05;
            if (str8 == null) {
                str8 = "";
            }
            r8.A09("verification_code", str8);
        }
        if (regFlowExtras.A0h) {
            r8.A09("skip_email", "true");
        }
        if (regFlowExtras.A0V) {
            r8.A09("allow_contacts_sync", "true");
        }
        if (regFlowExtras.A0Z) {
            r8.A09("has_sms_consent", "true");
        }
        if (regFlowExtras.A0X) {
            r8.A09("force_create_account", "true");
        }
        if (regFlowExtras.A0c) {
            r8.A09("requested_username_change", "true");
        }
        if (regFlowExtras.A0a) {
            r8.A09("one_tap_opt_in", "true");
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0B)) {
            r8.A09("gdpr_s", regFlowExtras.A0B);
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0C)) {
            r8.A09("id_token", regFlowExtras.A0C);
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0P)) {
            r8.A09("tos_version", regFlowExtras.A0P);
        }
        C134775p8 r0 = regFlowExtras.A02;
        if (r0 != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList<List> arrayList = new ArrayList<>();
            for (C134955pR r02 : r0.A00) {
                arrayList.add(r02.A00);
            }
            for (List<Integer> it : arrayList) {
                for (Integer num : it) {
                    sb.append(num.toString());
                    sb.append(",");
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append("|");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            r8.A09("qs_stamp", sb.toString());
        }
        String str9 = regFlowExtras.A07;
        if (str9 != null) {
            r8.A09("sn_result", str9);
        }
        String str10 = regFlowExtras.A06;
        if (str10 != null) {
            r8.A09("sn_nonce", str10);
        }
        if (z) {
            r8.A0F("profile_pic");
        }
    }

    public final void A06(C134605oq r2) {
        this.A0M = r2.name();
    }

    public RegFlowExtras() {
    }

    public RegFlowExtras(Parcel parcel) {
        C132395lE r0;
        boolean z = false;
        ClassLoader classLoader = getClass().getClassLoader();
        this.A01 = (CountryCodeData) parcel.readParcelable(classLoader);
        this.A0L = parcel.readString();
        this.A0K = parcel.readString();
        this.A08 = parcel.readString();
        this.A0I = parcel.readString();
        this.A0R = parcel.readString();
        this.A0O = parcel.readString();
        this.A0J = parcel.readString();
        this.A05 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0C = parcel.readString();
        this.A0B = parcel.readString();
        this.A0P = parcel.readString();
        this.A00 = parcel.readLong();
        this.A0Y = parcel.readByte() != 0;
        this.A0h = parcel.readByte() != 0;
        this.A0V = parcel.readByte() != 0;
        this.A0Z = parcel.readByte() != 0;
        this.A0a = parcel.readByte() != 0;
        this.A0U = parcel.readByte() != 0;
        this.A0i = parcel.readByte() != 0;
        this.A0b = parcel.readByte() != 0;
        this.A0W = parcel.readByte() != 0;
        this.A03 = (UserBirthDate) parcel.readParcelable(classLoader);
        ArrayList arrayList = new ArrayList();
        this.A0S = arrayList;
        parcel.readStringList(arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>();
        parcel.readStringList(arrayList2);
        this.A0T = new ArrayList(arrayList2.size());
        for (String str : arrayList2) {
            List list = this.A0T;
            try {
                C13080hr A0A2 = C12890hY.A00.A0A(str);
                A0A2.A0p();
                r0 = C132405lF.parseFromJson(A0A2);
            } catch (IOException unused) {
                r0 = null;
            }
            list.add(r0);
        }
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            this.A02 = new C134775p8();
            for (int i = 0; i < readInt; i++) {
                ArrayList arrayList3 = new ArrayList();
                parcel.readList(arrayList3, classLoader);
                this.A02.A00.add(new C134955pR(arrayList3));
            }
        }
        this.A0M = parcel.readString();
        this.A0F = parcel.readString();
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A0X = parcel.readByte() != 0;
        this.A0c = parcel.readByte() != 0 ? true : z;
        this.A0Q = parcel.readString();
        this.A0G = parcel.readString();
        this.A0H = parcel.readString();
        this.A09 = parcel.readString();
        this.A04 = parcel.readString();
    }
}
