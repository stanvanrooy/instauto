package p000X;

/* renamed from: X.CR0 */
public final class CR0 {
    public static C27781CQz parseFromJson(C13080hr r3) {
        C27781CQz cQz = new C27781CQz();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("product_list_title_content".equals(A0i)) {
                cQz.A03 = CR2.parseFromJson(r3);
            } else if ("product_list_item_content".equals(A0i)) {
                cQz.A02 = CRF.parseFromJson(r3);
            } else if ("product_list_group_content".equals(A0i)) {
                cQz.A01 = CRG.parseFromJson(r3);
            } else if ("product_list_collection_content".equals(A0i)) {
                cQz.A00 = CR1.parseFromJson(r3);
            }
            r3.A0f();
        }
        return cQz;
    }
}
