package p000X;

/* renamed from: X.1lT  reason: invalid class name and case insensitive filesystem */
public final class C38561lT implements C11590fD {
    public final /* synthetic */ AnonymousClass0C1 A00;

    public C38561lT(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        if (!((Boolean) AnonymousClass0L6.A03(this.A00, AnonymousClass0L7.NETWORK_PERF_QPL_PPR, "enable_only_on_image_load_time_users", false, (AnonymousClass04H) null)).booleanValue()) {
            return new C38551lS(((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.NETWORK_PERF_QPL_PPR, "is_enabled", false, (AnonymousClass04H) null)).booleanValue(), ((Integer) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.NETWORK_PERF_QPL_PPR, "sampling_rate", 1, (AnonymousClass04H) null)).intValue());
        }
        if (((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.PHOTOS_QPL_CONFIG, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return new C38551lS(((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.NETWORK_PERF_QPL_PPR, "is_enabled", false, (AnonymousClass04H) null)).booleanValue(), ((Integer) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.NETWORK_PERF_QPL_PPR, "sampling_rate", 1, (AnonymousClass04H) null)).intValue());
        }
        return new C38551lS(false, 1);
    }
}
