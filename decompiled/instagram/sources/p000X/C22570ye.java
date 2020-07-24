package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ParcelFormatException;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* renamed from: X.0ye  reason: invalid class name and case insensitive filesystem */
public final class C22570ye extends C22580yf {
    public SecretKey A00;
    public final SharedPreferences A01;
    public final String A02;

    public final String A04() {
        return "SymmetricTransformer";
    }

    public static synchronized C22590yg A00(Context context, String str) {
        C22570ye r0;
        synchronized (C22570ye.class) {
            String A0E = AnonymousClass000.A0E(str, "_single");
            SecretKey secretKey = null;
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((InputStream) null, (char[]) null);
                if (instance.containsAlias(A0E)) {
                    KeyStore.Entry entry = instance.getEntry(A0E, (KeyStore.ProtectionParameter) null);
                    if (entry instanceof KeyStore.SecretKeyEntry) {
                        secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
                    }
                }
            } catch (ParcelFormatException | IOException | NullPointerException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException e) {
                AnonymousClass0QD.A09("SymmetricTransformer", e);
            }
            if (secretKey == null) {
                secretKey = A01(str);
            }
            if (secretKey != null) {
                r0 = new C22570ye(context, str, secretKey);
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        p000X.AnonymousClass0QD.A09("SymmetricTransformer", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        p000X.AnonymousClass0QD.A09("SymmetricTransformer", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004f A[ExcHandler: IOException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException | CertificateException (r0v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x000b] */
    public static SecretKey A01(String str) {
        String A0E = AnonymousClass000.A0E(str, "_single");
        try {
            KeyStore.getInstance("AndroidKeyStore").load((InputStream) null, (char[]) null);
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(A0E, 3).setBlockModes(new String[]{"GCM"}).setRandomizedEncryptionRequired(true).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(128).build());
            return instance.generateKey();
        } catch (IOException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException | CertificateException e) {
        }
    }

    public final SharedPreferences A03() {
        return this.A01;
    }

    public final SecretKey A05(boolean z) {
        if (z) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((KeyStore.LoadStoreParameter) null);
                instance.deleteEntry(this.A02);
                this.A00 = A01(this.A02);
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                AnonymousClass0QD.A09(A04(), e);
            }
        }
        SecretKey secretKey = this.A00;
        if (secretKey != null) {
            return secretKey;
        }
        throw new InvalidKeyException("no secret key");
    }

    public final C14290kD AZD() {
        return C14290kD.SINGLE;
    }

    public final String getName() {
        return this.A02;
    }

    public C22570ye(Context context, String str, SecretKey secretKey) {
        this.A02 = str;
        this.A00 = secretKey;
        this.A01 = context.getSharedPreferences(str, 0);
    }
}
