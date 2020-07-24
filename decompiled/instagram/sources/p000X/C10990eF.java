package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0eF  reason: invalid class name and case insensitive filesystem */
public final class C10990eF implements C07190Sc {
    public static final AnonymousClass0Sw A0F = AnonymousClass0Sw.A00();
    public C07240Sh A00;
    public final SharedPreferences A01;
    public final Handler A02;
    public final C07260Sj A03;
    public final AnonymousClass0TQ A04;
    public final Runnable A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Queue A09 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final Context A0B;
    public final C07250Si A0C;
    public final C10080cd A0D;
    public final String A0E;

    public C10990eF(Context context, String str, AnonymousClass0TQ r7, C10080cd r8, SharedPreferences sharedPreferences, AnonymousClass0TQ r10, String str2, String str3, String str4) {
        this.A0B = context;
        this.A0E = str;
        this.A01 = sharedPreferences;
        this.A04 = r10;
        this.A08 = str4;
        this.A07 = str3;
        this.A06 = "567310203415052";
        this.A02 = new C07270Sk(this, context.getMainLooper());
        this.A05 = new C07280Sl(this);
        this.A0C = new C07250Si(context.getApplicationContext(), this.A0E);
        this.A03 = new C07260Sj(context.getApplicationContext(), this.A0E, r7, str2);
        this.A0D = r8;
        if (this.A00 != null) {
            A00(this);
        }
        C07240Sh r3 = new C07240Sh();
        r3.A04 = this.A07;
        r3.A05 = this.A08;
        String string = this.A01.getString("fb_uid", "");
        r3.A06 = TextUtils.isEmpty(string) ? "0" : string;
        r3.A03 = this.A06;
        r3.A02 = this.A04;
        this.A00 = r3;
    }

    public static void A00(C10990eF r10) {
        if (!r10.A00.A07.isEmpty()) {
            C07250Si r2 = r10.A0C;
            C07240Sh r8 = r10.A00;
            if (!r2.A00.exists() && !r2.A00.mkdir()) {
                AnonymousClass0DB.A0D("AnalyticsStorage", "Unable to open analytics storage.");
            }
            File file = r2.A00;
            Object[] objArr = new Object[2];
            if (r8.A08 == null) {
                r8.A08 = UUID.randomUUID();
            }
            objArr[0] = r8.A08.toString();
            objArr[1] = Integer.valueOf(r8.A00);
            File file2 = new File(file, String.format((Locale) null, "%s_%d.batch", objArr));
            if (file2.exists() && !file2.delete()) {
                AnonymousClass0DB.A0K("AnalyticsStorage", "File %s was not deleted", file2);
            }
            r8.A01 = System.currentTimeMillis();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF8");
                    try {
                        outputStreamWriter.write(r8.toString());
                    } catch (IOException e) {
                        AnonymousClass0DB.A0N("AnalyticsStorage", e, "failed to write session to file");
                    } catch (Throwable th) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e2) {
                            AnonymousClass0DB.A0N("AnalyticsStorage", e2, "failed to close writer");
                        }
                        throw th;
                    }
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e3) {
                        AnonymousClass0DB.A0N("AnalyticsStorage", e3, "failed to close writer");
                    }
                } catch (UnsupportedEncodingException e4) {
                    AnonymousClass0DB.A0N("AnalyticsStorage", e4, "UTF8 encoding is not supported");
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        AnonymousClass0DB.A0N("AnalyticsStorage", e5, "failed to close output stream");
                    }
                }
            } catch (FileNotFoundException e6) {
                AnonymousClass0DB.A0Q("AnalyticsStorage", e6, "Batch file creation failed %s", file2);
            }
            C07240Sh r1 = r10.A00;
            r1.A07.clear();
            r1.A00++;
        }
    }

    public static void A01(C10990eF r3, Runnable runnable) {
        r3.A09.add(runnable);
        if (r3.A0A.compareAndSet(false, true)) {
            AnonymousClass0Z9.A03(A0F, r3.A05, -1778251650);
        }
    }

    public final void reportEvent(C07180Sb r4) {
        C10080cd r1 = this.A0D;
        boolean z = false;
        if (r1.A02 || r1.A01.getBoolean(C08400Ww.ANALYTIC_IS_EMPLOYEE.A01, false)) {
            z = true;
        }
        if (z) {
            A01(this, new C07290Sm(this, r4));
        }
    }
}
