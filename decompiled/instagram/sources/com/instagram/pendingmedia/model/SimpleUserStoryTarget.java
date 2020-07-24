package com.instagram.pendingmedia.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.Objects;
import p000X.AnonymousClass000;

public class SimpleUserStoryTarget implements UserStoryTarget {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(77);
    public String A00;

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A00});
    }

    public final String AZE() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.A00, ((SimpleUserStoryTarget) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r6.equals("FACEBOOK_DATING") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r6.equals("CLOSE_FRIENDS") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r6.equals("FACEBOOK") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r6.equals("ALL") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r6.equals("ARCHIVE") == false) goto L_0x000b;
     */
    public static SimpleUserStoryTarget A00(String str) {
        char c;
        UserStoryTarget userStoryTarget;
        switch (str.hashCode()) {
            case -30118750:
                c = 1;
                break;
            case 64897:
                c = 0;
                break;
            case 1279756998:
                c = 3;
                break;
            case 1702038030:
                c = 2;
                break;
            case 2036774020:
                c = 4;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            userStoryTarget = UserStoryTarget.A00;
        } else if (c == 1) {
            userStoryTarget = UserStoryTarget.A01;
        } else if (c == 2) {
            userStoryTarget = UserStoryTarget.A02;
        } else if (c == 3) {
            userStoryTarget = UserStoryTarget.A03;
        } else if (c == 4) {
            userStoryTarget = UserStoryTarget.A04;
        } else {
            throw new IllegalStateException(AnonymousClass000.A0E("Cannot identify an existing instance of SimpleUserStoryTarget for type ", str));
        }
        return (SimpleUserStoryTarget) userStoryTarget;
    }

    public SimpleUserStoryTarget() {
    }

    public SimpleUserStoryTarget(String str) {
        this.A00 = str;
    }
}
