package p000X;

import com.facebook.breakpad.BreakpadManager;
import com.facebook.breakpad.UnwindstackStreamManager;
import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.0Yf  reason: invalid class name and case insensitive filesystem */
public final class C08710Yf implements AnonymousClass0ET {
    public final void ACl(AnonymousClass0EV r1) {
    }

    public final void Aie(AnonymousClass0EV r1) {
    }

    public final void ACm(AnonymousClass0EV r5) {
        AnonymousClass0ZL.A01("NativeExtraConfig.unwindStackInit", 1668321775);
        try {
            UnwindstackStreamManager.register();
            BreakpadManager.setMinidumpFlags(BreakpadManager.getMinidumpFlags() | OdexSchemeArtXdex.STATE_DEX2OAT_CLASSPATH_SET);
        } finally {
            AnonymousClass0ZL.A00(-1174985935);
        }
    }
}
