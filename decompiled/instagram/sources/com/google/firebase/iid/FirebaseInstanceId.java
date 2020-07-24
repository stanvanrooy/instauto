package com.google.firebase.iid;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass8HS;
import p000X.B4e;
import p000X.B76;
import p000X.C204338oi;
import p000X.C51962Mu;
import p000X.C55352aU;
import p000X.C55382aY;
import p000X.C60292jf;
import p000X.C60302jg;
import p000X.C60322ji;
import p000X.C60402jq;
import p000X.C62552nu;
import p000X.C62562nv;
import p000X.C68472zB;
import p000X.C68492zD;
import p000X.C68502zE;
import p000X.C68512zF;
import p000X.C68542zI;
import p000X.C68552zJ;
import p000X.C89733uk;
import p000X.C89763un;

public class FirebaseInstanceId {
    public static C68492zD A08;
    public static ScheduledThreadPoolExecutor A09;
    public static final long A0A = TimeUnit.HOURS.toSeconds(8);
    public C68512zF A00;
    public boolean A01 = false;
    public final C51962Mu A02;
    public final C68552zJ A03;
    public final C68472zB A04;
    public final C62552nu A05;
    public final C68542zI A06;
    public final Executor A07;

    public static void A03() {
        if (!Log.isLoggable("FirebaseInstanceId", 3) && Build.VERSION.SDK_INT == 23) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
    }

    public static final synchronized void A04(FirebaseInstanceId firebaseInstanceId) {
        synchronized (firebaseInstanceId) {
            if (!firebaseInstanceId.A01) {
                firebaseInstanceId.A09(0);
            }
        }
    }

    public final synchronized void A08() {
        A08.A02();
        if (this.A03.A00()) {
            A04(this);
        }
    }

    public final synchronized void A09(long j) {
        A05(new B4e(this, this.A06, Math.min(Math.max(30, j << 1), A0A)), j);
        this.A01 = true;
    }

    public final synchronized void A0A(boolean z) {
        this.A01 = z;
    }

    public FirebaseInstanceId(C51962Mu r8, C89763un r9, C89733uk r10) {
        boolean z;
        C51962Mu.A01(r8);
        C68472zB r6 = new C68472zB(r8.A01);
        Executor A002 = C204338oi.A00();
        Executor A003 = C204338oi.A00();
        if (C68472zB.A01(r8) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (A08 == null) {
                    C51962Mu.A01(r8);
                    A08 = new C68492zD(r8.A01);
                }
            }
            this.A02 = r8;
            this.A04 = r6;
            if (this.A00 == null) {
                C51962Mu.A01(r8);
                C68512zF r2 = (C68512zF) r8.A04.A02(C68512zF.class);
                if (r2 != null) {
                    if (r2.A01.A03() != 0) {
                        this.A00 = r2;
                    }
                }
                this.A00 = new C68512zF(r8, r6, A002, r10);
            }
            this.A00 = this.A00;
            this.A07 = A003;
            this.A06 = new C68542zI(A08);
            C68552zJ r1 = new C68552zJ(this, r9);
            this.A03 = r1;
            this.A05 = new C62552nu(A002);
            if (r1.A00()) {
                if (!A0B(A06())) {
                    C68542zI r22 = this.A06;
                    synchronized (r22) {
                        z = C68542zI.A00(r22) != null;
                    }
                    if (!z) {
                        return;
                    }
                }
                A04(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static C62562nv A00(String str, String str2) {
        C62562nv r6;
        C68492zD r3 = A08;
        synchronized (r3) {
            String string = r3.A01.getString(C68492zD.A01(str, str2), (String) null);
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        r6 = new C62562nv(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("Failed to parse token: ");
                        sb.append(valueOf);
                        Log.w("FirebaseInstanceId", sb.toString());
                    }
                } else {
                    r6 = new C62562nv(string, (String) null, 0);
                }
            }
            r6 = null;
        }
        return r6;
    }

    public static final Object A01(FirebaseInstanceId firebaseInstanceId, C60302jg r4) {
        try {
            return C60402jq.A01(r4, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    firebaseInstanceId.A08();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007c A[SYNTHETIC, Splitter:B:39:0x007c] */
    public static String A02() {
        C55352aU r1;
        C68492zD r3 = A08;
        synchronized (r3) {
            r1 = (C55352aU) r3.A03.get("");
            if (r1 == null) {
                try {
                    C68502zE r7 = r3.A02;
                    Context context = r3.A00;
                    try {
                        File A042 = C68502zE.A04(context);
                        if (!A042.exists()) {
                            r1 = null;
                        } else {
                            try {
                                r1 = C68502zE.A02(A042);
                            } catch (AnonymousClass8HS | IOException e) {
                                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                    String.valueOf(e);
                                }
                                r1 = C68502zE.A02(A042);
                            }
                        }
                        if (r1 != null) {
                            C68502zE.A06(context, r1);
                            if (r1 == null) {
                                r1 = r7.A09(context);
                            }
                            r3.A03.put("", r1);
                        } else {
                            e = null;
                            try {
                                r1 = C68502zE.A01(context.getSharedPreferences("com.google.android.gms.appid", 0));
                                if (r1 != null) {
                                    C68502zE.A00(context, r1, false);
                                    if (r1 == null) {
                                    }
                                    r3.A03.put("", r1);
                                }
                            } catch (AnonymousClass8HS e2) {
                                e = e2;
                            }
                            if (e == null) {
                                r1 = null;
                                if (r1 == null) {
                                }
                                r3.A03.put("", r1);
                            } else {
                                throw e;
                            }
                        }
                    } catch (IOException e3) {
                        String valueOf = String.valueOf(e3);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                        sb.append("IID file exists, but failed to read from it: ");
                        sb.append(valueOf);
                        Log.w("FirebaseInstanceId", sb.toString());
                        throw new AnonymousClass8HS(e3);
                    } catch (AnonymousClass8HS e4) {
                        e = e4;
                    }
                } catch (AnonymousClass8HS unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    getInstance(C51962Mu.A00()).A08();
                    r1 = r3.A02.A09(r3.A00);
                }
            }
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(r1.A01.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused2) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static void A05(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (A09 == null) {
                A09 = new ScheduledThreadPoolExecutor(1, new B76("FirebaseInstanceId"));
            }
            A09.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static FirebaseInstanceId getInstance(C51962Mu r2) {
        C51962Mu.A01(r2);
        return (FirebaseInstanceId) r2.A04.A02(FirebaseInstanceId.class);
    }

    public final C62562nv A06() {
        return A00(C68472zB.A01(this.A02), "*");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        if (r6.equals(r8.A02) == false) goto L_0x001e;
     */
    public final boolean A0B(C62562nv r8) {
        boolean z;
        if (r8 == null) {
            return true;
        }
        String A052 = this.A04.A05();
        if (System.currentTimeMillis() <= r8.A00 + C62562nv.A03) {
            z = false;
        }
        z = true;
        if (!z) {
            return false;
        }
        return true;
    }

    public final String A07(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            C60292jf r2 = new C60292jf();
            r2.A0I((Object) null);
            return ((C55382aY) A01(this, r2.A05(this.A07, new C60322ji(this, str, str2)))).A00;
        }
        throw new IOException("MAIN_THREAD");
    }
}
