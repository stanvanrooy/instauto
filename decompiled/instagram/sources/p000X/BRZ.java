package p000X;

import java.util.Map;

/* renamed from: X.BRZ */
public final class BRZ implements C51742Ly {
    public final /* synthetic */ C25768BZc A00;

    public BRZ(C25768BZc bZc) {
        this.A00 = bZc;
    }

    public final void BE9(Map map) {
        if (map.containsKey("android.permission.ACCESS_FINE_LOCATION")) {
            AnonymousClass2WY r1 = (AnonymousClass2WY) map.get("android.permission.ACCESS_FINE_LOCATION");
            if (r1 == AnonymousClass2WY.GRANTED) {
                C25768BZc.A02(this.A00, true, true);
            } else if (r1 == AnonymousClass2WY.DENIED || r1 == AnonymousClass2WY.DENIED_DONT_ASK_AGAIN) {
                C25768BZc.A02(this.A00, false, false);
            }
        }
    }
}
