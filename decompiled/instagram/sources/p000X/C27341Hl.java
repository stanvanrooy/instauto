package p000X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.instagram.common.pictureinpicture.PictureInPictureBackdrop;
import com.instagram.common.task.LazyObservableTask;

/* renamed from: X.1Hl  reason: invalid class name and case insensitive filesystem */
public abstract class C27341Hl extends AnonymousClass1HC implements AnonymousClass0RN, C12830hS, AnonymousClass1HH, C27351Hm, AnonymousClass1HI, AnonymousClass1HJ {
    public static final String KEY_CONTENT_INSETS = "contentInsets";
    public Rect mContentInsets;
    public final AnonymousClass1HV mFragmentVisibilityListenerController = new AnonymousClass1HV();
    public final AnonymousClass1HU mLifecycleListenerSet = new AnonymousClass1HU();
    public PictureInPictureBackdrop mPictureInPictureBackdrop;
    public final AnonymousClass1I0 mVolumeKeyPressController = new AnonymousClass1I0();

    public abstract C06590Pq getSession();

    public boolean isContainerFragment() {
        return false;
    }

    public boolean shouldCreatePictureInPictureBackdrop() {
        return true;
    }

    public void addFragmentVisibilityListener(C32741bm r2) {
        this.mFragmentVisibilityListenerController.addFragmentVisibilityListener(r2);
    }

    public final AnonymousClass1I0 getVolumeKeyPressController() {
        return this.mVolumeKeyPressController;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mLifecycleListenerSet.A07(i, i2, intent);
    }

    public void registerLifecycleListener(AnonymousClass19r r2) {
        this.mLifecycleListenerSet.A0C(r2);
    }

    public void registerLifecycleListenerSet(AnonymousClass1HU r4) {
        AnonymousClass1HU r2 = this.mLifecycleListenerSet;
        for (int i = 0; i < r4.A00.size(); i++) {
            r2.A0C((AnonymousClass19r) r4.A00.get(i));
        }
    }

    public void removeFragmentVisibilityListener(C32741bm r2) {
        this.mFragmentVisibilityListenerController.removeFragmentVisibilityListener(r2);
    }

    public void setContentInset(int i, int i2, int i3, int i4) {
        this.mContentInsets = new Rect(i, i2, i3, i4);
        tryToApplyContentInset();
    }

