package p000X;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmInitData;

/* renamed from: X.D8A */
public interface D8A {
    D89 acquireSession(Looper looper, DrmInitData drmInitData);

    boolean canAcquireSession(DrmInitData drmInitData);
}
