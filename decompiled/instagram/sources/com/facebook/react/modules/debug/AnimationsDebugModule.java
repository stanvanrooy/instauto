package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import p000X.A0j;
import p000X.A44;
import p000X.A9W;
import p000X.ACD;
import p000X.ACG;
import p000X.ACH;
import p000X.ACV;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0FY;
import p000X.C228039ra;

@ReactModule(name = "AnimationsDebugModule")
public class AnimationsDebugModule extends NativeAnimationsDebugModuleSpec {
    public static final String NAME = "AnimationsDebugModule";
    public final ACV mCatalystSettings;
    public ACD mFrameCallback;

    public String getName() {
        return NAME;
    }

    public void onCatalystInstanceDestroy() {
        ACD acd = this.mFrameCallback;
        if (acd != null) {
            acd.A09 = true;
            CatalystInstance catalystInstance = acd.A0A.A00;
            AnonymousClass0FY.A00(catalystInstance);
            catalystInstance.removeBridgeIdleDebugListener(acd.A0B);
            acd.A0C.setViewHierarchyUpdateDebugListener((A9W) null);
            this.mFrameCallback = null;
        }
    }

    public void startRecordingFps() {
        ACV acv = this.mCatalystSettings;
        if (acv != null && acv.isAnimationFpsDebugEnabled()) {
            if (this.mFrameCallback == null) {
                ACD acd = new ACD(getReactApplicationContext());
                this.mFrameCallback = acd;
                acd.A07 = new TreeMap();
                acd.A08 = true;
                acd.A09 = false;
                CatalystInstance catalystInstance = acd.A0A.A00;
                AnonymousClass0FY.A00(catalystInstance);
                catalystInstance.addBridgeIdleDebugListener(acd.A0B);
                acd.A0C.setViewHierarchyUpdateDebugListener(acd.A0B);
                C228039ra.A01(new ACG(acd, acd));
                return;
            }
            throw new A0j("Already recording FPS!");
        }
    }

    public void stopRecordingFps(double d) {
        ACH ach;
        ACH ach2;
        ACD acd = this.mFrameCallback;
        if (acd != null) {
            acd.A09 = true;
            CatalystInstance catalystInstance = acd.A0A.A00;
            AnonymousClass0FY.A00(catalystInstance);
            catalystInstance.removeBridgeIdleDebugListener(acd.A0B);
            acd.A0C.setViewHierarchyUpdateDebugListener((A9W) null);
            ACD acd2 = this.mFrameCallback;
            AnonymousClass0FY.A01(acd2.A07, "FPS was not recorded at each frame!");
            Map.Entry floorEntry = acd2.A07.floorEntry(Long.valueOf((long) d));
            if (floorEntry == null) {
                ach = null;
                ach2 = null;
            } else {
                ach = (ACH) floorEntry.getValue();
                ach2 = ach;
            }
            if (ach == null) {
                Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
            } else {
                String format = String.format(Locale.US, "FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(ach2.A00), Integer.valueOf(ach2.A03), Integer.valueOf(ach2.A02)});
                Locale locale = Locale.US;
                Toast.makeText(getReactApplicationContext(), AnonymousClass000.A0P(format, "\n", String.format(locale, "JS FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(ach2.A01), Integer.valueOf(ach2.A04), Integer.valueOf(ach2.A02)}), "\n", "Total Time MS: ", String.format(locale, "%d", new Object[]{Integer.valueOf(ach2.A05)})), 1).show();
            }
            this.mFrameCallback = null;
        }
    }

    public AnimationsDebugModule(A44 a44, ACV acv) {
        super(a44);
        this.mCatalystSettings = acv;
    }
}
