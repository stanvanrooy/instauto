package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.android.exoplayer2.Format;
import java.util.Map;

/* renamed from: X.D38 */
public final class D38 implements D3Q {
    public final C29623D2f A00;

    public final boolean Afi() {
        return false;
    }

    public final boolean BnY() {
        return false;
    }

    public final C29655D3o ADP(C29663D3w d3w, Format[] formatArr, Map map, Format format, int i, int i2) {
        if (format != null) {
            return new C29655D3o(format, NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED, NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED);
        }
        this.A00.A2Z(D2b.FORCE_LOWEST);
        return new C29655D3o(formatArr[formatArr.length - 1], NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED, NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED);
    }

    public D38(C29623D2f d2f) {
        this.A00 = d2f;
    }
}
