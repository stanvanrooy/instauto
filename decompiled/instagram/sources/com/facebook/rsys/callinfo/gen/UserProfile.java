package com.facebook.rsys.callinfo.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24853Auu;

public class UserProfile {
    public static AnonymousClass921 CONVERTER = new C24853Auu();
    public final int blockedByViewerStatus;
    public final int contactTypeExact;
    public final String firstName;
    public final boolean isGuest;
    public final String name;
    public final String profilePictureUrl;
    public final long profilePictureUrlExpirationTimestampMs;
    public final String profilePictureUrlFallback;
    public final String secondaryName;
    public final String thirdPartyId;
    public final String userId;
    public final int userProfileState;

    public static native UserProfile createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) obj;
        if (this.userProfileState != userProfile.userProfileState || !this.userId.equals(userProfile.userId)) {
            return false;
        }
        String str = this.thirdPartyId;
        if ((str != null || userProfile.thirdPartyId != null) && (str == null || !str.equals(userProfile.thirdPartyId))) {
            return false;
        }
        String str2 = this.firstName;
        if ((str2 != null || userProfile.firstName != null) && (str2 == null || !str2.equals(userProfile.firstName))) {
            return false;
        }
        String str3 = this.name;
        if ((str3 != null || userProfile.name != null) && (str3 == null || !str3.equals(userProfile.name))) {
            return false;
        }
        String str4 = this.profilePictureUrl;
        if ((str4 != null || userProfile.profilePictureUrl != null) && (str4 == null || !str4.equals(userProfile.profilePictureUrl))) {
            return false;
        }
        String str5 = this.profilePictureUrlFallback;
        if (((str5 != null || userProfile.profilePictureUrlFallback != null) && (str5 == null || !str5.equals(userProfile.profilePictureUrlFallback))) || this.profilePictureUrlExpirationTimestampMs != userProfile.profilePictureUrlExpirationTimestampMs || this.isGuest != userProfile.isGuest || this.blockedByViewerStatus != userProfile.blockedByViewerStatus || this.contactTypeExact != userProfile.contactTypeExact) {
            return false;
        }
        String str6 = this.secondaryName;
        if ((str6 != null || userProfile.secondaryName != null) && (str6 == null || !str6.equals(userProfile.secondaryName))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((527 + this.userProfileState) * 31) + this.userId.hashCode()) * 31;
        String str = this.thirdPartyId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str2 = this.firstName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.name;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.profilePictureUrl;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.profilePictureUrlFallback;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        long j = this.profilePictureUrlExpirationTimestampMs;
        int i6 = (((((((((i5 + hashCode5) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.isGuest ? 1 : 0)) * 31) + this.blockedByViewerStatus) * 31) + this.contactTypeExact) * 31;
        String str6 = this.secondaryName;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        return "UserProfile{userProfileState=" + this.userProfileState + "," + "userId=" + this.userId + "," + "thirdPartyId=" + this.thirdPartyId + "," + "firstName=" + this.firstName + "," + "name=" + this.name + "," + "profilePictureUrl=" + this.profilePictureUrl + "," + "profilePictureUrlFallback=" + this.profilePictureUrlFallback + "," + "profilePictureUrlExpirationTimestampMs=" + this.profilePictureUrlExpirationTimestampMs + "," + "isGuest=" + this.isGuest + "," + "blockedByViewerStatus=" + this.blockedByViewerStatus + "," + "contactTypeExact=" + this.contactTypeExact + "," + "secondaryName=" + this.secondaryName + "}";
    }

    public UserProfile(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, int i2, int i3, String str7) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Long.valueOf(j));
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(Integer.valueOf(i3));
        this.userProfileState = i;
        this.userId = str;
        this.thirdPartyId = str2;
        this.firstName = str3;
        this.name = str4;
        this.profilePictureUrl = str5;
        this.profilePictureUrlFallback = str6;
        this.profilePictureUrlExpirationTimestampMs = j;
        this.isGuest = z;
        this.blockedByViewerStatus = i2;
        this.contactTypeExact = i3;
        this.secondaryName = str7;
    }
}
