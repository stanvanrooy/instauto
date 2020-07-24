package p000X;

import com.instagram.tagging.widget.MediaTagHintsLayout;
import java.util.ArrayList;

/* renamed from: X.1lk  reason: invalid class name and case insensitive filesystem */
public final class C38731lk {
    public static void A00(C36841ih r2, C32181aj r3, boolean z) {
        MediaTagHintsLayout mediaTagHintsLayout = r3.A03;
        MediaTagHintsLayout.A01(mediaTagHintsLayout);
        MediaTagHintsLayout.A00(mediaTagHintsLayout);
        r3.A03.A03(r2.A04(r3.A00), z);
    }

    public static void A01(AnonymousClass0C1 r3, AnonymousClass1NJ r4, C36841ih r5, C32181aj r6, boolean z) {
        C38741ll A04 = r5.A04(r4.A0B(r3));
        if (!r4.A1P() || r5.A0y || A04.A06) {
            A04.A06 = true;
            MediaTagHintsLayout mediaTagHintsLayout = r6.A03;
            MediaTagHintsLayout.A01(mediaTagHintsLayout);
            MediaTagHintsLayout.A00(mediaTagHintsLayout);
            r6.A03.A03(A04, false);
        } else if (r5 != r6.A01 || r4.A0B(r3) != r6.A00) {
            MediaTagHintsLayout mediaTagHintsLayout2 = r6.A03;
            ArrayList A0w = r4.A0w();
            AnonymousClass0a4.A06(A0w);
            mediaTagHintsLayout2.setTags(A0w);
            MediaTagHintsLayout mediaTagHintsLayout3 = r6.A03;
            MediaTagHintsLayout.A01(mediaTagHintsLayout3);
            MediaTagHintsLayout.A00(mediaTagHintsLayout3);
            C36841ih r2 = r6.A01;
            if (r2 != null) {
                r2.A0E(r6, true, Integer.valueOf(r6.A00));
            }
            int A0B = r4.A0B(r6.A02);
            r6.A00 = A0B;
            r6.A01 = r5;
            r5.A0D(r6, true, Integer.valueOf(A0B));
            if (z) {
                C32181aj.A00(r6);
            }
        }
    }
}
