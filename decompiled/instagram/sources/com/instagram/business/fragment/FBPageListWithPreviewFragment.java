package com.instagram.business.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.p015ui.BusinessNavBar;
import com.instagram.igds.components.stepperheader.StepperHeader;
import com.instagram.model.business.BusinessInfo;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import com.instagram.registration.model.RegFlowExtras;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass612;
import p000X.AnonymousClass61R;
import p000X.AnonymousClass62H;
import p000X.AnonymousClass62I;
import p000X.AnonymousClass62o;
import p000X.AnonymousClass63U;
import p000X.AnonymousClass63X;
import p000X.AnonymousClass643;
import p000X.AnonymousClass645;
import p000X.AnonymousClass64I;
import p000X.AnonymousClass64Z;
import p000X.C05210Iq;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C100934Xs;
import p000X.C119945Cp;
import p000X.C13300iJ;
import p000X.C135395qH;
import p000X.C135765qs;
import p000X.C1409760w;
import p000X.C14100jl;
import p000X.C1412261x;
import p000X.C1413462l;
import p000X.C1415063c;
import p000X.C1415163e;
import p000X.C1415763o;
import p000X.C1416363u;
import p000X.C1416463v;
import p000X.C1418964v;
import p000X.C1419064w;
import p000X.C154876jR;
import p000X.C27341Hl;
import p000X.C30248DXi;

public class FBPageListWithPreviewFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, AnonymousClass63X {
    public C1416463v A00;
    public AnonymousClass61R A01;
    public AnonymousClass2UH A02;
    public PageSelectionOverrideData A03;
    public C1415163e A04;
    public AnonymousClass645 A05;
    public AnonymousClass645 A06;
    public C06590Pq A07;
    public BusinessInfo A08;
    public RegFlowExtras A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public final Handler A0G = new Handler(Looper.getMainLooper());
    public BusinessNavBar mBusinessNavBar;
    public AnonymousClass63U mBusinessNavBarHelper;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;
    public StepperHeader mStepperHeader;

    public final void AC1() {
    }

    public final void ACw() {
    }

