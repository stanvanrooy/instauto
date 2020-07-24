package com.facebook.cameracore.ardelivery.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass3SC;
import p000X.C79543dc;

public class AREffectFileBundle implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(36);
    public final String cacheKey;
    public final ARRequestAsset.CompressionMethod compressionMethod;
    public final List fileNames;

    /* renamed from: id */
    public final String f161id;
    public final boolean isLoggingDisabled;
    public final String uri;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AREffectFileBundle)) {
            return false;
        }
        AREffectFileBundle aREffectFileBundle = (AREffectFileBundle) obj;
        return this.f161id.equals(aREffectFileBundle.f161id) && this.cacheKey.equals(aREffectFileBundle.cacheKey) && this.fileNames.equals(aREffectFileBundle.fileNames) && this.uri.equals(aREffectFileBundle.uri) && this.compressionMethod == aREffectFileBundle.compressionMethod && this.isLoggingDisabled == aREffectFileBundle.isLoggingDisabled;
    }

    public AnonymousClass3SC getFileNames() {
        return new AnonymousClass3SC(this.fileNames);
    }

    public String[] getFileNamesForNative() {
        return (String[]) this.fileNames.toArray(new String[0]);
    }

    public int hashCode() {
        return (this.f161id.hashCode() * this.cacheKey.hashCode() * this.fileNames.hashCode() * this.uri.hashCode() * this.compressionMethod.hashCode()) + (this.isLoggingDisabled ? 1 : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161id);
        parcel.writeString(this.cacheKey);
        parcel.writeStringList(this.fileNames);
        parcel.writeString(this.uri);
        parcel.writeSerializable(this.compressionMethod);
        parcel.writeByte(this.isLoggingDisabled ? (byte) 1 : 0);
    }

    public String getCacheKey() {
        return this.cacheKey;
    }

    public ARRequestAsset.CompressionMethod getCompressionMethod() {
        return this.compressionMethod;
    }

    public String getId() {
        return this.f161id;
    }

    public String getUri() {
        return this.uri;
    }

    public boolean isLoggingDisabled() {
        return this.isLoggingDisabled;
    }

    public AREffectFileBundle(Parcel parcel) {
        this.f161id = parcel.readString();
        this.cacheKey = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.fileNames = arrayList;
        parcel.readStringList(arrayList);
        this.uri = parcel.readString();
        this.compressionMethod = (ARRequestAsset.CompressionMethod) parcel.readSerializable();
        this.isLoggingDisabled = parcel.readByte() != 0;
    }

    public AREffectFileBundle(String str, String str2, List list, String str3, ARRequestAsset.CompressionMethod compressionMethod2, boolean z) {
        C79543dc.A02(str, "bundle ID cannot be null");
        this.f161id = str;
        C79543dc.A02(str2, "bundle cache key cannot be null");
        this.cacheKey = str2;
        this.fileNames = list;
        this.uri = str3;
        this.compressionMethod = compressionMethod2;
        this.isLoggingDisabled = z;
    }
}
