package p000X;

import com.instagram.feed.media.EffectActionSheet;
import java.util.ArrayList;

/* renamed from: X.1tl  reason: invalid class name and case insensitive filesystem */
public final class C43081tl {
    public static EffectActionSheet parseFromJson(C13080hr r5) {
        ArrayList arrayList;
        String A0t;
        ArrayList arrayList2;
        String A0t2;
        EffectActionSheet effectActionSheet = new EffectActionSheet();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            if ("primary_actions".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    arrayList2 = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        if (r5.A0g() == C13120hv.VALUE_NULL) {
                            A0t2 = null;
                        } else {
                            A0t2 = r5.A0t();
                        }
                        if (A0t2 != null) {
                            arrayList2.add(A0t2);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                effectActionSheet.A00 = arrayList2;
            } else if ("secondary_actions".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        if (r5.A0g() == C13120hv.VALUE_NULL) {
                            A0t = null;
                        } else {
                            A0t = r5.A0t();
                        }
                        if (A0t != null) {
                            arrayList.add(A0t);
                        }
                    }
                } else {
                    arrayList = null;
                }
                effectActionSheet.A01 = arrayList;
            }
            r5.A0f();
        }
        return effectActionSheet;
    }

    public static void A00(C13460iZ r2, EffectActionSheet effectActionSheet) {
        r2.A0T();
        if (effectActionSheet.A00 != null) {
            r2.A0d("primary_actions");
            r2.A0S();
            for (String str : effectActionSheet.A00) {
                if (str != null) {
                    r2.A0g(str);
                }
            }
            r2.A0P();
        }
        if (effectActionSheet.A01 != null) {
            r2.A0d("secondary_actions");
            r2.A0S();
            for (String str2 : effectActionSheet.A01) {
                if (str2 != null) {
                    r2.A0g(str2);
                }
            }
            r2.A0P();
        }
        r2.A0Q();
    }
}
