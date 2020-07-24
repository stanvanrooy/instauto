package p000X;

import android.util.Base64;
import com.facebook.cryptopub.CryptoPubNative;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DFM */
public final class DFM {
    // A00 = storedEncryptionPrefs
    // A04 = encryptionArgs
    // A05 = cryptoPub
    public static int A03 = 2;
    public static final StoredDataAboutEncryptionArgs encryptionArgs = new StoredDataAboutEncryptionArgs(41, "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvcu1KMDR1vzuBr9iYKW8\nKWmhT8CVUBRkchiO8861H7zIOYRwkQrkeHA+0mkBo3Ly1PiLXDkbKQZyeqZbspke\n4e7WgFNwT23jHfRMV/cNPxjPEy4kxNEbzLET6GlWepGdXFhzHfnS1PinGQzj0ZOU\nZM3pQjgGRL9fAf8brt1ewhQ5XtpvKFdPyQq5BkeFEDKoInDsC/yKDWRAx2twgPFr\nCYUzAB8/yXuL30ErTHT79bt3yTnv1fRtE19tROIlBuqruwSBk9gGq/LuvSECgsl5\nz4VcpHXhgZt6MhrAj6y9vAAxO2RVrt0Mq4OY4HgyYz9Wlr1vAxXXGAAYIvrhAYLP\n7QIDAQAB\n-----END PUBLIC KEY-----\n", 0);
    public static final CryptoPubNative cryptoPub = new CryptoPubNative();
    public static final AtomicBoolean A06 = new AtomicBoolean(false);
    public StoredPasswordEncryptionPrefs storedEncryptionPrefs;
    public Integer A01;
    public DFP A02;

    public static DFO A00(String str, String str2) {
        try {
            CryptoPubNative cryptoPubNative = cryptoPub;
            StoredDataAboutEncryptionArgs encArgs = encryptionArgs;
            return new DFO("", 0, Base64.encodeToString(cryptoPubNative.encrypt(encArgs.encryptionKeyId, encArgs.encryptionPublicKey, str, str2), 2), new PasswordEmptyException("Default key used.", Constants.ZERO));
        } catch (Exception e) {
            return new DFO("", 0, str, new PasswordEmptyException(e, Constants.ONE));
        }
    }

    public DFM(StoredPasswordEncryptionPrefs encryptionPrefs, DFP dfp, Integer num) {
        this.storedEncryptionPrefs = encryptionPrefs;
        this.A02 = dfp;
        this.A01 = num;
    }
}
