package com.facebook.cameracore.ardelivery.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.B0Y;
import p000X.C79533db;
import p000X.C79543dc;

public class ARRequestAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(5);
    public final long A00;
    public final long A01;
    public final C79533db A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final String A0A;

    public enum CompressionMethod {
        NONE,
        ZIP,
        TAR_BROTLI
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ARRequestAsset)) {
            return false;
        }
        ARRequestAsset aRRequestAsset = (ARRequestAsset) obj;
        if (this.A02.A06.equals(aRRequestAsset.A02.A06) && this.A05.equals(aRRequestAsset.A05) && this.A07.equals(aRRequestAsset.A07) && B0Y.A01(this.A0A, aRRequestAsset.A0A) && this.A09 == aRRequestAsset.A09 && B0Y.A01(this.A04, aRRequestAsset.A04) && this.A00 == aRRequestAsset.A00) {
            List list = this.A08;
            List list2 = aRRequestAsset.A08;
            if (list == null) {
                equals = false;
                if (list2 == null) {
                    equals = true;
                }
            } else {
                equals = list.equals(list2);
            }
            if (equals && B0Y.A01(this.A06, aRRequestAsset.A06)) {
                ImmutableList immutableList = this.A03;
                ImmutableList immutableList2 = aRRequestAsset.A03;
                if (immutableList == null) {
                    equals2 = false;
                    if (immutableList2 == null) {
                        equals2 = true;
                    }
                } else {
                    equals2 = immutableList.equals(immutableList2);
                }
                if (equals2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ARAssetType A00() {
        return this.A02.A01;
    }

    public final String A01() {
        return this.A02.A06;
    }

    public final int hashCode() {
        return this.A02.A06.hashCode();
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("id: ");
        sb.append(A01());
        sb.append(", name: ");
        C79533db r1 = this.A02;
        sb.append(r1.A08);
        sb.append(", instance id: ");
        sb.append(r1.A07);
        sb.append(", cache key: ");
        sb.append(r1.A05);
        sb.append(", asset type: ");
        sb.append(A00());
        sb.append(", sub asset type: ");
        switch (A00().ordinal()) {
            case 0:
                C79533db r3 = this.A02;
                boolean z = false;
                if (r3.A01 == ARAssetType.EFFECT) {
                    z = true;
                }
                C79543dc.A06(z, "Cannot get effect asset type from asset type other than effect");
                obj = r3.A03;
                break;
            case 1:
                obj = this.A02.A03();
                break;
            default:
                obj = null;
                break;
        }
        sb.append(obj);
        sb.append(", compression method: ");
        sb.append(this.A02.A02);
        sb.append(", uri: ");
        sb.append(this.A07);
        sb.append(", file size bytes: ");
        sb.append(this.A00);
        sb.append(", md5 hash: ");
        sb.append(this.A04);
        sb.append(", is logging disabled: ");
        sb.append(this.A09);
        if (A00() == ARAssetType.EFFECT) {
            sb.append(", model capability minVersion: ");
            sb.append(this.A08);
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A02.A04());
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0A);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeTypedList(this.A08);
        parcel.writeString(this.A06);
        parcel.writeTypedList(this.A03);
    }

    public ARRequestAsset(Parcel parcel) {
        ImmutableList A092;
        try {
            this.A02 = new C79533db(ByteBuffer.wrap(parcel.createByteArray()));
            this.A05 = parcel.readString();
            this.A07 = parcel.readString();
            this.A0A = parcel.readString();
            this.A09 = parcel.readByte() != 0;
            this.A04 = parcel.readString();
            this.A00 = parcel.readLong();
            this.A01 = parcel.readLong();
            this.A08 = parcel.createTypedArrayList(ARCapabilityMinVersionModeling.CREATOR);
            this.A06 = parcel.readString();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AREffectFileBundle.CREATOR);
            if (createTypedArrayList == null) {
                A092 = null;
            } else {
                A092 = ImmutableList.A09(createTypedArrayList);
            }
            this.A03 = A092;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ARRequestAsset(String str, String str2, String str3, String str4, String str5, ARAssetType aRAssetType, VersionedCapability versionedCapability, EffectAssetType effectAssetType, boolean z, String str6, long j, long j2, CompressionMethod compressionMethod, List list, int i, String str7, String str8, List list2) {
        ImmutableList A092;
        String str9 = str;
        CompressionMethod compressionMethod2 = compressionMethod;
        if (compressionMethod != null) {
            boolean z2 = z;
            String str10 = str3;
            String str11 = str2;
            ARAssetType aRAssetType2 = aRAssetType;
            VersionedCapability versionedCapability2 = versionedCapability;
            EffectAssetType effectAssetType2 = effectAssetType;
            this.A02 = new C79533db(str9, str11, str10, aRAssetType2, versionedCapability2, effectAssetType2, (String) null, compressionMethod2, i, str7, Boolean.valueOf(z2));
            this.A07 = str5;
            this.A05 = str4;
            this.A04 = str6;
            this.A09 = z2;
            this.A0A = str;
            this.A00 = j;
            this.A01 = j2;
            this.A08 = list;
            this.A06 = str8;
            if (list2 == null) {
                A092 = null;
            } else {
                A092 = ImmutableList.A09(list2);
            }
            this.A03 = A092;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass000.A0E("Compression method must not be null: id=", str));
    }
}
