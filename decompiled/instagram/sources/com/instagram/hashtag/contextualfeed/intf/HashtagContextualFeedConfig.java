package com.instagram.hashtag.contextualfeed.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.model.hashtag.Hashtag;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass2US;

public class HashtagContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(52);
    public final EntityContextualFeedConfig A00;
    public final Hashtag A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
    }

    public HashtagContextualFeedConfig(AnonymousClass2US r2) {
        EntityContextualFeedConfig entityContextualFeedConfig = r2.A00;
        AnonymousClass11J.A00(entityContextualFeedConfig);
        this.A00 = entityContextualFeedConfig;
        Hashtag hashtag = r2.A01;
        AnonymousClass11J.A00(hashtag);
        this.A01 = hashtag;
        String str = r2.A02;
        AnonymousClass11J.A00(str);
        this.A02 = str;
    }

    public HashtagContextualFeedConfig(Parcel parcel) {
        this.A00 = (EntityContextualFeedConfig) parcel.readParcelable(EntityContextualFeedConfig.class.getClassLoader());
        this.A01 = (Hashtag) parcel.readParcelable(Hashtag.class.getClassLoader());
        this.A02 = parcel.readString();
    }
}
