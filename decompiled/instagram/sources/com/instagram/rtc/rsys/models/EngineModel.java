package com.instagram.rtc.rsys.models;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24847Aug;

public class EngineModel {
    public static AnonymousClass921 CONVERTER = new C24847Aug();
    public final CallEndedModel callEndedModel;
    public final IgCallModel callModel;
    public final int state;

    public static native EngineModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof EngineModel)) {
            return false;
        }
        EngineModel engineModel = (EngineModel) obj;
        if (this.state != engineModel.state) {
            return false;
        }
        IgCallModel igCallModel = this.callModel;
        if ((igCallModel != null || engineModel.callModel != null) && (igCallModel == null || !igCallModel.equals(engineModel.callModel))) {
            return false;
        }
        CallEndedModel callEndedModel2 = this.callEndedModel;
        if ((callEndedModel2 != null || engineModel.callEndedModel != null) && (callEndedModel2 == null || !callEndedModel2.equals(engineModel.callEndedModel))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int i = (527 + this.state) * 31;
        IgCallModel igCallModel = this.callModel;
        int i2 = 0;
        if (igCallModel == null) {
            hashCode = 0;
        } else {
            hashCode = igCallModel.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        CallEndedModel callEndedModel2 = this.callEndedModel;
        if (callEndedModel2 != null) {
            i2 = callEndedModel2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "EngineModel{state=" + this.state + "," + "callModel=" + this.callModel + "," + "callEndedModel=" + this.callEndedModel + "}";
    }

    public EngineModel(int i, IgCallModel igCallModel, CallEndedModel callEndedModel2) {
        AnonymousClass920.A00(Integer.valueOf(i));
        this.state = i;
        this.callModel = igCallModel;
        this.callEndedModel = callEndedModel2;
    }
}