    public final String getModuleName() {
        return "fb_page_list_with_preview";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(FBPageListWithPreviewFragment fBPageListWithPreviewFragment, AnonymousClass62o r8) {
        AnonymousClass645 r1;
        C13300iJ r0;
        String str;
        List list = r8.A00.A00;
        fBPageListWithPreviewFragment.mLoadingSpinner.setVisibility(8);
        if (list == null || list.isEmpty() || fBPageListWithPreviewFragment.A02 == null) {
            AnonymousClass0ZA.A0E(fBPageListWithPreviewFragment.A0G, new C1418964v(fBPageListWithPreviewFragment), -507629687);
            return;
        }
        String str2 = null;
        BusinessInfo businessInfo = fBPageListWithPreviewFragment.A08;
        if (!(businessInfo == null || (str = businessInfo.A0E) == null)) {
            str2 = str;
        }
        C1416463v r5 = fBPageListWithPreviewFragment.A00;
        ImmutableList<AnonymousClass645> A002 = C154876jR.A00(list);
        r5.A05.clear();
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass645 r12 : A002) {
            AnonymousClass0C1 r02 = r5.A04;
            if (r02 == null) {
                r0 = null;
            } else {
                r0 = r02.A06;
            }
            if (!r12.A00(r0)) {
                r5.A05.add(r12);
            } else {
                arrayList.add(r12);
            }
        }
        r5.A05.addAll(arrayList);
        List list2 = r5.A05;
        if (list2 != null && !list2.isEmpty()) {
            AnonymousClass645 r13 = (AnonymousClass645) r5.A05.get(0);
            if (str2 != null) {
                for (int i = 0; i < r5.A05.size(); i++) {
                    if (((AnonymousClass645) r5.A05.get(i)).A07.equals(str2)) {
                        r13 = (AnonymousClass645) r5.A05.get(i);
                    }
                }
            }
            FBPageListWithPreviewFragment fBPageListWithPreviewFragment2 = r5.A01;
            AnonymousClass645 r03 = fBPageListWithPreviewFragment2.A05;
            fBPageListWithPreviewFragment2.A06 = r03;
            String str3 = fBPageListWithPreviewFragment2.A0A;
            if (str3 != null) {
                C1416463v r3 = fBPageListWithPreviewFragment2.A00;
                List list3 = r3.A05;
                if (list3 != null) {
                    Iterator it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r1 = (AnonymousClass645) it.next();
                        if (r1.A07.equals(str3)) {
                            r3.A0K(r1);
                            break;
                        }
                    }
                }
                r1 = null;
                fBPageListWithPreviewFragment2.A05 = r1;
                fBPageListWithPreviewFragment2.A0A = null;
            } else {
                if (r03 != null) {
                    r13 = r03;
                }
                fBPageListWithPreviewFragment2.A00.A0K(r13);
            }
            C1415163e r2 = fBPageListWithPreviewFragment2.A04;
            AnonymousClass645 r14 = fBPageListWithPreviewFragment2.A05;
            AnonymousClass645 r04 = fBPageListWithPreviewFragment2.A06;
            r2.A04 = r14;
            r2.A05 = r04;
            r5.A0J();
        }
        fBPageListWithPreviewFragment.mRecyclerView.setLayoutManager(new LinearLayoutManager());
        fBPageListWithPreviewFragment.mRecyclerView.setAdapter(fBPageListWithPreviewFragment.A00);
        int i2 = fBPageListWithPreviewFragment.A00.A00;
        if (i2 != -1) {
            fBPageListWithPreviewFragment.mRecyclerView.A0h(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r1.A7s() == false) goto L_0x0015;
     */
    private boolean A01() {
        boolean z;
        if (this.A0F) {
            return false;
        }
        AnonymousClass2UH r1 = this.A02;
        if (AnonymousClass62H.A0F(r1)) {
            return true;
        }
        if (r1 != null) {
            z = true;
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    public final void BFZ() {
        AnonymousClass612 r1;
        String str;
        this.A04.A06("page");
        C1416463v r2 = this.A00;
        AnonymousClass645 r12 = r2.A03;
        this.A06 = r12;
        AnonymousClass645 r4 = r2.A02;
        this.A05 = r4;
        C1415163e r11 = this.A04;
        r11.A04 = r4;
        r11.A05 = r12;
        if (r4 != null) {
            AnonymousClass612 r22 = new AnonymousClass612();
            r22.A09 = r4.A06;
            r22.A01 = r4.A03;
            r22.A00 = r4.A02;
            String str2 = r4.A07;
            r22.A0E = str2;
            BusinessInfo A002 = r22.A00();
            BusinessInfo businessInfo = this.A08;
            if (businessInfo == null) {
                this.A08 = A002;
            } else {
                if (businessInfo.A0H) {
                    String str3 = null;
                    if (r4 != null) {
                        str3 = str2;
                    }
                    r1 = new AnonymousClass612(businessInfo);
                    r1.A0E = str3;
                } else {
                    String str4 = businessInfo.A07;
                    r1 = new AnonymousClass612(A002);
                    r1.A07 = str4;
                }
                this.A08 = r1.A00();
            }
            AnonymousClass2UH r3 = this.A02;
            if (r3 != null) {
                AnonymousClass62I AJp = r3.AJp();
                AJp.A01(this.A08);
                if (AnonymousClass62H.A0C(r3)) {
                    AJp.A0F = r4.A04;
                }
            }
            boolean A0F2 = AnonymousClass62H.A0F(r3);
            if (!A0F2) {
                BusinessInfo businessInfo2 = this.A08;
                AnonymousClass2UH r23 = r11.A02;
                if (AnonymousClass62H.A0C(r23) || r11.A0F) {
                    r23.AJp().A01(businessInfo2);
                    if (!C1415763o.A05(r11.A07) || r11.A04.A07.equals(C05210Iq.A02(r11.A07).A06.A2U)) {
                        AnonymousClass2UH r0 = r11.A02;
                        if (r0 != null && ((BusinessConversionActivity) r0).A0a()) {
                            ((BusinessConversionActivity) r11.A02).A0Z(r11.A08, r11.A00.getActivity(), "page_selection", r11.A0J);
                        } else if (r11.A0F) {
                            C1415163e.A01(r11);
                            C1415163e.A00(r11);
                        } else {
                            r11.A02.Aoa(r11.A03());
                            C1415163e.A00(r11);
                        }
                    } else {
                        Context context = r11.A00.getContext();
                        AnonymousClass645 r13 = r11.A04;
                        String str5 = r13.A07;
                        String str6 = r13.A04;
                        String A003 = C14100jl.A00(r11.A07);
                        String str7 = r11.A0B;
                        AnonymousClass2UH r24 = r11.A02;
                        if (r11.A0E) {
                            str = "business_signup_flow";
                        } else if (AnonymousClass62H.A0C(r24)) {
                            str = "business_conversion";
                        } else {
                            str = null;
                        }
                        C119945Cp.A00(context, str5, str6, A003, str7, str, this, C05210Iq.A02(r11.A07), r11);
                    }
                }
            } else if (A0F2) {
                this.mBusinessNavBarHelper.A01();
                C06590Pq r7 = this.A07;
                RegFlowExtras regFlowExtras = this.A09;
                AnonymousClass2UH r8 = this.A02;
                AnonymousClass645 r14 = this.A00.A02;
                AnonymousClass64I r5 = new AnonymousClass64I(this, r7, r8, regFlowExtras, this.A0B);
                String str8 = regFlowExtras.A08;
                String str9 = regFlowExtras.A0I;
                if (r14 != null) {
                    str9 = r14.A09;
                }
                if (!C135395qH.A00(r7, this, this, str9, str8, r5) && r8 != null) {
                    r8.Aob(regFlowExtras.A02(), ConversionStep.EDIT_USERNAME, false);
                }
                C06590Pq r32 = this.A07;
                C135765qs.A03(r32, "page_selection", this.A0B, (C06270Ok) null, C14100jl.A01(r32));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0 == false) goto L_0x001b;
     */
    public final void configureActionBar(AnonymousClass1EX r3) {
        int i;
        if (this.A0F) {
            r3.BlI(C0003R.string.in_app_signup_navigation_bar_title);
            C1415163e r1 = this.A04;
            if (!r1.A0F) {
                boolean A052 = C1415763o.A05(r1.A07);
                i = C0003R.C0004drawable.instagram_x_outline_24;
            }
            i = C0003R.C0004drawable.instagram_arrow_back_24;
            r3.BmB(i, new AnonymousClass64Z(this));
        }
    }

    public final boolean onBackPressed() {
        C1415163e r5 = this.A04;
        if (r5.A0E) {
            C06590Pq r4 = r5.A07;
            C135765qs.A02(r4, "facebook_account_selection", r5.A0B, (C06270Ok) null, C14100jl.A01(r4));
            AnonymousClass2UH r0 = r5.A02;
            if (r0 == null) {
                return false;
            }
            r0.Be6();
            return true;
        } else if (r5.A0F) {
            AnonymousClass2UH r02 = r5.A02;
            AnonymousClass0a4.A06(r02);
            r02.A8B();
            return true;
        } else if (!AnonymousClass62H.A0C(r5.A02)) {
            return false;
        } else {
            if (r5.A0D) {
                return true;
            }
            AnonymousClass61R r1 = r5.A01;
            if (r1 != null) {
                r1.Ajn(r5.A04().A00());
            }
            if (C1415763o.A05(r5.A07)) {
                AnonymousClass2UH r03 = r5.A02;
                AnonymousClass0a4.A06(r03);
                r03.A8B();
                return true;
            }
            AnonymousClass2UH r04 = r5.A02;
            AnonymousClass0a4.A06(r04);
            r04.Be6();
            return true;
        }
    }

    public final void BLe() {
        boolean z;
        if (A01()) {
            AnonymousClass2UH r1 = this.A02;
            if (!AnonymousClass62H.A0F(r1) || r1 == null) {
                z = false;
            } else {
                r1.Bou(this.A09.A02());
                z = true;
            }
            if (!z && AnonymousClass62H.A0C(this.A02)) {
                AnonymousClass61R r12 = this.A01;
                if (r12 != null) {
                    r12.AnJ(this.A04.A04().A00());
                }
                this.A02.Bot();
            }
        }
    }

    public final C06590Pq getSession() {
        return this.A07;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A02 = AnonymousClass62H.A01(getActivity());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.0Ok} */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ea, code lost:
        if (r0 == r2) goto L_0x00ec;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        String string;
        String str;
        String str2;
        AnonymousClass0C1 r9;
        C06270Ok r7;
        AnonymousClass61R r5;
        Integer num;
        Integer num2;
        CharSequence string2;
        Resources resources;
        int i;
        AnonymousClass62I AJp;
        BusinessInfo businessInfo;
        int A022 = AnonymousClass0Z0.A02(1122105077);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A07 = AnonymousClass0J1.A00(bundle2);
        this.A0B = bundle2.getString("entry_point");
        this.A0D = bundle2.getString("business_signup");
        this.A03 = (PageSelectionOverrideData) bundle2.getParcelable("EXTRA_FB_OVERRIDE_DATA");
        AnonymousClass2UH r0 = this.A02;
        if (r0 != null) {
            this.A01 = C30248DXi.A00(this.A07, this, r0.ALv(), r0.Aad());
        }
        C1415163e r52 = new C1415163e(this.A07, this, this.A02, this.A01);
        this.A04 = r52;
        r52.A03 = this.A03;
        r52.A0B = this.A0B;
        r52.A0A = this.mArguments.getString("edit_profile_entry");
        this.A04.A0C = this.A0D;
        AnonymousClass2UH r02 = this.A02;
        if (r02 != null) {
            string = r02.AJp().A0G;
        } else {
            string = bundle2.getString("target_page_id");
        }
        this.A0C = string;
        BusinessInfo A023 = AnonymousClass62H.A02(bundle2, this.A02);
        this.A08 = A023;
        C1415163e r53 = this.A04;
        AnonymousClass2UH r03 = r53.A02;
        if (!(r03 == null || (businessInfo = AJp.A07) == null)) {
            AnonymousClass612 r2 = new AnonymousClass612(A023);
            r2.A0E = businessInfo.A0E;
            r2.A0H = true;
            A023 = r2.A00();
            (AJp = r03.AJp()).A01(A023);
        }
        this.A08 = A023;
        this.A0F = AnonymousClass62H.A0G(this.A02);
        PageSelectionOverrideData pageSelectionOverrideData = r53.A03;
        if (pageSelectionOverrideData == null || TextUtils.isEmpty(pageSelectionOverrideData.A04)) {
            str = null;
        } else {
            str = r53.A03.A04;
        }
        if (str == null) {
            Context context = getContext();
            if (this.A04.A0G) {
                resources = context.getResources();
                i = C0003R.string.link_ig_account_to_fb_page;
            } else {
                resources = context.getResources();
                i = C0003R.string.connect_to_fb_page;
            }
            str = resources.getString(i);
        }
        C1415163e r22 = this.A04;
        PageSelectionOverrideData pageSelectionOverrideData2 = r22.A03;
        if (pageSelectionOverrideData2 == null || TextUtils.isEmpty(pageSelectionOverrideData2.A03)) {
            str2 = null;
        } else {
            str2 = r22.A03.A03;
        }
        if (str2 == null) {
            AnonymousClass2UH r04 = this.A02;
            boolean z = true;
            if (r04 != null) {
                num = r04.ALv();
                num2 = Constants.A0C;
            } else {
                C06590Pq r23 = this.A07;
                if (r23.AgN()) {
                    num = C05210Iq.A04(r23).A1b;
                    num2 = Constants.A0N;
                }
                z = false;
                if (z) {
                    string2 = "";
                } else {
                    Context requireContext = requireContext();
                    String A052 = C05210Iq.A05(this.A07);
                    boolean z2 = this.A04.A0G;
                    C06590Pq r24 = this.A07;
                    if (!z2 || A052 == null) {
                        string2 = requireContext.getResources().getString(C0003R.string.connect_to_fb_page_explain_ads_increase_connection);
                    } else {
                        string2 = C100934Xs.A00(requireContext, r24, C0003R.string.connect_ig_to_fb_page_explain);
                    }
                }
                str2 = string2.toString();
            }
        }
        Context requireContext2 = requireContext();
        C06590Pq r25 = this.A07;
        ? r6 = 0;
        if (r25.AgN()) {
            r9 = C05210Iq.A02(r25);
        } else {
            r9 = null;
        }
        this.A00 = new C1416463v(requireContext2, r9, str, str2, this);
        this.A0E = AnonymousClass62H.A05(this.A07, this.A02);
        AnonymousClass2UH r26 = this.A02;
        if (AnonymousClass62H.A0F(r26)) {
            RegFlowExtras A032 = AnonymousClass62H.A03(bundle2, r26);
            this.A09 = A032;
            AnonymousClass0a4.A06(A032);
            this.A04.A09 = A032;
            C06590Pq r4 = this.A07;
            C135765qs.A04(r4, "facebook_account_selection", this.A0B, (C06270Ok) null, C14100jl.A01(r4));
        } else {
            BusinessInfo businessInfo2 = this.A08;
            if (businessInfo2 == null || !businessInfo2.A0H) {
                r7 = null;
            } else {
                String str3 = businessInfo2.A0E;
                r7 = C06270Ok.A00();
                r7.A09("prefilled_page_id", str3);
            }
            if (this.A0F) {
                C06590Pq r3 = this.A07;
                String str4 = this.A0B;
                AnonymousClass2UH r27 = this.A02;
                if (AnonymousClass62H.A0C(r27)) {
                    r6 = r27.AKi((C06270Ok) null);
                }
                C1416363u.A00(r3, "page_selection", str4, r6, r7, C14100jl.A01(this.A07), this.A04.A05());
            } else if (!(this.A02 == null || (r5 = this.A01) == null)) {
                C1412261x A042 = this.A04.A04();
                AnonymousClass2UH r32 = this.A02;
                Map map = null;
                if (AnonymousClass62H.A0C(r32)) {
                    map = r32.AKj((Map) null);
                }
                A042.A07 = map;
                BusinessInfo businessInfo3 = this.A08;
                if (businessInfo3 != null && businessInfo3.A0H) {
                    String str5 = businessInfo3.A0E;
                    String str6 = str5;
                    HashMap hashMap = new HashMap();
                    r6 = hashMap;
                    if (str5 != null) {
                        hashMap.put("prefilled_page_id", str6);
                        r6 = hashMap;
                    }
                }
                A042.A08 = r6;
                r5.AnW(A042.A00());
            }
        }
        AnonymousClass0Z0.A09(1181942443, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r1 != null) goto L_0x0027;
     */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0Z0.A02(1000815852);
        View inflate = layoutInflater.inflate(C0003R.layout.fb_page_fragment_with_preview, viewGroup, false);
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.findViewById(C0003R.C0005id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        AnonymousClass2UH r0 = this.A02;
        if (r0 != null) {
            ConversionStep BX2 = r0.BX2();
            z = true;
        }
        z = false;
        int i = C0003R.string.next;
        if (z) {
            i = C0003R.string.done;
        }
        this.mBusinessNavBarHelper = new AnonymousClass63U(this, businessNavBar, i, C1415063c.A00(this.A07, this.A02));
        this.mBusinessNavBar.A06(A01());
        C1415163e r4 = this.A04;
        BusinessNavBar businessNavBar2 = this.mBusinessNavBar;
        String string = r4.A00.getString(C0003R.string.learn_more);
        businessNavBar2.setFooterTerms(r4.A07, string, r4.A00.getString(C0003R.string.facebook_page_selection_terms, string), "https://help.instagram.com/402748553849926");
        businessNavBar2.A01();
        this.A04.A06 = this.mBusinessNavBarHelper;
        PageSelectionOverrideData pageSelectionOverrideData = this.A03;
        if (pageSelectionOverrideData != null && !TextUtils.isEmpty(pageSelectionOverrideData.A06)) {
            this.mBusinessNavBar.setPrimaryButtonText((CharSequence) this.A03.A06);
        }
        registerLifecycleListener(this.mBusinessNavBarHelper);
        AnonymousClass0Z0.A09(604869572, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1257104011);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        AnonymousClass0Z0.A09(285532217, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        AnonymousClass62o r1;
        StepperHeader stepperHeader;
        C1419064w r0;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        this.mRecyclerView = recyclerView;
        this.mBusinessNavBar.A04(recyclerView);
        if (C1409760w.A00(this.A02)) {
            StepperHeader stepperHeader2 = (StepperHeader) view.findViewById(C0003R.C0005id.stepper_header);
            this.mStepperHeader = stepperHeader2;
            stepperHeader2.setVisibility(0);
            PageSelectionOverrideData pageSelectionOverrideData = this.A03;
            if (pageSelectionOverrideData == null || !AnonymousClass62H.A0G(this.A02)) {
                this.mStepperHeader.A03(this.A02.ABJ(), this.A02.BrZ());
                stepperHeader = this.mStepperHeader;
                r0 = C1419064w.COLD;
            } else {
                this.mStepperHeader.A03(pageSelectionOverrideData.A01, pageSelectionOverrideData.A00);
                stepperHeader = this.mStepperHeader;
                r0 = C1419064w.WARM;
            }
            stepperHeader.setColorScheme(r0);
        }
        this.mLoadingSpinner = (SpinnerImageView) view.findViewById(C0003R.C0005id.loading_indicator);
        AnonymousClass2UH r12 = this.A02;
        if (!AnonymousClass62H.A0C(r12) || (r1 = r12.AJp().A05) == null || r1.A00 == null) {
            z = false;
        } else {
            A00(this, r1);
            z = true;
        }
        if (!z) {
            Context requireContext = requireContext();
            AnonymousClass1L8 A002 = AnonymousClass1L8.A00(this);
            C06590Pq r5 = this.A07;
            Context requireContext2 = requireContext();
            String str3 = this.A0B;
            AnonymousClass2UH r10 = this.A02;
            if (AnonymousClass62H.A0F(r10)) {
                str = "facebook_account_selection";
            } else {
                str = "page_selection";
            }
            C1413462l r3 = new C1413462l(this, r5, requireContext2, str3, str, this.A05, r10, this.A0A, this.A0C);
            PageSelectionOverrideData pageSelectionOverrideData2 = this.A03;
            if (pageSelectionOverrideData2 == null) {
                str2 = null;
            } else {
                str2 = pageSelectionOverrideData2.A07;
            }
            r3.A07 = str2;
            AnonymousClass643.A00(requireContext, A002, r5, r3, this.A0E);
        }
    }
}
