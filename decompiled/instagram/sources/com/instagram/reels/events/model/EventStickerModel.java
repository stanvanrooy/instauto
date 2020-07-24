package com.instagram.reels.events.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;
import java.util.Objects;
import p000X.C123005Pd;
import p000X.C13300iJ;
import p000X.C169837Nv;

public class EventStickerModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(450);
    public int A00;
    public long A01;
    public long A02 = 0;
    public C123005Pd A03 = C123005Pd.INVITED;
    public C13300iJ A04;
    public String A05;
    public String A06;
    public List A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventStickerModel eventStickerModel = (EventStickerModel) obj;
            if (!(this.A02 == eventStickerModel.A02 && this.A01 == eventStickerModel.A01 && this.A00 == eventStickerModel.A00 && this.A06.equals(eventStickerModel.A06) && Objects.equals(this.A05, eventStickerModel.A05) && Objects.equals(this.A04, eventStickerModel.A04) && this.A03 == eventStickerModel.A03 && this.A07 == eventStickerModel.A07)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A06, Long.valueOf(this.A02), this.A05, this.A04, Long.valueOf(this.A01), Integer.valueOf(this.A00), this.A03, this.A07});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A03);
    }

    public EventStickerModel() {
    }

    public EventStickerModel(C169837Nv r3) {
        this.A06 = r3.A02;
        this.A02 = r3.A00;
        this.A05 = r3.A01;
    }

    public EventStickerModel(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A02 = parcel.readLong();
        this.A05 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A03 = (C123005Pd) parcel.readValue(C123005Pd.class.getClassLoader());
    }
}
