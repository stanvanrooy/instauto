package com.instagram.react.modules.exceptionmanager;

import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000X.A0Y;
import p000X.A1e;
import p000X.A44;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass901;
import p000X.C06570Po;
import p000X.C06580Pp;
import p000X.C06590Pq;
import p000X.C16940pQ;
import p000X.C227749r3;
import p000X.C227769r6;
import p000X.C227789r8;
import p000X.C227799rA;
import p000X.C227889rL;
import p000X.C228039ra;
import p000X.C228089rf;

@ReactModule(canOverrideExistingModule = true, name = "ExceptionsManager", needsEagerInit = true)
public class IgReactExceptionManager extends NativeExceptionsManagerSpec implements C227799rA, C06570Po, C06580Pp {
    public static final String ERROR_CATEGORY_PREFIX = "IG React Native JS: ";
    public static final String MODULE_NAME = "ExceptionsManager";
    public final Set mExceptionHandlers;
    public final C06590Pq mSession;

    public boolean canOverrideExistingModule() {
        return true;
    }

    public String getName() {
        return "ExceptionsManager";
    }

    public void onSessionIsEnding() {
    }

    public void onUserSessionWillEnd(boolean z) {
    }

    public static IgReactExceptionManager getInstance(C06590Pq r2) {
        return (IgReactExceptionManager) r2.AVA(IgReactExceptionManager.class, new C227769r6(r2));
    }

    public void addExceptionHandler(C227799rA r2) {
        C228039ra.A00();
        this.mExceptionHandlers.add(r2);
    }

    public void handleException(Exception exc) {
        C227889rL r0;
        AnonymousClass901 A01 = C16940pQ.A00().A01(this.mSession);
        if (A01 != null && (r0 = A01.A01) != null) {
            C228089rf r02 = r0.A09;
            if (r02 == null || !r02.AKB()) {
                synchronized (this.mExceptionHandlers) {
                    if (!this.mExceptionHandlers.isEmpty()) {
                        AnonymousClass0QD.A00().Bca(AnonymousClass000.A0E(ERROR_CATEGORY_PREFIX, exc.getMessage()), exc);
                        A01.A03();
                        C228039ra.A01(new C227749r3(this, new HashSet(this.mExceptionHandlers), exc));
                    } else if (exc instanceof RuntimeException) {
                        throw ((RuntimeException) exc);
                    } else {
                        throw new RuntimeException(exc);
                    }
                }
                return;
            }
            exc.getMessage();
        }
    }

    public void removeExceptionHandler(C227799rA r2) {
        C228039ra.A00();
        this.mExceptionHandlers.remove(r2);
    }

    public void reportFatalException(String str, A1e a1e, double d) {
        C227889rL r0;
        AnonymousClass901 A01 = C16940pQ.A00().A01(this.mSession);
        if (A01 != null && (r0 = A01.A01) != null) {
            C228089rf r02 = r0.A09;
            if (r02 == null || !r02.AKB()) {
                throw new C227789r8(A0Y.A00(str, a1e));
            }
        }
    }

    public void reportSoftException(String str, A1e a1e, double d) {
        C227889rL r0;
        AnonymousClass901 A01 = C16940pQ.A00().A01(this.mSession);
        if (A01 != null && (r0 = A01.A01) != null) {
            C228089rf r02 = r0.A09;
            if (r02 == null || !r02.AKB()) {
                AnonymousClass0QD.A00().BcZ(AnonymousClass000.A0E(ERROR_CATEGORY_PREFIX, str), A0Y.A00(str, a1e));
            }
        }
    }

    public void updateExceptionMessage(String str, A1e a1e, double d) {
        AnonymousClass901 A01 = C16940pQ.A00().A01(this.mSession);
        if (A01 != null) {
            C227889rL r0 = A01.A01;
        }
    }

    public IgReactExceptionManager(C06590Pq r2) {
        super((A44) null);
        this.mExceptionHandlers = Collections.synchronizedSet(new HashSet());
        this.mSession = r2;
    }

    public /* synthetic */ IgReactExceptionManager(C06590Pq r1, C227769r6 r2) {
        this(r1);
    }
}
