package com.facebook.rti.mqtt.protocol.messages;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass0W3;

public class GqlsTopicExtraInfo implements TopicExtraInfo {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0W3();
    public final Boolean A00;
    public final String A01;
    public final Map A02;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r5.A01) == false) goto L_0x001e;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GqlsTopicExtraInfo gqlsTopicExtraInfo = (GqlsTopicExtraInfo) obj;
            String str = this.A01;
            if (str == null) {
                if (gqlsTopicExtraInfo.A01 != null) {
                    return false;
                }
            }
            Map map = this.A02;
            if (map != null) {
                if (!map.equals(gqlsTopicExtraInfo.A02)) {
                    return false;
                }
            } else if (gqlsTopicExtraInfo.A02 != null) {
                return false;
            }
            Boolean bool = this.A00;
            if (bool != null) {
                return bool.equals(gqlsTopicExtraInfo.A00);
            }
            return gqlsTopicExtraInfo.A00 == null;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.A01;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map map = this.A02;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Boolean bool = this.A00;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return "GqlsTopicExtraInfo{DESCRIPTION='GraphQL Subscription Infomation', subscription='" + this.A01 + '\'' + ", queryParams=" + this.A02 + ", forceLogEnabled=" + this.A00 + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeMap(this.A02);
        parcel.writeValue(this.A00);
    }

    public GqlsTopicExtraInfo(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readHashMap(HashMap.class.getClassLoader());
        this.A00 = (Boolean) parcel.readValue((ClassLoader) null);
    }
}
