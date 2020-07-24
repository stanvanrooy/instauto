package com.instagram.feed.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass96O;

public class StoryUnlockableStickerAttribution implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(330);
    public String A00;
    public String A01;
    public List A02;

    public class StoryUnlockableSticker implements Parcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(331);
        public AnonymousClass96O A00;
        public ThumbnailImage A01;
        public String A02;
        public String A03;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            parcel.writeString(this.A02);
            parcel.writeParcelable(this.A01, i);
            parcel.writeSerializable(this.A00);
        }

        public StoryUnlockableSticker() {
        }

        public StoryUnlockableSticker(Parcel parcel) {
            String readString = parcel.readString();
            AnonymousClass0a4.A06(readString);
            this.A03 = readString;
            String readString2 = parcel.readString();
            AnonymousClass0a4.A06(readString2);
            this.A02 = readString2;
            Parcelable readParcelable = parcel.readParcelable(ThumbnailImage.class.getClassLoader());
            AnonymousClass0a4.A06(readParcelable);
            this.A01 = (ThumbnailImage) readParcelable;
            Serializable readSerializable = parcel.readSerializable();
            AnonymousClass0a4.A06(readSerializable);
            this.A00 = (AnonymousClass96O) readSerializable;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        List list = this.A02;
        parcel.writeParcelableArray((Parcelable[]) list.toArray(new StoryUnlockableSticker[list.size()]), i);
    }

    public StoryUnlockableStickerAttribution() {
    }

    public StoryUnlockableStickerAttribution(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass0a4.A06(readString);
        this.A01 = readString;
        String readString2 = parcel.readString();
        AnonymousClass0a4.A06(readString2);
        this.A00 = readString2;
        List asList = Arrays.asList((StoryUnlockableSticker[]) parcel.readParcelableArray(StoryUnlockableSticker.class.getClassLoader()));
        AnonymousClass0a4.A06(asList);
        this.A02 = asList;
    }
}
