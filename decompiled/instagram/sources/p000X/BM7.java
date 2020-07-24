package p000X;

import android.util.Base64;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: X.BM7 */
public final class BM7 extends SSLSocketFactory implements C206318sP {
    public BM8 A00;
    public SSLSocketFactory A01;
    public boolean A02 = false;

    private synchronized void A00() {
        IllegalArgumentException illegalArgumentException;
        AnonymousClass92V r0;
        if (this.A01 == null) {
            System.currentTimeMillis();
            try {
                KeyManagerFactory instance = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null, (char[]) null);
                KeyManager[] keyManagers = instance.getKeyManagers();
                TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance2.init(AnonymousClass0IS.A00().A00);
                TrustManager[] trustManagers = instance2.getTrustManagers();
                SSLContext instance3 = SSLContext.getInstance("TLS");
                instance3.init(keyManagers, trustManagers, (SecureRandom) null);
                instance3.getClientSessionContext().setSessionCacheSize(0);
                System.currentTimeMillis();
                this.A01 = instance3.getSocketFactory();
                boolean z = this.A02;
                System.currentTimeMillis();
                BMA bma = new BMA();
                bma.A00 = AnonymousClass0IS.A00();
                String[] strArr = BMB.A00;
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = BM5.A00().iterator();
                    while (it.hasNext()) {
                        arrayList.add(Base64.encodeToString(BM8.A00(AnonymousClass92V.A00(((X509Certificate) it.next()).getPublicKey().getEncoded())).A00, 2));
                    }
                    ArrayList arrayList2 = new ArrayList(Arrays.asList(strArr));
                    arrayList2.addAll(arrayList);
                    strArr = (String[]) arrayList2.toArray(strArr);
                }
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    String[] strArr2 = {AnonymousClass000.A0E("sha1/", strArr[i])};
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Set set = (Set) bma.A01.put("*.instagram.com", Collections.unmodifiableSet(linkedHashSet));
                    if (set != null) {
                        linkedHashSet.addAll(set);
                    }
                    int i2 = 0;
                    while (i2 < 1) {
                        String str = strArr2[i2];
                        if (str.startsWith("sha1/")) {
                            String substring = str.substring(5);
                            if (substring != null) {
                                byte[] decode = Base64.decode(substring, 2);
                                if (decode != null) {
                                    r0 = new AnonymousClass92V(decode);
                                } else {
                                    r0 = null;
                                }
                                if (r0 != null) {
                                    linkedHashSet.add(r0);
                                    i2++;
                                } else {
                                    illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0E("pins must be base64: ", str));
                                }
                            } else {
                                illegalArgumentException = new IllegalArgumentException("base64 == null");
                            }
                        } else {
                            illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0E("pins must start with 'sha1/': ", str));
                        }
                        throw illegalArgumentException;
                    }
                }
                BM8 bm8 = new BM8(bma);
                System.currentTimeMillis();
                this.A00 = bm8;
            } catch (Exception e) {
                throw new IllegalStateException("Failure initializing default SSL context", e);
            } catch (Throwable th) {
                System.currentTimeMillis();
                throw th;
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final void A8M(String str, Certificate[] certificateArr) {
        Set set;
        A00();
        try {
            BM8 bm8 = this.A00;
            Set set2 = (Set) bm8.A00.get(str);
            int indexOf = str.indexOf(46);
            Set<AnonymousClass92V> set3 = null;
            if (indexOf != str.lastIndexOf(46)) {
                set = (Set) bm8.A00.get(AnonymousClass000.A0E("*.", str.substring(indexOf + 1)));
            } else {
                set = null;
            }
            if (!(set2 == null && set == null)) {
                if (set2 == null || set == null) {
                    set3 = set;
                    if (set2 != null) {
                        set3 = set2;
                    }
                } else {
                    set3 = new LinkedHashSet<>();
                    set3.addAll(set2);
                    set3.addAll(set);
                }
            }
            if (set3 != null) {
                X509Certificate[] A002 = BM9.A00(certificateArr, bm8.A01);
                int length = A002.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    if (!set3.contains(BM8.A00(AnonymousClass92V.A00(A002[i2].getPublicKey().getEncoded())))) {
                        i2++;
                    } else {
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder("Certificate pinning failure!");
                sb.append("\n  Peer certificate chain:");
                while (i < length) {
                    X509Certificate x509Certificate = A002[i];
                    sb.append("\n    ");
                    if (x509Certificate instanceof X509Certificate) {
                        sb.append(AnonymousClass000.A0E("sha1/", Base64.encodeToString(BM8.A00(AnonymousClass92V.A00(x509Certificate.getPublicKey().getEncoded())).A00, 2)));
                        sb.append(": ");
                        sb.append(x509Certificate.getSubjectDN().getName());
                        i++;
                    } else {
                        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
                    }
                }
                sb.append("\n  Pinned certificates for ");
                sb.append(str);
                sb.append(":");
                for (AnonymousClass92V r1 : set3) {
                    sb.append("\n    sha1/");
                    sb.append(Base64.encodeToString(r1.A00, 2));
                }
                throw new SSLPeerUnverifiedException(sb.toString());
            }
        } catch (CertificateException e) {
            throw new SSLPeerUnverifiedException(e.toString());
        } catch (SSLPeerUnverifiedException e2) {
            AnonymousClass0QD.A09("ssl_pin_error", e2);
            throw e2;
        }
    }

    public final String[] getDefaultCipherSuites() {
        A00();
        return this.A01.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        A00();
        return this.A01.getSupportedCipherSuites();
    }

    public BM7() {
    }

    public BM7(boolean z) {
        this.A02 = z;
    }

    public final Socket createSocket(String str, int i) {
        throw new UnsupportedOperationException("Shouldn't be called for SSLSocketFactory");
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        throw new UnsupportedOperationException("Shouldn't be called for SSLSocketFactory");
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        throw new UnsupportedOperationException("Shouldn't be called for SSLSocketFactory");
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        throw new UnsupportedOperationException("Shouldn't be called for SSLSocketFactory");
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        AnonymousClass0NG r5;
        A00();
        SSLSocket sSLSocket = (SSLSocket) this.A01.createSocket(socket, str, i, z);
        synchronized (AnonymousClass0NG.class) {
            if (AnonymousClass0NG.A04 == null) {
                AnonymousClass0NG.A04 = new AnonymousClass0NG();
            }
            r5 = AnonymousClass0NG.A04;
        }
        if (!r5.A03 || !r5.A00.isInstance(sSLSocket)) {
            return sSLSocket;
        }
        try {
            r5.A02.invoke(sSLSocket, new Object[]{true});
            r5.A01.invoke(sSLSocket, new Object[]{str});
            return sSLSocket;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
