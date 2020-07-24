package com.facebook.react;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.catalyst.views.art.ARTGroupViewManager;
import com.facebook.catalyst.views.art.ARTShapeViewManager;
import com.facebook.catalyst.views.art.ARTSurfaceViewManager;
import com.facebook.catalyst.views.art.ARTTextViewManager;
import com.facebook.catalyst.views.gradient.ReactAxialGradientManager;
import com.facebook.catalyst.views.video.ReactVideoManager;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.fbreact.i18n.FbReactI18nAssetsModule;
import com.facebook.fbreact.i18n.FbReactI18nModule;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.picker.ReactDialogPickerManager;
import com.facebook.react.views.picker.ReactDropdownPickerManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.systrace.SystraceMessage;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.impl.IgReactPackage$$ReactModuleInfoProvider;
import com.instagram.react.modules.base.IgNativeColorsModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.react.modules.base.IgReactAnalyticsModule;
import com.instagram.react.modules.base.IgReactDialogModule;
import com.instagram.react.modules.base.IgReactFBUserAgentModule;
import com.instagram.react.modules.base.IgReactFunnelLoggerModule;
import com.instagram.react.modules.base.IgReactPerformanceLoggerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.base.IgSharedPreferencesModule;
import com.instagram.react.modules.base.RelayAPIConfigModule;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactBloksNavigationModule;
import com.instagram.react.modules.product.IgReactBoostPostModule;
import com.instagram.react.modules.product.IgReactBrandedContentModule;
import com.instagram.react.modules.product.IgReactCheckpointModule;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.react.modules.product.IgReactCompassionResourceModule;
import com.instagram.react.modules.product.IgReactCountryCodeRoute;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.react.modules.product.IgReactInsightsModule;
import com.instagram.react.modules.product.IgReactInsightsStoryPresenterModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPostInsightsModule;
import com.instagram.react.modules.product.IgReactPromoteMigrationModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.react.modules.product.IgReactPurchaseProtectionSheetModule;
import com.instagram.react.modules.product.IgReactShoppingCatalogSettingsModule;
import com.instagram.react.modules.product.IgReactShoppingPickerModule;
import com.instagram.react.modules.product.IgReactShoppingSignupReactModule;
import com.instagram.react.perf.IgReactPerformanceLoggerFlagManager;
import com.instagram.react.views.bubblespinnerview.ReactBubbleSpinnerManager;
import com.instagram.react.views.checkmarkview.ReactCheckmarkManager;
import com.instagram.react.views.clockview.ReactClockManager;
import com.instagram.react.views.custom.IgLoadingIndicatorViewManager;
import com.instagram.react.views.image.IgReactImageLoaderModule;
import com.instagram.react.views.image.IgReactImageManager;
import com.instagram.react.views.maps.IgStaticMapViewManager;
import com.instagram.react.views.postpurchase.ReactProductCardViewManager;
import com.instagram.react.views.switchview.ReactSwitchManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000X.A1z;
import p000X.A21;
import p000X.A22;
import p000X.A23;
import p000X.A26;
import p000X.A2E;
import p000X.A2F;
import p000X.A2G;
import p000X.A2I;
import p000X.A2J;
import p000X.A2K;
import p000X.A2M;
import p000X.A2N;
import p000X.A2Q;
import p000X.A2R;
import p000X.A2S;
import p000X.A2U;
import p000X.A2V;
import p000X.A2W;
import p000X.A2X;
import p000X.A2Y;
import p000X.A2Z;
import p000X.A3L;
import p000X.A3X;
import p000X.A44;
import p000X.A48;
import p000X.AnonymousClass6A6;
import p000X.AnonymousClass6BC;
import p000X.AnonymousClass909;
import p000X.AnonymousClass90P;
import p000X.AnonymousClass90Q;
import p000X.AnonymousClass915;
import p000X.AnonymousClass91F;
import p000X.AnonymousClass950;
import p000X.AnonymousClass9D4;
import p000X.AnonymousClass9FU;
import p000X.AnonymousClass9M3;
import p000X.AnonymousClass9SH;
import p000X.C08750Yk;
import p000X.C112154s9;
import p000X.C112164sA;
import p000X.C139125wx;
import p000X.C139135wy;
import p000X.C139185xC;
import p000X.C144766Gz;
import p000X.C147236Rd;
import p000X.C148266Vt;
import p000X.C148276Vw;
import p000X.C152796g1;
import p000X.C156076lY;
import p000X.C157206nX;
import p000X.C2102694x;
import p000X.C228099rh;
import p000X.C23050A1q;
import p000X.C23052A2b;
import p000X.C23073A4r;
import p000X.C23155AAf;

public abstract class LazyReactPackage implements A48 {
    public C23073A4r A00() {
        return new IgReactPackage$$ReactModuleInfoProvider();
    }

