package com.instagram.creation.capture.quickcapture.faceeffectui;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000X.AnonymousClass1Xv;
import p000X.AnonymousClass26P;
import p000X.AnonymousClass7K9;

public class FaceEffectLinearLayoutManager extends LinearLayoutManager {
    public float A00;
    public int A01 = 0;
    public AnonymousClass7K9 A02;
    public AnonymousClass26P A03;
    public final Context A04;

    public FaceEffectLinearLayoutManager(Context context) {
        super(0, false);
        this.A04 = context;
        this.A00 = 350.0f;
    }

    public final void A1Z(RecyclerView recyclerView, AnonymousClass1Xv r4, int i) {
        AnonymousClass26P r1 = new AnonymousClass26P(this, this.A04);
        this.A03 = r1;
        r1.A00 = i;
        A0t(r1);
    }

    public final int A0P() {
        return this.A01;
    }

    public final int A0Q() {
        return this.A01;
    }
}
