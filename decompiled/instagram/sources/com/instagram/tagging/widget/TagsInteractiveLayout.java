package com.instagram.tagging.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.model.Tag;
import java.util.ArrayList;
import java.util.Iterator;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1NJ;
import p000X.C13300iJ;
import p000X.C27733CPc;
import p000X.C27734CPd;
import p000X.C27736CPf;
import p000X.C27738CPh;
import p000X.C27754CPy;
import p000X.C27869CUj;
import p000X.C27871CUl;
import p000X.C27872CUm;
import p000X.C28168CcW;

public class TagsInteractiveLayout extends TagsLayout implements AnonymousClass0RN, C28168CcW {
    public C27738CPh A00;
    public C27734CPd A01;
    public C27734CPd A02;
    public C27754CPy A03;
    public C27736CPf A04;
    public ArrayList A05 = new ArrayList();
    public boolean A06;
    public boolean A07;
    public AnonymousClass0C1 A08;
    public ArrayList A09 = new ArrayList();
    public ArrayList A0A = new ArrayList();
    public final GestureDetector A0B = new GestureDetector(getContext(), new C27733CPc(this));

    public final void A6s(C13300iJ r1) {
    }

    public final void AET() {
        this.A01 = true;
        removeView(this.A02);
        this.A02 = null;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.8f, 1.0f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < getChildCount(); i++) {
            C27734CPd A022 = A02(i);
            Tag tag = (Tag) A022.getTag();
            if (this.A00 != C27738CPh.PEOPLE || tag == null || tag.A01() != C27738CPh.SUGGESTED_PRODUCT) {
                A022.A06(alphaAnimation);
            }
        }
        this.A04.BQr();
    }

    public final void BbP() {
    }

    public final void Btf() {
    }

    public String getModuleName() {
        return "tags_interactive_layout";
    }

    public class UnnamedTagSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(475);
        public PointF A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.A00.x);
            parcel.writeFloat(this.A00.y);
        }

        public UnnamedTagSavedState(Parcel parcel) {
            super(parcel);
            PointF pointF = new PointF();
            this.A00 = pointF;
            pointF.x = parcel.readFloat();
            this.A00.y = parcel.readFloat();
        }

        public UnnamedTagSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static void A01(TagsInteractiveLayout tagsInteractiveLayout, Product product, boolean z) {
        if (tagsInteractiveLayout.A02 != null) {
            Iterator it = tagsInteractiveLayout.A0A.iterator();
            while (it.hasNext()) {
                if (((ProductTag) it.next()).A03().equals(product.getId())) {
                    tagsInteractiveLayout.AET();
                    return;
                }
            }
            if (!tagsInteractiveLayout.A05.isEmpty()) {
                Iterator it2 = tagsInteractiveLayout.A05.iterator();
                MediaSuggestedProductTag mediaSuggestedProductTag = null;
                MediaSuggestedProductTag mediaSuggestedProductTag2 = null;
                while (it2.hasNext()) {
                    MediaSuggestedProductTag mediaSuggestedProductTag3 = (MediaSuggestedProductTag) it2.next();
                    C27734CPd cPd = tagsInteractiveLayout.A02;
                    if (cPd != null && mediaSuggestedProductTag3.A00().equals(cPd.getNormalizedPosition())) {
                        mediaSuggestedProductTag = mediaSuggestedProductTag3;
                    } else if (mediaSuggestedProductTag3.A02 && mediaSuggestedProductTag3.A02() != null && mediaSuggestedProductTag3.A02().getId().equals(product.getId())) {
                        mediaSuggestedProductTag2 = mediaSuggestedProductTag3;
                    }
                }
                if (mediaSuggestedProductTag != null) {
                    tagsInteractiveLayout.A06(mediaSuggestedProductTag);
                    tagsInteractiveLayout.A04.BPy(mediaSuggestedProductTag, product, z);
                }
                if (mediaSuggestedProductTag2 != null) {
                    tagsInteractiveLayout.A06(mediaSuggestedProductTag2);
                }
            }
            tagsInteractiveLayout.A00(new ProductTag(product, tagsInteractiveLayout.A02.getNormalizedPosition()));
        }
    }

    public final void A05(PointF pointF) {
        C27734CPd cUl;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.8f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < getChildCount(); i++) {
            if (A02(i).getNormalizedPosition() == pointF) {
                alphaAnimation = new AlphaAnimation(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                alphaAnimation.setFillAfter(true);
            }
            A02(i).A05(alphaAnimation);
        }
        this.A01 = false;
        C27738CPh cPh = this.A00;
        String string = getResources().getString(C0003R.string.people_tagging_default_text);
        AnonymousClass0C1 r2 = this.A08;
        if (cPh == C27738CPh.PEOPLE) {
            cUl = new C27869CUj(getContext(), r2, pointF);
        } else if (cPh == C27738CPh.SUGGESTED_PRODUCT) {
            cUl = new C27872CUm(getContext(), r2, pointF, true);
        } else {
            cUl = new C27871CUl(getContext(), r2, pointF);
        }
        cUl.setText(string);
        this.A02 = cUl;
        addView(cUl);
        this.A04.BQs(pointF);
    }

    public final void A06(MediaSuggestedProductTag mediaSuggestedProductTag) {
        this.A05.remove(mediaSuggestedProductTag);
        removeView(findViewWithTag(mediaSuggestedProductTag));
        this.A04.BQr();
    }

    public final void A4g(C13300iJ r3) {
        C27734CPd cPd = this.A02;
        if (cPd != null) {
            A00(new PeopleTag(r3, cPd.getNormalizedPosition()));
        }
    }

    public boolean handleTapUp(float f, float f2) {
        ArrayList arrayList;
        if (this.A02 != null) {
            AET();
            return true;
        }
        C27734CPd cPd = this.A01;
        if (cPd != null) {
            Tag tag = (Tag) cPd.getTag();
            C27738CPh A012 = tag.A01();
            if (A012 == C27738CPh.SUGGESTED_PRODUCT) {
                MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) tag;
                if (mediaSuggestedProductTag.A02) {
                    this.A04.BPz(this, this.A09, this.A0A, mediaSuggestedProductTag);
                } else {
                    if (!this.A03.Ac7(this.A09.size(), this.A0A.size())) {
                        if (this.A04.Aoz(this, this.A09, this.A0A, mediaSuggestedProductTag)) {
                            A05(this.A01.getNormalizedPosition());
                            return true;
                        }
                    }
                    this.A03.Boc(this.A09.size(), this.A0A.size());
                    return true;
                }
            } else {
                if (this.A06) {
                    if (A012 == C27738CPh.PEOPLE) {
                        arrayList = this.A09;
                    } else {
                        arrayList = this.A0A;
                    }
                    arrayList.remove(tag);
                    removeView(findViewWithTag(tag));
                    this.A04.BQr();
                }
                if (this.A07) {
                    this.A01.A03();
                    return true;
                }
            }
        } else {
            if (!this.A03.Ac7(this.A09.size(), this.A0A.size())) {
                if (this.A04.Aoz(this, this.A09, this.A0A, (MediaSuggestedProductTag) null)) {
                    A05(new PointF(f / ((float) getWidth()), f2 / ((float) getHeight())));
                    return true;
                }
            }
            this.A03.Boc(this.A09.size(), this.A0A.size());
            return true;
        }
        return true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof UnnamedTagSavedState) {
            UnnamedTagSavedState unnamedTagSavedState = (UnnamedTagSavedState) parcelable;
            super.onRestoreInstanceState(unnamedTagSavedState.getSuperState());
            A05(unnamedTagSavedState.A00);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setEditingTagType(C27738CPh cPh) {
        this.A00 = cPh;
        if (cPh == C27738CPh.PRODUCT) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
            alphaAnimation.setFillAfter(true);
            for (int i = 0; i < getChildCount(); i++) {
                C27734CPd A022 = A02(i);
                Tag tag = (Tag) A022.getTag();
                if (tag != null && tag.A01() == C27738CPh.SUGGESTED_PRODUCT) {
                    A022.A06(alphaAnimation);
                }
            }
        } else {
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            alphaAnimation2.setFillAfter(true);
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                C27734CPd A023 = A02(i2);
                Tag tag2 = (Tag) A023.getTag();
                if (tag2 != null && tag2.A01() == C27738CPh.SUGGESTED_PRODUCT) {
                    A023.A05(alphaAnimation2);
                }
            }
        }
        A04();
    }

    public void setTags(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z, AnonymousClass0C1 r7) {
        this.A09 = arrayList;
        this.A0A = arrayList2;
        if (arrayList3 != null) {
            this.A05 = arrayList3;
        }
        this.A08 = r7;
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        super.setTags(arrayList4, z, this.A08);
    }

    private void A00(Tag tag) {
        if (tag.A01() == C27738CPh.PEOPLE) {
            this.A09.add((PeopleTag) tag);
        } else {
            this.A0A.add((ProductTag) tag);
        }
        A03(tag, false, this.A08, (AnonymousClass1NJ) null);
        AET();
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (this.A02 == null) {
            return onSaveInstanceState;
        }
        UnnamedTagSavedState unnamedTagSavedState = new UnnamedTagSavedState(onSaveInstanceState);
        unnamedTagSavedState.A00 = this.A02.getNormalizedPosition();
        return unnamedTagSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(-212043952);
        if (this.A01 != null && motionEvent.getAction() == 1) {
            this.A04.BQt(this.A01.getNormalizedPosition());
            if (this.A01.getTag() != null) {
                ((Tag) this.A01.getTag()).A00 = this.A01.getNormalizedPosition();
            }
        }
        boolean onTouchEvent = this.A0B.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(697980870, A052);
        return onTouchEvent;
    }

    public void setListener(C27736CPf cPf) {
        this.A04 = cPf;
    }

    public void setTaggingEditProvider(C27754CPy cPy) {
        this.A03 = cPy;
    }

    public TagsInteractiveLayout(Context context) {
        super(context);
    }

    public TagsInteractiveLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TagsInteractiveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
