package com.facebook.cameracore.mediapipeline.services.instruction.interfaces;

import android.os.Handler;
import android.os.Looper;
import p000X.AnonymousClass0ZA;
import p000X.C30534DeI;
import p000X.C30535DeJ;
import p000X.C30536DeK;
import p000X.C57212dm;
import p000X.C77543aB;

public class InstructionServiceListenerWrapper {
    public final C77543aB mListener;
    public final Handler mUIHandler = new Handler(Looper.getMainLooper());

    public void hideInstruction() {
        AnonymousClass0ZA.A0E(this.mUIHandler, new C30536DeK(this), -1020888852);
    }

    public void setVisibleAutomaticInstruction(int i) {
        AnonymousClass0ZA.A0E(this.mUIHandler, new C57212dm(this, i), -1946141543);
    }

    public void showInstructionForToken(String str) {
        AnonymousClass0ZA.A0E(this.mUIHandler, new C30534DeI(this, str), 538972451);
    }

    public void showInstructionWithCustomText(String str) {
        AnonymousClass0ZA.A0E(this.mUIHandler, new C30535DeJ(this, str), 1979820574);
    }

    public InstructionServiceListenerWrapper(C77543aB r3) {
        this.mListener = r3;
    }
}
