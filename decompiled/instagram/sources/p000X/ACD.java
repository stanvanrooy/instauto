package p000X;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.TreeMap;

/* renamed from: X.ACD */
public final class ACD extends ACP {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public long A04 = -1;
    public long A05 = -1;
    public ACJ A06;
    public TreeMap A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public final A3N A0A;
    public final ACE A0B;
    public final UIManagerModule A0C;

    public ACD(A3N a3n) {
        this.A0A = a3n;
        NativeModule A022 = a3n.A02(UIManagerModule.class);
        AnonymousClass0FY.A00(A022);
        this.A0C = (UIManagerModule) A022;
        this.A0B = new ACE();
    }
}
