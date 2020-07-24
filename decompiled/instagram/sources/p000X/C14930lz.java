package p000X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;

/* renamed from: X.0lz  reason: invalid class name and case insensitive filesystem */
public final class C14930lz {
    public final int A00;
    public final int A01;
    public final QuickPerformanceLogger A02;
    public final String A03;
    public final String A04;

    public final void A00(Throwable th) {
        AnonymousClass0Hz withMarker = this.A02.withMarker(28442625, this.A01);
        withMarker.A06("error_message", th.toString());
        withMarker.Aoj();
        this.A02.markerPoint(28442625, this.A01, "dod_metadata_critical_path_processing_failed");
    }

    public final void A01(Throwable th) {
        AnonymousClass0Hz withMarker = this.A02.withMarker(28442625, this.A01);
        withMarker.A06("error_message", th.toString());
        withMarker.A07("is_delta", false);
        withMarker.Aoj();
    }

    public C14930lz(QuickPerformanceLogger quickPerformanceLogger, C14910lx r7) {
        this.A02 = quickPerformanceLogger;
        C14900lv r0 = r7.A01;
        int i = r0.A00;
        this.A00 = i;
        String str = r0.A05;
        this.A04 = str;
        String str2 = r0.A04;
        this.A03 = str2;
        this.A01 = Arrays.hashCode(new Object[]{Integer.valueOf(i), str, str2});
    }
}
