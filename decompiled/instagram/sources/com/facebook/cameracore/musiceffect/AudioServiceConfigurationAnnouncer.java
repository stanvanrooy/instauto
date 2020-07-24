package com.facebook.cameracore.musiceffect;

import com.facebook.jni.HybridData;
import java.util.concurrent.atomic.AtomicBoolean;
import p000X.AnonymousClass0Y1;
import p000X.C30622DgI;
import p000X.C30623DgJ;
import p000X.C30624DgK;

public class AudioServiceConfigurationAnnouncer {
    public final AtomicBoolean mDestructed = new AtomicBoolean(false);
    public HybridData mHybridData = initHybrid();

    private native boolean announce(String str, String str2, String str3, String str4, long j, long j2, String str5);

    public static native HybridData initHybrid();

    public native float audioClipProgress();

    public native boolean pause();

    public native boolean resume();

    static {
        AnonymousClass0Y1.A08("musiceffect-native");
    }

    public boolean announce(C30623DgJ dgJ) {
        C30624DgK dgK = dgJ.A01;
        C30622DgI dgI = dgJ.A00;
        return announce((String) null, dgK.A00, (String) null, dgK.A01, dgI.A00, 0, dgI.A01);
    }
}
