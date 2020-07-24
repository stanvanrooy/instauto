package com.facebook.rsys.call.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callinfo.gen.CallInfo;
import java.util.ArrayList;
import java.util.Map;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24852Auq;

public class CallModel {
    public static AnonymousClass921 CONVERTER = new C24852Auq();
    public final boolean acceptRemoteVideoEnabled;
    public final boolean addParticipantsEnabled;
    public final long callAnsweredTimestampMs;
    public final long callConnectedTimestampMs;
    public final CallContext callContext;
    public final long callCreatedTimestampMs;
    public final long callEndedTimestampMs;
    public final CallInfo callInfo;
    public final int callStartedWithCamera;
    public final int inCallState;
    public final ArrayList initialDataMessages;
    public final boolean inviteRequestedVideo;
    public final long joinableCompleteTimestampMs;
    public final int joinableState;
    public final int joinableStateDesired;
    public final boolean maxParticipantsReached;
    public final ArrayList notifications;
    public final ArrayList remoteParticipants;
    public final CallParticipant selfParticipant;
    public final String sharedCallId;
    public final Map userCapabilities;

    public static native CallModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallModel)) {
            return false;
        }
        CallModel callModel = (CallModel) obj;
        if (this.inCallState != callModel.inCallState || this.callCreatedTimestampMs != callModel.callCreatedTimestampMs || this.joinableCompleteTimestampMs != callModel.joinableCompleteTimestampMs || this.callAnsweredTimestampMs != callModel.callAnsweredTimestampMs || this.callConnectedTimestampMs != callModel.callConnectedTimestampMs || this.callEndedTimestampMs != callModel.callEndedTimestampMs || this.inviteRequestedVideo != callModel.inviteRequestedVideo || this.acceptRemoteVideoEnabled != callModel.acceptRemoteVideoEnabled || this.callStartedWithCamera != callModel.callStartedWithCamera || !this.selfParticipant.equals(callModel.selfParticipant) || !this.remoteParticipants.equals(callModel.remoteParticipants) || !this.callContext.equals(callModel.callContext) || !this.callInfo.equals(callModel.callInfo) || this.joinableState != callModel.joinableState || this.joinableStateDesired != callModel.joinableStateDesired || this.maxParticipantsReached != callModel.maxParticipantsReached || this.addParticipantsEnabled != callModel.addParticipantsEnabled) {
            return false;
        }
        String str = this.sharedCallId;
        if (((str != null || callModel.sharedCallId != null) && (str == null || !str.equals(callModel.sharedCallId))) || !this.notifications.equals(callModel.notifications)) {
            return false;
        }
        Map map = this.userCapabilities;
        if ((map != null || callModel.userCapabilities != null) && (map == null || !map.equals(callModel.userCapabilities))) {
            return false;
        }
        ArrayList arrayList = this.initialDataMessages;
        if ((arrayList != null || callModel.initialDataMessages != null) && (arrayList == null || !arrayList.equals(callModel.initialDataMessages))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.callCreatedTimestampMs;
        long j2 = this.joinableCompleteTimestampMs;
        long j3 = this.callAnsweredTimestampMs;
        long j4 = this.callConnectedTimestampMs;
        long j5 = this.callEndedTimestampMs;
        int hashCode3 = (((((((((((((((((((((((((((((((((527 + this.inCallState) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.inviteRequestedVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + this.callStartedWithCamera) * 31) + this.selfParticipant.hashCode()) * 31) + this.remoteParticipants.hashCode()) * 31) + this.callContext.hashCode()) * 31) + this.callInfo.hashCode()) * 31) + this.joinableState) * 31) + this.joinableStateDesired) * 31) + (this.maxParticipantsReached ? 1 : 0)) * 31) + (this.addParticipantsEnabled ? 1 : 0)) * 31;
        String str = this.sharedCallId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode3 + hashCode) * 31) + this.notifications.hashCode()) * 31;
        Map map = this.userCapabilities;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i2 = (hashCode4 + hashCode2) * 31;
        ArrayList arrayList = this.initialDataMessages;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "CallModel{inCallState=" + this.inCallState + "," + "callCreatedTimestampMs=" + this.callCreatedTimestampMs + "," + "joinableCompleteTimestampMs=" + this.joinableCompleteTimestampMs + "," + "callAnsweredTimestampMs=" + this.callAnsweredTimestampMs + "," + "callConnectedTimestampMs=" + this.callConnectedTimestampMs + "," + "callEndedTimestampMs=" + this.callEndedTimestampMs + "," + "inviteRequestedVideo=" + this.inviteRequestedVideo + "," + "acceptRemoteVideoEnabled=" + this.acceptRemoteVideoEnabled + "," + "callStartedWithCamera=" + this.callStartedWithCamera + "," + "selfParticipant=" + this.selfParticipant + "," + "remoteParticipants=" + this.remoteParticipants + "," + "callContext=" + this.callContext + "," + "callInfo=" + this.callInfo + "," + "joinableState=" + this.joinableState + "," + "joinableStateDesired=" + this.joinableStateDesired + "," + "maxParticipantsReached=" + this.maxParticipantsReached + "," + "addParticipantsEnabled=" + this.addParticipantsEnabled + "," + "sharedCallId=" + this.sharedCallId + "," + "notifications=" + this.notifications + "," + "userCapabilities=" + this.userCapabilities + "," + "initialDataMessages=" + this.initialDataMessages + "}";
    }

    public CallModel(int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, int i2, CallParticipant callParticipant, ArrayList arrayList, CallContext callContext2, CallInfo callInfo2, int i3, int i4, boolean z3, boolean z4, String str, ArrayList arrayList2, Map map, ArrayList arrayList3) {
        int i5 = i;
        AnonymousClass920.A00(Integer.valueOf(i5));
        long j6 = j;
        AnonymousClass920.A00(Long.valueOf(j6));
        long j7 = j2;
        AnonymousClass920.A00(Long.valueOf(j7));
        long j8 = j3;
        AnonymousClass920.A00(Long.valueOf(j8));
        long j9 = j4;
        AnonymousClass920.A00(Long.valueOf(j9));
        long j10 = j5;
        AnonymousClass920.A00(Long.valueOf(j10));
        boolean z5 = z;
        AnonymousClass920.A00(Boolean.valueOf(z5));
        boolean z6 = z2;
        AnonymousClass920.A00(Boolean.valueOf(z6));
        int i6 = i2;
        AnonymousClass920.A00(Integer.valueOf(i6));
        CallParticipant callParticipant2 = callParticipant;
        AnonymousClass920.A00(callParticipant2);
        ArrayList arrayList4 = arrayList;
        AnonymousClass920.A00(arrayList4);
        CallContext callContext3 = callContext2;
        AnonymousClass920.A00(callContext3);
        CallInfo callInfo3 = callInfo2;
        AnonymousClass920.A00(callInfo3);
        int i7 = i3;
        AnonymousClass920.A00(Integer.valueOf(i7));
        int i8 = i4;
        AnonymousClass920.A00(Integer.valueOf(i8));
        boolean z7 = z3;
        AnonymousClass920.A00(Boolean.valueOf(z7));
        boolean z8 = z4;
        AnonymousClass920.A00(Boolean.valueOf(z8));
        ArrayList arrayList5 = arrayList2;
        AnonymousClass920.A00(arrayList5);
        this.inCallState = i5;
        this.callCreatedTimestampMs = j6;
        this.joinableCompleteTimestampMs = j7;
        this.callAnsweredTimestampMs = j8;
        this.callConnectedTimestampMs = j9;
        this.callEndedTimestampMs = j10;
        this.inviteRequestedVideo = z5;
        this.acceptRemoteVideoEnabled = z6;
        this.callStartedWithCamera = i6;
        this.selfParticipant = callParticipant2;
        this.remoteParticipants = arrayList4;
        this.callContext = callContext3;
        this.callInfo = callInfo3;
        this.joinableState = i7;
        this.joinableStateDesired = i8;
        this.maxParticipantsReached = z7;
        this.addParticipantsEnabled = z8;
        this.sharedCallId = str;
        this.notifications = arrayList5;
        this.userCapabilities = map;
        this.initialDataMessages = arrayList3;
    }
}
