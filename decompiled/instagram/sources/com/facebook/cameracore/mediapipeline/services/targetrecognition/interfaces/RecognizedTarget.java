package com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces;

public class RecognizedTarget {
    public final String effectID;
    public final String name;
    public final String targetURL;

    public RecognizedTarget(String str, String str2, String str3) {
        this.name = str;
        this.targetURL = str2;
        this.effectID = str3;
    }
}
