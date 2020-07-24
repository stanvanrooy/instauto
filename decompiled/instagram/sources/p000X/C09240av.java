package p000X;

import android.net.http.X509TrustManagerExtensions;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.0av  reason: invalid class name and case insensitive filesystem */
public final class C09240av extends X509ExtendedTrustManager implements X509TrustManager {
    public final BM6 A00;
    public final X509TrustManagerExtensions[] A01;

    private X509TrustManagerExtensions[] A00(TrustManager[] trustManagerArr) {
        X509TrustManagerExtensions[] x509TrustManagerExtensionsArr = new X509TrustManagerExtensions[trustManagerArr.length];
        int i = 0;
        while (true) {
            TrustManager[] trustManagerArr2 = this.A00.A02;
            if (i >= trustManagerArr2.length) {
                return x509TrustManagerExtensionsArr;
            }
            x509TrustManagerExtensionsArr[i] = new X509TrustManagerExtensions((X509TrustManager) trustManagerArr2[i]);
            i++;
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.A00.getAcceptedIssuers();
    }

    public C09240av() {
        BM6 bm6 = new BM6();
        this.A00 = bm6;
        this.A01 = A00(bm6.A02);
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.A00.checkServerTrusted(x509CertificateArr, str);
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        for (TrustManager trustManager : this.A00.A02) {
            ((X509ExtendedTrustManager) trustManager).checkServerTrusted(x509CertificateArr, str, socket);
        }
        this.A00.A00(x509CertificateArr);
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        for (TrustManager trustManager : this.A00.A02) {
            ((X509ExtendedTrustManager) trustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        }
        this.A00.A00(x509CertificateArr);
    }
}
