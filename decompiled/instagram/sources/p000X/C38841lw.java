package p000X;

import com.instagram.discovery.related.model.RelatedItem;
import java.util.ArrayList;

/* renamed from: X.1lw  reason: invalid class name and case insensitive filesystem */
public final class C38841lw {
    public static C38851lx parseFromJson(C13080hr r4) {
        C38851lx r2 = new C38851lx();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("full_item".equals(A0i)) {
                r2.A01 = C38861ly.parseFromJson(r4);
            } else {
                ArrayList arrayList = null;
                if ("fill_items".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            C38871lz parseFromJson = C38861ly.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r2.A07 = arrayList;
                } else if ("medias".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            C38871lz parseFromJson2 = C38861ly.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r2.A08 = arrayList;
                } else if ("one_by_two_item".equals(A0i)) {
                    r2.A02 = C38861ly.parseFromJson(r4);
                } else if ("two_by_two_item".equals(A0i)) {
                    r2.A05 = C38861ly.parseFromJson(r4);
                } else if ("three_by_four_item".equals(A0i)) {
                    r2.A03 = C38861ly.parseFromJson(r4);
                } else if ("tray_item".equals(A0i)) {
                    r2.A04 = C38861ly.parseFromJson(r4);
                } else if ("tabs_info".equals(A0i)) {
                    r2.A00 = C221909h8.parseFromJson(r4);
                } else if ("related".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            RelatedItem parseFromJson3 = AnonymousClass6VH.parseFromJson(r4);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    r2.A09 = arrayList;
                } else if ("related_style".equals(A0i)) {
                    r2.A06 = (AnonymousClass43D) AnonymousClass43D.A01.get(r4.A0r());
                }
            }
            r4.A0f();
        }
        return r2;
    }
}
