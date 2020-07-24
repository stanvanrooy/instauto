package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.0pF  reason: invalid class name and case insensitive filesystem */
public final class C16840pF implements C16850pG {
    public final /* synthetic */ C16570oo A00;

    public C16840pF(C16570oo r1) {
        this.A00 = r1;
    }

    public final boolean Ae0(Context context, AnonymousClass0C1 r3) {
        return !this.A00.A0C(r3, context);
    }

    public final void Aql(Context context, AnonymousClass0C1 r4, AnonymousClass0P4 r5) {
        r5.A0A("video_call_in_progress", Boolean.valueOf(this.A00.A0C(r4, context)));
    }

    public final String AFK(Context context, AnonymousClass0C1 r3, boolean z) {
        int i = C0003R.string.unable_to_switch_accounts_during_video_call;
        if (z) {
            i = C0003R.string.unable_to_logout_during_video_call;
        }
        return context.getString(i);
    }

    public final String AFL(Context context, AnonymousClass0C1 r3, boolean z) {
        int i = C0003R.string.unable_to_switch_accounts_during_video_call_title;
        if (z) {
            i = C0003R.string.unable_to_logout_during_video_call_title;
        }
        return context.getString(i);
    }
}
