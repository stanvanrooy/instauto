package p000X;

import android.content.Context;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.0ze  reason: invalid class name and case insensitive filesystem */
public final class C23150ze implements C23160zf {
    public static final C17120pi A02 = new C23180zh();
    public int A00;
    public boolean A01;

    public final ShareType AVv() {
        return null;
    }

    public final boolean AfP() {
        return false;
    }

    public final boolean AfQ() {
        return false;
    }

    public final void BXX(AnonymousClass0C1 r1, PendingMedia pendingMedia, C155546ka r3) {
    }

    public final String getTypeName() {
        return "UploadFinishShareTarget";
    }

    public final AnonymousClass1C3 A6x(Context context, AnonymousClass0C1 r12, Object obj, long j, String str, String str2, String str3, boolean z, String str4, ShareType shareType, String str5) {
        boolean z2 = z;
        String str6 = str;
        C15890nh A002 = C160416ss.A00(C160566t8.FINISH, r12, str6, z2, str4, C05860Mt.A00(context));
        C160416ss.A08(r12, A002, C185537wE.A00(((C103784e8) obj).A01), z2, j);
        return A002.A04();
    }

    public final /* bridge */ /* synthetic */ Object A73(PendingMedia pendingMedia) {
        return new C103784e8(this, pendingMedia);
    }

    public final int AX9() {
        return this.A00;
    }

    public final boolean Aem() {
        return this.A01;
    }

    public final boolean Apg(AnonymousClass0C1 r5, PendingMedia pendingMedia) {
        if (!((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.SKIP_PHOTO_FINISH, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || pendingMedia.A0g != MediaType.PHOTO) {
            return true;
        }
        return false;
    }

    public final C28691Ms BWq(AnonymousClass0C1 r2, C33861dc r3) {
        return (C28691Ms) new C88703sr(this).then(r3);
    }

    public final AnonymousClass1NJ BPV(AnonymousClass0C1 r3, PendingMedia pendingMedia, C28691Ms r5, Context context) {
        if (pendingMedia.A0x()) {
            new C42531sV(context, r3).A0O(pendingMedia);
        }
        return null;
    }

    public final void Bgg(boolean z) {
        this.A01 = z;
    }

    public final void Bkp(int i) {
        this.A00 = i;
    }
}
