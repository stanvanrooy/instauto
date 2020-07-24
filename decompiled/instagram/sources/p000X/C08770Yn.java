package p000X;

import com.facebook.breakpad.BreakpadManager;

/* renamed from: X.0Yn  reason: invalid class name and case insensitive filesystem */
public final class C08770Yn implements AnonymousClass0ET {
    public final void ACl(AnonymousClass0EV r1) {
    }

    public final void ACm(AnonymousClass0EV r1) {
    }

    public final void Aie(AnonymousClass0EV r4) {
        int i;
        AnonymousClass0ZL.A01("NativeExtraConfig.jvmStreamEnabled", -2098918445);
        try {
            BreakpadManager.setJvmStreamEnabled(true);
            i = -231002250;
        } catch (Exception | UnsatisfiedLinkError e) {
            AnonymousClass0DB.A0H("lacrima", "Error enabling jvm stream", e);
            i = -1573642695;
        } catch (Throwable th) {
            AnonymousClass0ZL.A00(1194324758);
            throw th;
        }
        AnonymousClass0ZL.A00(i);
    }
}
