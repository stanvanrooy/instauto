package p000X;

import com.facebook.proxygen.HTTPRequestError;
import java.io.IOException;

/* renamed from: X.1xi  reason: invalid class name and case insensitive filesystem */
public final class C45341xi extends IOException {
    public final HTTPRequestError A00;

    public C45341xi(HTTPRequestError hTTPRequestError) {
        super(hTTPRequestError.mErrMsg);
        this.A00 = hTTPRequestError;
    }
}
