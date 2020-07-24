package p000X;

import com.instagram.model.mediatype.MediaType;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.15w  reason: invalid class name and case insensitive filesystem */
public final class C247515w extends AnonymousClass15F {
    public static final C17120pi A03 = new C247615x();
    public String A00 = "";
    public boolean A01;
    public final C191778Hv A02 = new C191778Hv();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C247515w r5 = (C247515w) obj;
            if (this.A01 != r5.A01 || !Objects.equals(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public final String getTypeName() {
        return "PendingMediaUploadImageOperation";
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A00, Boolean.valueOf(this.A01)});
    }

    public final Set ANY() {
        if (this.A01) {
            return EnumSet.of(C243714i.NETWORK);
        }
        return super.ANY();
    }

    public final C106364iO BeC(C106264iC r8, C105884ha r9, C106204i6 r10, C106114hx r11) {
        return new C107324jx(r8, r9, r10, MediaType.PHOTO, new C104704ff(this, (AnonymousClass160) C106394iR.A01(r9, "common.imageInfo", AnonymousClass160.class), (String) C106394iR.A00(r9, "common.imageHash", String.class), r9)).A03(this.A02);
    }
}
