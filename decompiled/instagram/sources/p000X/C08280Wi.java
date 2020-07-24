package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import com.facebook.rti.push.service.FbnsService;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: X.0Wi  reason: invalid class name and case insensitive filesystem */
public final class C08280Wi implements Callable {
    public final /* synthetic */ FbnsAIDLRequest A00;
    public final /* synthetic */ C08290Wl A01;

    public C08280Wi(C08290Wl r1, FbnsAIDLRequest fbnsAIDLRequest) {
        this.A01 = r1;
        this.A00 = fbnsAIDLRequest;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        boolean z2;
        RemoteException remoteException;
        IFbnsAIDLService iFbnsAIDLService;
        boolean z3;
        boolean z4;
        String packageName;
        try {
            C08290Wl r6 = this.A01;
            synchronized (r6) {
                r6.A00++;
                long j = 200;
                int i = 1;
                while (true) {
                    C08290Wl r8 = r6;
                    synchronized (r8) {
                        try {
                            z = false;
                            if (r6.A02 == Constants.A0C) {
                                z = true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    if (!z) {
                        if (i > 5) {
                            AnonymousClass0DB.A0J("FbnsAIDLClientManager", "Max Try reached for binding to FbnsAIDLService, threadId %d", Long.valueOf(Thread.currentThread().getId()));
                            break;
                        }
                        Thread currentThread = Thread.currentThread();
                        currentThread.getId();
                        SystemClock.elapsedRealtime();
                        synchronized (r8) {
                            z3 = false;
                            if (r6.A02 == Constants.ONE) {
                                z3 = true;
                            }
                        }
                        if (!z3) {
                            if (Looper.getMainLooper().getThread() == currentThread) {
                                AnonymousClass0DB.A0D("FbnsAIDLClientManager", "This operation can't be run on UI thread");
                                z4 = true;
                            } else {
                                currentThread.getId();
                                SystemClock.elapsedRealtime();
                                Context context = r6.A03;
                                Iterator it = AnonymousClass0UP.A01.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        packageName = context.getPackageName();
                                        break;
                                    }
                                    packageName = (String) it.next();
                                    if (AnonymousClass0TR.A01(context, packageName)) {
                                        break;
                                    }
                                }
                                ComponentName componentName = new ComponentName(packageName, FbnsService.A01(packageName));
                                Intent intent = new Intent(IFbnsAIDLService.class.getName());
                                intent.setComponent(componentName);
                                new AnonymousClass0UR(r6.A03).A02(intent);
                                synchronized (r6) {
                                    z4 = false;
                                    try {
                                        if (AnonymousClass0ZI.A02(r6.A03, intent, r6.A04, 1, -958744252)) {
                                            r6.A02 = Constants.ONE;
                                        } else {
                                            AnonymousClass0DB.A0D("FbnsAIDLClientManager", "open failed: bindService failure, do unbind to let service shutdown");
                                            AnonymousClass0ZI.A01(r6.A03, r6.A04, 727883886);
                                        }
                                    } catch (SecurityException e) {
                                        AnonymousClass0DB.A0G("FbnsAIDLClientManager", "open failed: bindService throw SecurityException", e);
                                        z4 = true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                }
                            }
                            if (z4) {
                                break;
                            }
                        }
                        r6.wait(j);
                        j *= 2;
                        i++;
                    }
                }
            }
            C08290Wl r62 = this.A01;
            FbnsAIDLRequest fbnsAIDLRequest = this.A00;
            FbnsAIDLResult fbnsAIDLResult = new FbnsAIDLResult(Bundle.EMPTY);
            try {
                synchronized (r62) {
                    synchronized (r62) {
                        z2 = false;
                        if (r62.A02 == Constants.A0C) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        iFbnsAIDLService = r62.A01;
                        if (iFbnsAIDLService == null) {
                            remoteException = new RemoteException("AIDLService is null");
                        }
                    } else {
                        remoteException = new RemoteException("AIDLService is not bound");
                    }
                    throw remoteException;
                }
                C08310Wn r0 = (C08310Wn) C08310Wn.A02.get(Integer.valueOf(fbnsAIDLRequest.A00));
                if (r0 == null) {
                    r0 = C08310Wn.NOT_EXIST;
                }
                if (r0.A01) {
                    Bundle bundle = fbnsAIDLRequest.A00;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    bundle.toString();
                    fbnsAIDLResult = iFbnsAIDLService.BYm(fbnsAIDLRequest);
                } else {
                    Bundle bundle2 = fbnsAIDLRequest.A00;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    bundle2.toString();
                    iFbnsAIDLService.BsK(fbnsAIDLRequest);
                }
            } catch (DeadObjectException e2) {
                AnonymousClass0DB.A0G("FbnsAIDLClientManager", "Fbns AIDL request got DeadObjectException", e2);
            } catch (RemoteException e3) {
                AnonymousClass0DB.A0G("FbnsAIDLClientManager", "Fbns AIDL request got RemoteException", e3);
            }
            return fbnsAIDLResult;
        } finally {
            C08290Wl.A00(this.A01);
        }
    }
}
