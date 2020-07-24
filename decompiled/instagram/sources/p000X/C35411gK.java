package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextPaint;
import com.facebook.C0003R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.p003io.Closeables;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1gK  reason: invalid class name and case insensitive filesystem */
public final class C35411gK extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass1GP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35411gK(AnonymousClass1GP r5) {
        super(519, 2, false, true);
        this.A00 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:200:0x045a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0460, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04eb, code lost:
        r3 = r2.A0T.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04ef, code lost:
        if (r1 == null) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04f1, code lost:
        r1 = "SUCCESS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04f3, code lost:
        p000X.AnonymousClass1GP.A06(r2, r3, "undefined", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04fa, code lost:
        r1 = "FAIL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01aa, code lost:
        if (r0.A00 <= 0) goto L_0x01ac;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:127:0x0251, B:147:0x0324] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0156 A[SYNTHETIC, Splitter:B:69:0x0156] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018e  */
    public final void run() {
        boolean z;
        Bitmap bitmap;
        AnonymousClass0R7 r1;
        Bitmap bitmap2;
        AnonymousClass1FY r5;
        C35531gW r12;
        boolean z2;
        AnonymousClass1FY r14;
        int i;
        int i2;
        AnonymousClass1GP r2 = this.A00;
        AnonymousClass0R7 r13 = r2.A0T.A09;
        if (r13 != null) {
            r13.All(r2.A0E.A03);
        }
        if (this.A00.A0Q == Constants.ZERO) {
            this.A00.A0Q = Constants.ONE;
        }
        boolean z3 = false;
        if (this.A00.A0Q != Constants.A0C) {
            String A03 = AnonymousClass12C.A03(this.A00.A0E);
            if (this.A00.A0F.A03) {
                this.A00.A0T.A0B.A00().Bac(A03);
            }
            AnonymousClass1GP r22 = this.A00;
            C35431gM r7 = new C35431gM(r22.A0T.A0B, r22.A0E, A03);
            boolean A0A = r22.A0A();
            int i3 = this.A00.A0P;
            AnonymousClass0R7 r52 = this.A00.A0T.A09;
            C35441gN A002 = r7.A01.A04.A00();
            try {
                r14 = new AnonymousClass1FY();
                if (r52 != null) {
                    r52.Alf(r7.A00.A03);
                }
                r14 = r7.A01.A00().Aam(r7.A02);
                boolean z4 = false;
                if (r14.A01()) {
                    z4 = true;
                    AnonymousClass1FY r15 = ((C35511gU) r14.A00()).A00;
                    if (r15.A01()) {
                        i = ((C56252cB) r15.A00()).A00.optInt("scan", -1);
                    } else {
                        i = -1;
                    }
                    if (A0A || AnonymousClass12C.A07(i3, i)) {
                        A002.A02(((C35511gU) r14.A00()).A01);
                        if (r52 != null) {
                            r52.Ald(r7.A00.A03, A002.A00);
                        }
                    }
                } else {
                    String str = r7.A00.A03;
                    if (str.startsWith("file:/")) {
                        FileInputStream fileInputStream = null;
                        try {
                            File file = new File(Uri.parse(str).getPath());
                            FileInputStream fileInputStream2 = new FileInputStream(file);
                            try {
                                if (file.length() <= 2147483647L) {
                                    A002.A02(fileInputStream2);
                                    fileInputStream2.close();
                                    fileInputStream2.close();
                                    i = 0;
                                    if (A002.A00 > 0) {
                                        i = -1;
                                    }
                                } else {
                                    throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    } else {
                        if (r52 != null) {
                            r52.Alk(str);
                        }
                        r12 = null;
                        AnonymousClass1GP r53 = this.A00;
                        C50092Ey r6 = r53.A0T.A0B.A01;
                        if (r12 == null) {
                            r53.A08 = r12.A01;
                            r53.A03 = r12.A00;
                            int i4 = r53.A0P;
                            AnonymousClass1GP r23 = this.A00;
                            boolean z5 = !AnonymousClass12C.A07(i4, r23.A03);
                            if (z5 && (r0 = r23.A08) != null) {
                                z2 = true;
                            }
                            z2 = false;
                            if (!z5) {
                                z3 = true;
                            }
                            if (r6 != null) {
                                if (z5) {
                                    r6.A00(System.currentTimeMillis(), A03);
                                } else {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    int i5 = r23.A0P;
                                    int i6 = this.A00.A03;
                                    synchronized (r6) {
                                        C27377CAw cAw = (C27377CAw) r6.A01.get(A03);
                                        if (cAw != null) {
                                            cAw.A00(currentTimeMillis);
                                            C27375CAu.A02(r6.A02, "partial_cache_hit", cAw.A0B, cAw.A0C, currentTimeMillis, r6.A00, String.valueOf(i5), String.valueOf(i6));
                                        }
                                    }
                                }
                            }
                            z = z3;
                            z3 = z2;
                        } else {
                            if (r6 != null) {
                                r6.A03(System.currentTimeMillis(), A03, r53.A0E.A03);
                            }
                            z = true;
                        }
                    }
                }
                if (r14.A01()) {
                    Closeables.A01(((C35511gU) r14.A00()).A01);
                }
                if (r52 != null) {
                    r52.Alk(r7.A00.A03);
                }
                C15130mO r62 = r7.A01.A02;
                if (z4 && r62 != null && (i2 = A002.A00) > 0) {
                    r62.A02(r7.A02, 0, -1, (String) null, (long) i2);
                }
                r12 = new C35531gW(A002, i);
            } catch (IOException unused) {
                if (A002 != null) {
                    A002.A01();
                }
            } catch (Throwable th3) {
                if (r14.A01()) {
                    Closeables.A01(((C35511gU) r14.A00()).A01);
                }
                if (r52 != null) {
                    r52.Alk(r7.A00.A03);
                }
                throw th3;
            }
            AnonymousClass1GP r532 = this.A00;
            C50092Ey r63 = r532.A0T.A0B.A01;
            if (r12 == null) {
            }
        } else {
            z = false;
        }
        if (z3) {
            AnonymousClass1GP r16 = this.A00;
            AnonymousClass1GP.A05(r16, r16.A0T.A0H, "disk");
        } else if (z) {
            AnonymousClass1GP r24 = this.A00;
            switch (r24.A0G.intValue()) {
                case 0:
                    if (!r24.A0T.A0R) {
                        AnonymousClass1GP.A00(r24);
                    }
                    synchronized (r24.A0T.A0E) {
                        try {
                            if (r24.A0Q == Constants.A0C || r24.A01 == 0) {
                                AnonymousClass1GP.A06(r24, r24.A0T.A0H, "undefined", "CANCELLED");
                            } else {
                                if ((!r24.A0T.A0J.get()) && (r1 = r24.A0T.A09) != null) {
                                    r1.Alh(r24.A0E.A03);
                                }
                                r24.A0T.A0H.remove(r24);
                                r24.A0T.A02.A2S(r24);
                                AnonymousClass12C.A04(r24.A0T);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                    return;
                case 1:
                    AnonymousClass1GP.A06(r24, r24.A0T.A0H, "undefined", NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED);
                    return;
                case 2:
                case 3:
                    AnonymousClass12C r0 = r24.A0T;
                    Context context = r0.A06;
                    C252818e r142 = r0.A0B;
                    AnonymousClass18O r132 = r24.A0E;
                    String A032 = AnonymousClass12C.A03(r132);
                    String str2 = r24.A0H;
                    boolean z6 = false;
                    if (r24.A02 > 0) {
                        z6 = true;
                    }
                    boolean z7 = true;
                    boolean z8 = !z6;
                    boolean startsWith = r132.A03.startsWith("emoji:/");
                    Class<AnonymousClass21K> cls = AnonymousClass21K.class;
                    synchronized (cls) {
                        if (startsWith) {
                            String str3 = r132.A03.substring(7).split("//")[1];
                            synchronized (cls) {
                                try {
                                    int i7 = C06220Of.A0B(context).densityDpi;
                                    Typeface ALz = AnonymousClass19g.A00(context).ALz();
                                    if (!(AnonymousClass21K.A02 != null && AnonymousClass21K.A00 == i7 && (ALz == null || AnonymousClass21K.A07 == ALz))) {
                                        AnonymousClass21K.A00(context.getResources().getDimensionPixelSize(C0003R.dimen.default_emoji_size), i7, ALz);
                                        int round = Math.round(C06220Of.A03(context, 9));
                                        Rect rect = new Rect();
                                        AnonymousClass21K.A08.getTextBounds("😁", 0, 2, rect);
                                        AnonymousClass21K.A00 = i7;
                                        if (ALz != null) {
                                            AnonymousClass21K.A07 = ALz;
                                        }
                                        Bitmap createBitmap = Bitmap.createBitmap(rect.width() + round, rect.height() + round, Bitmap.Config.ARGB_8888);
                                        AnonymousClass21K.A02 = createBitmap;
                                        AnonymousClass21K.A04 = new Canvas(createBitmap);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    throw th;
                                }
                            }
                            AnonymousClass21K.A02.eraseColor(0);
                            AnonymousClass21K.A08.getTextBounds(str3, 0, str3.length(), AnonymousClass21K.A06);
                            Rect rect2 = AnonymousClass21K.A06;
                            AnonymousClass21K.A04.drawText(str3, ((float) AnonymousClass21K.A02.getWidth()) / 2.0f, ((((float) AnonymousClass21K.A02.getHeight()) / 2.0f) + (((float) Math.abs(rect2.top)) / 2.0f)) - (((float) rect2.bottom) / 2.0f), AnonymousClass21K.A08);
                            bitmap2 = AnonymousClass21K.A02;
                        } else {
                            String[] split = r132.A03.substring(20).split("//");
                            int parseInt = Integer.parseInt(split[1]);
                            String[] split2 = split[2].split(",");
                            synchronized (cls) {
                                int i8 = C06220Of.A0B(context).densityDpi;
                                Typeface ALz2 = AnonymousClass19g.A00(context).ALz();
                                if (!(AnonymousClass21K.A03 != null && AnonymousClass21K.A01 == i8 && (ALz2 == null || AnonymousClass21K.A07 == ALz2))) {
                                    AnonymousClass21K.A00(context.getResources().getDimensionPixelSize(C0003R.dimen.default_emoji_size), i8, ALz2);
                                    int round2 = Math.round(C06220Of.A03(context, 48));
                                    AnonymousClass21K.A01 = i8;
                                    if (ALz2 != null) {
                                        AnonymousClass21K.A07 = ALz2;
                                    }
                                    Bitmap createBitmap2 = Bitmap.createBitmap(parseInt * round2, round2, Bitmap.Config.ARGB_8888);
                                    AnonymousClass21K.A03 = createBitmap2;
                                    AnonymousClass21K.A05 = new Canvas(createBitmap2);
                                }
                            }
                            AnonymousClass21K.A03.eraseColor(0);
                            int width = AnonymousClass21K.A03.getWidth() / parseInt;
                            int height = AnonymousClass21K.A03.getHeight();
                            for (int i9 = 0; i9 < split2.length; i9++) {
                                TextPaint textPaint = AnonymousClass21K.A08;
                                String str4 = split2[i9];
                                textPaint.getTextBounds(str4, 0, str4.length(), AnonymousClass21K.A06);
                                Rect rect3 = AnonymousClass21K.A06;
                                AnonymousClass21K.A05.drawText(split2[i9], ((float) (width * i9)) + (((float) width) / 2.0f), ((((float) height) / 2.0f) + (((float) Math.abs(rect3.top)) / 2.0f)) - (((float) rect3.bottom) / 2.0f), AnonymousClass21K.A08);
                            }
                            bitmap2 = AnonymousClass21K.A03;
                        }
                        AnonymousClass1FY ACn = r142.A00().ACn(A032);
                        if (ACn.A01()) {
                            C33371co r3 = (C33371co) ACn.A00();
                            bitmap2.compress(Bitmap.CompressFormat.PNG, 75, r3);
                            r3.A04();
                        }
                    }
                    C35441gN A003 = r142.A04.A00();
                    bitmap = null;
                    try {
                        r5 = new AnonymousClass1FY();
                        AnonymousClass1FY AF0 = r142.A00().AF0(A032);
                        if (AF0.A01()) {
                            A003.A02((AnonymousClass1FV) AF0.A00());
                            A003.A01 = true;
                            if (AF0.A01()) {
                                Closeables.A01((InputStream) AF0.A00());
                            }
                            C36531iC A08 = r142.A05.A0D.A08(r132.A00, 1, A003.A02, A003.A00, -1.0f, -1, false, str2, r132.A03, z8);
                            if (A08 != null) {
                                bitmap = A08.A01;
                            }
                        }
                        A003.A01();
                    } catch (IOException unused2) {
                        A003.A01();
                    } catch (Throwable th6) {
                        A003.A01();
                        throw th6;
                    }
                    r24.A06 = bitmap;
                    if (bitmap == null) {
                        z7 = false;
                    }
                    r24.A0C = z7;
                    break;
                case 4:
                    String substring = r24.A0E.A03.substring(9);
                    AnonymousClass12C r02 = r24.A0T;
                    Context context2 = r02.A06;
                    C252818e r54 = r02.A0B;
                    String str5 = r24.A0E.A00;
                    int i10 = r24.A0L;
                    String str6 = r24.A0H;
                    boolean z9 = false;
                    if (r24.A02 > 0) {
                        z9 = true;
                    }
                    boolean z10 = true;
                    bitmap = new C37341jV(context2, r54, str5, substring, i10, str6, !z9).A00();
                    r24.A06 = bitmap;
                    if (bitmap == null) {
                        z10 = false;
                    }
                    r24.A0C = z10;
                    break;
                default:
                    throw new UnsupportedOperationException("Unsupported uri type");
            }
        } else {
            AnonymousClass1GP r25 = this.A00;
            r25.A0C = true;
            AnonymousClass1GP.A06(r25, r25.A0T.A0H, "disk", "SUCCESS");
        }
    }
}
