package p000X;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.HashMap;

/* renamed from: X.B9l */
public final class B9l {
    public static B9l A01;
    public final HashMap A00 = new HashMap();

    public static String A00(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    public final String A01(int i) {
        String str = (String) this.A00.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a2 A[SYNTHETIC, Splitter:B:18:0x00a2] */
    public B9l(Context context) {
        BufferedInputStream bufferedInputStream;
        int read;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.publicSourceDir)), 1024);
            try {
                MessageDigest instance = MessageDigest.getInstance(B8q.A00(Constants.A0C));
                MessageDigest instance2 = MessageDigest.getInstance(B8q.A00(Constants.ONE));
                MessageDigest instance3 = MessageDigest.getInstance(B8q.A00(Constants.ZERO));
                byte[] bArr = new byte[1024];
                do {
                    read = bufferedInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                        instance2.update(bArr, 0, read);
                        instance3.update(bArr, 0, read);
                    }
                } while (read != -1);
                this.A00.put(10003, A00(instance.digest()));
                this.A00.put(10004, A00(instance2.digest()));
                this.A00.put(10005, A00(instance3.digest()));
            } catch (Throwable th) {
                th = th;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                C54802Yz.A00(th2);
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
            }
            throw th;
        }
    }
}