    public void tryToApplyContentInset() {
        View view = this.mView;
        if (view != null && this.mContentInsets != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                Rect rect = this.mContentInsets;
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    public void unregisterLifecycleListener(AnonymousClass19r r2) {
        this.mLifecycleListenerSet.A00.remove(r2);
    }

    private C06590Pq getSessionWithAssertion() {
        C06590Pq session = getSession();
        AnonymousClass0a4.A07(session, AnonymousClass000.A0E(getClass().getName(), " is returning null from getSession()"));
        return session;
    }

    private void maybeReportNavigationModuleResumed() {
        if (!isContainerFragment() && isResumed() && this.mUserVisibleHint) {
            C26441Dh.A00(getSessionWithAssertion()).A06(this);
        }
    }

    public void afterOnCreate(Bundle bundle) {
        super.afterOnCreate(bundle);
        this.mLifecycleListenerSet.A00();
    }

    public void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        super.afterOnCreateView(layoutInflater, viewGroup, bundle, view);
        if (view != null) {
            this.mLifecycleListenerSet.A0A(view);
        }
    }

    public void afterOnDestroy() {
        super.afterOnDestroy();
        this.mLifecycleListenerSet.A01();
    }

    public void afterOnDestroyView() {
        super.afterOnDestroyView();
        this.mLifecycleListenerSet.A02();
    }

    public void afterOnPause() {
        super.afterOnPause();
        this.mLifecycleListenerSet.A03();
        PictureInPictureBackdrop pictureInPictureBackdrop = this.mPictureInPictureBackdrop;
        if (pictureInPictureBackdrop != null) {
            pictureInPictureBackdrop.A01();
        }
    }

    public void afterOnResume() {
        super.afterOnResume();
        this.mLifecycleListenerSet.A04();
        PictureInPictureBackdrop pictureInPictureBackdrop = this.mPictureInPictureBackdrop;
        if (pictureInPictureBackdrop != null) {
            pictureInPictureBackdrop.A02();
        }
    }

    public void afterOnStart() {
        super.afterOnStart();
        this.mLifecycleListenerSet.A05();
    }

    public void afterOnStop() {
        super.afterOnStop();
        this.mLifecycleListenerSet.A06();
    }

    public Activity getRootActivity() {
        Context context = getContext();
        if (context instanceof Activity) {
            Activity parent = ((Activity) context).getParent();
            if (parent == null) {
                return (Activity) getContext();
            }
            return parent;
        }
        throw new RuntimeException("Fragment is not attached.");
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return C33101cN.A01(this, z, i2);
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return C33101cN.A00(this, z, i2);
    }

    public void onDestroy() {
        int A02 = AnonymousClass0Z0.A02(-799703426);
        super.onDestroy();
        C49922Ee.A00(this);
        AnonymousClass0Z0.A09(-1092462541, A02);
    }

    public void onDestroyView() {
        int A02 = AnonymousClass0Z0.A02(-329702987);
        super.onDestroyView();
        this.mPictureInPictureBackdrop = null;
        AnonymousClass0Z0.A09(1163185354, A02);
    }

    public void onResume() {
        int A02 = AnonymousClass0Z0.A02(-833451044);
        super.onResume();
        maybeReportNavigationModuleResumed();
        AnonymousClass0Z0.A09(-241399534, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Rect rect = this.mContentInsets;
        if (rect != null) {
            bundle.putParcelable("contentInsets", rect);
        }
        this.mLifecycleListenerSet.A08(bundle);
    }

    public void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        boolean z3 = false;
        if (z2 != z) {
            z3 = true;
        }
        this.mFragmentVisibilityListenerController.A00(z, this);
        if (z3) {
            maybeReportNavigationModuleResumed();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLifecycleListenerSet.A0B(view, bundle);
        if (shouldCreatePictureInPictureBackdrop()) {
            this.mPictureInPictureBackdrop = new PictureInPictureBackdrop(getActivity());
        }
        if (!(bundle == null || bundle.getParcelable("contentInsets") == null)) {
            this.mContentInsets = (Rect) bundle.getParcelable("contentInsets");
        }
        tryToApplyContentInset();
        C18280rb r2 = C18280rb.A00;
        if (r2 != null) {
            this.mLifecycleListenerSet.A0C(r2.A00(getActivity()));
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(-1337981550);
        super.onViewStateRestored(bundle);
        this.mLifecycleListenerSet.A09(bundle);
        AnonymousClass0Z0.A09(-982976163, A02);
    }

    public final boolean onVolumeKeyPressed(AnonymousClass2YZ r4, KeyEvent keyEvent) {
        for (AnonymousClass1HD r1 : getChildFragmentManager().A0Q.A02()) {
            if ((r1 instanceof C27351Hm) && ((C27351Hm) r1).onVolumeKeyPressed(r4, keyEvent)) {
                return true;
            }
        }
        return this.mVolumeKeyPressController.onVolumeKeyPressed(r4, keyEvent);
    }

    public void scheduleLazily(AnonymousClass0IT r4) {
        C28351Lj.A00(getContext(), AnonymousClass1L8.A00(this), new LazyObservableTask(r4));
    }

    public void schedule(C17860qv r3) {
        C28351Lj.A00(getContext(), AnonymousClass1L8.A00(this), r3);
    }

    public void schedule(C17860qv r1, int i, int i2, boolean z, boolean z2) {
        schedule(r1);
    }
}
