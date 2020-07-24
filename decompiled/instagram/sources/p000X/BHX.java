package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.BHX */
public final class BHX extends C22580yf {
    public byte[] A00;
    public final KeyStore.PrivateKeyEntry A01;
    public final SharedPreferences A02;
    public final String A03;

    public final String A04() {
        return "AsymmetricTransformer";
    }

    public final SecretKey A05(boolean z) {
        SecretKey secretKey;
        byte[] bArr;
        if ((this.A00 != null || this.A02.contains(this.A03)) && !z) {
            if (this.A00 == null) {
                this.A00 = Base64.decode(this.A02.getString(this.A03, (String) null), 0);
            }
            byte[] bArr2 = this.A00;
            try {
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(4, this.A01.getPrivateKey());
                secretKey = (SecretKey) instance.unwrap(bArr2, "AES", 3);
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                AnonymousClass0QD.A09(A04(), e);
                secretKey = null;
            }
        } else {
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            secretKey = new SecretKeySpec(bArr3, "AES/GCM/NoPadding");
            try {
                Cipher instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance2.init(3, this.A01.getCertificate().getPublicKey());
                bArr = instance2.wrap(secretKey);
            } catch (InvalidKeyException | NoSuchAlgorithmException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                AnonymousClass0QD.A09(A04(), e2);
                bArr = null;
            }
            this.A00 = bArr;
            this.A02.edit().putString(this.A03, Base64.encodeToString(this.A00, 0)).apply();
        }
        if (secretKey != null) {
            return secretKey;
        }
        throw new InvalidKeyException("No key found");
    }

    public BHX(Context context, String str, KeyStore.PrivateKeyEntry privateKeyEntry) {
        this.A03 = str;
        this.A01 = privateKeyEntry;
        this.A02 = context.getSharedPreferences("pair_prefs", 0);
    }

    public final SharedPreferences A03() {
        return this.A02;
    }

    public final C14290kD AZD() {
        return C14290kD.PAIR;
    }

    public final String getName() {
        return this.A03;
    }
}
