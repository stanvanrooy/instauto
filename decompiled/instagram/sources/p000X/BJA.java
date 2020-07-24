package p000X;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient$zzd;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.service.zal;
import com.google.android.gms.common.internal.service.zam;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.auth.zzan;
import com.google.android.gms.internal.auth.zzao;
import com.google.android.gms.internal.location.zzap;
import com.google.android.gms.internal.p026authapi.zzw;
import com.google.android.gms.internal.p026authapi.zzx;
import com.google.android.gms.internal.p051authapiphone.zze;
import com.google.android.gms.internal.p051authapiphone.zzf;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzj;
import com.google.android.gms.signin.internal.zaf;
import com.google.android.gms.signin.internal.zag;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.BJA */
public abstract class BJA {
    public static final Feature[] A0R = new Feature[0];
    public static final String[] A0S = {"service_esmobile", "service_googleme"};
    public int A00;
    public int A01;
    public int A02 = 1;
    public long A03;
    public long A04;
    public long A05;
    public ConnectionResult A06 = null;
    public BKi A07;
    public IGmsServiceBroker A08;
    public AtomicInteger A09 = new AtomicInteger(0);
    public boolean A0A = false;
    public IInterface A0B;
    public BJG A0C;
    public BKY A0D;
    public final Context A0E;
    public final Handler A0F;
    public final C25438BKb A0G;
    public final C25442BKh A0H;
    public final Object A0I = new Object();
    public final Object A0J = new Object();
    public final String A0K;
    public final ArrayList A0L = new ArrayList();
    public final int A0M;
    public final Looper A0N;
    public final C42001rL A0O;
    public final BK8 A0P;
    public volatile zzb A0Q = null;

