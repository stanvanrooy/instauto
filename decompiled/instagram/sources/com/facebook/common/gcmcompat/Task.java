package com.facebook.common.gcmcompat;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p000X.AnonymousClass000;
import p000X.B5B;
import p000X.B66;

public abstract class Task implements Parcelable {
    public final String A00;
    public final String A01;
    public final int A02;
    public final Bundle A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public static void A00(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            if (obtain.dataSize() <= 10240) {
                obtain.recycle();
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj instanceof Bundle) {
                        A00((Bundle) obj);
                    } else if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                    }
                }
                return;
            }
            obtain.recycle();
            throw new IllegalArgumentException(AnonymousClass000.A0E("Extras exceeding maximum size(10240 bytes): ", Integer.toString(obtain.dataSize())));
        }
    }

    public void A02(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retry_policy", 0);
        bundle2.putInt("initial_backoff_seconds", 30);
        bundle2.putInt("maximum_backoff_seconds", 3600);
        bundle.putString(B5B.INTENT_PARAM_TAG, this.A01);
        bundle.putBoolean("update_current", this.A06);
        bundle.putBoolean("persisted", this.A04);
        bundle.putString("service", this.A00);
        bundle.putInt("requiredNetwork", this.A02);
        bundle.putBoolean("requiresCharging", this.A05);
        bundle.putBoolean("requiresIdle", false);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle(B5B.INTENT_PARAM_EXTRAS, this.A03);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeBundle(this.A03);
    }

    public static void A01(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (str.length() > 100) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    public Task(B66 b66) {
        this.A03 = b66.A01;
        this.A02 = b66.A00;
        this.A05 = b66.A05;
        this.A00 = b66.A02;
        this.A01 = b66.A03;
        this.A04 = b66.A04;
        this.A06 = b66.A06;
    }

    public Task(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        boolean z = false;
        this.A06 = parcel.readInt() == 1;
        this.A04 = parcel.readInt() == 1;
        this.A02 = parcel.readInt();
        this.A05 = parcel.readInt() == 1 ? true : z;
        this.A03 = parcel.readBundle(getClass().getClassLoader());
    }
}
