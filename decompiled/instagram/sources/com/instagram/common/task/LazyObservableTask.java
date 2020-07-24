package com.instagram.common.task;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000X.AD9;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0IT;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0ZA;
import p000X.C12670hC;
import p000X.C17860qv;

public final class LazyObservableTask implements C17860qv {
    public C17860qv A00;
    public final CountDownLatch A01;
    public final Handler A02;
    public final AnonymousClass0IT A03;

    public final int getRunnableId() {
        return -3;
    }

    public final void onStart() {
    }

    public final String getName() {
        C17860qv r0 = this.A00;
        if (r0 == null) {
            return "Lazy";
        }
        return AnonymousClass000.A0E("Lazy_", r0.getName());
    }

    public final void onFinish() {
        this.A00.onFinish();
    }

    public final void run() {
        this.A00 = (C17860qv) this.A03.get();
        if (this.A02 == null || C12670hC.A08()) {
            this.A00.onStart();
        } else {
            AnonymousClass0ZA.A0E(this.A02, new AD9(this), -825837807);
            try {
                this.A01.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                AnonymousClass0QD.A05("com.instagram.common.task.LazyObservableTask", "countdown interrupted", e);
            }
        }
        this.A00.run();
    }

    public LazyObservableTask(AnonymousClass0IT r3) {
        this.A03 = r3;
        if (Looper.myLooper() != null) {
            this.A02 = new Handler();
            this.A01 = new CountDownLatch(1);
        }
    }
}
