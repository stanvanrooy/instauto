package com.instagram.igtv.p035ui;

import android.content.Context;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1AD;
import p000X.AnonymousClass1PH;
import p000X.AnonymousClass3DC;
import p000X.AnonymousClass76D;
import p000X.AnonymousClass76E;
import p000X.AnonymousClass76T;
import p000X.AnonymousClass76U;
import p000X.AnonymousClass76V;
import p000X.AnonymousClass76Z;
import p000X.C13150hy;
import p000X.C137125t6;
import p000X.C1662977d;
import p000X.C18730sK;
import p000X.C18750sM;
import p000X.C256319p;
import p000X.C27691Iv;
import p000X.C27791Jf;
import p000X.C32631ba;
import p000X.C64482rY;

/* renamed from: com.instagram.igtv.ui.RecyclerViewFetchMoreInteractor */
public final class RecyclerViewFetchMoreInteractor extends C256319p implements AnonymousClass1AD {
    public final RecyclerView A00;
    public final C18750sM A01;
    public final C18750sM A02;
    public final int A03 = 5;
    public final AnonymousClass76D A04;

    public RecyclerViewFetchMoreInteractor(RecyclerView recyclerView, AnonymousClass76D r4, C137125t6 r5) {
        C13150hy.A02(recyclerView, "recyclerView");
        C13150hy.A02(r4, "delegate");
        C13150hy.A02(r5, AnonymousClass0C5.$const$string(102));
        this.A00 = recyclerView;
        this.A04 = r4;
        this.A02 = C18730sK.A00(new AnonymousClass76T(this));
        this.A01 = C18730sK.A00(new AnonymousClass76U(this));
        r5.getLifecycle().A06(this);
    }

    @OnLifecycleEvent(C1662977d.ON_START)
    public final void startObservingScroll() {
        this.A00.A0w(this);
    }

    @OnLifecycleEvent(C1662977d.ON_STOP)
    public final void stopObservingScroll() {
        this.A00.A0x(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        r2 = r12.A04;
     */
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        AnonymousClass76D r2;
        Context context;
        int A032 = AnonymousClass0Z0.A03(-1712403767);
        C13150hy.A02(recyclerView, "recyclerView");
        AnonymousClass76E r1 = this.A04.A03;
        if (r1 == null) {
            C13150hy.A03("seriesInteractor");
        }
        if (!r1.A00) {
            AnonymousClass76E r12 = this.A04.A03;
            if (r12 == null) {
                C13150hy.A03("seriesInteractor");
            }
            if (r12.A05.A0A) {
                AnonymousClass1PH r13 = (AnonymousClass1PH) this.A01.getValue();
                C13150hy.A01(r13, "adapter");
                if (r13.getItemCount() - ((LinearLayoutManager) this.A02.getValue()).A1h() < this.A03 && (context = r2.getContext()) != null) {
                    AnonymousClass76E r0 = r2.A03;
                    if (r0 == null) {
                        C13150hy.A03("seriesInteractor");
                    }
                    if (!r0.A00) {
                        AnonymousClass76E r3 = r2.A03;
                        if (r3 == null) {
                            C13150hy.A03("seriesInteractor");
                        }
                        C13150hy.A01(context, "it");
                        C13150hy.A02(context, "context");
                        if (!r3.A00) {
                            r3.A00 = true;
                            C32631ba r6 = r3.A05;
                            C27691Iv r22 = r3.A04;
                            AnonymousClass76Z r14 = r3.A09;
                            String str = r6.A02;
                            C13150hy.A01(str, "id");
                            String str2 = r6.A05;
                            String str3 = r6.A03;
                            String str4 = r6.A06;
                            C13150hy.A02(context, "context");
                            C13150hy.A02(str, "seriesId");
                            C27791Jf A002 = C64482rY.A00(AnonymousClass3DC.A00(context, r14.A00, str, str2, str3, str4));
                            C13150hy.A01(A002, "RxRequest.observeRequest…ngToken, startAtMediaId))");
                            r22.A02(A002, new AnonymousClass76V(r3, context));
                        }
                    }
                }
            }
        }
        AnonymousClass0Z0.A0A(-234961191, A032);
    }
}
