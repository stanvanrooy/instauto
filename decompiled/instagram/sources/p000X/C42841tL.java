package p000X;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import oauth.signpost.OAuth;

/* renamed from: X.1tL  reason: invalid class name and case insensitive filesystem */
public final class C42841tL extends AnonymousClass1N1 {
    public AnonymousClass0C1 A00;
    public C192738Lz A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    public final void A03() {
        if (this.A01 == null && !this.A07) {
            A01();
        }
        C192738Lz r1 = this.A01;
        if (r1 != null) {
            this.A01 = r1;
            if (this.A06) {
                super.A05(r1);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C192738Lz r2 = (C192738Lz) obj;
        this.A01 = r2;
        if (this.A06) {
            super.A05(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a6, code lost:
        if (r6 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3.A00 = r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00ab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00f3 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3 A[Catch:{ Exception -> 0x00fb }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5 A[Catch:{ Exception -> 0x00fb }] */
    public final /* bridge */ /* synthetic */ Object A08() {
        String str;
        C205758rO r5 = new C205758rO(this.A02, this.A03);
        List asList = Arrays.asList(new C26151Bw[]{new C26151Bw("x_auth_username", this.A05), new C26151Bw("x_auth_password", this.A04), new C26151Bw("x_auth_mode", "client_auth")});
        C192728Ly r4 = new C192728Ly();
        AnonymousClass1BZ r1 = new AnonymousClass1BZ();
        r1.A02 = this.A06;
        r1.A01 = Constants.ONE;
        r1.A00 = new C26131Bu(asList);
        AnonymousClass1C4 A002 = r1.A00();
        C255919l r12 = new C255919l();
        r12.A03 = C15920nk.Other;
        C256019m A003 = r12.A00();
        r5.sign((Object) A002);
        try {
            AnonymousClass1CA r6 = AnonymousClass1C8.A00().A01(new AnonymousClass1C3(A002, A003), (C44061vX) null).A00;
            InputStream AHT = r6.AHT();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = AHT.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            str = new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF8"));
            try {
                r6.close();
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e = e2;
            str = null;
        } catch (Throwable ) {
            throw th;
        }
        if (str != null) {
            return null;
        }
        HashMap hashMap = new HashMap(2);
        String[] split = TextUtils.split(str, "&");
        C192728Ly r3 = new C192728Ly();
        for (String split2 : split) {
            String[] split3 = split2.split("=", 2);
            hashMap.put(split3[0], split3[1]);
        }
        r3.A02 = (String) hashMap.get(OAuth.OAUTH_TOKEN);
        r3.A01 = (String) hashMap.get(OAuth.OAUTH_TOKEN_SECRET);
        return new C192738Lz(r3);
        try {
            e.printStackTrace();
            if (str != null) {
            }
        } catch (Exception e3) {
            r4.A00 = e3.getMessage();
            return new C192738Lz(r4);
        }
    }

    public final /* bridge */ /* synthetic */ void A0B(Object obj) {
        super.A0B((C192738Lz) obj);
    }

    public final void A02() {
        super.A02();
        A04();
        if (this.A01 != null) {
            this.A01 = null;
        }
    }

    public final void A04() {
        A07();
    }

    public C42841tL(Context context) {
        super(context);
    }
}
