package p000X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentState;

/* renamed from: X.00j  reason: invalid class name and case insensitive filesystem */
public final class C019500j {
    public int A00 = -1;
    public final AnonymousClass1HD A01;
    public final AnonymousClass1AT A02;

    public static Bundle A00(C019500j r4) {
        Bundle bundle = new Bundle();
        r4.A01.performSaveInstanceState(bundle);
        r4.A02.A02(r4.A01, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        View view = r4.A01.mView;
        if (!(view == null || view == null)) {
            SparseArray sparseArray = new SparseArray();
            view.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                r4.A01.mSavedViewState = sparseArray;
            }
        }
        if (r4.A01.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", r4.A01.mSavedViewState);
        }
        if (!r4.A01.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", r4.A01.mUserVisibleHint);
        }
        return bundle;
    }

    public final void A01(ClassLoader classLoader) {
        Bundle bundle = this.A01.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            AnonymousClass1HD r2 = this.A01;
            r2.mSavedViewState = r2.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            AnonymousClass1HD r22 = this.A01;
            r22.mTargetWho = r22.mSavedFragmentState.getString("android:target_state");
            AnonymousClass1HD r3 = this.A01;
            if (r3.mTargetWho != null) {
                r3.mTargetRequestCode = r3.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            AnonymousClass1HD r32 = this.A01;
            Boolean bool = r32.mSavedUserVisibleHint;
            if (bool != null) {
                r32.mUserVisibleHint = bool.booleanValue();
                r32.mSavedUserVisibleHint = null;
            } else {
                r32.mUserVisibleHint = r32.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            AnonymousClass1HD r1 = this.A01;
            if (!r1.mUserVisibleHint) {
                r1.mDeferStart = true;
            }
        }
    }

    public C019500j(AnonymousClass1AT r2, AnonymousClass1HD r3) {
        this.A02 = r2;
        this.A01 = r3;
    }

    public C019500j(AnonymousClass1AT r3, AnonymousClass1HD r4, FragmentState fragmentState) {
        String str;
        this.A02 = r3;
        this.A01 = r4;
        r4.mSavedViewState = null;
        r4.mBackStackNesting = 0;
        r4.mInLayout = false;
        r4.mAdded = false;
        AnonymousClass1HD r0 = r4.mTarget;
        if (r0 != null) {
            str = r0.mWho;
        } else {
            str = null;
        }
        r4.mTargetWho = str;
        r4.mTarget = null;
        Bundle bundle = fragmentState.A00;
        if (bundle != null) {
            r4.mSavedFragmentState = bundle;
        } else {
            r4.mSavedFragmentState = new Bundle();
        }
    }

    public C019500j(AnonymousClass1AT r4, ClassLoader classLoader, AnonymousClass1AV r6, FragmentState fragmentState) {
        this.A02 = r4;
        this.A01 = r6.A01(classLoader, fragmentState.A05);
        Bundle bundle = fragmentState.A04;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        AnonymousClass1HD r2 = this.A01;
        r2.setArguments(fragmentState.A04);
        r2.mWho = fragmentState.A0C;
        r2.mFromLayout = fragmentState.A07;
        r2.mRestored = true;
        r2.mFragmentId = fragmentState.A02;
        r2.mContainerId = fragmentState.A01;
        r2.mTag = fragmentState.A0B;
        r2.mRetainInstance = fragmentState.A0A;
        r2.mRemoving = fragmentState.A09;
        r2.mDetached = fragmentState.A06;
        r2.mHidden = fragmentState.A08;
        r2.mMaxState = AnonymousClass77Z.values()[fragmentState.A03];
        Bundle bundle2 = fragmentState.A00;
        if (bundle2 != null) {
            this.A01.mSavedFragmentState = bundle2;
        } else {
            this.A01.mSavedFragmentState = new Bundle();
        }
        AnonymousClass1AM.A0F(2);
    }
}
