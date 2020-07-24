package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.instagram.pendingmedia.model.PendingMedia;

/* renamed from: X.0zm  reason: invalid class name and case insensitive filesystem */
public final class C23230zm implements C16850pG {
    public final String AFK(Context context, AnonymousClass0C1 r3, boolean z) {
        int i = C0003R.string.wait_for_uploads_to_finish_switch;
        if (z) {
            i = C0003R.string.wait_for_uploads_to_finish_logout;
        }
        return context.getString(i);
    }

    public final String AFL(Context context, AnonymousClass0C1 r3, boolean z) {
        return context.getString(C0003R.string.just_a_moment);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    public final boolean Ae0(Context context, AnonymousClass0C1 r6) {
        boolean z;
        boolean z2;
        C17870qw A00 = C17870qw.A00(context, r6);
        if (A00.A02.A05.A08()) {
            synchronized (A00) {
                for (C106884jF r0 : A00.A0A) {
                    PendingMedia pendingMedia = r0.A03;
                    if (pendingMedia == null || (!pendingMedia.A0u() && !pendingMedia.A0x())) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (!z2) {
                    }
                }
                z = ((Boolean) C05680Ln.A0n.A00()).booleanValue();
            }
            if (!z || !C160846te.A00()) {
                return !A00.A0L();
            }
            return true;
        }
        z = false;
        if (!z || !C160846te.A00()) {
        }
    }

    public final void Aql(Context context, AnonymousClass0C1 r4, AnonymousClass0P4 r5) {
        r5.A0A("upload_in_progress", Boolean.valueOf(C17870qw.A00(context, r4).A0L()));
    }
}
