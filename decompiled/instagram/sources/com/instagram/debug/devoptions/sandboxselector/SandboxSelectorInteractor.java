package com.instagram.debug.devoptions.sandboxselector;

import android.content.res.Resources;
import com.facebook.C0003R;
import p000X.AnonymousClass10N;
import p000X.AnonymousClass10U;
import p000X.AnonymousClass1B1;
import p000X.AnonymousClass1HQ;
import p000X.AnonymousClass1HR;
import p000X.AnonymousClass1J9;
import p000X.AnonymousClass1KF;
import p000X.AnonymousClass7BR;
import p000X.C05770Lw;
import p000X.C13150hy;
import p000X.C17700qf;
import p000X.C17710qg;
import p000X.C183227s6;
import p000X.C25941Az;
import p000X.C27691Iv;
import p000X.C27791Jf;

public final class SandboxSelectorInteractor extends C25941Az {
    public final SandboxViewModelConverter converter;
    public final AnonymousClass1HQ invokeWithContextLiveData;
    public final AnonymousClass1HQ manualEntryDialogLiveData;
    public final SandboxOverlayIndicatorUpdater overlayIndicatorUpdater;
    public final SandboxRepository repository;
    public final Resources resources;
    public final AnonymousClass1HQ sandboxesLiveData;
    public final C27691Iv subscriber;
    public final AnonymousClass1HQ toastLiveData;

    public final class Factory implements AnonymousClass1B1 {
        public final SandboxRepository repository;
        public final Resources resources;

        public Factory(SandboxRepository sandboxRepository, Resources resources2) {
            C13150hy.A02(sandboxRepository, "repository");
            C13150hy.A02(resources2, "resources");
            this.repository = sandboxRepository;
            this.resources = resources2;
        }

        public C25941Az create(Class cls) {
            C13150hy.A02(cls, "modelClass");
            return new SandboxSelectorInteractor(this.repository, this.resources, (SandboxViewModelConverter) null, (SandboxOverlayIndicatorUpdater) null, 12, (AnonymousClass7BR) null);
        }
    }

    public static final void onManualEntryClicked(SandboxSelectorInteractor sandboxSelectorInteractor) {
        sandboxSelectorInteractor.manualEntryDialogLiveData.A09(true);
    }

    public static final void onResetSandbox(SandboxSelectorInteractor sandboxSelectorInteractor) {
        int i;
        if (sandboxSelectorInteractor.repository.getCurrentSandbox().type == SandboxType.PRODUCTION) {
            i = C0003R.string.dev_options_sandbox_selector_reset_noop;
        } else {
            sandboxSelectorInteractor.repository.resetToDefaultSandbox();
            sandboxSelectorInteractor.invokeWithContextLiveData.A09(new SandboxSelectorInteractor$onResetSandbox$toastRes$1(sandboxSelectorInteractor.overlayIndicatorUpdater));
            i = C0003R.string.dev_options_sandbox_selector_reset_success;
        }
        sandboxSelectorInteractor.toastLiveData.A09(sandboxSelectorInteractor.resources.getString(i));
    }

    public static final void onSandboxSelected(SandboxSelectorInteractor sandboxSelectorInteractor, Sandbox sandbox) {
        sandboxSelectorInteractor.repository.setSandbox(sandbox);
    }

    public final AnonymousClass1HR invokeWithContextLiveData() {
        AnonymousClass1HQ r0 = this.invokeWithContextLiveData;
        if (r0 != null) {
            return r0;
        }
        throw new C183227s6("null cannot be cast to non-null type androidx.lifecycle.LiveData<(android.content.Context) -> kotlin.Unit>");
    }

    public final AnonymousClass1HR manualEntryDialogLiveData() {
        AnonymousClass1HQ r0 = this.manualEntryDialogLiveData;
        if (r0 != null) {
            return r0;
        }
        throw new C183227s6("null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Boolean>");
    }

