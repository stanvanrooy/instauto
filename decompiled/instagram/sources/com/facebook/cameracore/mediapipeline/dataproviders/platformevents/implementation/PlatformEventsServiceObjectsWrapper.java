package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import com.facebook.jni.HybridData;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass3CA;
import p000X.AnonymousClass3GK;

public class PlatformEventsServiceObjectsWrapper {
    public final AnonymousClass3GK mDelegate;
    public final HybridData mHybridData;
    public final AnonymousClass3CA mInput;
    public boolean mIsAlive;

    private native void enqueueEventNative(String str);

    private native HybridData initHybrid();

    public void start() {
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper;
        this.mIsAlive = true;
        AnonymousClass3CA r2 = this.mInput;
        if (r2 != null && (platformEventsServiceObjectsWrapper = r2.A00) != null && platformEventsServiceObjectsWrapper.mIsAlive) {
            while (!r2.A01.isEmpty()) {
                r2.A00.enqueueEvent((JSONObject) r2.A01.pop());
            }
        }
    }

    public void didReceiveEngineEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AnonymousClass3GK r3 = this.mDelegate;
            if (r3 != null) {
                try {
                    if (jSONObject.has("log")) {
                        jSONObject.getString("log");
                    }
                    if (jSONObject.has("requestUserName")) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("user_name", r3.A00.A06.AZn());
                            AnonymousClass3GK.A00(r3, jSONObject2);
                        } catch (JSONException e) {
                            AnonymousClass0QD.A01("PlatformEventsController::onReceiveRequestUserNameEvent", e.getMessage());
                        }
                    }
                } catch (JSONException e2) {
                    AnonymousClass0QD.A01("PlatformEventsController::didReceiveEngineEvent", e2.getMessage());
                }
            }
        } catch (JSONException e3) {
            throw new IllegalArgumentException(AnonymousClass000.A0E("Invalid json events from engine: ", e3.toString()));
        }
    }

    public PlatformEventsServiceObjectsWrapper(AnonymousClass3GK r2, AnonymousClass3CA r3) {
        this.mDelegate = r2;
        this.mInput = r3;
        if (r3 != null) {
            r3.A00 = this;
        }
        this.mHybridData = initHybrid();
    }

    public void enqueueEvent(JSONObject jSONObject) {
        enqueueEventNative(jSONObject.toString());
    }
}
