package com.facebook.cameracore.mediapipeline.asyncscripting;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.facebook.cameracore.mediapipeline.asyncscripting.IAsyncScriptingService;
import java.util.concurrent.FutureTask;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.B74;

public class AsyncScriptingService extends Service {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final IAsyncScriptingService.Stub A01 = new IAsyncScriptingService.Stub() {
        {
            AnonymousClass0Z0.A0A(496344847, AnonymousClass0Z0.A03(1050089820));
        }

        public final IJsVm ABH(IScriptingClient iScriptingClient) {
            int A03 = AnonymousClass0Z0.A03(-217309775);
            try {
                AsyncScriptingService asyncScriptingService = AsyncScriptingService.this;
                FutureTask futureTask = new FutureTask(new B74(asyncScriptingService, iScriptingClient));
                AnonymousClass0ZA.A0E(asyncScriptingService.A00, futureTask, -2067022467);
                JsVm jsVm = (JsVm) futureTask.get();
                jsVm.init();
                AnonymousClass0Z0.A0A(1194790814, A03);
                return jsVm;
            } catch (Exception e) {
                AnonymousClass0DB.A05(AsyncScriptingService.class, "createVm failed", e);
                AnonymousClass0Z0.A0A(-313062250, A03);
                return null;
            }
        }
    };

    public final IBinder onBind(Intent intent) {
        return this.A01;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0Z0.A04(-734984540);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        AnonymousClass0Z0.A0B(-144220526, A04);
        return onStartCommand;
    }
}
