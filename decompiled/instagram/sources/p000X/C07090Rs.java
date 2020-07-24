package p000X;

import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;

/* renamed from: X.0Rs  reason: invalid class name and case insensitive filesystem */
public final class C07090Rs implements C26141Bv {
    public static final C17190pp A03 = new C17190pp("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    public final C06650Pw A00;
    public final String A01;
    public final String A02;

    public final C17190pp AIj() {
        return null;
    }

    public static String A00(boolean z, String str, String str2) {
        String str3;
        if (z) {
            str3 = "format=json&compressed=0&multi_batch=1&sent_time=";
        } else {
            str3 = "format=json&compressed=0&sent_time=";
        }
        return AnonymousClass000.A0O(str3, str2, "&access_token=", str, "&message=");
    }

    public final C17190pp AIn() {
        return A03;
    }

    public final InputStream BWa() {
        if (this.A00.Aex()) {
            return new SequenceInputStream(new ByteArrayInputStream(A00(this.A00.Agc(), this.A01, this.A02).getBytes()), this.A00.BWa());
        }
        return new SequenceInputStream(new ByteArrayInputStream(A00(this.A00.Agc(), this.A01, this.A02).getBytes()), new C07070Rq(new InputStreamReader(this.A00.BWa(), C07070Rq.A08), new CharArrayWriter()));
    }

    public final long getContentLength() {
        if (this.A00.Aex()) {
            C06650Pw r3 = this.A00;
            return (long) (A00(r3.Agc(), this.A01, this.A02).length() + r3.ATZ());
        }
        try {
            InputStream BWa = BWa();
            int i = 0;
            while (BWa.read() != -1) {
                i++;
            }
            BWa.close();
            return (long) i;
        } catch (IOException unused) {
            return 0;
        }
    }

    public C07090Rs(C06650Pw r1, String str, String str2) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = str2;
    }
}
