package com.facebook.rsys.call.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.video.gen.VideoStream;
import java.util.ArrayList;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24854Auv;

public class ParticipantMediaState {
    public static AnonymousClass921 CONVERTER = new C24854Auv();
    public final int audioStreamState;
    public final ArrayList audioStreams;
    public final VideoStream videoStream;
    public final int videoStreamState;

    public static native ParticipantMediaState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof ParticipantMediaState)) {
            return false;
        }
        ParticipantMediaState participantMediaState = (ParticipantMediaState) obj;
        if (this.videoStreamState != participantMediaState.videoStreamState) {
            return false;
        }
        VideoStream videoStream2 = this.videoStream;
        if (((videoStream2 != null || participantMediaState.videoStream != null) && (videoStream2 == null || !videoStream2.equals(participantMediaState.videoStream))) || this.audioStreamState != participantMediaState.audioStreamState || !this.audioStreams.equals(participantMediaState.audioStreams)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int i = (527 + this.videoStreamState) * 31;
        VideoStream videoStream2 = this.videoStream;
        if (videoStream2 == null) {
            hashCode = 0;
        } else {
            hashCode = videoStream2.hashCode();
        }
        return ((((i + hashCode) * 31) + this.audioStreamState) * 31) + this.audioStreams.hashCode();
    }

    public String toString() {
        return "ParticipantMediaState{videoStreamState=" + this.videoStreamState + "," + "videoStream=" + this.videoStream + "," + "audioStreamState=" + this.audioStreamState + "," + "audioStreams=" + this.audioStreams + "}";
    }

    public ParticipantMediaState(int i, VideoStream videoStream2, int i2, ArrayList arrayList) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(arrayList);
        this.videoStreamState = i;
        this.videoStream = videoStream2;
        this.audioStreamState = i2;
        this.audioStreams = arrayList;
    }
}
