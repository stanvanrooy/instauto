package p000X;

/* renamed from: X.1cs  reason: invalid class name and case insensitive filesystem */
public final class C33411cs implements Runnable {
    public final /* synthetic */ AnonymousClass14L A00;

    public C33411cs(AnonymousClass14L r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass14L r11 = this.A00;
        C05760Lv r10 = C05760Lv.A01;
        long j = r10.A00.getLong("device_info_last_reported_time_foreground", 0);
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass0DB.A0D("fatal", "runForegroundReporters");
        boolean z = false;
        if (Long.valueOf(currentTimeMillis).longValue() > Long.valueOf(j).longValue() + 43200000) {
            z = true;
        }
        if (z) {
            AnonymousClass14L.A00(r11, r11.A02);
            r10.A00.edit().putLong("device_info_last_reported_time_foreground", currentTimeMillis).apply();
        }
    }
}
