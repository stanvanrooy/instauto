package com.facebook.grimsey;

import android.text.TextUtils;
import com.facebook.systrace.Systrace;
import p000X.AnonymousClass070;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Yw;
import p000X.BG1;
import p000X.C08800Yq;

public class GrimseyFBsystraceListener implements AnonymousClass0Yw {
    public static final Class A02 = GrimseyFBsystraceListener.class;
    public boolean A00 = false;
    public boolean A01 = false;

    public static void register() {
        C08800Yq.A00(new GrimseyFBsystraceListener());
    }

    public final void BSJ() {
        boolean z = this.A00;
        if (z || this.A01) {
            if (z) {
                Grimsey.stopAllocationTracking();
            }
            if (this.A01) {
                Grimsey.stopNativeAllocationTracking();
            }
            Grimsey.collectStackTraces(false);
            Grimsey.closeLogFile();
            this.A00 = false;
            this.A01 = false;
        }
    }

    public final void BSH() {
        boolean A08 = Systrace.A08(1048576);
        boolean A082 = Systrace.A08(35184372088832L);
        if (A08 || A082) {
            String A022 = AnonymousClass070.A02("debug.grimsey.fbsystrace_output");
            String A023 = AnonymousClass070.A02("debug.grimsey.fbsystrace_args");
            if (!TextUtils.isEmpty(A022)) {
                Grimsey.setOutputDestination(A022);
                Grimsey.collectStackTraces(true);
                if (A08) {
                    Grimsey.startAllocationTracking(true);
                    this.A00 = true;
                }
                if (A082) {
                    BG1 bg1 = new BG1(this, A023);
                    Grimsey.startNativeAllocationTracking(bg1.A03, bg1.A01, bg1.A02, bg1.A00);
                    this.A01 = true;
                    return;
                }
                return;
            }
            AnonymousClass0DB.A03(A02, "No allocation tracking output path specified.");
        }
    }
}
