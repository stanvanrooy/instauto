package p000X;

import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;

/* renamed from: X.0ag  reason: invalid class name and case insensitive filesystem */
public final class C09140ag implements C025002p {
    public AnonymousClass0Fp A00;
    public final int A01;

    public C09140ag(int i) {
        this.A01 = i;
    }

    public final HttpURLConnection AIe(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            if (this.A00 == null) {
                this.A00 = new AnonymousClass0Fp();
            }
            try {
                AnonymousClass0Fp r1 = this.A00;
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init((KeyManager[]) null, r1.A00, (SecureRandom) null);
                httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
            } catch (KeyManagementException | NoSuchAlgorithmException e) {
                AnonymousClass0DB.A0H("lacrima", "Pinning failed", e);
            }
        }
        httpURLConnection.setConnectTimeout(this.A01);
        httpURLConnection.setReadTimeout(this.A01);
        return httpURLConnection;
    }
}