    public List A01(A44 a44) {
        IgReactPackage igReactPackage = (IgReactPackage) this;
        ArrayList arrayList = new ArrayList();
        arrayList.add(A3X.A00(IntentModule.class, new A2E(igReactPackage, a44)));
        arrayList.add(A3X.A00(NativeAnimatedModule.class, new A2R(igReactPackage, a44)));
        arrayList.add(A3X.A00(CameraRollManager.class, new C2102694x(igReactPackage, a44)));
        arrayList.add(A3X.A00(DialogModule.class, new A2I(igReactPackage, a44)));
        arrayList.add(A3X.A00(DatePickerDialogModule.class, new C157206nX(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgNetworkingModule.class, new AnonymousClass90Q(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactAnalyticsModule.class, new C23050A1q(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgNativeColorsModule.class, new A2G(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactCommentModerationModule.class, new AnonymousClass90P(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactBrandedContentModule.class, new AnonymousClass950(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactCheckpointModule.class, new C139135wy(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactCountryCodeRoute.class, new C139125wx(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactPostInsightsModule.class, new C147236Rd(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactPromoteMigrationModule.class, new A2Z(igReactPackage, a44)));
        arrayList.add(new A3X(new C23052A2b(igReactPackage, a44), FbReactI18nAssetsModule.NAME));
        arrayList.add(A3X.A00(FbReactI18nModule.class, new AnonymousClass9FU(igReactPackage, a44)));
        arrayList.add(A3X.A00(I18nManagerModule.class, new A2Y(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactNavigatorModule.class, new C148266Vt(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgSharedPreferencesModule.class, new A2F(igReactPackage, a44)));
        arrayList.add(A3X.A00(LocationModule.class, new A2X(igReactPackage, a44)));
        arrayList.add(A3X.A00(PermissionsModule.class, new A2W(igReactPackage, a44)));
        arrayList.add(A3X.A00(AsyncStorageModule.class, new A2V(igReactPackage, a44)));
        arrayList.add(A3X.A00(ToastModule.class, new A2U(igReactPackage, a44)));
        arrayList.add(A3X.A00(RelayAPIConfigModule.class, new AnonymousClass6BC(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactExceptionManager.class, new AnonymousClass91F(igReactPackage)));
        arrayList.add(A3X.A00(IgReactFBUserAgentModule.class, new A2S(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactFunnelLoggerModule.class, new AnonymousClass9SH(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactDialogModule.class, new C144766Gz(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactPerformanceLoggerModule.class, new A26(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactImageLoaderModule.class, new AnonymousClass909(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactInsightsModule.class, new C152796g1(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactInsightsStoryPresenterModule.class, new A2Q(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactQEModule.class, new A21(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactShoppingCatalogSettingsModule.class, new C156076lY(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactPurchaseProtectionSheetModule.class, new A23(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactShoppingPickerModule.class, new AnonymousClass9D4(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactShoppingSignupReactModule.class, new C112154s9(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactPurchaseExperienceBridgeModule.class, new AnonymousClass9M3(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactCompassionResourceModule.class, new A2N(igReactPackage, a44)));
        arrayList.add(A3X.A00(AppearanceModule.class, new AnonymousClass915(igReactPackage, a44)));
        arrayList.add(A3X.A00(AppStateModule.class, new C228099rh(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactMediaPickerNativeModule.class, new AnonymousClass6A6(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactBoostPostModule.class, new A22(igReactPackage, a44)));
        arrayList.add(A3X.A00(StatusBarModule.class, new A2M(igReactPackage, a44)));
        arrayList.add(A3X.A00(SoundManagerModule.class, new A2K(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactGeoGatingModule.class, new C148276Vw(igReactPackage, a44)));
        arrayList.add(A3X.A00(ClipboardModule.class, new C139185xC(igReactPackage, a44)));
        arrayList.add(A3X.A00(IgReactBloksNavigationModule.class, new C112164sA(igReactPackage, a44)));
        arrayList.add(A3X.A00(NetInfoModule.class, new A2J(igReactPackage, a44)));
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    public final List AAi(A44 a44) {
        ArrayList arrayList = new ArrayList();
        for (A3X a3x : A01(a44)) {
            C08750Yk A02 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createNativeModule");
            A02.A01("module", (Object) null);
            A02.A02();
            ReactMarker.logMarker(A3L.CREATE_MODULE_START, a3x.A00, 0);
            try {
                NativeModule nativeModule = (NativeModule) a3x.A01.get();
                ReactMarker.logMarker(A3L.CREATE_MODULE_END);
                SystraceMessage.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(A3L.CREATE_MODULE_END);
                SystraceMessage.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
                throw th;
            }
        }
        return arrayList;
    }

    public List ABF(A44 a44) {
        if (!(this instanceof IgReactPackage)) {
            List<A3X> emptyList = Collections.emptyList();
            if (emptyList == null || emptyList.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (A3X a3x : emptyList) {
                arrayList.add((ViewManager) a3x.A01.get());
            }
            return arrayList;
        }
        IgReactPackage igReactPackage = (IgReactPackage) this;
        return Arrays.asList(new ViewManager[]{new ARTGroupViewManager(), new ARTShapeViewManager(), new ARTTextViewManager(), new ARTSurfaceViewManager(), new IgLoadingIndicatorViewManager(), new IgReactImageManager(), new IgStaticMapViewManager(), new ReactAxialGradientManager(), new ReactBubbleSpinnerManager(), new ReactHorizontalScrollContainerViewManager(), new ReactHorizontalScrollViewManager((C23155AAf) null), new ReactModalHostManager(), new ReactProgressBarViewManager(), new ReactRawTextManager(), new ReactScrollViewManager((C23155AAf) null), new ReactSliderManager(), new ReactSwitchManager(), new ReactCheckmarkManager(), new ReactClockManager(), new ReactProductCardViewManager(), new ReactTextInputManager(), new ReactTextViewManager(), new ReactVideoManager(), new ReactViewManager(), new ReactWebViewManager(new A1z(), (List) null), new ReactVirtualTextViewManager(), new ReactDropdownPickerManager(), new ReactDialogPickerManager(), new SwipeRefreshLayoutManager(), new IgReactPerformanceLoggerFlagManager(igReactPackage.A01, igReactPackage.A00)});
    }
}