    public static final void A00(BJA bja, int i, IInterface iInterface) {
        BKY bky;
        boolean z = false;
        if (i == 4) {
            z = true;
        }
        boolean z2 = false;
        if (iInterface != null) {
            z2 = true;
        }
        boolean z3 = false;
        if (z == z2) {
            z3 = true;
        }
        AnonymousClass0a2.A06(z3);
        synchronized (bja.A0I) {
            bja.A02 = i;
            bja.A0B = iInterface;
            if (i == 1) {
                BJG bjg = bja.A0C;
                if (bjg != null) {
                    BK8 bk8 = bja.A0P;
                    String A072 = bja.A07();
                    String str = bja.A0K;
                    if (str == null) {
                        str = bja.A0E.getClass().getName();
                    }
                    bk8.A00(new BJP(A072, "com.google.android.gms"), bjg, str);
                    bja.A0C = null;
                }
            } else if (i == 2 || i == 3) {
                if (!(bja.A0C == null || (bky = bja.A0D) == null)) {
                    String str2 = bky.A01;
                    String str3 = bky.A00;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + String.valueOf(str3).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str2);
                    sb.append(" on ");
                    sb.append(str3);
                    Log.e("GmsClient", sb.toString());
                    BK8 bk82 = bja.A0P;
                    BKY bky2 = bja.A0D;
                    String str4 = bky2.A01;
                    String str5 = bky2.A00;
                    BJG bjg2 = bja.A0C;
                    String str6 = bja.A0K;
                    if (str6 == null) {
                        str6 = bja.A0E.getClass().getName();
                    }
                    bk82.A00(new BJP(str4, str5), bjg2, str6);
                    bja.A09.incrementAndGet();
                }
                BJG bjg3 = new BJG(bja, bja.A09.get());
                bja.A0C = bjg3;
                BKY bky3 = new BKY(bja.A07());
                bja.A0D = bky3;
                BK8 bk83 = bja.A0P;
                String str7 = bky3.A01;
                String str8 = bky3.A00;
                String str9 = bja.A0K;
                if (str9 == null) {
                    str9 = bja.A0E.getClass().getName();
                }
                if (!bk83.A01(new BJP(str7, str8), bjg3, str9)) {
                    BKY bky4 = bja.A0D;
                    String str10 = bky4.A01;
                    String str11 = bky4.A00;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str10).length() + 34 + String.valueOf(str11).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str10);
                    sb2.append(" on ");
                    sb2.append(str11);
                    Log.e("GmsClient", sb2.toString());
                    int i2 = bja.A09.get();
                    Handler handler = bja.A0F;
                    AnonymousClass0ZA.A0D(handler, handler.obtainMessage(7, i2, -1, new BJK(bja, 16)));
                }
            } else if (i == 4) {
                bja.A04 = System.currentTimeMillis();
            }
        }
    }

    public Account A02() {
        if (!(this instanceof BJ9)) {
            return null;
        }
        return ((BJ9) this).A00;
    }

    public IInterface A05(IBinder iBinder) {
        if (!(this instanceof BIV)) {
            if (!(this instanceof BJ5)) {
                if (!(this instanceof BJ7)) {
                    if (!(this instanceof BJ8)) {
                        if (!(this instanceof BIU)) {
                            if (!(this instanceof BJ3)) {
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
                                return queryLocalInterface instanceof zal ? (zal) queryLocalInterface : new zam(iBinder);
                            } else if (iBinder == null) {
                                return null;
                            } else {
                                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                                return queryLocalInterface2 instanceof zze ? (zze) queryLocalInterface2 : new zzf(iBinder);
                            }
                        } else if (iBinder == null) {
                            return null;
                        } else {
                            IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                            return queryLocalInterface3 instanceof zzw ? (zzw) queryLocalInterface3 : new zzx(iBinder);
                        }
                    } else if (iBinder == null) {
                        return null;
                    } else {
                        IInterface queryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
                        return queryLocalInterface4 instanceof zzan ? (zzan) queryLocalInterface4 : new zzao(iBinder);
                    }
                } else if (iBinder == null) {
                    return null;
                } else {
                    IInterface queryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    return queryLocalInterface5 instanceof com.google.android.gms.internal.location.zzao ? (com.google.android.gms.internal.location.zzao) queryLocalInterface5 : new zzap(iBinder);
                }
            } else if (iBinder == null) {
                return null;
            } else {
                IInterface queryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                return queryLocalInterface6 instanceof zzi ? (zzi) queryLocalInterface6 : new zzj(iBinder);
            }
        } else if (iBinder == null) {
            return null;
        } else {
            IInterface queryLocalInterface7 = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            return queryLocalInterface7 instanceof zaf ? (zaf) queryLocalInterface7 : new zag(iBinder);
        }
    }

    public String A06() {
        return !(this instanceof BIV) ? !(this instanceof BJ5) ? !(this instanceof BJ7) ? !(this instanceof BJ8) ? !(this instanceof BIU) ? !(this instanceof BJ3) ? "com.google.android.gms.common.internal.service.ICommonService" : "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService" : "com.google.android.gms.auth.api.credentials.internal.ICredentialsService" : "com.google.android.gms.auth.api.internal.IAuthService" : "com.google.android.gms.location.internal.IGoogleLocationManagerService" : "com.google.android.gms.safetynet.internal.ISafetyNetService" : "com.google.android.gms.signin.internal.ISignInService";
    }

    public String A07() {
        return !(this instanceof BIV) ? !(this instanceof BJ5) ? !(this instanceof BJ7) ? !(this instanceof BJ8) ? !(this instanceof BIU) ? !(this instanceof BJ3) ? "com.google.android.gms.common.service.START" : "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START" : "com.google.android.gms.auth.api.credentials.service.START" : "com.google.android.gms.auth.service.START" : "com.google.android.location.internal.GoogleLocationManagerService.START" : "com.google.android.gms.safetynet.service.START" : "com.google.android.gms.signin.service.START";
    }

    public final Bundle AIf() {
        return null;
    }

    public boolean BYX() {
        return false;
    }

    public final boolean BdV() {
        return true;
    }

    public boolean BdW() {
        return false;
    }

    public static final boolean A01(BJA bja, int i, int i2, IInterface iInterface) {
        synchronized (bja.A0I) {
            if (bja.A02 != i) {
                return false;
            }
            A00(bja, i2, iInterface);
            return true;
        }
    }

    public Bundle A03() {
        if (this instanceof BIV) {
            BIV biv = (BIV) this;
            if (!biv.A0E.getPackageName().equals(biv.A02.A02)) {
                biv.A01.putString("com.google.android.gms.signin.internal.realClientPackageName", biv.A02.A02);
            }
            return biv.A01;
        } else if (this instanceof BJ7) {
            Bundle bundle = new Bundle();
            bundle.putString("client_name", ((BJ7) this).A00);
            return bundle;
        } else if (this instanceof BJ8) {
            return ((BJ8) this).A00;
        } else {
            if (!(this instanceof BIU)) {
                return new Bundle();
            }
            C25452BKx bKx = ((BIU) this).A00;
            if (bKx == null) {
                return new Bundle();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("consumer_package", (String) null);
            bundle2.putBoolean("force_save_dialog", bKx.A00);
            return bundle2;
        }
    }

    public final IInterface A04() {
        IInterface iInterface;
        synchronized (this.A0I) {
            if (this.A02 == 5) {
                throw new DeadObjectException();
            } else if (isConnected()) {
                boolean z = false;
                if (this.A0B != null) {
                    z = true;
                }
                AnonymousClass0a2.A09(z, "Client is connected but service is null");
                iInterface = this.A0B;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return iInterface;
    }

    public Set A08() {
        if (!(this instanceof BJ9)) {
            return Collections.EMPTY_SET;
        }
        return ((BJ9) this).A02;
    }

    public final void A9X(BKi bKi) {
        AnonymousClass0a2.A03(bKi, "Connection progress callbacks cannot be null.");
        this.A07 = bKi;
        A00(this, 2, (IInterface) null);
    }

    public void AC7() {
        this.A09.incrementAndGet();
        synchronized (this.A0L) {
            try {
                int size = this.A0L.size();
                for (int i = 0; i < size; i++) {
                    C25421BJc bJc = (C25421BJc) this.A0L.get(i);
                    synchronized (bJc) {
                        bJc.A00 = null;
                    }
                }
                this.A0L.clear();
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        synchronized (this.A0J) {
            try {
                this.A08 = null;
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                    break;
                }
            }
        }
        A00(this, 1, (IInterface) null);
        return;
        throw th;
    }

    public final void ACj(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        String str2;
        String str3;
        synchronized (this.A0I) {
            try {
                i = this.A02;
                iInterface = this.A0B;
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        synchronized (this.A0J) {
            try {
                iGmsServiceBroker = this.A08;
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                    break;
                }
            }
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            str2 = "DISCONNECTED";
        } else if (i == 2) {
            str2 = "REMOTE_CONNECTING";
        } else if (i == 3) {
            str2 = "LOCAL_CONNECTING";
        } else if (i == 4) {
            str2 = "CONNECTED";
        } else if (i != 5) {
            str2 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        } else {
            str2 = "DISCONNECTING";
        }
        printWriter.print(str2);
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(A06()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.A04 > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.A04;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.A03 > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.A00;
            if (i2 == 1) {
                str3 = "CAUSE_SERVICE_DISCONNECTED";
                printWriter.append(str3);
            } else if (i2 != 2) {
                printWriter.append(String.valueOf(i2));
            } else {
                str3 = "CAUSE_NETWORK_LOST";
                printWriter.append(str3);
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.A03;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.A05 > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C229229x8.A00(this.A01));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.A05;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
            return;
        }
        return;
        throw th;
    }

    public final Feature[] AGP() {
        zzb zzb = this.A0Q;
        if (zzb == null) {
            return null;
        }
        return zzb.A01;
    }

    public Intent AW2() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 == 3) goto L_0x000c;
     */
    public final boolean Aen() {
        boolean z;
        synchronized (this.A0I) {
            int i = this.A02;
            if (i != 2) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.A0I) {
            z = false;
            if (this.A02 == 4) {
                z = true;
            }
        }
        return z;
    }

    public BJA(Context context, Looper looper, BK8 bk8, C42001rL r6, int i, C25438BKb bKb, C25442BKh bKh, String str) {
        AnonymousClass0a2.A03(context, "Context must not be null");
        this.A0E = context;
        AnonymousClass0a2.A03(looper, "Looper must not be null");
        this.A0N = looper;
        AnonymousClass0a2.A03(bk8, "Supervisor must not be null");
        this.A0P = bk8;
        AnonymousClass0a2.A03(r6, "API availability must not be null");
        this.A0O = r6;
        this.A0F = new BJB(this, looper);
        this.A0M = i;
        this.A0G = bKb;
        this.A0H = bKh;
        this.A0K = str;
    }

    public final String ALA() {
        BKY bky;
        if (isConnected() && (bky = this.A0D) != null) {
            return bky.A00;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int AQI() {
        return 12451000;
    }

    public final void AU4(IAccountAccessor iAccountAccessor, Set set) {
        Bundle A032 = A03();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.A0M);
        getServiceRequest.A03 = this.A0E.getPackageName();
        getServiceRequest.A01 = A032;
        if (set != null) {
            getServiceRequest.A06 = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (BdW()) {
            Account A022 = A02();
            if (A022 == null) {
                A022 = new Account("<<default account>>", GcmTaskServiceCompat.GOOGLE_PREFIX);
            }
            getServiceRequest.A00 = A022;
            if (iAccountAccessor != null) {
                getServiceRequest.A02 = iAccountAccessor.asBinder();
            }
        }
        Feature[] featureArr = A0R;
        getServiceRequest.A04 = featureArr;
        getServiceRequest.A05 = featureArr;
        try {
            synchronized (this.A0J) {
                IGmsServiceBroker iGmsServiceBroker = this.A08;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.AVn(new BaseGmsClient$zzd(this, this.A09.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.A0F;
            AnonymousClass0ZA.A0D(handler, handler.obtainMessage(6, this.A09.get(), 1));
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i = this.A09.get();
            Handler handler2 = this.A0F;
            AnonymousClass0ZA.A0D(handler2, handler2.obtainMessage(1, i, -1, new BJE(this, 8, (IBinder) null, (Bundle) null)));
        }
    }

    public final void BUM(BH7 bh7) {
        bh7.BNK();
    }
}
