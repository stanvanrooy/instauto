package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.C0003R;
import com.facebook.forker.Process;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.1Ps  reason: invalid class name and case insensitive filesystem */
public final class C29391Ps extends C29121Or {
    public LinearLayoutManager A00;
    public AnonymousClass1VI A01;
    public C30261Td A02;
    public boolean A03;
    public Integer A04;
    public final Context A05;
    public final C28161Kq A06;
    public final C29401Pt A07;
    public final AnonymousClass0C1 A08;
    public final AnonymousClass1HD A09;
    public final C28181Ks A0A;
    public final boolean A0B;

    public final int ANH(int i, Object obj, Object obj2) {
        String id = ((C43411uN) obj).getId();
        if (id != null) {
            return id.hashCode();
        }
        return obj.hashCode();
    }

    public final int getViewTypeCount() {
        return 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if ((r2.getTag() instanceof p000X.CZT) != false) goto L_0x001a;
     */
    private View A00(ViewGroup viewGroup, C43481uU r5) {
        boolean z;
        C29401Pt r1 = this.A07;
        View view = r1.A00;
        r1.A00 = null;
        if (view != null) {
            if (!(view == null || view.getTag() == null)) {
                z = true;
            }
            z = false;
            if (!z) {
                return view;
            }
        }
        int i = 2131886724;
        if (r5 == C43481uU.EMBEDDED_WITH_CONTENT_THUMBNAIL) {
            i = 2131886723;
        }
        View inflate = LayoutInflater.from(new ContextThemeWrapper(viewGroup.getContext(), i)).inflate(C0003R.layout.netego_carousel_redesign, viewGroup, false);
        inflate.setTag(CZS.A00(inflate));
        return inflate;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: X.ChM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: X.20c} */
    /* JADX WARNING: type inference failed for: r8v7, types: [X.1PH] */
    /* JADX WARNING: type inference failed for: r8v11, types: [X.ChM] */
    /* JADX WARNING: type inference failed for: r8v18, types: [X.20c, X.1PH] */
    /* JADX WARNING: type inference failed for: r8v38 */
    /* JADX WARNING: type inference failed for: r8v39 */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03e5, code lost:
        if (r3 != false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03f8, code lost:
        if (r3 != false) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x040f, code lost:
        r8.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0214, code lost:
        if (r1.A07 != false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0271, code lost:
        if (r1.A07 != false) goto L_0x0273;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A6f(int i, View view, Object obj, Object obj2) {
        boolean z;
        ? r8;
        boolean z2;
        ? r82;
        boolean z3;
        Resources resources;
        int i2;
        String str;
        Object obj3 = obj;
        Object obj4 = obj2;
        int A032 = AnonymousClass0Z0.A03(-1369753895);
        View view2 = view;
        int i3 = i;
        if (i == 0) {
            Context context = this.A05;
            AnonymousClass1HD r3 = this.A09;
            AnonymousClass0C1 r21 = this.A08;
            C31711Zp r0 = (C31711Zp) view2.getTag();
            C28161Kq r7 = this.A06;
            C30261Td r11 = this.A02;
            C43411uN r4 = (C43411uN) obj3;
            C43541ua r1 = (C43541ua) obj4;
            C29401Pt r20 = this.A07;
            C28181Ks r19 = this.A0A;
            Integer num = this.A04;
            AnonymousClass20Y.A00(r21, r4, r1);
            View view3 = r0.A02;
            int i4 = 8;
            if (r1.A06) {
                i4 = 0;
            }
            view3.setVisibility(i4);
            View view4 = r0.A03;
            int i5 = 0;
            if (r1.getPosition() == 0) {
                i5 = 8;
            }
            view4.setVisibility(i5);
            View view5 = r0.A00;
            int i6 = 0;
            if (r1.getPosition() == 0) {
                i6 = 8;
            }
            view5.setVisibility(i6);
            String str2 = r4.A0D;
            if (!TextUtils.isEmpty(str2)) {
                r0.A07.setText(str2);
            }
            String str3 = r4.A0C;
            r0.A06.setText(str3);
            TextView textView = r0.A06;
            int i7 = 0;
            if (TextUtils.isEmpty(str3)) {
                i7 = 8;
            }
            textView.setVisibility(i7);
            TextView textView2 = r0.A05;
            if (r1.A05) {
                z = true;
            }
            z = false;
            int i8 = 4;
            if (z) {
                i8 = 0;
            }
            textView2.setVisibility(i8);
            ConstraintLayout constraintLayout = r0.A08;
            int i9 = 8;
            if (r1.A07) {
                i9 = 0;
            }
            constraintLayout.setVisibility(i9);
            View view6 = r0.A01;
            int i10 = 0;
            if (r1.A07) {
                i10 = 8;
            }
            view6.setVisibility(i10);
            String str4 = r4.A06;
            if (!TextUtils.isEmpty(str4)) {
                r0.A05.setText(str4);
                r0.A04.setText(str4);
            }
            AnonymousClass20Z r14 = new AnonymousClass20Z(r7, r4);
            r0.A05.setOnClickListener(r14);
            r0.A08.setOnClickListener(r14);
            if (r4.A0L) {
                r0.A09.setVisibility(0);
                r0.A09.setOnClickListener(new C56732cy(r11, r4, r1));
                if (r1.A05) {
                    z3 = true;
                }
                z3 = false;
                if (z3) {
                    C31691Zj r112 = (C31691Zj) r0.A05.getLayoutParams();
                    r112.A0I = -1;
                    r0.A05.setLayoutParams(r112);
                    C43671us r12 = new C43671us();
                    r12.A0G((ConstraintLayout) r0.A02);
                    r12.A0C(C0003R.C0005id.netego_carousel_cta, 6, C0003R.C0005id.netego_carousel_title, 7, 0);
                    r12.A0E((ConstraintLayout) r0.A02);
                    TextView textView3 = r0.A05;
                    textView3.setPaddingRelative(0, textView3.getPaddingTop(), r0.A05.getPaddingEnd(), r0.A05.getPaddingBottom());
                    if (!TextUtils.isEmpty(str2)) {
                        r0.A07.append(context.getString(C0003R.string.dot_with_space));
                    }
                }
            } else {
                r0.A05.setPaddingRelative(context.getResources().getDimensionPixelSize(C0003R.dimen.carousel_horizontal_padding), r0.A05.getPaddingTop(), r0.A05.getPaddingEnd(), r0.A05.getPaddingBottom());
                C43671us r10 = new C43671us();
                r10.A0G((ConstraintLayout) r0.A02);
                r10.A0C(C0003R.C0005id.netego_carousel_cta, 7, 0, 7, 0);
                r10.A0E((ConstraintLayout) r0.A02);
                r0.A09.setVisibility(8);
                r0.A09.setOnClickListener((View.OnClickListener) null);
            }
            if (r4.A0H != null) {
                AnonymousClass1PH r83 = r0.A0A.A0J;
                if (r83 instanceof C465920c) {
                    r8 = (C465920c) r83;
                } else {
                    r8 = 0;
                }
                if (r8 == 0) {
                    r7.BQB();
                    C465920c r9 = new C465920c(r3.getActivity(), new C28351Lj(r3.getContext(), AnonymousClass1L8.A00(r3)), r21, r7, new C466020d(r0), new C466120e(r3, r0), r20, r19);
                    r9.A00 = r4;
                    r9.notifyDataSetChanged();
                    r0.A0A.setAdapter(r9);
                    if (((r9 instanceof C465920c) || (r9 instanceof C28465ChM)) && (r3 instanceof AnonymousClass1HH)) {
                        ((AnonymousClass1HH) r3).registerLifecycleListener(new C466420h(r9));
                    }
                } else {
                    if (!r1.A02) {
                        boolean z4 = false;
                        if (r8.A00 != r4) {
                            z4 = true;
                        }
                    }
                    z2 = false;
                    r1.A02 = false;
                    r8.A00 = r4;
                    r8.notifyDataSetChanged();
                }
            } else {
                AnonymousClass1PH r84 = r0.A0A.A0J;
                if (r84 instanceof C28465ChM) {
                    r82 = (C28465ChM) r84;
                } else {
                    r82 = 0;
                }
                if (r8 == 0) {
                    r7.BQB();
                    C28465ChM chM = new C28465ChM(r3.getActivity(), new C28351Lj(r3.getContext(), AnonymousClass1L8.A00(r3)), r21, r7, new C28143Cc5(r0), new C27867CUh(r3, r0), r20, num, r19);
                    chM.A01(r4);
                    r0.A0A.setAdapter(chM);
                    if (((chM instanceof C465920c) || (chM instanceof C28465ChM)) && (r3 instanceof AnonymousClass1HH)) {
                        ((AnonymousClass1HH) r3).registerLifecycleListener(new C466420h(chM));
                    }
                } else {
                    if (!r1.A02) {
                        boolean z5 = false;
                        if (r8.A00 != r4) {
                            z5 = true;
                        }
                    }
                    z2 = false;
                    r1.A02 = false;
                    r8.A01(r4);
                }
            }
            if (r1.A04) {
                r0.A0A.A0g(z2);
                r1.A04 = z2;
            }
        } else if (i3 == 1 || i3 == 2) {
            Context context2 = this.A05;
            AnonymousClass1HD r122 = this.A09;
            AnonymousClass0C1 r15 = this.A08;
            CZT czt = (CZT) view2.getTag();
            C28161Kq r02 = this.A06;
            C43411uN r92 = (C43411uN) obj3;
            C43541ua r13 = (C43541ua) obj4;
            Integer num2 = this.A04;
            AnonymousClass20Y.A00(r15, r92, r13);
            if (TextUtils.isEmpty(r92.A0D) || r92.A04 != C43481uU.EMBEDDED_WITH_CONTENT_THUMBNAIL) {
                czt.A01.setVisibility(8);
                czt.A00.setVisibility(8);
            } else {
                czt.A01.setText(r92.A0D);
                czt.A01.setVisibility(0);
                if (r92.ALf() == C29261Pf.SUGGESTED_USERS) {
                    czt.A00.setVisibility(0);
                }
            }
            C28451Ch8 ch8 = (C28451Ch8) czt.A02.getAdapter();
            if (ch8 == null) {
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(C0003R.dimen.card_width_redesign);
                if (r92.A04 == C43481uU.EMBEDDED_WITH_CONTENT_THUMBNAIL) {
                    resources = context2.getResources();
                    i2 = C0003R.dimen.card_height_redesign_embedded;
                } else {
                    resources = context2.getResources();
                    i2 = C0003R.dimen.card_height_redesign;
                }
                int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
                int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(C0003R.dimen.card_spacing_redesign);
                C28451Ch8 ch82 = new C28451Ch8(r15, r02, dimensionPixelSize, dimensionPixelSize2, new C175547eg(czt));
                ch82.A01 = r92;
                AnonymousClass0Z1.A00(ch82, 361751265);
                czt.A02.setAdapter((Adapter) ch82);
                ReboundViewPager reboundViewPager = czt.A02;
                reboundViewPager.setOverridePageSize(dimensionPixelSize);
                reboundViewPager.setPageSpacing((float) dimensionPixelSize3);
                czt.A02.setExtraBufferSize(2);
                czt.A02.setItemPositioner(new C44541wK(dimensionPixelSize, dimensionPixelSize3, 0.86f));
                ReboundViewPager reboundViewPager2 = czt.A02;
                reboundViewPager2.setAccessibilityDelegateCompat(new C113854uy(reboundViewPager2));
                C28452Ch9 ch9 = r13.A01;
                if (ch9 != null) {
                    ch9.A02.A03(C28142Cc4.class, ch9.A03);
                    ch9.A00.Azd();
                }
                if (r92.A0F != null) {
                    str = "preview";
                } else if (r92.A0G != null) {
                    str = "profile";
                } else {
                    str = null;
                }
                C28452Ch9 ch92 = new C28452Ch9(r15, r122, czt.A02, ch82, new C28464ChL(r15, r02.AFt(), r92.A00, r92.A08, str, num2, r92.A0B));
                ch82.A00 = ch92;
                czt.A02.A0L(new C44601wQ(r13, ch92));
                r13.A01 = ch92;
                czt.A02.A0I(r13.A00);
            } else {
                if (!r13.A02) {
                    boolean z6 = false;
                    if (ch8.A01 != r92) {
                        z6 = true;
                    }
                    if (!z6) {
                        AnonymousClass0Z1.A00(ch8, 1286694882);
                    }
                }
                r13.A02 = false;
                ch8.A01 = r92;
                AnonymousClass0Z1.A00(ch8, 361751265);
                if (r13.A04) {
                    czt.A02.A0I(0);
                    r13.A04 = false;
                }
            }
        } else if (i3 == 3) {
            this.A01.A07(this.A08, view2, (C43411uN) obj3, obj4);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A05("Unknown viewType = ", i3));
            AnonymousClass0Z0.A0A(2127759860, A032);
            throw illegalArgumentException;
        }
        if (!this.A0B) {
            this.A06.BZm((C43411uN) obj3, view2);
        }
        AnonymousClass0Z0.A0A(1806106058, A032);
    }

    public final /* bridge */ /* synthetic */ void A72(C29491Qc r11, Object obj, Object obj2) {
        int i;
        C43411uN r12 = (C43411uN) obj;
        C43541ua r13 = (C43541ua) obj2;
        C43481uU r5 = r12.A04;
        if (r5 != C43481uU.WITH_CONTENT_THUMBNAIL || !((Boolean) AnonymousClass0L6.A03(this.A08, AnonymousClass0L7.SEPARATE_EMPTY_FEED_SU, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C29401Pt r6 = this.A07;
            C43481uU r7 = r12.A04;
            C43481uU r0 = r6.A01;
            if (!(r0 == null || r0 == r7)) {
                r6.A01 = null;
                r6.A04.clear();
            }
            if (r6.A01 == null) {
                r6.A01 = r7;
                int ordinal = r7.ordinal();
                switch (ordinal) {
                    case 1:
                    case 2:
                        C29401Pt.A00(r6, r7).A00(C0003R.layout.netego_carousel_redesign, new CZR(r6.A02, new CZQ(r6)));
                        break;
                    default:
                        C29401Pt.A00(r6, r7).A00(C0003R.layout.netego_carousel, new C43581ue(r6.A02, r6.A03, new C43571ud(r6)));
                        break;
                }
                AnonymousClass0PR A002 = C29401Pt.A00(r6, r7);
                C43591uf r3 = new C43591uf(r6);
                switch (ordinal) {
                    case 1:
                    case 2:
                        i = C0003R.layout.suggested_user_card_redesign;
                        break;
                    default:
                        i = C0003R.layout.suggested_entity_card;
                        break;
                }
                for (int i2 = 0; i2 < 3; i2++) {
                    A002.A00(i, r3);
                }
            }
        }
        if (r13.Ai7()) {
            r11.A00(3);
            return;
        }
        switch (r5.ordinal()) {
            case 1:
                r11.A00(1);
                break;
            case 2:
                r11.A00(2);
                break;
            default:
                r11.A00(0);
                break;
        }
        this.A06.A3d(r12, r13);
    }

    public final int AaQ(int i, Object obj, Object obj2) {
        if (!this.A03) {
            return Process.WAIT_RESULT_TIMEOUT;
        }
        this.A03 = false;
        return Integer.MAX_VALUE;
    }

    public final void BVd(View view, int i, Object obj, Object obj2) {
        if (this.A0B) {
            this.A06.BZm((C43411uN) obj, view);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.A0B) {
            this.A06.Brz(view);
        }
    }

    public C29391Ps(Context context, AnonymousClass1HD r3, AnonymousClass0C1 r4, C28161Kq r5, C28181Ks r6, Integer num, boolean z, boolean z2) {
        this.A05 = context;
        this.A09 = r3;
        this.A08 = r4;
        this.A06 = r5;
        this.A07 = new C29401Pt(context, r4);
        this.A0A = r6;
        this.A04 = num;
        C29411Pu.A00 = z;
        this.A0B = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if ((r2.getTag() instanceof p000X.C31711Zp) != false) goto L_0x0059;
     */
    public final View ABB(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        boolean z;
        int A032 = AnonymousClass0Z0.A03(-57023346);
        if (i == 0) {
            LinearLayoutManager A002 = AnonymousClass1ZQ.A00(this.A00);
            this.A00 = A002;
            A002.A0w(true);
            C29401Pt r1 = this.A07;
            view = r1.A00;
            r1.A00 = null;
            if (view != null) {
                if (!(view == null || view.getTag() == null)) {
                    z = true;
                }
                z = false;
                if (!z) {
                    ((C31711Zp) view.getTag()).A0A.setLayoutManager(this.A00);
                    i2 = 1439887763;
                }
            }
            Context context = this.A05;
            LinearLayoutManager linearLayoutManager = this.A00;
            view = LayoutInflater.from(context).inflate(C0003R.layout.netego_carousel, viewGroup, false);
            C31711Zp A003 = C29411Pu.A00(context, view);
            view.setTag(A003);
            A003.A0A.setLayoutManager(linearLayoutManager);
            i2 = 1439887763;
        } else if (i == 1) {
            view = A00(viewGroup, C43481uU.WITH_CONTENT_THUMBNAIL);
            i2 = -565731710;
        } else if (i == 2) {
            view = A00(viewGroup, C43481uU.EMBEDDED_WITH_CONTENT_THUMBNAIL);
            i2 = 886445871;
        } else if (i == 3) {
            view = AnonymousClass1VI.A00(this.A05, viewGroup, 2);
            i2 = 754858343;
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A05("Unknown viewType = ", i));
            AnonymousClass0Z0.A0A(1858441910, A032);
            throw illegalArgumentException;
        }
        AnonymousClass0Z0.A0A(i2, A032);
        return view;
    }
}
