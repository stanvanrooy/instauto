package p000X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment$SavedState;
import java.util.ArrayList;

/* renamed from: X.00k  reason: invalid class name and case insensitive filesystem */
public abstract class C019600k extends C71883Cn {
    public AnonymousClass1HD A00 = null;
    public AnonymousClass1H6 A01 = null;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public final int A04;
    public final AnonymousClass1AM A05;

    public abstract AnonymousClass1HD A00(int i);

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment$SavedState fragment$SavedState;
        AnonymousClass1HD r6 = (AnonymousClass1HD) obj;
        if (this.A01 == null) {
            this.A01 = this.A05.A0Q();
        }
        while (this.A03.size() <= i) {
            this.A03.add((Object) null);
        }
        ArrayList arrayList = this.A03;
        if (r6.isAdded()) {
            fragment$SavedState = this.A05.A0K(r6);
        } else {
            fragment$SavedState = null;
        }
        arrayList.set(i, fragment$SavedState);
        this.A02.set(i, (Object) null);
        this.A01.A0D(r6);
        if (r6.equals(this.A00)) {
            this.A00 = null;
        }
    }

    public final void finishUpdate(ViewGroup viewGroup) {
        AnonymousClass1H6 r0 = this.A01;
        if (r0 != null) {
            try {
                r0.A0H();
            } catch (IllegalStateException unused) {
                this.A01.A0A();
            }
            this.A01 = null;
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        AnonymousClass1HD A002;
        Fragment$SavedState fragment$SavedState;
        if (this.A02.size() <= i || (A002 = (AnonymousClass1HD) this.A02.get(i)) == null) {
            if (this.A01 == null) {
                this.A01 = this.A05.A0Q();
            }
            A002 = A00(i);
            if (this.A03.size() > i && (fragment$SavedState = (Fragment$SavedState) this.A03.get(i)) != null) {
                A002.setInitialSavedState(fragment$SavedState);
            }
            while (this.A02.size() <= i) {
                this.A02.add((Object) null);
            }
            A002.setMenuVisibility(false);
            if (this.A04 == 0) {
                A002.setUserVisibleHint(false);
            }
            this.A02.set(i, A002);
            this.A01.A01(viewGroup.getId(), A002);
            if (this.A04 == 1) {
                this.A01.A0F(A002, AnonymousClass77Z.STARTED);
                return A002;
            }
        }
        return A002;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        if (((AnonymousClass1HD) obj).mView == view) {
            return true;
        }
        return false;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.A03.clear();
            this.A02.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.A03.add((Fragment$SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    AnonymousClass1HD A0M = this.A05.A0M(bundle, str);
                    if (A0M == null) {
                        Log.w("FragmentStatePagerAdapt", AnonymousClass000.A0E("Bad fragment at key ", str));
                    } else {
                        while (this.A02.size() <= parseInt) {
                            this.A02.add((Object) null);
                        }
                        A0M.setMenuVisibility(false);
                        this.A02.set(parseInt, A0M);
                    }
                }
            }
        }
    }

    public final Parcelable saveState() {
        Bundle bundle;
        if (this.A03.size() > 0) {
            bundle = new Bundle();
            Fragment$SavedState[] fragment$SavedStateArr = new Fragment$SavedState[this.A03.size()];
            this.A03.toArray(fragment$SavedStateArr);
            bundle.putParcelableArray("states", fragment$SavedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.A02.size(); i++) {
            AnonymousClass1HD r2 = (AnonymousClass1HD) this.A02.get(i);
            if (r2 != null && r2.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.A05.A0Z(bundle, AnonymousClass000.A05("f", i), r2);
            }
        }
        return bundle;
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        AnonymousClass1HD r7 = (AnonymousClass1HD) obj;
        AnonymousClass1HD r0 = this.A00;
        if (r7 != r0) {
            if (r0 != null) {
                r0.setMenuVisibility(false);
                if (this.A04 == 1) {
                    if (this.A01 == null) {
                        this.A01 = this.A05.A0Q();
                    }
                    this.A01.A0F(this.A00, AnonymousClass77Z.STARTED);
                } else {
                    this.A00.setUserVisibleHint(false);
                }
            }
            r7.setMenuVisibility(true);
            if (this.A04 == 1) {
                if (this.A01 == null) {
                    this.A01 = this.A05.A0Q();
                }
                this.A01.A0F(r7, AnonymousClass77Z.RESUMED);
            } else {
                r7.setUserVisibleHint(true);
            }
            this.A00 = r7;
        }
    }

    public C019600k(AnonymousClass1AM r3, int i) {
        this.A05 = r3;
        this.A04 = i;
    }

    public final void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}
