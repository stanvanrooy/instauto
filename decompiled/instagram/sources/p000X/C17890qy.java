package p000X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.0qy  reason: invalid class name and case insensitive filesystem */
public final class C17890qy extends C17910r0 {
    public AnonymousClass2UR A00;

    public final AnonymousClass2UR A01() {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass2UR();
        }
        return this.A00;
    }

    public final void A02(AnonymousClass0P4 r3, Hashtag hashtag) {
        r3.A0G("hashtag_id", hashtag.A07);
        r3.A0G("hashtag_name", hashtag.A0A);
        r3.A0G("hashtag_follow_status", AnonymousClass6HO.A00(hashtag.A00()));
    }
}
