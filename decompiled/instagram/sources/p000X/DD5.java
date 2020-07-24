package p000X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.DD5 */
public final class DD5 extends C29866DEb implements C29869DEe {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        C29023Cqb[] cqbArr = (C29023Cqb[]) DD3.A08(byteBuffer, i, 0, DD4.class);
        if (cqbArr != null) {
            this.A00 = new ArrayList(Arrays.asList(cqbArr));
        }
        this.A01 = (C29865DEa[]) DD3.A08(byteBuffer, i, 1, DDM.class);
    }
}
