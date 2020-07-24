package p000X;

import com.instagram.pendingmedia.model.ShareTargetHelper;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.0zX  reason: invalid class name and case insensitive filesystem */
public final class C23090zX implements C17840qt {
    public final AnonymousClass00N AIc() {
        C04450Ea r2 = new C04450Ea(3);
        r2.put(ShareType.REEL_SHARE, new C42551sX());
        return r2;
    }

    public final void BZe() {
        C17410qC r2 = ShareTargetHelper.A00;
        r2.A03("DirectMultiConfigMediaTarget", new C23210zk(this));
        r2.A03("MultiConfigStoryTarget", new C23220zl(this));
    }
}
