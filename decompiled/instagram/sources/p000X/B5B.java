package p000X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.B5B */
public abstract class B5B extends Service {
    public static final String ACTION_EXECUTE = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String INTENT_PARAM_EXTRAS = "extras";
    public static final String INTENT_PARAM_TAG = "tag";
    public static final int NUM_THREADS = 2;
    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    public static final String TAG = "GcmTaskService";
    public final Set mActiveTags = new HashSet();
    public ExecutorService mExecutorService;
    public int mLatestStartId;
    public Messenger mServiceMessenger;

    private synchronized Messenger getServiceMessenger() {
        if (this.mServiceMessenger == null) {
            this.mServiceMessenger = new Messenger(new B5C(this, Looper.getMainLooper(), new ComponentName(this, getClass())));
        }
        return this.mServiceMessenger;
    }

    public synchronized ExecutorService getExecutorService() {
        if (this.mExecutorService == null) {
            this.mExecutorService = Executors.newFixedThreadPool(2, new AX5());
        }
        return this.mExecutorService;
    }

    public void onInitializeTasks() {
    }

    public abstract int onRunTask(B5G b5g);

    /* JADX WARNING: Can't wrap try/catch for region: R(2:41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r5 = android.util.Pair.create(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0167, code lost:
        r3.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x016b, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        p000X.B5Q.A00 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        p000X.AnonymousClass0DB.A0E("GooglePlayCallbackExtractor", "Bad callback received, terminating");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0151, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0155, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0159, code lost:
        if (r0 != null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x015b, code lost:
        p000X.AnonymousClass0DB.A0E("GooglePlayCallbackExtractor", "No callback received, terminating");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a6 */
    public Pair extractCallback(Bundle bundle) {
        boolean booleanValue;
        String str;
        IllegalStateException illegalStateException;
        Bundle bundle2 = bundle;
        if (bundle == null) {
            AnonymousClass0DB.A0D("GooglePlayCallbackExtractor", "No callback received, terminating");
            return null;
        }
        Bundle bundle3 = new Bundle();
        Parcel obtain = Parcel.obtain();
        bundle2.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        try {
            if (obtain.readInt() <= 0) {
                AnonymousClass0DB.A0E("GooglePlayCallbackExtractor", "No callback received, terminating");
            } else if (obtain.readInt() != 1279544898) {
                AnonymousClass0DB.A0E("GooglePlayCallbackExtractor", "No callback received, terminating");
            } else {
                int readInt = obtain.readInt();
                int i = 0;
                B5F b5f = null;
                while (true) {
                    if (i >= readInt) {
                        break;
                    }
                    synchronized (B5Q.class) {
                        if (B5Q.A00 == null) {
                            Bundle bundle4 = new Bundle();
                            bundle4.putString("key", "value");
                            Parcel obtain2 = Parcel.obtain();
                            bundle4.writeToParcel(obtain2, 0);
                            obtain2.setDataPosition(0);
                            boolean z = false;
                            boolean z2 = false;
                            if (obtain2.readInt() > 0) {
                                z2 = true;
                            }
                            if (!z2) {
                                illegalStateException = new IllegalStateException();
                                break;
                            }
                            boolean z3 = false;
                            if (obtain2.readInt() == 1279544898) {
                                z3 = true;
                            }
                            if (!z3) {
                                illegalStateException = new IllegalStateException();
                                break;
                            }
                            if (obtain2.readInt() == 1) {
                                z = true;
                            }
                            if (!z) {
                                illegalStateException = new IllegalStateException();
                                break;
                            }
                            B5Q.A00 = Boolean.valueOf("key".equals(obtain2.readString()));
                            obtain2.recycle();
                        }
                        booleanValue = B5Q.A00.booleanValue();
                    }
                    if (booleanValue) {
                        str = obtain.readString();
                    } else {
                        Object readValue = obtain.readValue((ClassLoader) null);
                        if (!(readValue instanceof String)) {
                            AnonymousClass0DB.A0E("GooglePlayCallbackExtractor", "Bad callback received, terminating");
                            str = null;
                        } else {
                            str = (String) readValue;
                        }
                    }
                    if (str != null) {
                        if (b5f != null || !"callback".equals(str)) {
                            Object readValue2 = obtain.readValue((ClassLoader) null);
                            if (readValue2 instanceof String) {
                                bundle3.putString(str, (String) readValue2);
                            } else if (readValue2 instanceof Boolean) {
                                bundle3.putBoolean(str, ((Boolean) readValue2).booleanValue());
                            } else if (readValue2 instanceof Integer) {
                                bundle3.putInt(str, ((Integer) readValue2).intValue());
                            } else if (readValue2 instanceof ArrayList) {
                                bundle3.putParcelableArrayList(str, (ArrayList) readValue2);
                            } else if (readValue2 instanceof Bundle) {
                                bundle3.putBundle(str, (Bundle) readValue2);
                            } else if (readValue2 instanceof Parcelable) {
                                bundle3.putParcelable(str, (Parcelable) readValue2);
                            }
                        } else if (obtain.readInt() != 4) {
                            break;
                        } else if (!"com.google.android.gms.gcm.PendingCallback".equals(obtain.readString())) {
                            AnonymousClass0DB.A0E("GooglePlayCallbackExtractor", "Bad callback received, terminating");
                            break;
                        } else {
                            b5f = new B5F(obtain.readStrongBinder());
                        }
                    }
                    i++;
                }
                throw illegalStateException;
            }
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public IBinder onBind(Intent intent) {
        if (intent == null || Build.VERSION.SDK_INT < 21 || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            return null;
        }
        return getServiceMessenger().getBinder();
    }

    public void onCreate() {
        int A04 = AnonymousClass0Z0.A04(-1748514931);
        super.onCreate();
        AnonymousClass0Z0.A0B(1901157359, A04);
    }

    public void onDestroy() {
        int A04 = AnonymousClass0Z0.A04(-2049527650);
        super.onDestroy();
        ExecutorService executorService = getExecutorService();
        if (executorService != null) {
            List<Runnable> shutdownNow = executorService.shutdownNow();
            if (!shutdownNow.isEmpty()) {
                AnonymousClass0DB.A0J(TAG, "Shutting down, but not all tasks are finished executing. Remaining: %d", Integer.valueOf(shutdownNow.size()));
            }
        }
        AnonymousClass0Z0.A0B(96572628, A04);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int A04 = AnonymousClass0Z0.A04(-1794414635);
        try {
            super.onStartCommand(intent, i, i2);
            if (intent == null) {
                stopIfDone(i2);
                i3 = -359466611;
            } else {
                String action = intent.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    B5D createJob = createJob(intent);
                    if (createJob != null) {
                        createJob.A01();
                    }
                } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    AnonymousClass0DB.A0D(TAG, "Unknown action received, terminating");
                }
                stopIfDone(i2);
                i3 = -1436985591;
            }
            AnonymousClass0Z0.A0B(i3, A04);
            return 2;
        } catch (Throwable th) {
            stopIfDone(i2);
            AnonymousClass0Z0.A0B(-812906177, A04);
            throw th;
        }
    }

