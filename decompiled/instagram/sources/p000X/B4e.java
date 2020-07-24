package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;

/* renamed from: X.B4e */
public final class B4e implements Runnable {
    public final FirebaseInstanceId A00;
    public final long A01;
    public final PowerManager.WakeLock A02;
    public final C68542zI A03;

    public final Context A00() {
        C51962Mu r0 = this.A00.A02;
        C51962Mu.A01(r0);
        return r0.A01;
    }

    public B4e(FirebaseInstanceId firebaseInstanceId, C68542zI r5, long j) {
        this.A00 = firebaseInstanceId;
        this.A03 = r5;
        this.A01 = j;
        PowerManager.WakeLock A002 = AnonymousClass0ZP.A00((PowerManager) A00().getSystemService("power"), 1, "fiid-sync");
        this.A02 = A002;
        AnonymousClass0ZP.A03(A002);
    }

    public final boolean A01() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) A00().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02e3, code lost:
        if (r0 == false) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02e5, code lost:
        r14.A00.A0A(false);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117 A[Catch:{ IOException | SecurityException -> 0x00f3, all -> 0x0318 }] */
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        B57 b57;
        String string;
        String str;
        String str2;
        String str3;
        IOException iOException;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        try {
            if (C25152B3h.A00().A01(A00())) {
                AnonymousClass0ZP.A01(this.A02);
            }
            this.A00.A0A(true);
            boolean z4 = false;
            if (this.A00.A00.A01.A03() != 0) {
                z4 = true;
            }
            if (!z4) {
                this.A00.A0A(false);
            } else {
                C25152B3h A002 = C25152B3h.A00();
                Context A003 = A00();
                if (A002.A01 == null) {
                    boolean z5 = false;
                    if (A003.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                        z5 = true;
                    }
                    A002.A01 = Boolean.valueOf(z5);
                }
                if (!A002.A00.booleanValue()) {
                    Log.isLoggable("FirebaseInstanceId", 3);
                }
                if (!A002.A01.booleanValue() || A01()) {
                    C62562nv A06 = this.A00.A06();
                    if (this.A00.A0B(A06)) {
                        FirebaseInstanceId firebaseInstanceId = this.A00;
                        String A07 = firebaseInstanceId.A07(C68472zB.A01(firebaseInstanceId.A02), "*");
                        if (A07 == null) {
                            Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                            z = false;
                            if (z) {
                                C68542zI r3 = this.A03;
                                FirebaseInstanceId firebaseInstanceId2 = this.A00;
                                while (true) {
                                    synchronized (r3) {
                                        try {
                                            String A004 = C68542zI.A00(r3);
                                            if (A004 == null) {
                                                FirebaseInstanceId.A03();
                                                z2 = true;
                                                break;
                                            }
                                            String[] split = A004.split("!");
                                            if (split.length == 2) {
                                                String str9 = split[0];
                                                String str10 = split[1];
                                                char c = 65535;
                                                try {
                                                    int hashCode = str9.hashCode();
                                                    if (hashCode != 83) {
                                                        if (hashCode == 85 && str9.equals("U")) {
                                                            c = 1;
                                                        }
                                                    } else if (str9.equals("S")) {
                                                        c = 0;
                                                    }
                                                    if (c != 0) {
                                                        if (c == 1) {
                                                            C62562nv A062 = firebaseInstanceId2.A06();
                                                            if (firebaseInstanceId2.A0B(A062)) {
                                                                iOException = new IOException("token not available");
                                                                break;
                                                            }
                                                            String A022 = FirebaseInstanceId.A02();
                                                            C68512zF r4 = firebaseInstanceId2.A00;
                                                            String str11 = A062.A01;
                                                            Bundle bundle = new Bundle();
                                                            String valueOf = String.valueOf(str10);
                                                            if (valueOf.length() != 0) {
                                                                str6 = "/topics/".concat(valueOf);
                                                            } else {
                                                                str6 = new String("/topics/");
                                                            }
                                                            bundle.putString("gcm.topic", str6);
                                                            bundle.putString("delete", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                                                            String valueOf2 = String.valueOf(str10);
                                                            if (valueOf2.length() != 0) {
                                                                str7 = "/topics/".concat(valueOf2);
                                                            } else {
                                                                str7 = new String("/topics/");
                                                            }
                                                            FirebaseInstanceId.A01(firebaseInstanceId2, C68512zF.A00(r4, A022, str11, str7, bundle).A04(r4.A04, new B4f(r4)).A04(C204338oi.A00, new B4j()));
                                                        }
                                                    } else {
                                                        C62562nv A063 = firebaseInstanceId2.A06();
                                                        if (firebaseInstanceId2.A0B(A063)) {
                                                            iOException = new IOException("token not available");
                                                            break;
                                                        }
                                                        String A023 = FirebaseInstanceId.A02();
                                                        String str12 = A063.A01;
                                                        C68512zF r42 = firebaseInstanceId2.A00;
                                                        Bundle bundle2 = new Bundle();
                                                        String valueOf3 = String.valueOf(str10);
                                                        if (valueOf3.length() != 0) {
                                                            str4 = "/topics/".concat(valueOf3);
                                                        } else {
                                                            str4 = new String("/topics/");
                                                        }
                                                        bundle2.putString("gcm.topic", str4);
                                                        String valueOf4 = String.valueOf(str10);
                                                        if (valueOf4.length() != 0) {
                                                            str5 = "/topics/".concat(valueOf4);
                                                        } else {
                                                            str5 = new String("/topics/");
                                                        }
                                                        FirebaseInstanceId.A01(firebaseInstanceId2, C68512zF.A00(r42, A023, str12, str5, bundle2).A04(r42.A04, new B4f(r42)).A04(C204338oi.A00, new B4j()));
                                                    }
                                                    FirebaseInstanceId.A03();
                                                } catch (IOException e) {
                                                    String valueOf5 = String.valueOf(e.getMessage());
                                                    if (valueOf5.length() != 0) {
                                                        str3 = "Topic sync failed: ".concat(valueOf5);
                                                    } else {
                                                        str3 = new String("Topic sync failed: ");
                                                    }
                                                    Log.e("FirebaseInstanceId", str3);
                                                    z3 = false;
                                                }
                                            }
                                            z3 = true;
                                            if (!z3) {
                                                z2 = false;
                                                break;
                                            }
                                            synchronized (r3) {
                                                try {
                                                    b57 = (B57) r3.A02.remove(Integer.valueOf(r3.A00));
                                                    synchronized (r3) {
                                                        synchronized (r3.A01) {
                                                            C68492zD r10 = r3.A01;
                                                            synchronized (r10) {
                                                                try {
                                                                    string = r10.A01.getString("topic_operaion_queue", "");
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                            String valueOf6 = String.valueOf(A004);
                                                            if (valueOf6.length() != 0) {
                                                                str = ",".concat(valueOf6);
                                                            } else {
                                                                str = new String(",");
                                                            }
                                                            if (string.startsWith(str)) {
                                                                String valueOf7 = String.valueOf(A004);
                                                                if (valueOf7.length() != 0) {
                                                                    str2 = ",".concat(valueOf7);
                                                                } else {
                                                                    str2 = new String(",");
                                                                }
                                                                String substring = string.substring(str2.length());
                                                                C68492zD r1 = r3.A01;
                                                                synchronized (r1) {
                                                                    try {
                                                                        r1.A01.edit().putString("topic_operaion_queue", substring).apply();
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    r3.A00++;
                                                } catch (Throwable th3) {
                                                    while (true) {
                                                        th = th3;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (b57 != null) {
                                                b57.A01((Object) null);
                                            }
                                        } catch (Throwable th4) {
                                            while (true) {
                                                th = th4;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                throw iOException;
                            }
                            this.A00.A09(this.A01);
                        } else {
                            Log.isLoggable("FirebaseInstanceId", 3);
                            if (A06 == null || !A07.equals(A06.A01)) {
                                Context A005 = A00();
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", A07);
                                Class<FirebaseInstanceIdReceiver> cls = FirebaseInstanceIdReceiver.class;
                                Intent intent2 = new Intent(A005, cls);
                                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                                intent2.putExtra("wrapped_intent", intent);
                                A005.sendBroadcast(intent2);
                                Intent intent3 = new Intent("com.google.firebase.iid.TOKEN_REFRESH");
                                Intent intent4 = new Intent(A005, cls);
                                intent4.setAction("com.google.firebase.INSTANCE_ID_EVENT");
                                intent4.putExtra("wrapped_intent", intent3);
                                A005.sendBroadcast(intent4);
                            }
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    this.A00.A09(this.A01);
                } else {
                    B4g b4g = new B4g(this);
                    FirebaseInstanceId.A03();
                    b4g.A00.A00().registerReceiver(b4g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (IOException | SecurityException e2) {
            String valueOf8 = String.valueOf(e2.getMessage());
            if (valueOf8.length() != 0) {
                str8 = "Token retrieval failed: ".concat(valueOf8);
            } else {
                str8 = new String("Token retrieval failed: ");
            }
            Log.e("FirebaseInstanceId", str8);
        } catch (Throwable th5) {
            if (C25152B3h.A00().A01(A00())) {
                AnonymousClass0ZP.A02(this.A02);
            }
            throw th5;
        }
        if (C25152B3h.A00().A01(A00())) {
            AnonymousClass0ZP.A02(this.A02);
            return;
        }
        return;
        throw th;
    }
}
