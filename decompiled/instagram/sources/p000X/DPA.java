package p000X;

import java.util.Map;

/* renamed from: X.DPA */
public final class DPA {
    public final /* synthetic */ C30055DOk A00;

    public DPA(C30055DOk dOk) {
        this.A00 = dOk;
    }

    public final void A00(String str) {
        this.A00.A08.A08(22, str);
    }

    public final void A01(String str, C30073DPd dPd, String str2) {
        String str3 = str2;
        String str4 = str;
        this.A00.A08.A0G(str4, dPd, C06360Ot.formatString("RecordingController ErrorCode=%d", Integer.valueOf(dPd.A01)), str3, dPd.A00);
    }

    public final void A02(String str, Throwable th, String str2) {
        this.A00.A08.A0F(str, th, "RecordingController", str2);
    }

    public final void A03(String str, Map map) {
        this.A00.A0C.A00.A08.A0J(str, map);
    }
}
