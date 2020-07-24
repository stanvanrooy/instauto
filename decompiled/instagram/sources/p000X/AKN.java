package p000X;

/* renamed from: X.AKN */
public final class AKN {
    public static AKS parseFromJson(C13080hr r3) {
        AKS aks = new AKS();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            C29161Ov.A01(aks, A0i, r3);
            r3.A0f();
        }
        aks.A08();
        return aks;
    }
}
