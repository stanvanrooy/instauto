package p000X;

import com.instagram.model.venue.Venue;

/* renamed from: X.1vA  reason: invalid class name and case insensitive filesystem */
public final class C43841vA implements C11200ea {
    public final /* synthetic */ C43831v9 A00;

    public C43841vA(C43831v9 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        p000X.AnonymousClass0QD.A05("LocationPlaceSignature", "Error in venue selected listener", r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-1288045325);
        C43921vI r9 = (C43921vI) obj;
        int A032 = AnonymousClass0Z0.A03(1220344429);
        Venue venue = r9.A00;
        if (r9.A01 == Constants.ZERO || ((Boolean) AnonymousClass0L6.A02(this.A00.A00, AnonymousClass0L7.PLACE_SIGNATURE, "is_story_and_quick_tag_signature_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
            if ("facebook_places".equals(venue.A05)) {
                C43831v9 r5 = this.A00;
                String str2 = venue.A04;
                Integer num = r9.A01;
                if (num != Constants.ZERO) {
                    switch (num.intValue()) {
                        case 1:
                            str = "POST_QUICK";
                            break;
                        case 2:
                            str = "STORY";
                            break;
                        default:
                            str = "POST";
                            break;
                    }
                } else {
                    str = null;
                }
                synchronized (r5) {
                    if (!str2.equals(r5.A01)) {
                        r5.A01 = str2;
                        C43831v9.A02(r5, str2, str, 0);
                    }
                }
            }
            AnonymousClass0Z0.A0A(1613895300, A032);
            AnonymousClass0Z0.A0A(53738821, A03);
        }
        AnonymousClass0Z0.A0A(-860272022, A032);
        AnonymousClass0Z0.A0A(53738821, A03);
    }
}
