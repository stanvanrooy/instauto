package p000X;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Vn  reason: invalid class name and case insensitive filesystem */
public final class C08070Vn {
    public static final byte[] A0M = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass0TQ A0A;
    public final AnonymousClass0TZ A0B;
    public final AnonymousClass0UT A0C;
    public final AnonymousClass0UV A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final Map A0H;
    public final AtomicInteger A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b1, code lost:
        throw new p000X.C08060Vm();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x00a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00ac */
    public C08070Vn(String str, String str2, int i, int i2, boolean z, AnonymousClass0UT r15, String str3, String str4, String str5, AnonymousClass0TZ r19, AtomicInteger atomicInteger, int i3, int i4, int i5, int i6, int i7, int i8, AnonymousClass0TQ r27, List list, boolean z2, boolean z3, Map map) {
        String str6;
        C08060Vm r0;
        this.A00 = str;
        this.A01 = str2;
        this.A06 = i;
        this.A02 = i2;
        this.A0L = z;
        this.A0C = r15;
        String str7 = str3;
        this.A0D = new AnonymousClass0UV(str7, str4, Long.MAX_VALUE);
        this.A0E = str5;
        AnonymousClass0TZ r1 = r19;
        this.A0B = r1;
        this.A0I = atomicInteger;
        this.A03 = i3;
        this.A08 = i4;
        this.A04 = i5;
        this.A07 = i6;
        this.A05 = i7;
        this.A09 = i8;
        this.A0A = r27;
        this.A0G = list;
        this.A0K = z2;
        this.A0J = z3;
        try {
            byte[] bytes = AnonymousClass000.A0P(r1.A01(), " ", (String) r15.second, " ", str7, " ").getBytes("utf-8");
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(bytes, 0, bytes.length);
                StringBuilder sb = new StringBuilder(r4);
                for (byte b : instance.digest()) {
                    byte b2 = b & 255;
                    byte[] bArr = A0M;
                    sb.append((char) bArr[b2 >>> 4]);
                    sb.append((char) bArr[b2 & 15]);
                }
                str6 = sb.toString();
                this.A0F = str6;
                this.A0H = map;
            } catch (NoSuchAlgorithmException ) {
                r0 = new C08060Vm();
                throw r0;
            } catch (UnsupportedEncodingException unused) {
                r0 = new C08060Vm();
                throw r0;
            }
        } catch (C08060Vm unused2) {
            str6 = null;
        }
    }
}
