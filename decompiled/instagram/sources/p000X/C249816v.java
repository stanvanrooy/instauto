package p000X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.16v  reason: invalid class name and case insensitive filesystem */
public final class C249816v implements C249916w {
    public final C13300iJ A00;

    public final List AMd() {
        return null;
    }

    public final void Bgq(ImageUrl imageUrl) {
    }

    public final Integer AH7() {
        return Constants.ZERO;
    }

    public final String AJ4() {
        return this.A00.AZn();
    }

    public final ImageUrl AJ5() {
        return this.A00.ASv();
    }

    public final Map APN() {
        HashMap hashMap = new HashMap();
        hashMap.put("a_pk", this.A00.getId());
        return hashMap;
    }

    public final Integer AQj() {
        return Constants.ONE;
    }

    public final Integer AZG() {
        return Constants.ONE;
    }

    public final C13300iJ AZf() {
        return this.A00;
    }

    public final String getId() {
        return this.A00.getId();
    }

    public final String getName() {
        return this.A00.AZn();
    }

    public C249816v(C13300iJ r1) {
        this.A00 = r1;
    }

    public final String toString() {
        C13300iJ r0 = this.A00;
        return AnonymousClass000.A0O("{user_id: ", r0.getId(), " username: ", r0.AZn(), "}");
    }
}
