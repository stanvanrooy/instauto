package com.facebook.react.modules.storage;

import android.os.AsyncTask;
import com.facebook.fbreact.specs.NativeAsyncStorageSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import java.util.concurrent.Executor;
import p000X.A1e;
import p000X.A44;
import p000X.ACR;
import p000X.ACW;
import p000X.ACX;
import p000X.ACY;
import p000X.ACa;
import p000X.ACb;
import p000X.ACc;
import p000X.C23193ACd;
import p000X.C23196ACg;

@ReactModule(name = "AsyncSQLiteDBStorage")
public final class AsyncStorageModule extends NativeAsyncStorageSpec {
    public static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "AsyncSQLiteDBStorage";
    public final C23196ACg executor;
    public C23193ACd mReactDatabaseSupplier;
    public boolean mShuttingDown;

    public String getName() {
        return NAME;
    }

    public void multiGet(A1e a1e, Callback callback) {
        if (a1e == null) {
            callback.invoke(ACR.A00("Invalid key"), null);
            return;
        }
        new ACW(this, getReactApplicationContext(), callback, a1e).executeOnExecutor(this.executor, new Void[0]);
    }

    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    public static boolean ensureDatabase(AsyncStorageModule asyncStorageModule) {
        if (asyncStorageModule.mShuttingDown) {
            return false;
        }
        asyncStorageModule.mReactDatabaseSupplier.A04();
        return true;
    }

    public void clear(Callback callback) {
        new ACc(this, getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000a */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
    public void clearSensitiveData() {
        C23193ACd aCd = this.mReactDatabaseSupplier;
        synchronized (aCd) {
            aCd.A03();
            C23193ACd.A00(aCd);
            if (!C23193ACd.A01(aCd)) {
                throw new RuntimeException("Clearing and deleting database RKStorage failed");
            }
        }
    }

    public void getAllKeys(Callback callback) {
        new ACX(this, getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void multiMerge(A1e a1e, Callback callback) {
        new ACY(this, getReactApplicationContext(), callback, a1e).executeOnExecutor(this.executor, new Void[0]);
    }

    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    public void multiRemove(A1e a1e, Callback callback) {
        if (a1e.size() == 0) {
            callback.invoke(ACR.A00("Invalid key"));
            return;
        }
        new ACa(this, getReactApplicationContext(), callback, a1e).executeOnExecutor(this.executor, new Void[0]);
    }

    public void multiSet(A1e a1e, Callback callback) {
        if (a1e.size() == 0) {
            callback.invoke(ACR.A00("Invalid key"));
            return;
        }
        new ACb(this, getReactApplicationContext(), callback, a1e).executeOnExecutor(this.executor, new Void[0]);
    }

    public AsyncStorageModule(A44 a44) {
        this(a44, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public AsyncStorageModule(A44 a44, Executor executor2) {
        super(a44);
        this.mShuttingDown = false;
        this.executor = new C23196ACg(this, executor2);
        if (C23193ACd.A02 == null) {
            C23193ACd.A02 = new C23193ACd(a44.getApplicationContext());
        }
        this.mReactDatabaseSupplier = C23193ACd.A02;
    }
}
