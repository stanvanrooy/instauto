package p000X;

/* renamed from: X.CR1 */
public final class CR1 {
    public static CR3 parseFromJson(C13080hr r3) {
        CR3 cr3 = new CR3();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("product_collection_tile".equals(A0i)) {
                cr3.A00 = C216129Tk.parseFromJson(r3);
            } else if ("metadata".equals(A0i)) {
                cr3.A01 = CR5.parseFromJson(r3);
            }
            r3.A0f();
        }
        return cr3;
    }
}
