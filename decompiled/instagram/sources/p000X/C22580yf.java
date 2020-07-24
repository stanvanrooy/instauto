package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: X.0yf  reason: invalid class name and case insensitive filesystem */
public abstract class C22580yf implements C22590yg {
    public abstract SharedPreferences A03();

    public abstract String A04();

    public abstract SecretKey A05(boolean z);

    public final OutputStream AX2(Context context) {
        CipherOutputStream cipherOutputStream;
        try {
            File file = new File(A02(context));
            if (file.exists()) {
                file.delete();
            } else {
                new File(file.getParent()).mkdirs();
            }
            file.createNewFile();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, A05(true));
            cipherOutputStream = new CipherOutputStream(bufferedOutputStream, instance);
            try {
                A03().edit().putString(getName(), Base64.encodeToString(instance.getIV(), 0)).apply();
                return cipherOutputStream;
            } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                e = e;
                AnonymousClass0QD.A09(A04(), e);
                return cipherOutputStream;
            }
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            e = e2;
            cipherOutputStream = null;
            AnonymousClass0QD.A09(A04(), e);
            return cipherOutputStream;
        }
    }

    public final InputStream Bqd(Context context) {
        GCMParameterSpec gCMParameterSpec;
        try {
            String string = A03().getString(getName(), (String) null);
            if (string != null) {
                gCMParameterSpec = new GCMParameterSpec(128, Base64.decode(string, 0));
            } else {
                gCMParameterSpec = null;
            }
            if (gCMParameterSpec == null) {
                return null;
            }
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, A05(false), gCMParameterSpec);
            return new CipherInputStream(new BufferedInputStream(new FileInputStream(A02(context))), instance);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            AnonymousClass0QD.A09(A04(), e);
            return null;
        }
    }

    private String A02(Context context) {
        return context.getFilesDir().getCanonicalPath() + '/' + AZD().A00 + '/' + getName();
    }
}
