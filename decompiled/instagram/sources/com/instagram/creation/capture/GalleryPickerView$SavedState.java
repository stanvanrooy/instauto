package com.instagram.creation.capture;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.HashMap;
import java.util.Map;

public class GalleryPickerView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(295);
    public int A00;
    public String A01;
    public String A02;
    public Map A03 = new HashMap();
    public boolean A04;
    public boolean A05;
    public float[] A06 = new float[9];
    public String[] A07;

    public final String toString() {
        return "GalleryPickerView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " folderId=" + this.A00 + " folderName=" + this.A01 + " mediumId=" + this.A02 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeFloatArray(this.A06);
        parcel.writeStringArray(this.A07);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A03.size());
        for (Map.Entry entry : this.A03.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }

    public GalleryPickerView$SavedState(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        boolean z = true;
        this.A04 = parcel.readInt() == 1;
        parcel.readFloatArray(this.A06);
        this.A07 = parcel.createStringArray();
        this.A05 = parcel.readInt() != 1 ? false : z;
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.A03.put(parcel.readString(), (GalleryPreviewInfo) parcel.readParcelable(GalleryPreviewInfo.class.getClassLoader()));
        }
    }

    public GalleryPickerView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
