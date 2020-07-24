package p000X;

import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AQE */
public final class AQE {
    public final Map A00;
    public final Set A01;
    public final Set A02;

    public final Set A00() {
        C25138B2q b2q;
        synchronized (this.A02) {
            b2q = new C25138B2q(this.A01);
        }
        return b2q;
    }

    public final void A01(String str) {
        synchronized (this.A02) {
            Uri parse = Uri.parse(str);
            if (!(parse == null || parse.getHost() == null)) {
                this.A02.add(parse.getHost());
            }
        }
    }

    public AQE() {
        this.A00 = new HashMap();
        this.A02 = new HashSet();
        this.A01 = new HashSet();
    }

    public AQE(Bundle bundle) {
        this.A00 = (Map) bundle.getSerializable("resource_counts");
        this.A02 = (Set) bundle.getSerializable("resource_domains");
        this.A01 = (Set) bundle.getSerializable("images_url");
    }
}
