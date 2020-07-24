package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.android.exoplayer2.Format;
import java.util.Map;

/* renamed from: X.D31 */
public final class D31 implements D3Q {
    public final C29623D2f A00;

    public final boolean Afi() {
        return false;
    }

    public final boolean BnY() {
        return false;
    }

    public final C29655D3o ADP(C29663D3w d3w, Format[] formatArr, Map map, Format format, int i, int i2) {
        Format format2;
        this.A00.A2Z(D2b.USE_DEFAULT);
        Format format3 = null;
        int i3 = 0;
        while (true) {
            if (i3 >= formatArr.length) {
                format2 = format3;
                break;
            }
            format2 = formatArr[i3];
            if (format2.A0W) {
                break;
            }
            if (format3 == null || format2.A04 < format3.A04) {
                format3 = format2;
            }
            i3++;
        }
        return new C29655D3o(format2, NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED, NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED);
    }

    public D31(C29623D2f d2f) {
        this.A00 = d2f;
    }
}
