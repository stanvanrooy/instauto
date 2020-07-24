package p000X;

import com.instagram.model.mediatype.MediaType;
import java.util.Objects;

/* renamed from: X.15y  reason: invalid class name and case insensitive filesystem */
public final class C247715y extends AnonymousClass15F {
    public static final C17120pi A01 = new C247815z();
    public String A00;

    public final String getTypeName() {
        return "PendingMediaCalculatePDQHashOperation";
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A00});
    }

    public final C106364iO BeC(C106264iC r9, C105884ha r10, C106204i6 r11, C106114hx r12) {
        return new C107324jx(r9, r10, r11, MediaType.PHOTO, new C100624Wl(this, (String) C106394iR.A01(r10, "common.originalImageFilePath", String.class))).A03(new AnonymousClass8HF(r9.A04));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C247715y) obj).A00);
    }
}
