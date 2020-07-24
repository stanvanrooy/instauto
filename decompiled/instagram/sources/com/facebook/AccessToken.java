package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import p000X.Constants;
import p000X.C12840hT;
import p000X.C42241s0;

public final class AccessToken implements Parcelable {
    public static final Integer A08 = Constants.ONE;
    public static final Date A09;
    public static final Date A0A = new Date();
    public static final Date A0B;
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(2);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Date A04;
    public final Date A05;
    public final Set A06;
    public final Set A07;

    public static Date A00(Bundle bundle, Date date) {
        long parseLong;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get("expires_in");
        if (obj instanceof Long) {
            parseLong = ((Long) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (parseLong * 1000));
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r1 = r3.A01;
     */
    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        return this.A04.equals(accessToken.A04) && this.A07.equals(accessToken.A07) && this.A06.equals(accessToken.A06) && this.A02.equals(accessToken.A02) && this.A00 == accessToken.A00 && this.A05.equals(accessToken.A05) && (str != null ? str.equals(accessToken.A01) : accessToken.A01 == null) && this.A03.equals(accessToken.A03);
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        A0B = date;
        A09 = date;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.A00;
        int hashCode2 = (((((((((((527 + this.A04.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A02.hashCode()) * 31) + C42241s0.A01(num).hashCode() + num.intValue()) * 31) + this.A05.hashCode()) * 31;
        String str = this.A01;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("{AccessToken");
        sb.append(" token:");
        if (this.A02 == null) {
            str = "null";
        } else {
            str = "ACCESS_TOKEN_REMOVED";
        }
        sb.append(str);
        sb.append(" permissions:");
        Set set = this.A07;
        if (set == null) {
            str2 = "null";
        } else {
            sb.append("[");
            sb.append(TextUtils.join(", ", set));
            str2 = "]";
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A04.getTime());
        parcel.writeStringList(new ArrayList(this.A07));
        parcel.writeStringList(new ArrayList(this.A06));
        parcel.writeString(this.A02);
        parcel.writeString(C42241s0.A01(this.A00));
        parcel.writeLong(this.A05.getTime());
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public AccessToken(Parcel parcel) {
        this.A04 = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.A07 = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.A06 = Collections.unmodifiableSet(new HashSet(arrayList));
        this.A02 = parcel.readString();
        this.A00 = C42241s0.A00(parcel.readString());
        this.A05 = new Date(parcel.readLong());
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public AccessToken(String str, String str2) {
        this(str, C12840hT.A02, str2, (Collection) null, (Collection) null, Constants.A0u, (Date) null, (Date) null);
    }

    public AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Integer num, Date date, Date date2) {
        HashSet hashSet;
        HashSet hashSet2;
        this.A04 = date == null ? A09 : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        this.A07 = Collections.unmodifiableSet(hashSet);
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        this.A06 = Collections.unmodifiableSet(hashSet2);
        this.A02 = str;
        this.A00 = num == null ? A08 : num;
        this.A05 = date2 == null ? A0A : date2;
        this.A01 = str2;
        this.A03 = str3;
    }
}
