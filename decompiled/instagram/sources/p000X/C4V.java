package p000X;

import android.graphics.Point;

/* renamed from: X.C4V */
public final class C4V implements D0N {
    public final /* synthetic */ C4Q A00;

    public C4V(C4Q c4q) {
        this.A00 = c4q;
    }

    public final /* bridge */ /* synthetic */ Object BrI(C29484Cyd cyd) {
        if (((Boolean) cyd.A04()).booleanValue()) {
            C4X c4x = (C4X) this.A00.A0C.get();
            if (c4x != null) {
                if (this.A00.A06.A00() == C27237C4e.FRONT_FLASH) {
                    C4Q c4q = this.A00;
                    if (c4q.A00 == C27242C4l.ID_FRONT_SIDE) {
                        c4q.A00 = C27242C4l.ID_FRONT_SIDE_FLASH;
                        c4x.BQx();
                    }
                }
                c4x.BBw(this.A00.A00, (Point[]) null);
                return null;
            }
            return null;
        }
        this.A00.A02();
        return null;
    }
}
