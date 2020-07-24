package p000X;

import com.facebook.xzdecoder.XzInputStream;
import java.io.InputStream;

/* renamed from: X.0c0  reason: invalid class name and case insensitive filesystem */
public final class C09780c0 extends AnonymousClass0YB {
    public int A00;
    public final InputStream A01;
    public final /* synthetic */ C09760by A02;

    public final AnonymousClass0YA A00() {
        AnonymousClass0YA r1;
        while (true) {
            r1 = null;
            int i = this.A00;
            C09800c4[] r2 = this.A02.A02;
            if (i >= r2.length) {
                break;
            }
            this.A00 = i + 1;
            C09800c4 r3 = r2[i];
            AnonymousClass0YG r22 = new AnonymousClass0YG(this, r3.A02);
            try {
                r1 = new AnonymousClass0YA(r3, r22);
                if (r3.A00) {
                    break;
                }
                r1.close();
            } catch (Throwable th) {
                r22.close();
                throw th;
            }
        }
        return r1;
    }

    public C09780c0(C09760by r10) {
        Throwable th;
        String str;
        InputStream inputStream;
        this.A02 = r10;
        InputStream inputStream2 = r10.A01.getInputStream(r10.A00);
        try {
            Integer num = r10.A03.A00;
            if (num == Constants.ZERO) {
                inputStream = new XzInputStream(inputStream2);
            } else if (num == Constants.ONE) {
                try {
                    inputStream = (InputStream) Class.forName("com.facebook.zstd.ZstdInputStream").getConstructor(new Class[]{InputStream.class}).newInstance(new Object[]{inputStream2});
                } catch (Exception e) {
                    th = new IllegalArgumentException(e);
                    throw th;
                }
            } else {
                Integer num2 = Constants.A0C;
                if (num == num2 || num == Constants.A0N) {
                    if (num == num2) {
                        str = "xz";
                    } else {
                        str = "zst";
                    }
                    inputStream = (InputStream) Class.forName("com.facebook.superpack.SuperpackFileInputStream").getMethod("createFromSingletonArchiveInputStream", new Class[]{InputStream.class, String.class}).invoke((Object) null, new Object[]{inputStream2, str});
                } else {
                    throw new IllegalStateException("Unknown compression algorithm");
                }
            }
            this.A01 = inputStream;
            if (!A01()) {
                close();
            }
        } catch (Exception e2) {
            th = new RuntimeException("Could not access Superpack archive", e2);
        } catch (Throwable th2) {
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th2;
        }
    }

    public final boolean A01() {
        int length;
        int i = this.A00;
        while (true) {
            C09800c4[] r0 = this.A02.A02;
            length = r0.length;
            if (i < length && !r0[i].A00) {
                i++;
            }
        }
        if (i < length) {
            return true;
        }
        return false;
    }

    public final void close() {
        this.A01.close();
    }
}
