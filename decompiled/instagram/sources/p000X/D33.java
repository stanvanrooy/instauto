package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.android.exoplayer2.Format;
import java.util.Map;

/* renamed from: X.D33 */
public final class D33 implements D3Q {
    public final Format A00;
    public final /* synthetic */ D2X A01;

    public final boolean Afi() {
        return false;
    }

    public final boolean BnY() {
        return true;
    }

    public D33(D2X d2x, Format format) {
        this.A01 = d2x;
        this.A00 = format;
    }

    public final C29655D3o ADP(C29663D3w d3w, Format[] formatArr, Map map, Format format, int i, int i2) {
        this.A01.A0A.A2Z(D2b.PRESELECTED);
        return new C29655D3o(this.A00, NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED, NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED);
    }
}
