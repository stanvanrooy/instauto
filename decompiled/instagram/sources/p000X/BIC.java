package p000X;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: X.BIC */
public final class BIC implements C138505vN {
    public final Credential A00;
    public final Status A01;

    public BIC(Status status, Credential credential) {
        this.A01 = status;
        this.A00 = credential;
    }

    public final Credential AJ8() {
        return this.A00;
    }

    public final Status AWn() {
        return this.A01;
    }
}
