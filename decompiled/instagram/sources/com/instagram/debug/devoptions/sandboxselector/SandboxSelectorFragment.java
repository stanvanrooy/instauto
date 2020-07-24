package com.instagram.debug.devoptions.sandboxselector;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.facebook.C0003R;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorInteractor;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1B1;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1HR;
import p000X.AnonymousClass2GT;
import p000X.AnonymousClass7BR;
import p000X.C101214Yy;
import p000X.C11750fc;
import p000X.C120125Dh;
import p000X.C13150hy;
import p000X.C25921Ax;
import p000X.C25941Az;

public final class SandboxSelectorFragment extends C101214Yy implements AnonymousClass1HM {
    public C120125Dh adapter;
    public SandboxSelectorInteractor interactor;
    public AnonymousClass0C1 session;

    public String getModuleName() {
        return AnonymousClass0C5.$const$string(285);
    }

    public boolean isToolbarEnabled() {
        return true;
    }

    public static final /* synthetic */ C120125Dh access$getAdapter$p(SandboxSelectorFragment sandboxSelectorFragment) {
        C120125Dh r1 = sandboxSelectorFragment.adapter;
        if (r1 == null) {
            C13150hy.A03("adapter");
        }
        return r1;
    }

    public static final /* synthetic */ AnonymousClass0C1 access$getSession$p(SandboxSelectorFragment sandboxSelectorFragment) {
        AnonymousClass0C1 r1 = sandboxSelectorFragment.session;
        if (r1 == null) {
            C13150hy.A03("session");
        }
        return r1;
    }

    public void configureActionBar(AnonymousClass1EX r2) {
        C13150hy.A02(r2, "configurer");
        r2.BlI(C0003R.string.dev_options_sandbox_selector_actionbar);
        r2.Bo6(true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C13150hy.A02(view, "view");
        super.onViewCreated(view, bundle);
        ListView listView = getListView();
        C13150hy.A01(listView, "listView");
        C120125Dh r1 = this.adapter;
        if (r1 == null) {
            C13150hy.A03("adapter");
        }
        listView.setAdapter(r1);
        SandboxSelectorInteractor sandboxSelectorInteractor = this.interactor;
        if (sandboxSelectorInteractor == null) {
            C13150hy.A03("interactor");
        }
        sandboxSelectorInteractor.sandboxesLiveData().A05(getViewLifecycleOwner(), new SandboxSelectorFragment$onViewCreated$$inlined$with$lambda$1(this));
        sandboxSelectorInteractor.toastLiveData().A05(getViewLifecycleOwner(), new SandboxSelectorFragment$onViewCreated$$inlined$with$lambda$2(this));
        sandboxSelectorInteractor.invokeWithContextLiveData().A05(getViewLifecycleOwner(), new SandboxSelectorFragment$onViewCreated$$inlined$with$lambda$3(this));
        sandboxSelectorInteractor.manualEntryDialogLiveData().A05(getViewLifecycleOwner(), new SandboxSelectorFragment$onViewCreated$$inlined$with$lambda$4(this));
        sandboxSelectorInteractor.onStart();
    }

    private final void observe(AnonymousClass1HR r3, AnonymousClass2GT r4) {
        r3.A05(getViewLifecycleOwner(), new SandboxSelectorFragment$observe$1(r4));
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(-2088573534);
        super.onCreate(bundle);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(this.mArguments);
        C13150hy.A01(A06, "IgSessionManager.getUserSession(arguments)");
        this.session = A06;
        this.adapter = new C120125Dh(getContext());
        AnonymousClass0C1 r5 = this.session;
        if (r5 == null) {
            C13150hy.A03("session");
        }
        SandboxRepository sandboxRepository = new SandboxRepository(r5, (DevServerApi) null, (SandboxPreferences) null, (SandboxDataModelConverter) null, 14, (AnonymousClass7BR) null);
        Context context = getContext();
        if (context == null) {
            C13150hy.A00();
        }
        C13150hy.A01(context, "context!!");
        Resources resources = context.getResources();
        C13150hy.A01(resources, "context!!.resources");
        C25941Az A00 = new C25921Ax((C11750fc) this, (AnonymousClass1B1) new SandboxSelectorInteractor.Factory(sandboxRepository, resources)).A00(SandboxSelectorInteractor.class);
        C13150hy.A01(A00, "ViewModelProvider(this, …orInteractor::class.java]");
        this.interactor = (SandboxSelectorInteractor) A00;
        AnonymousClass0Z0.A09(1281457185, A02);
    }

    public AnonymousClass0C1 getSession() {
        AnonymousClass0C1 r1 = this.session;
        if (r1 == null) {
            C13150hy.A03("session");
        }
        return r1;
    }
}
