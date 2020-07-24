package p000X;

import androidx.lifecycle.CoroutineLiveData;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;

/* renamed from: X.BDK */
public final class BDK {
    public C50512Gp A00;
    public C50512Gp A01;
    public final long A02 = ArLinkScanControllerImpl.ERROR_DELAY_MS;
    public final CoroutineLiveData A03;
    public final C18720sJ A04;
    public final C46381ze A05;
    public final AnonymousClass101 A06;

    public BDK(CoroutineLiveData coroutineLiveData, C46381ze r5, AnonymousClass101 r6, C18720sJ r7) {
        C13150hy.A02(coroutineLiveData, "liveData");
        C13150hy.A02(r5, "block");
        C13150hy.A02(r6, "scope");
        C13150hy.A02(r7, "onDone");
        this.A03 = coroutineLiveData;
        this.A05 = r5;
        this.A06 = r6;
        this.A04 = r7;
    }
}