    public static B5D createJob(B5B b5b, String str, B5R b5r, Bundle bundle) {
        synchronized (b5b.mActiveTags) {
            if (b5b.mActiveTags.add(str)) {
                return new B5D(b5b, str, b5r, bundle);
            }
            AnonymousClass0DB.A0K(TAG, "%s: Task already running, won't start another", b5b.getPackageName());
            return null;
        }
    }

    private B5D createJob(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            AnonymousClass0DB.A0D(TAG, "Null Intent passed, terminating");
            return null;
        }
        Pair extractCallback = extractCallback(extras);
        if (extractCallback != null) {
            B5R b5r = (B5R) extractCallback.first;
            Bundle bundle = (Bundle) extractCallback.second;
            String string = bundle.getString(INTENT_PARAM_TAG);
            if (string != null) {
                return createJob(this, string, b5r, bundle.getBundle(INTENT_PARAM_EXTRAS));
            }
        }
        return null;
    }

    private void stopIfDone(int i) {
        synchronized (this.mActiveTags) {
            this.mLatestStartId = i;
            if (this.mActiveTags.isEmpty()) {
                stopSelf(this.mLatestStartId);
            }
        }
    }

    public static void stopIfDone(B5B b5b, String str) {
        synchronized (b5b.mActiveTags) {
            b5b.mActiveTags.remove(str);
            if (b5b.mActiveTags.isEmpty()) {
                b5b.stopSelf(b5b.mLatestStartId);
            }
        }
    }
}
