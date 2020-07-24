package p000X;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;

/* renamed from: X.BM9 */
public final class BM9 {
    public static X509Certificate[] A00(Certificate[] certificateArr, AnonymousClass0IS r9) {
        boolean z;
        LinkedList linkedList = new LinkedList();
        X509Certificate x509Certificate = certificateArr[0];
        boolean A01 = r9.A01(x509Certificate);
        linkedList.add(x509Certificate);
        boolean z2 = true;
        int i = 1;
        while (i < certificateArr.length) {
            X509Certificate x509Certificate2 = certificateArr[i];
            X509Certificate x509Certificate3 = certificateArr[i - 1];
            if (r9.A01(x509Certificate2)) {
                A01 = true;
            }
            if (!x509Certificate2.getSubjectX500Principal().equals(x509Certificate3.getIssuerX500Principal())) {
                z = false;
            } else {
                try {
                    x509Certificate3.verify(x509Certificate2.getPublicKey());
                    z = true;
                } catch (GeneralSecurityException unused) {
                    z = false;
                }
            }
            if (!z) {
                break;
            }
            linkedList.add(x509Certificate2);
            i++;
        }
        X509Certificate x509Certificate4 = certificateArr[i - 1];
        X509Certificate x509Certificate5 = (X509Certificate) r9.A01.get(x509Certificate4.getIssuerX500Principal());
        X509Certificate x509Certificate6 = null;
        if (x509Certificate5 != null && !x509Certificate5.getSubjectX500Principal().equals(x509Certificate4.getSubjectX500Principal())) {
            try {
                x509Certificate4.verify(x509Certificate5.getPublicKey());
                x509Certificate6 = x509Certificate5;
            } catch (GeneralSecurityException unused2) {
            }
        }
        if (x509Certificate6 != null) {
            linkedList.add(x509Certificate6);
        } else {
            z2 = A01;
        }
        if (z2) {
            return (X509Certificate[]) linkedList.toArray(new X509Certificate[linkedList.size()]);
        }
        throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
    }
}
