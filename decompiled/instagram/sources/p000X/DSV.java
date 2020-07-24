package p000X;

import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.iface.TigonRequestBuilder;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.DSV */
public final class DSV implements TigonRequest {
    public final Map A00;
    public final Map A01;

    public DSV(TigonRequestBuilder tigonRequestBuilder) {
        Map map;
        this.A00 = Collections.unmodifiableMap(tigonRequestBuilder.A00);
        Map map2 = tigonRequestBuilder.A01;
        if (map2 != null) {
            map = Collections.unmodifiableMap(map2);
        } else {
            map = null;
        }
        this.A01 = map;
    }
}
