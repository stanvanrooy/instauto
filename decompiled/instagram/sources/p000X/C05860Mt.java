package p000X;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.UUID;

/* renamed from: X.0Mt  reason: invalid class name and case insensitive filesystem */
public final class C05860Mt {
    public static final long A01 = System.currentTimeMillis();
    public static final C05860Mt A02 = new C05860Mt();
    public static final Class A03 = C05860Mt.class;
    public static final String[] A04 = {"9774d56d682e549c", "9d1d1f0dfa440886", "fc067667235b8f19"};
    public String A00 = null;

    public final synchronized String A05(Context context) {
        String str;
        if (A03(this.A00)) {
            str = this.A00;
        } else {
            str = getCustomUuidHelper(new File("/mnt/sdcard/.profig.os"), new File(context.getFilesDir(), "INSTALLATION"));
        }
        return str;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0016 */
    public static void A02(File file, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static boolean A03(String str) {
        if (str == null || TextUtils.isEmpty(str) || !str.matches("[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}")) {
            return false;
        }
        return true;
    }

    public final String A04() {
        try {
            return A05(AnonymousClass0QO.A00);
        } catch (RuntimeException e) {
            AnonymousClass0DB.A05(A03, "filesystem unavailable", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 != false) goto L_0x0023;
     */
    public static final String A00(Context context) {
        boolean z;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != null && !TextUtils.isEmpty(string)) {
            String[] strArr = A04;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (strArr[i].equalsIgnoreCase(string)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        string = "";
        return AnonymousClass000.A0E("android-", string);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0028 */
    public static String A01(File file) {
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                byte[] bArr = new byte[((int) randomAccessFile.length())];
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                return new String(bArr);
            } catch (IOException unused) {
            } catch (Throwable ) {
                throw th;
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:14|15|16|17|18|19|23|(1:25)(2:28|29)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x008a */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    public String getCustomUuidHelper(File file, File file2) {
        String A012 = A01(file);
        this.A00 = A012;
        if (!A03(A012)) {
            String A013 = A01(file2);
            this.A00 = A013;
            if (A013 != null) {
                A02(file, A013);
            }
        } else if (!file2.exists()) {
            A02(file2, this.A00);
        }
        if (!A03(this.A00)) {
            String uuid = UUID.randomUUID().toString();
            String[] split = uuid.split("-");
            if (split.length >= 2) {
                String hexString = Integer.toHexString(new Random().nextInt(15));
                String hexString2 = Long.toHexString(((System.currentTimeMillis() - A01) / 1000) + 1635);
                uuid = uuid.replaceFirst(split[1], String.format("%s%s", new Object[]{hexString, hexString2}));
            }
            Class cls = A03;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(uuid.getBytes());
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                A02(file, uuid);
                String A014 = A01(file2);
                if (!A03(A014)) {
                    this.A00 = A014;
                } else {
                    throw new RuntimeException("Failed to read installation file and create a valid UUID");
                }
            } catch (IOException e) {
                AnonymousClass0DB.A05(cls, "Failed to generate internal installation file.", e);
                throw new RuntimeException(e);
            }
        }
        return this.A00;
    }
}
