package p000X;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.BM6 */
public final class BM6 implements X509TrustManager {
    public final Set A00 = new HashSet();
    public final AnonymousClass0IS A01;
    public final TrustManager[] A02;

    public final void A00(X509Certificate[] x509CertificateArr) {
        if (r4 != 0) {
            X509Certificate[] A002 = BM9.A00(x509CertificateArr, this.A01);
            int length = A002.length;
            int i = 0;
            while (i < length) {
                try {
                    if (!this.A00.contains(ByteBuffer.wrap(MessageDigest.getInstance("SHA-256").digest(A002[i].getPublicKey().getEncoded())))) {
                        i++;
                    } else {
                        return;
                    }
                } catch (NoSuchAlgorithmException e) {
                    throw new CertificateException(e);
                }
            }
            StringBuilder sb = new StringBuilder("pinning error, trusted chain: ");
            for (X509Certificate encoded : x509CertificateArr) {
                sb.append(Base64.encodeToString(encoded.getEncoded(), 0));
                sb.append("\n");
            }
            throw new CertificateException(sb.toString());
        }
        throw new CertificateException("pinning error: certificate chain empty");
    }

    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] x509CertificateArr = new X509Certificate[0];
        for (TrustManager trustManager : this.A02) {
            X509Certificate[] acceptedIssuers = ((X509TrustManager) trustManager).getAcceptedIssuers();
            int length = x509CertificateArr.length;
            int length2 = acceptedIssuers.length;
            x509CertificateArr = (X509Certificate[]) Arrays.copyOf(x509CertificateArr, length2 + length);
            System.arraycopy(acceptedIssuers, 0, x509CertificateArr, length, length2);
        }
        return x509CertificateArr;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        for (TrustManager trustManager : this.A02) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
        A00(x509CertificateArr);
    }

    public BM6() {
        this.A01 = AnonymousClass0IS.A00();
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init((KeyStore) null);
            this.A02 = instance.getTrustManagers();
            for (String decode : AnonymousClass0Fq.A00) {
                this.A00.add(ByteBuffer.wrap(Base64.decode(decode, 0)));
            }
        } catch (KeyStoreException | NoSuchAlgorithmException e) {
            throw new IllegalStateException("Failure initializing TrustManager", e);
        }
    }
}
