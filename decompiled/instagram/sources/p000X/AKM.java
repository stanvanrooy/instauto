package p000X;

import android.os.SystemClock;

/* renamed from: X.AKM */
public final class AKM extends C17920r1 {
    public final /* synthetic */ AKE A00;

    public AKM(AKE ake) {
        this.A00 = ake;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(-1957702925);
        this.A00.A04 = false;
        AnonymousClass0Z0.A0A(-737625072, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(1784605580);
        AKE ake = this.A00;
        ake.A04 = true;
        ake.A00 = SystemClock.elapsedRealtime();
        AnonymousClass0Z0.A0A(-2103680711, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(1371442227);
        AKR akr = (AKR) obj;
        int A032 = AnonymousClass0Z0.A03(-2024992293);
        AKC akc = this.A00.A02;
        if (akc != null) {
            akc.A00(akr);
        }
        AnonymousClass0Z0.A0A(1934328329, A032);
        AnonymousClass0Z0.A0A(1246988350, A03);
    }
}
