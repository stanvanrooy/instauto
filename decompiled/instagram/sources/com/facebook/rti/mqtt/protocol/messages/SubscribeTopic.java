package com.facebook.rti.mqtt.protocol.messages;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p000X.AnonymousClass0WI;
import p000X.C07390Sx;
import p000X.C07410Sz;

public class SubscribeTopic implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0WI();
    public final int A00;
    public final String A01;
    public volatile TopicExtraInfo A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SubscribeTopic subscribeTopic = (SubscribeTopic) obj;
            if (!C07390Sx.A00(this.A01, subscribeTopic.A01) || this.A00 != subscribeTopic.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00)});
    }

    public final String toString() {
        return String.format("{ name='%s', qos='%s', extra='%s' }", new Object[]{this.A01, Integer.valueOf(this.A00), this.A02});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public SubscribeTopic(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A02 = (TopicExtraInfo) parcel.readParcelable(TopicExtraInfo.class.getClassLoader());
    }

    public SubscribeTopic(String str, int i) {
        C07410Sz.A00(str);
        this.A01 = str;
        Integer valueOf = Integer.valueOf(i);
        C07410Sz.A00(valueOf);
        this.A00 = valueOf.intValue();
    }
}
