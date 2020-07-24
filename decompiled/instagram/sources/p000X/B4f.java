package p000X;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

/* renamed from: X.B4f */
public final class B4f implements C60332jj {
    public final /* synthetic */ C68512zF A00;

    public B4f(C68512zF r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ Object BrJ(C60302jg r5) {
        Bundle bundle = (Bundle) r5.A0C(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
            }
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
