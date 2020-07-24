package com.instagram.rtc.rsys.models;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import java.util.ArrayList;
import java.util.Map;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24846Auf;

public class IgCallModel {
    public static AnonymousClass921 CONVERTER = new C24846Auf();
    public final int inCallState;
    public final String instagramVideoCallId;
    public final boolean inviteRequestedVideo;
    public final String localCallId;
    public final MediaSyncState mediaSyncState;
    public final ArrayList participants;
    public final RingNotification ringNotification;
    public final ParticipantModel selfParticipant;
    public final String serverInfoData;
    public final Map userCapabilities;
    public final int userType;

    public static native IgCallModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof IgCallModel)) {
            return false;
        }
        IgCallModel igCallModel = (IgCallModel) obj;
        if (this.userType != igCallModel.userType || this.inCallState != igCallModel.inCallState || !this.localCallId.equals(igCallModel.localCallId)) {
            return false;
        }
        String str = this.instagramVideoCallId;
        if ((str != null || igCallModel.instagramVideoCallId != null) && (str == null || !str.equals(igCallModel.instagramVideoCallId))) {
            return false;
        }
        String str2 = this.serverInfoData;
        if (((str2 != null || igCallModel.serverInfoData != null) && (str2 == null || !str2.equals(igCallModel.serverInfoData))) || !this.selfParticipant.equals(igCallModel.selfParticipant) || !this.participants.equals(igCallModel.participants) || !this.userCapabilities.equals(igCallModel.userCapabilities)) {
            return false;
        }
        MediaSyncState mediaSyncState2 = this.mediaSyncState;
        if (((mediaSyncState2 != null || igCallModel.mediaSyncState != null) && (mediaSyncState2 == null || !mediaSyncState2.equals(igCallModel.mediaSyncState))) || this.inviteRequestedVideo != igCallModel.inviteRequestedVideo) {
            return false;
        }
        RingNotification ringNotification2 = this.ringNotification;
        if ((ringNotification2 != null || igCallModel.ringNotification != null) && (ringNotification2 == null || !ringNotification2.equals(igCallModel.ringNotification))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((((527 + this.userType) * 31) + this.inCallState) * 31) + this.localCallId.hashCode()) * 31;
        String str = this.instagramVideoCallId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str2 = this.serverInfoData;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode5 = (((((((i2 + hashCode2) * 31) + this.selfParticipant.hashCode()) * 31) + this.participants.hashCode()) * 31) + this.userCapabilities.hashCode()) * 31;
        MediaSyncState mediaSyncState2 = this.mediaSyncState;
        if (mediaSyncState2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mediaSyncState2.hashCode();
        }
        int i3 = (((hashCode5 + hashCode3) * 31) + (this.inviteRequestedVideo ? 1 : 0)) * 31;
        RingNotification ringNotification2 = this.ringNotification;
        if (ringNotification2 != null) {
            i = ringNotification2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "IgCallModel{userType=" + this.userType + "," + "inCallState=" + this.inCallState + "," + "localCallId=" + this.localCallId + "," + "instagramVideoCallId=" + this.instagramVideoCallId + "," + "serverInfoData=" + this.serverInfoData + "," + "selfParticipant=" + this.selfParticipant + "," + "participants=" + this.participants + "," + "userCapabilities=" + this.userCapabilities + "," + "mediaSyncState=" + this.mediaSyncState + "," + "inviteRequestedVideo=" + this.inviteRequestedVideo + "," + "ringNotification=" + this.ringNotification + "}";
    }

    public IgCallModel(int i, int i2, String str, String str2, String str3, ParticipantModel participantModel, ArrayList arrayList, Map map, MediaSyncState mediaSyncState2, boolean z, RingNotification ringNotification2) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(participantModel);
        AnonymousClass920.A00(arrayList);
        AnonymousClass920.A00(map);
        AnonymousClass920.A00(Boolean.valueOf(z));
        this.userType = i;
        this.inCallState = i2;
        this.localCallId = str;
        this.instagramVideoCallId = str2;
        this.serverInfoData = str3;
        this.selfParticipant = participantModel;
        this.participants = arrayList;
        this.userCapabilities = map;
        this.mediaSyncState = mediaSyncState2;
        this.inviteRequestedVideo = z;
        this.ringNotification = ringNotification2;
    }
}