    public final void onStart() {
        this.subscriber.A02(C27791Jf.A04(this.repository.observeCurrentSandbox(), this.repository.observeHealthyConnection(), this.repository.getSandboxMetadata().A0H(C17710qg.A00(new SandboxMetadata(AnonymousClass10U.A00, CorpnetStatus.CHECKING))), new C0083xc4739acd(new SandboxSelectorInteractor$onStart$combined$1(this))), new SandboxSelectorInteractor$onStart$1(this));
        this.subscriber.A02(new C27791Jf(AnonymousClass1J9.A00(new AnonymousClass1KF(this.repository.observeCurrentSandbox().A09().A00))), new SandboxSelectorInteractor$onStart$2(this));
    }

    public final AnonymousClass1HR sandboxesLiveData() {
        AnonymousClass1HQ r0 = this.sandboxesLiveData;
        if (r0 != null) {
            return r0;
        }
        throw new C183227s6("null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.collections.List<kotlin.Any>>");
    }

    public final AnonymousClass1HR toastLiveData() {
        AnonymousClass1HQ r0 = this.toastLiveData;
        if (r0 != null) {
            return r0;
        }
        throw new C183227s6("null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.String>");
    }

    public static final C17710qg convertViewModels(SandboxSelectorInteractor sandboxSelectorInteractor, Sandbox sandbox, IgServerHealth igServerHealth, C17710qg r7) {
        C17710qg r1;
        String str;
        if (r7.A05()) {
            r1 = C17710qg.A01(AnonymousClass10N.A0D(AnonymousClass10N.A0D(AnonymousClass10N.A0D(sandboxSelectorInteractor.converter.convertCurrentSandboxSection(sandbox, igServerHealth, new SandboxSelectorInteractor$convertViewModels$result$1(sandboxSelectorInteractor)), sandboxSelectorInteractor.converter.convert(((SandboxMetadata) r7.A02()).sandboxes, new SandboxSelectorInteractor$convertViewModels$result$2(sandboxSelectorInteractor))), sandboxSelectorInteractor.converter.convertManualEntrySection(new SandboxSelectorInteractor$convertViewModels$result$3(sandboxSelectorInteractor))), sandboxSelectorInteractor.converter.convertCorpnetSection(((SandboxMetadata) r7.A02()).status)));
            str = "Optional.of(result)";
        } else {
            r1 = C17700qf.A00;
            str = "Optional.absent()";
        }
        C13150hy.A01(r1, str);
        return r1;
    }

    public void onCleared() {
        super.onCleared();
        this.subscriber.A01();
    }

    public SandboxSelectorInteractor(SandboxRepository sandboxRepository, Resources resources2, SandboxViewModelConverter sandboxViewModelConverter, SandboxOverlayIndicatorUpdater sandboxOverlayIndicatorUpdater) {
        C13150hy.A02(sandboxRepository, "repository");
        C13150hy.A02(resources2, "resources");
        C13150hy.A02(sandboxViewModelConverter, "converter");
        C13150hy.A02(sandboxOverlayIndicatorUpdater, "overlayIndicatorUpdater");
        this.repository = sandboxRepository;
        this.resources = resources2;
        this.converter = sandboxViewModelConverter;
        this.overlayIndicatorUpdater = sandboxOverlayIndicatorUpdater;
        this.subscriber = C27691Iv.A00();
        this.sandboxesLiveData = new AnonymousClass1HQ();
        this.manualEntryDialogLiveData = new AnonymousClass1HQ();
        this.toastLiveData = new AnonymousClass1HQ();
        this.invokeWithContextLiveData = new AnonymousClass1HQ();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SandboxSelectorInteractor(SandboxRepository sandboxRepository, Resources resources2, SandboxViewModelConverter sandboxViewModelConverter, SandboxOverlayIndicatorUpdater sandboxOverlayIndicatorUpdater, int i, AnonymousClass7BR r8) {
        this(sandboxRepository, resources2, (i & 4) != 0 ? new SandboxViewModelConverter() : sandboxViewModelConverter, (i & 8) != 0 ? new SandboxOverlayIndicatorUpdater((C05770Lw) null, 1, (AnonymousClass7BR) null) : sandboxOverlayIndicatorUpdater);
    }
}
