package p000X;

import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.BM5 */
public final class BM5 {
    public static final Class A01 = BM5.class;
    public SoftReference A00 = new SoftReference((Object) null);

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0045, code lost:
        r1 = (javax.net.ssl.X509TrustManager) r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0055  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0024=Splitter:B:17:0x0024, B:21:0x002e=Splitter:B:21:0x002e} */
    public final byte[][] A02() {
        X509Certificate[] x509CertificateArr;
        TrustManagerFactory trustManagerFactory;
        X509TrustManager x509TrustManager;
        synchronized (this) {
            x509CertificateArr = (X509Certificate[]) this.A00.get();
            if (x509CertificateArr == null) {
                synchronized (this) {
                    try {
                        trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        try {
                            trustManagerFactory.init((KeyStore) null);
                        } catch (NoSuchAlgorithmException e) {
                            e = e;
                        } catch (KeyStoreException e2) {
                            e = e2;
                            AnonymousClass0DB.A05(A01, "Failed to create TrustManagerFactory", e);
                            if (trustManagerFactory != null) {
                            }
                            x509TrustManager = null;
                            if (x509TrustManager != null) {
                            }
                            return A01(Arrays.asList(x509CertificateArr));
                        }
                    } catch (NoSuchAlgorithmException e3) {
                        e = e3;
                        trustManagerFactory = null;
                        AnonymousClass0DB.A05(A01, "Failed to create TrustManagerFactory", e);
                        if (trustManagerFactory != null) {
                        }
                        x509TrustManager = null;
                        if (x509TrustManager != null) {
                        }
                        return A01(Arrays.asList(x509CertificateArr));
                    } catch (KeyStoreException e4) {
                        e = e4;
                        trustManagerFactory = null;
                        AnonymousClass0DB.A05(A01, "Failed to create TrustManagerFactory", e);
                        if (trustManagerFactory != null) {
                        }
                        x509TrustManager = null;
                        if (x509TrustManager != null) {
                        }
                        return A01(Arrays.asList(x509CertificateArr));
                    }
                    if (trustManagerFactory != null) {
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        int length = trustManagers.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            TrustManager trustManager = trustManagers[i];
                            if (trustManager instanceof X509TrustManager) {
                                break;
                            }
                            i++;
                        }
                    }
                    x509TrustManager = null;
                }
                if (x509TrustManager != null) {
                    x509CertificateArr = new X509Certificate[0];
                } else {
                    x509CertificateArr = x509TrustManager.getAcceptedIssuers();
                    this.A00 = new SoftReference(x509CertificateArr);
                }
            }
        }
        return A01(Arrays.asList(x509CertificateArr));
    }

    public static synchronized ArrayList A00() {
        ArrayList arrayList;
        synchronized (BM5.class) {
            arrayList = new ArrayList();
            try {
                KeyStore instance = KeyStore.getInstance("AndroidCAStore");
                instance.load((InputStream) null, (char[]) null);
                Enumeration<String> aliases = instance.aliases();
                while (aliases.hasMoreElements()) {
                    String nextElement = aliases.nextElement();
                    if (nextElement.startsWith("user:")) {
                        Certificate certificate = instance.getCertificate(nextElement);
                        if (certificate instanceof X509Certificate) {
                            arrayList.add((X509Certificate) certificate);
                        }
                    }
                }
            } catch (KeyStoreException e) {
                AnonymousClass0DB.A06(A01, "Failed to get user Root CA", e);
            } catch (Throwable th) {
                AnonymousClass0DB.A06(A01, "Failed to load AndroidCAStore", th);
            }
        }
        return arrayList;
    }

    public static byte[][] A01(List list) {
        byte[][] bArr = new byte[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            try {
                bArr[i] = ((X509Certificate) list.get(i)).getEncoded();
            } catch (CertificateEncodingException e) {
                AnonymousClass0DB.A06(A01, "Failed to encode Root CA", e);
            }
        }
        return bArr;
    }
}
