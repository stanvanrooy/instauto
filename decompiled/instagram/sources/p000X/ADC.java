package p000X;

/* renamed from: X.ADC */
public final class ADC extends BDD implements BDB {
    public final String A00;
    public final Throwable A01;

    private final void A00() {
        String str;
        if (this.A01 != null) {
            StringBuilder sb = new StringBuilder("Module with the Main dispatcher had failed to initialize");
            String str2 = this.A00;
            if (str2 == null || (str = AnonymousClass000.A0E(". ", str2)) == null) {
                str = "";
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString(), this.A01);
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public final String toString() {
        String str;
        Throwable th = this.A01;
        if (th != null) {
            str = ", cause=" + th;
        } else {
            str = "";
        }
        return AnonymousClass000.A0F("Main[missing", str, ']');
    }

    public ADC(Throwable th, String str) {
        this.A01 = th;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void dispatch(AnonymousClass2GC r2, Runnable runnable) {
        A00();
        throw null;
    }

    public final BDD getImmediate() {
        return this;
    }

    public final C50602Gy invokeOnTimeout(long j, Runnable runnable) {
        A00();
        throw null;
    }

    public final boolean isDispatchNeeded(AnonymousClass2GC r2) {
        A00();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void scheduleResumeAfterDelay(long j, C50732Hq r4) {
        A00();
        throw null;
    }
}
