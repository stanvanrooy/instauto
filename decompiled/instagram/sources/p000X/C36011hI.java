package p000X;

import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.1hI  reason: invalid class name and case insensitive filesystem */
public final class C36011hI implements C31881aA {
    public final /* synthetic */ C31581Yw A00;
    public final /* synthetic */ C35761gt A01;
    public final /* synthetic */ AnonymousClass0C1 A02;
    public final /* synthetic */ String A03;

    public final void B9O(C37371jY r1) {
    }

    public C36011hI(C35761gt r1, C31581Yw r2, String str, AnonymousClass0C1 r4) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = str;
        this.A02 = r4;
    }

    public final void B3v() {
        String str;
        CircularImageView circularImageView = this.A01.A0E;
        if (circularImageView.getTypedUrl() != null) {
            str = circularImageView.getTypedUrl().AZc();
        } else {
            str = null;
        }
        C249916w r0 = this.A00.A04.A0M;
        String id = r0.getId();
        String name = r0.getName();
        String str2 = this.A03;
        AnonymousClass0C1 r2 = this.A02;
        AnonymousClass0P4 A002 = C51722Lw.A00(str2, "reel_avatar_fail_to_load");
        A002.A0G("reel_image_uri", str);
        A002.A0G("reel_owner_id", id);
        A002.A0G("reel_owner_name", name);
        C51722Lw.A01(A002);
        AnonymousClass0WN.A01(r2).BcG(A002);
    }
}
