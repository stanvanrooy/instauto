package com.instagram.tagging.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.model.Tag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PB;
import p000X.AnonymousClass9GA;
import p000X.AnonymousClass9GD;
import p000X.AnonymousClass9GE;
import p000X.AnonymousClass9GI;
import p000X.C177157hP;
import p000X.C27734CPd;
import p000X.C27869CUj;
import p000X.C27871CUl;
import p000X.C27872CUm;
import p000X.C36841ih;
import p000X.C38311l4;

public class TagsLayout extends ViewGroup {
    public AnonymousClass9GE A00;
    public boolean A01 = true;

    private List getOverlaps() {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Integer valueOf = Integer.valueOf(i);
            if (!hashSet.contains(valueOf)) {
                hashSet.add(valueOf);
                ArrayList arrayList = new ArrayList(8);
                linkedList.add(arrayList);
                arrayList.add(A02(i));
                Rect rect = new Rect(A02(i).getDrawingBounds());
                for (int i2 = i + 1; i2 < childCount; i2++) {
                    if (A02(i2).A08() && Rect.intersects(rect, A02(i2).getDrawingBounds())) {
                        rect.union(A02(i2).getDrawingBounds());
                        hashSet.add(Integer.valueOf(i2));
                        arrayList.add(A02(i2));
                    }
                }
            }
        }
        return linkedList;
    }

    public final void A04() {
        int i;
        if (this.A01) {
            int[] iArr = new int[25];
            int[] iArr2 = new int[26];
            for (List list : getOverlaps()) {
                Collections.sort(list, new AnonymousClass9GI(this));
                iArr2[0] = -1;
                int i2 = 0;
                while (i2 < list.size()) {
                    int[] A002 = A00(list, i2, i2);
                    int i3 = i2;
                    while (true) {
                        i = A002[0];
                        if (i >= iArr2[i3]) {
                            break;
                        }
                        i3 = iArr[i3 - 1];
                        A002 = A00(list, i3, i2);
                    }
                    int i4 = i2 + 1;
                    iArr2[i4] = i + A002[1];
                    iArr[i2] = i3;
                    i2 = i4;
                }
            }
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            A02(i5).A02();
        }
    }

    private int[] A00(List list, int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        int A012 = ((C27734CPd) list.get(i)).A01(0);
        int A002 = (((C27734CPd) list.get(i2)).A00(measuredWidth) + ((C27734CPd) list.get(i2)).getBubbleWidth()) - A012;
        int i3 = 0;
        for (int i4 = i; i4 <= i2; i4++) {
            i3 += ((C27734CPd) list.get(i4)).getBubbleWidth();
        }
        if (i3 <= A002) {
            A012 = ((C27734CPd) list.get(i)).getPreferredBounds().left - (((((C27734CPd) list.get(i)).getPreferredBounds().left + i3) - ((C27734CPd) list.get(i2)).getPreferredBounds().right) / 2);
            A002 = i3;
        }
        int max = Math.max(0, A012);
        int i5 = 0;
        while (i <= i2) {
            int bubbleWidth = (((C27734CPd) list.get(i)).getBubbleWidth() * A002) / i3;
            ((C27734CPd) list.get(i)).A04(max + i5 + (bubbleWidth >> 1));
            i5 += bubbleWidth;
            i++;
        }
        return new int[]{max, A002};
    }

    public final C27734CPd A02(int i) {
        return (C27734CPd) getChildAt(i);
    }

    public final C27734CPd A03(Tag tag, boolean z, AnonymousClass0C1 r10, AnonymousClass1NJ r11) {
        String A04;
        String A042;
        C27734CPd cPd;
        switch (tag.A01().ordinal()) {
            case 1:
                Context context = getContext();
                PointF A002 = tag.A00();
                AnonymousClass0a4.A06(A002);
                C27871CUl cUl = new C27871CUl(context, r10, A002);
                Product product = (Product) tag.A02();
                AnonymousClass1PB textLayoutParams = cUl.getTextLayoutParams();
                AnonymousClass0a4.A06(textLayoutParams);
                getContext();
                Merchant merchant = ((Product) tag.A02()).A02;
                if (r11 != null) {
                    A04 = r11.A0c(r10).getId();
                } else {
                    A04 = r10.A04();
                }
                cUl.A0B(C177157hP.A00(r10, product, textLayoutParams, context, !merchant.A02.equals(A04)), C0003R.color.white);
                cPd = cUl;
                break;
            case 2:
                Context context2 = getContext();
                PointF A003 = tag.A00();
                AnonymousClass0a4.A06(A003);
                C27872CUm cUm = new C27872CUm(context2, r10, A003, ((MediaSuggestedProductTag) tag).A02);
                Product product2 = (Product) tag.A02();
                AnonymousClass1PB textLayoutParams2 = cUm.getTextLayoutParams();
                AnonymousClass0a4.A06(textLayoutParams2);
                getContext();
                Merchant merchant2 = ((Product) tag.A02()).A02;
                if (r11 != null) {
                    A042 = r11.A0c(r10).getId();
                } else {
                    A042 = r10.A04();
                }
                cUm.A0B(C177157hP.A00(r10, product2, textLayoutParams2, context2, !merchant2.A02.equals(A042)), C0003R.color.igds_primary_text);
                cPd = cUm;
                break;
            default:
                Context context3 = getContext();
                PointF A004 = tag.A00();
                AnonymousClass0a4.A06(A004);
                C27734CPd cUj = new C27869CUj(context3, r10, A004);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tag.A05());
                spannableStringBuilder.setSpan(new C38311l4(), 0, spannableStringBuilder.length(), 33);
                cUj.setText(spannableStringBuilder);
                cPd = cUj;
                break;
        }
        cPd.setTag(tag);
        cPd.setClickable(z);
        addView(cPd);
        return cPd;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A04();
        AnonymousClass9GE r0 = this.A00;
        if (r0 != null) {
            r0.BQw();
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(i, i2);
        }
        setMeasuredDimension(size, size2);
    }

    public static void setTagsLayoutListener(TagsLayout tagsLayout, AnonymousClass9GE r1) {
        tagsLayout.A00 = r1;
    }

    public TagsLayout(Context context) {
        super(context);
    }

    public TagsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TagsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setTags(List list, AnonymousClass1NJ r9, C36841ih r10, int i, boolean z, boolean z2, AnonymousClass0C1 r14) {
        AnonymousClass0a4.A06(list);
        LinkedList linkedList = new LinkedList();
        String id = r14.A06.getId();
        Iterator it = list.iterator();
        C27734CPd cPd = null;
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            if (tag.A00() != null) {
                boolean z3 = false;
                if (r9 != null) {
                    z3 = true;
                }
                C27734CPd A03 = A03(tag, z3, r14, r9);
                if (r9 != null) {
                    A03.setMedia(r9);
                }
                if (r10 != null) {
                    A03.setMediaState(r10);
                }
                A03.setCarouselIndex(i);
                linkedList.add(A03);
                if ((tag instanceof PeopleTag) && tag.A03().equals(id)) {
                    cPd = A03;
                }
            }
        }
        if (cPd != null) {
            cPd.bringToFront();
        }
        if (z) {
            setTagsLayoutListener(this, new AnonymousClass9GA(this, linkedList, z2, list));
        }
        post(new AnonymousClass9GD(this));
    }

    public void setTags(List list, boolean z, AnonymousClass0C1 r11) {
        setTags(list, (AnonymousClass1NJ) null, (C36841ih) null, -1, z, false, r11);
    }
}
