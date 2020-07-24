package p000X;

import android.view.Choreographer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.21z  reason: invalid class name and case insensitive filesystem */
public final class C470321z {
    public static C470321z A04;
    public long A00;
    public final Choreographer.FrameCallback A01;
    public final Choreographer A02;
    public final Set A03 = new HashSet();

    public C470321z(Choreographer choreographer) {
        this.A02 = choreographer;
        this.A01 = new AnonymousClass220(this);
    }
}
