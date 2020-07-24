package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.android.exoplayer2.Format;
import java.util.Map;

/* renamed from: X.D34 */
public final class D34 implements D3Q {
    public final /* synthetic */ D2X A00;

    public final boolean Afi() {
        return false;
    }

    public final boolean BnY() {
        return false;
    }

    public D34(D2X d2x) {
        this.A00 = d2x;
    }

    public final C29655D3o ADP(C29663D3w d3w, Format[] formatArr, Map map, Format format, int i, int i2) {
        this.A00.A0A.A2Z(D2b.SINGLE_FORMAT);
        return new C29655D3o(formatArr[0], NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED, NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED);
    }
}
