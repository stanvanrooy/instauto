package com.instagram.business.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.fragment.AccountTypeSelectionFragment;
import com.instagram.business.fragment.AccountTypeSelectionWithValuePropFragment;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.business.fragment.ConnectFBPageFragment;
import com.instagram.business.fragment.FBPageListWithPreviewFragment;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.business.fragment.PageLoaderFragment;
import com.instagram.business.fragment.ProfessionalAccountDescriptionFragment;
import com.instagram.business.fragment.ProfileDisplayOptionsFragment;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.model.business.BusinessInfo;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.registration.model.RegFlowExtras;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0I1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0J5;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass267;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass38H;
import p000X.AnonymousClass51P;
import p000X.AnonymousClass51Q;
import p000X.AnonymousClass612;
import p000X.AnonymousClass62H;
import p000X.AnonymousClass62I;
import p000X.AnonymousClass62K;
import p000X.AnonymousClass62R;
import p000X.AnonymousClass656;
import p000X.AnonymousClass657;
import p000X.AnonymousClass659;
import p000X.AnonymousClass65B;
import p000X.AnonymousClass65O;
import p000X.AnonymousClass666;
import p000X.C05000Hl;
import p000X.C05210Iq;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C120125Dh;
import p000X.C12800hP;
import p000X.C12830hS;
import p000X.C13240i8;
import p000X.C133525n3;
import p000X.C133535n4;
import p000X.C134405oU;
import p000X.C135705qm;
import p000X.C135735qp;
import p000X.C135745qq;
import p000X.C136395rv;
import p000X.C136595sF;
import p000X.C137275tN;
import p000X.C137335tT;
import p000X.C137355tV;
import p000X.C137955uU;
import p000X.C1409460t;
import p000X.C1410261b;
import p000X.C1410461e;
import p000X.C1413162h;
import p000X.C1415763o;
import p000X.C1418364p;
import p000X.C1418464q;
import p000X.C1423966x;
import p000X.C16310oO;
import p000X.C23300zv;
import p000X.C35071fl;
import p000X.C53892Uu;

public class BusinessConversionActivity extends BaseFragmentActivity implements AnonymousClass0RN, AnonymousClass2UH, AnonymousClass0J5 {
    public Bundle A00;
    public AnonymousClass62I A01;
    public AnonymousClass657 A02;
    public AnonymousClass656 A03;
    public C1418364p A04;
    public PageSelectionOverrideData A05;
    public C06590Pq A06;
    public Integer A07;
    public HashSet A08 = new HashSet();
    public boolean A09;
    public boolean A0A;
    public String A0B;
    public boolean A0C;

    public final void AoZ() {
        Aoa((Bundle) null);
    }

    public final void Aoa(Bundle bundle) {
        Aob(bundle, (ConversionStep) null, true);
    }

    public final void Be6() {
        Be7((Bundle) null);
    }

    public final void Bot() {
        Bou((Bundle) null);
    }

    public final String getModuleName() {
        return "business_conversion_activity";
    }

    private void A06() {
        C35071fl r1;
        C1413162h A012 = C1413162h.A01(this.A06);
        Integer num = this.A07;
        AnonymousClass62I r0 = this.A01;
        String str = r0.A0B;
        boolean z = r0.A0J;
        Integer num2 = r0.A09;
        HashMap hashMap = new HashMap();
        hashMap.put("entry_point", str);
        hashMap.put("is_fb_linked_when_enter_flow", String.valueOf(z));
        hashMap.put("is_page_admin", AnonymousClass62K.A00(num2));
        Bundle A022 = C137355tV.A02(hashMap);
        switch (num.intValue()) {
            case 0:
                r1 = C1413162h.A04;
                break;
            case 1:
                r1 = C1413162h.A09;
                break;
            case 2:
                r1 = C1413162h.A07;
                break;
            case 3:
                r1 = C1413162h.A06;
                break;
            case 4:
                r1 = C1413162h.A05;
                break;
            case 5:
                r1 = C1413162h.A08;
                break;
            default:
                throw new IllegalArgumentException("unsupported flow type");
        }
        C1413162h.A02 = r1;
        A012.A00.Bpg(r1);
        C1413162h.A03 = C1413162h.A00(A022);
    }

    private void A07() {
        ConversionStep conversionStep;
        BusinessConversionStep A002 = this.A02.A01.A00();
        if (A002 == null) {
            conversionStep = null;
        } else {
            conversionStep = A002.A01;
        }
        if (conversionStep == ConversionStep.CREATE_PAGE) {
            AnonymousClass657 r3 = this.A02;
            BusinessConversionFlowStatus businessConversionFlowStatus = r3.A01;
            AnonymousClass0a4.A06(businessConversionFlowStatus.A00());
            int i = businessConversionFlowStatus.A00;
            r3.A01 = AnonymousClass659.A01(businessConversionFlowStatus, i, i - 1);
            this.A08.remove(conversionStep);
        } else if (conversionStep == ConversionStep.PAGES_LOADER) {
            AnonymousClass657 r32 = this.A02;
            BusinessConversionFlowStatus businessConversionFlowStatus2 = r32.A01;
            C06590Pq r5 = this.A06;
            boolean A022 = this.A01.A02();
            AnonymousClass267 r2 = new AnonymousClass267();
            if ((!A022 || !C134405oU.A03(r5, true)) && (A022 || !((Boolean) C134405oU.A00(new C05000Hl("is_enabled", AnonymousClass0L7.SMB_CONVERSION_CHOOSE_CAT_IF_NO_FB_PAGES_LAUNCHER, false, (String[]) null, (AnonymousClass04H) null), r5, true)).booleanValue())) {
                r2.A08(new BusinessConversionStep(ConversionStep.PAGE_SELECTION));
            } else {
                r2.A08(new BusinessConversionStep(ConversionStep.CHOOSE_CATEGORY));
            }
            ImmutableList A062 = r2.A06();
            int i2 = businessConversionFlowStatus2.A00;
            r32.A01 = AnonymousClass659.A03(businessConversionFlowStatus2, A062, i2, i2 - 1);
        }
    }

    private void A08(Bundle bundle) {
        String r2;
        if (bundle == null) {
            AnonymousClass62I r1 = this.A01;
            r1.A08 = null;
            r1.A0A = null;
            return;
        }
        this.A01.A08 = (RegFlowExtras) bundle.getParcelable("RegFlowExtras.EXTRA_KEY");
        RegFlowExtras regFlowExtras = this.A01.A08;
        if (regFlowExtras != null) {
            HashMap hashMap = new HashMap();
            String str = null;
            if (regFlowExtras.A03() == null) {
                r2 = null;
            } else {
                r2 = regFlowExtras.A03().toString();
            }
            hashMap.put("registration_flow", r2);
            hashMap.put(IgReactPurchaseExperienceBridgeModule.EMAIL, regFlowExtras.A08);
            CountryCodeData countryCodeData = regFlowExtras.A01;
            if (countryCodeData != null) {
                str = countryCodeData.A01;
            }
            hashMap.put("area_code", str);
            hashMap.put("phone", regFlowExtras.A0L);
            hashMap.put("device_nonce", regFlowExtras.A06);
            hashMap.put("business_name", regFlowExtras.A0I);
            bundle.putBundle("conversion_funnel_log_payload", C137355tV.A02(hashMap));
        }
        this.A01.A0A = bundle.getString("error_message");
        if (bundle.containsKey("fb_access_token")) {
            this.A01.A0C = bundle.getString("fb_access_token");
        }
        if (bundle.containsKey("fb_user_id")) {
            this.A01.A0D = bundle.getString("fb_user_id");
        }
    }

    public final C06590Pq A0L() {
        return this.A06;
    }

    public final void A0Z(C12830hS r10, Context context, String str, C137335tT r13) {
        Context context2 = context;
        C12830hS r5 = r10;
        C137335tT r8 = r13;
        String str2 = str;
        if (((AnonymousClass0C1) this.A06).A06.A1o == Constants.A0C) {
            boolean A0D = AnonymousClass62H.A0D(this);
            AnonymousClass2OA r2 = new AnonymousClass2OA(context);
            int i = C0003R.string.change_to_private_with_done_switch_dialog_title;
            if (A0D) {
                i = C0003R.string.change_to_private_with_done_switch_dialog_title_creator;
            }
            r2.A07(i);
            int i2 = C0003R.string.change_to_private_with_done_switch_dialog_content;
            if (A0D) {
                i2 = C0003R.string.change_to_private_with_done_switch_dialog_content_creator;
            }
            r2.A06(i2);
            int i3 = C0003R.string.f118ok;
            if (A0D) {
                i3 = C0003R.string.change_to_private_with_done_switch_dialog_cta_creator;
            }
            r2.A0A(i3, new AnonymousClass51P(this, r5, context2, str2, r8));
            r2.A09(C0003R.string.cancel, (DialogInterface.OnClickListener) null);
            r2.A03().show();
            return;
        }
        A09(this, false, r5, context2, str2, r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public final boolean A0a() {
        if (!this.A06.AgN()) {
            return false;
        }
        if (AnonymousClass62H.A0D(this)) {
            if (ConversionStep.CHOOSE_CATEGORY != AJZ()) {
                return false;
            }
            if (C134405oU.A05(this.A06, true) || C136395rv.A00(this.A06, true)) {
                return true;
            }
            return false;
        } else if (!AnonymousClass62H.A0C(this)) {
            return false;
        } else {
            if (ConversionStep.CHOOSE_CATEGORY != AJZ() && ConversionStep.PAGE_SELECTION != AJZ()) {
                return false;
            }
        }
        return true;
    }

    public final void A8B() {
        C1413162h.A03(C1413162h.A01(this.A06), A01(), "cancel", (String) null, (Bundle) null);
        this.A02.A02();
        finish();
    }

    public final int ABJ() {
        AnonymousClass657 r1 = this.A02;
        return AnonymousClass657.A00(r1, r1.A01.A00 + 1) - 1;
    }

    public final ConversionStep AJZ() {
        BusinessConversionStep A002 = this.A02.A01.A00();
        if (A002 == null) {
            return null;
        }
        return A002.A01;
    }

    public final AnonymousClass62I AJp() {
        return this.A01;
    }

    public final C06270Ok AKi(C06270Ok r3) {
        if (r3 == null) {
            r3 = C06270Ok.A00();
        }
        r3.A05("is_fb_linked_when_enter_flow", Boolean.valueOf(this.A01.A0J));
        r3.A09("is_fb_page_admin_when_enter_flow", AnonymousClass62K.A00(this.A01.A09));
        return r3;
    }

    public final Map AKj(Map map) {
        if (map == null) {
            map = new HashMap();
        }
        map.put("is_fb_linked_when_enter_flow", String.valueOf(this.A01.A0J));
        map.put("is_fb_page_admin_when_enter_flow", AnonymousClass62K.A00(this.A01.A09));
        return map;
    }

    public final Integer ALv() {
        return this.A07;
    }

    public final String Aad() {
        return this.A0B;
    }

    public final boolean Ab7() {
        if (this.A07 != Constants.ONE || BX3() == null) {
            return false;
        }
        while (BX3() != null) {
            Be6();
        }
        return true;
    }

    public final boolean Ahx() {
        return this.A0A;
    }

    public final ConversionStep BX2() {
        BusinessConversionStep businessConversionStep;
        BusinessConversionFlowStatus businessConversionFlowStatus = this.A02.A01;
        boolean z = false;
        if (businessConversionFlowStatus.A00 < businessConversionFlowStatus.A01.size() - 1) {
            z = true;
        }
        if (z) {
            businessConversionStep = (BusinessConversionStep) businessConversionFlowStatus.A01.get(businessConversionFlowStatus.A00 + 1);
        } else {
            businessConversionStep = null;
        }
        if (businessConversionStep == null) {
            return null;
        }
        return businessConversionStep.A01;
    }

    public final ConversionStep BX3() {
        BusinessConversionStep A012 = this.A02.A01.A01();
        if (A012 == null) {
            return null;
        }
        return A012.A01;
    }

    public final void Bha(Integer num) {
        ImmutableList immutableList;
        if (this.A07 != num) {
            this.A07 = num;
            A06();
            ConversionStep AJZ = AJZ();
            if (AJZ == ConversionStep.SIGNUP_SPLASH || AJZ == ConversionStep.ACCOUNT_TYPE_SELECTION || AJZ == ConversionStep.ACCOUNT_TYPE_SELECTION_WITH_VALUE_PROP) {
                boolean z = false;
                if (AJZ != ConversionStep.ACCOUNT_TYPE_SELECTION) {
                    z = true;
                }
                switch (this.A07.intValue()) {
                    case 0:
                        immutableList = C1410461e.A02(z, this.A09);
                        break;
                    case 1:
                        immutableList = C1410461e.A04(true, this.A09);
                        break;
                    case 2:
                        if (!C136395rv.A01(this.A06, false)) {
                            immutableList = C1410461e.A03(this.A09, z);
                            break;
                        } else {
                            immutableList = C1410461e.A00(this.A06, z);
                            break;
                        }
                }
                BusinessConversionFlowStatus businessConversionFlowStatus = this.A02.A01;
                int i = businessConversionFlowStatus.A00;
                this.A02.A01 = AnonymousClass659.A03(businessConversionFlowStatus, immutableList, i + 1, i);
            }
            getIntent().getExtras().putInt("business_account_flow", C53892Uu.A00(this.A07));
        }
    }

    public final boolean BnQ() {
        Integer num = this.A07;
        if (num == Constants.ZERO) {
            return true;
        }
        if (num != Constants.A0j || AJZ() == ConversionStep.CREATE_PAGE) {
            return false;
        }
        return true;
    }

    public final int BrZ() {
        AnonymousClass657 r1 = this.A02;
        return AnonymousClass657.A00(r1, r1.A01.A01.size());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r2 != false) goto L_0x0035;
     */
    public final void Bsa(String str) {
        boolean z;
        C06590Pq r1 = this.A06;
        if (r1.AgN()) {
            AnonymousClass0C1 A022 = C05210Iq.A02(r1);
            C23300zv A002 = C23300zv.A00(A022);
            String A042 = A022.A04();
            boolean z2 = false;
            if (str == null) {
                z2 = true;
            }
            int A003 = this.A01.A00();
            boolean equals = "composer_branded_content_tools".equals(this.A01.A0B);
            boolean z3 = !equals;
            if (this.A07 == Constants.A0C) {
                z = true;
            }
            z = false;
            A002.BXT(new AnonymousClass38H(A042, z2, A003, z3, z));
        }
    }

    private String A01() {
        ConversionStep AJZ = AJZ();
        if (AJZ == null) {
            return null;
        }
        return AJZ.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0363, code lost:
        r3.A00(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0366, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0409, code lost:
        r3.A00(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x040c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0464, code lost:
        r3.A00(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0467, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04a4, code lost:
        r3.A00(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        if (r1 != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0065, code lost:
        if (r0 == false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0243  */
    private void A04() {
        boolean z;
        boolean z2;
        List list;
        List list2;
        String str;
        Bundle A022;
        String str2;
        AnonymousClass1HD r0;
        String str3;
        AnonymousClass1HD r02;
        String str4;
        AnonymousClass1HD r03;
        String str5;
        AnonymousClass1HD r04;
        AnonymousClass1HD r2;
        List list3;
        ConversionStep AJZ = AJZ();
        if (AJZ == null) {
            finish();
            return;
        }
        if ((AJZ != ConversionStep.FACEBOOK_CONNECT || !C134405oU.A02(this.A06)) && (AJZ != ConversionStep.PAGE_SELECTION || ((this.A09 && !C134405oU.A03(this.A06, false)) || !C134405oU.A02(this.A06)))) {
            if (AJZ != ConversionStep.SUGGEST_BUSINESS) {
                if (AJZ == ConversionStep.ONBOARDING_CHECKLIST) {
                    C1410261b r05 = this.A01.A02;
                    if (!(r05 == null || (list = r05.A00) == null)) {
                        boolean isEmpty = list.isEmpty();
                        z2 = true;
                    }
                    z2 = false;
                }
                z = false;
                if (z) {
                    if (AJZ == ConversionStep.FACEBOOK_CONNECT) {
                        A022 = C137355tV.A00(this.A06);
                    } else {
                        if (AJZ == ConversionStep.SIGNUP_SPLASH) {
                            AnonymousClass62I r22 = this.A01;
                            String str6 = r22.A0I;
                            String str7 = str6;
                            if (str6 != null) {
                                String str8 = r22.A0H;
                                String str9 = str8;
                                if (!(str8 == null || (str = r22.A0B) == null)) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("upsell_page_id", str7);
                                    hashMap.put("upsell_fb_user_id", str9);
                                    hashMap.put("entry_point", str);
                                    A022 = C137355tV.A02(hashMap);
                                }
                            }
                        }
                        this.A00 = null;
                        if (AJZ == ConversionStep.PAGE_SELECTION || AJZ == ConversionStep.CREATE_PAGE) {
                            this.A01.A0F = null;
                        }
                        C1418364p r3 = this.A04;
                        switch (AJZ.ordinal()) {
                            case 0:
                                str2 = AJZ.name();
                                int i = r3.A0Q.A00;
                                boolean z3 = false;
                                if (i != -1) {
                                    z3 = true;
                                }
                                AnonymousClass0a4.A0A(z3);
                                if (r3.A0B == null) {
                                    C16310oO.A00.A00();
                                    String str10 = r3.A0L;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("entry_point", str10);
                                    bundle.putString("edit_profile_entry", (String) null);
                                    bundle.putInt("entry_position", i);
                                    AnonymousClass62R r06 = new AnonymousClass62R();
                                    r06.setArguments(bundle);
                                    r3.A0B = r06;
                                }
                                r0 = r3.A0B;
                                break;
                            case 1:
                                str3 = AJZ.name();
                                if (r3.A01 == null) {
                                    C16310oO.A00.A00();
                                    String str11 = r3.A0L;
                                    AccountTypeSelectionFragment accountTypeSelectionFragment = new AccountTypeSelectionFragment();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("entry_point", str11);
                                    accountTypeSelectionFragment.setArguments(bundle2);
                                    r3.A01 = accountTypeSelectionFragment;
                                }
                                r02 = r3.A01;
                                break;
                            case 2:
                                str4 = AJZ.name();
                                if (r3.A02 == null) {
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("entry_point", r3.A0L);
                                    C16310oO.A00.A00();
                                    AccountTypeSelectionWithValuePropFragment accountTypeSelectionWithValuePropFragment = new AccountTypeSelectionWithValuePropFragment();
                                    accountTypeSelectionWithValuePropFragment.setArguments(bundle3);
                                    r3.A02 = accountTypeSelectionWithValuePropFragment;
                                }
                                r03 = r3.A02;
                                break;
                            case 3:
                                str3 = AJZ.name();
                                if (r3.A08 == null) {
                                    C16310oO.A00.A00();
                                    Integer num = Constants.A0N;
                                    String str12 = r3.A0L;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putString("entry_point", str12);
                                    bundle4.putInt("selected_account_type", C13240i8.A00(num));
                                    ProfessionalAccountDescriptionFragment professionalAccountDescriptionFragment = new ProfessionalAccountDescriptionFragment();
                                    professionalAccountDescriptionFragment.setArguments(bundle4);
                                    r3.A08 = professionalAccountDescriptionFragment;
                                }
                                r02 = r3.A08;
                                break;
                            case 4:
                                str4 = AJZ.name();
                                if (r3.A0D == null) {
                                    r3.A0D = C16310oO.A00.A00().A06(r3.A0L, (String) null, (String) null, false, false, (RegFlowExtras) null, r3.A0K);
                                }
                                if (r3.A0P.BX3() == ConversionStep.PAGE_SELECTION && (r2 = r3.A0E) != null) {
                                    r3.A0D.setTargetFragment(r2, 0);
                                }
                                r03 = r3.A0D;
                                break;
                            case 5:
                                str3 = AJZ.name();
                                if (r3.A06 == null) {
                                    C16310oO.A00.A00();
                                    String str13 = r3.A0L;
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putString("edit_profile_entry", (String) null);
                                    bundle5.putString("entry_point", str13);
                                    ConnectFBPageFragment connectFBPageFragment = new ConnectFBPageFragment();
                                    connectFBPageFragment.setArguments(bundle5);
                                    r3.A06 = connectFBPageFragment;
                                }
                                r02 = r3.A06;
                                break;
                            case 6:
                                str5 = AJZ.name();
                                if (r3.A0E == null) {
                                    C16310oO.A00.A00();
                                    String str14 = r3.A0L;
                                    String str15 = r3.A0M;
                                    PageSelectionOverrideData pageSelectionOverrideData = r3.A0K;
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putString("entry_point", str14);
                                    bundle6.putString("edit_profile_entry", (String) null);
                                    bundle6.putString("target_page_id", str15);
                                    bundle6.putParcelable("EXTRA_FB_OVERRIDE_DATA", pageSelectionOverrideData);
                                    FBPageListWithPreviewFragment fBPageListWithPreviewFragment = new FBPageListWithPreviewFragment();
                                    fBPageListWithPreviewFragment.setArguments(bundle6);
                                    r3.A0E = fBPageListWithPreviewFragment;
                                }
                                r04 = r3.A0E;
                                break;
                            case 7:
                                str4 = AJZ.name();
                                if (r3.A05 == null) {
                                    C16310oO.A00.A00();
                                    String str16 = r3.A0L;
                                    Bundle bundle7 = new Bundle();
                                    bundle7.putString("entry_point", str16);
                                    CategorySearchFragment categorySearchFragment = new CategorySearchFragment();
                                    categorySearchFragment.setArguments(bundle7);
                                    r3.A05 = categorySearchFragment;
                                }
                                r03 = r3.A05;
                                break;
                            case 8:
                                str2 = AJZ.name();
                                if (r3.A09 == null) {
                                    C16310oO.A00.A00();
                                    AnonymousClass62I r1 = r3.A0Q;
                                    BusinessInfo businessInfo = r1.A06;
                                    String str17 = r3.A0L;
                                    String str18 = r1.A0F;
                                    String str19 = r1.A0A;
                                    Bundle bundle8 = new Bundle();
                                    bundle8.putParcelable("business_info", businessInfo);
                                    bundle8.putString("entry_point", str17);
                                    bundle8.putString("edit_profile_entry", (String) null);
                                    bundle8.putString("page_access_token", str18);
                                    bundle8.putString("page_name", (String) null);
                                    bundle8.putBoolean("show_created_page_dialog", false);
                                    bundle8.putString("error_message", str19);
                                    C1409460t r07 = new C1409460t();
                                    r07.setArguments(bundle8);
                                    r3.A09 = r07;
                                }
                                r0 = r3.A09;
                                break;
                            case 9:
                                str3 = AJZ.name();
                                if (r3.A0G == null) {
                                    C16310oO.A00.A00();
                                    String str20 = r3.A0L;
                                    Bundle bundle9 = new Bundle();
                                    bundle9.putSerializable("entry_point", str20);
                                    bundle9.putString("edit_profile_entry", (String) null);
                                    ProfileDisplayOptionsFragment profileDisplayOptionsFragment = new ProfileDisplayOptionsFragment();
                                    profileDisplayOptionsFragment.setArguments(bundle9);
                                    r3.A0G = profileDisplayOptionsFragment;
                                }
                                r02 = r3.A0G;
                                break;
                            case 10:
                                str4 = AJZ.name();
                                if (r3.A0F == null) {
                                    C16310oO.A00.A00();
                                    String str21 = r3.A0L;
                                    Bundle bundle10 = new Bundle();
                                    bundle10.putString("entry_point", str21);
                                    PageLoaderFragment pageLoaderFragment = new PageLoaderFragment();
                                    pageLoaderFragment.setArguments(bundle10);
                                    r3.A0F = pageLoaderFragment;
                                }
                                r03 = r3.A0F;
                                break;
                            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                                str3 = AJZ.name();
                                if (r3.A0I == null) {
                                    C16310oO.A00.A00();
                                    String str22 = r3.A0L;
                                    String str23 = r3.A0M;
                                    Bundle bundle11 = new Bundle();
                                    bundle11.putString("entry_point", str22);
                                    bundle11.putString("target_page_id", str23);
                                    C137955uU r08 = new C137955uU();
                                    r08.setArguments(bundle11);
                                    r3.A0I = r08;
                                }
                                r02 = r3.A0I;
                                break;
                            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                                str3 = AJZ.name();
                                if (r3.A07 == null) {
                                    C16310oO.A00.A00();
                                    String str24 = r3.A0L;
                                    Bundle bundle12 = new Bundle();
                                    bundle12.putString("entry_point", str24);
                                    bundle12.putString("target_page_id", (String) null);
                                    C133525n3 r09 = new C133525n3();
                                    r09.setArguments(bundle12);
                                    r3.A07 = r09;
                                }
                                r02 = r3.A07;
                                break;
                            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                                str4 = AJZ.name();
                                if (r3.A00 == null) {
                                    C16310oO.A00.A00();
                                    String str25 = r3.A0L;
                                    Bundle bundle13 = new Bundle();
                                    bundle13.putString("entry_point", str25);
                                    C135705qm r010 = new C135705qm();
                                    r010.setArguments(bundle13);
                                    r3.A00 = r010;
                                }
                                r03 = r3.A00;
                                break;
                            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                                str3 = AJZ.name();
                                if (r3.A04 == null) {
                                    C16310oO.A00.A00();
                                    String str26 = r3.A0L;
                                    C136595sF r23 = new C136595sF();
                                    Bundle bundle14 = new Bundle();
                                    bundle14.putString("entry_point", str26);
                                    bundle14.putString("edit_profile_entry", str3);
                                    r23.setArguments(bundle14);
                                    r3.A04 = r23;
                                }
                                r02 = r3.A04;
                                break;
                            case 15:
                                str4 = AJZ.name();
                                if (r3.A03 == null) {
                                    C16310oO.A00.A00();
                                    String str27 = r3.A0L;
                                    Bundle bundle15 = new Bundle();
                                    bundle15.putString("entry_point", str27);
                                    C133535n4 r011 = new C133535n4();
                                    r011.setArguments(bundle15);
                                    r3.A03 = r011;
                                }
                                r03 = r3.A03;
                                break;
                            case 16:
                                str3 = AJZ.name();
                                if (r3.A0H == null) {
                                    C16310oO.A00.A00();
                                    String str28 = r3.A0L;
                                    Bundle bundle16 = new Bundle();
                                    bundle16.putString("entry_point", str28);
                                    bundle16.putParcelable("business_info", (Parcelable) null);
                                    C135745qq r012 = new C135745qq();
                                    r012.setArguments(bundle16);
                                    r3.A0H = r012;
                                }
                                r02 = r3.A0H;
                                break;
                            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                                str3 = AJZ.name();
                                if (r3.A0A == null) {
                                    C16310oO.A00.A00();
                                    String str29 = r3.A0L;
                                    Bundle bundle17 = new Bundle();
                                    bundle17.putString("entry_point", str29);
                                    bundle17.putParcelable("business_info", (Parcelable) null);
                                    C135735qp r013 = new C135735qp();
                                    r013.setArguments(bundle17);
                                    r3.A0A = r013;
                                }
                                r02 = r3.A0A;
                                break;
                            case 18:
                                str5 = AJZ.name();
                                if (r3.A0J == null) {
                                    C16310oO.A00.A00();
                                    C1423966x r014 = r3.A0Q.A03;
                                    if (r014 != null) {
                                        list3 = r014.A01;
                                    } else {
                                        list3 = null;
                                    }
                                    String str30 = r3.A0L;
                                    boolean BnQ = r3.A0P.BnQ();
                                    int ABJ = r3.A0P.ABJ();
                                    int BrZ = r3.A0P.BrZ();
                                    SuggestBusinessFragment suggestBusinessFragment = new SuggestBusinessFragment();
                                    Bundle bundle18 = new Bundle();
                                    bundle18.putString("entry_point", str30);
                                    bundle18.putString("suggested_business_fetch_entry_point", "post_conversion_nux_render");
                                    bundle18.putBoolean("ARG_SHOW_STEPPER_HEADER", BnQ);
                                    bundle18.putInt("ARG_STEP_INDEX", ABJ);
                                    bundle18.putInt("ARG_STEP_COUNT", BrZ);
                                    suggestBusinessFragment.setArguments(bundle18);
                                    suggestBusinessFragment.A05 = list3;
                                    r3.A0J = suggestBusinessFragment;
                                }
                                r04 = r3.A0J;
                                break;
                            case 19:
                                str4 = AJZ.name();
                                if (r3.A0C == null) {
                                    Bundle bundle19 = new Bundle();
                                    bundle19.putString("entry_point", r3.A0L);
                                    C16310oO.A00.A00();
                                    OnboardingCheckListFragment onboardingCheckListFragment = new OnboardingCheckListFragment();
                                    onboardingCheckListFragment.setArguments(bundle19);
                                    r3.A0C = onboardingCheckListFragment;
                                }
                                r03 = r3.A0C;
                                break;
                            default:
                                r3.A0P.AoZ();
                                return;
                        }
                    }
                    this.A00 = A022;
                    this.A01.A0F = null;
                    C1418364p r32 = this.A04;
                    switch (AJZ.ordinal()) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            break;
                        case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                            break;
                        case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                            break;
                        case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                            break;
                        case C120125Dh.VIEW_TYPE_LINK /*14*/:
                            break;
                        case 15:
                            break;
                        case 16:
                            break;
                        case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                            break;
                        case 18:
                            break;
                        case 19:
                            break;
                    }
                } else {
                    AnonymousClass657.A01(this.A02, false);
                    A04();
                    return;
                }
            } else {
                C1423966x r015 = this.A01.A03;
                if (!(r015 == null || (list2 = r015.A01) == null)) {
                    list2.size();
                }
            }
        }
        z = true;
        if (z) {
        }
    }

    public static void A09(BusinessConversionActivity businessConversionActivity, boolean z, C12830hS r15, Context context, String str, C137335tT r18) {
        Integer num;
        if (AnonymousClass62H.A0D(businessConversionActivity)) {
            num = Constants.A0N;
        } else {
            num = Constants.A0C;
        }
        AnonymousClass62I r5 = businessConversionActivity.A01;
        String str2 = r5.A0B;
        BusinessInfo businessInfo = r5.A06;
        String moduleName = businessConversionActivity.getModuleName();
        AnonymousClass62I AJp = businessConversionActivity.AJp();
        Context context2 = context;
        String str3 = str;
        C137275tN.A00(r15, context2, (AnonymousClass0C1) businessConversionActivity.A06, str2, businessInfo, r5, str3, moduleName, AJp.A0F, z, AJp.A00(), num, r18, AnonymousClass62H.A04(businessConversionActivity));
    }

    public final void A0V(Bundle bundle) {
        if (AJZ() == null) {
            AoZ();
            C06590Pq r1 = this.A06;
            if (r1.AgN() && C05210Iq.A02(r1).A06.AeV() && this.A07 == Constants.ZERO) {
                AnonymousClass2OA r2 = new AnonymousClass2OA(this);
                r2.A0U(false);
                r2.A0V(false);
                r2.A07(C0003R.string.already_business_title);
                r2.A06(C0003R.string.already_business_message);
                r2.A0A(C0003R.string.f118ok, new AnonymousClass65O(this));
                r2.A03().show();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (p000X.C134405oU.A05(r5.A06, false) == false) goto L_0x0011;
     */
    public final boolean A7s() {
        boolean z;
        if (AnonymousClass62H.A0D(this)) {
            z = true;
        }
        z = false;
        ConversionStep AJZ = AJZ();
        if (AJZ == ConversionStep.CREATE_PAGE || AJZ == ConversionStep.PAGE_SELECTION || AJZ == ConversionStep.FACEBOOK_CONNECT) {
            if (this.A07 == Constants.ZERO || AnonymousClass62H.A0D(this) || this.A0A) {
                return true;
            }
            return false;
        } else if (AJZ != ConversionStep.EDIT_CONTACT) {
            return false;
        } else {
            if (this.A07 == Constants.ZERO || z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (r4 > r2.A01.size()) goto L_0x003c;
     */
    public final void Aob(Bundle bundle, ConversionStep conversionStep, boolean z) {
        boolean z2;
        ImmutableList A002;
        A08(bundle);
        C1413162h.A03(C1413162h.A01(this.A06), A01(), "finish_step", (String) null, bundle);
        A07();
        if (z) {
            if (conversionStep != null) {
                this.A08.add(conversionStep);
                AnonymousClass657 r7 = this.A02;
                BusinessConversionFlowStatus businessConversionFlowStatus = r7.A01;
                BusinessConversionStep businessConversionStep = new BusinessConversionStep(conversionStep);
                BusinessConversionFlowStatus businessConversionFlowStatus2 = businessConversionFlowStatus;
                int i = businessConversionFlowStatus.A00;
                int i2 = i;
                int i3 = i + 1;
                if (businessConversionFlowStatus != null && i3 >= 0) {
                    z2 = true;
                }
                z2 = false;
                AnonymousClass0a4.A0A(z2);
                if (i3 == businessConversionFlowStatus2.A01.size()) {
                    AnonymousClass267 r2 = new AnonymousClass267();
                    r2.A07(businessConversionFlowStatus2.A01);
                    r2.A08(businessConversionStep);
                    A002 = r2.A06();
                } else {
                    A002 = AnonymousClass659.A00(businessConversionFlowStatus2, businessConversionStep, i3, true);
                }
                r7.A01 = new BusinessConversionFlowStatus(A002, i2);
            }
        } else if (conversionStep != null) {
            AnonymousClass657 r5 = this.A02;
            BusinessConversionFlowStatus businessConversionFlowStatus3 = r5.A01;
            r5.A01 = new BusinessConversionFlowStatus(AnonymousClass659.A00(businessConversionFlowStatus3, new BusinessConversionStep(conversionStep), businessConversionFlowStatus3.A00 + 1, false), businessConversionFlowStatus3.A00);
        }
        AnonymousClass657.A01(this.A02, false);
        A04();
        C1413162h.A03(C1413162h.A01(this.A06), A01(), "start_step", (String) null, this.A00);
    }

    public final void Aoc(Bundle bundle, List list) {
        A08(bundle);
        A07();
        this.A02.A03(list);
        A04();
    }

    public final void Be7(Bundle bundle) {
        ConversionStep AJZ = AJZ();
        C1413162h.A03(C1413162h.A01(this.A06), A01(), "cancel", (String) null, bundle);
        AnonymousClass657 r3 = this.A02;
        BusinessConversionFlowStatus businessConversionFlowStatus = r3.A01;
        boolean z = false;
        if (businessConversionFlowStatus.A00 > -1) {
            z = true;
        }
        if (z) {
            BusinessConversionStep A002 = businessConversionFlowStatus.A00();
            if (A002 != null) {
                r3.A04.remove(A002);
            }
            BusinessConversionStep A012 = r3.A01.A01();
            if (A012 == null) {
                BusinessConversionFlowStatus businessConversionFlowStatus2 = r3.A01;
                r3.A01 = new BusinessConversionFlowStatus(businessConversionFlowStatus2.A01, businessConversionFlowStatus2.A00 - 1);
                for (AnonymousClass51Q r1 : r3.A02) {
                    C1413162h.A01(r1.A00.A06).A04();
                    r1.A00.setResult(0);
                }
                AnonymousClass657.A05.remove(r3.A00.A00());
                r3.A03 = new HashSet();
                r3.A02 = new HashSet();
            } else if (A012.A00 != AnonymousClass65B.SKIP || !r3.A04.containsKey(A012)) {
                BusinessConversionFlowStatus businessConversionFlowStatus3 = r3.A01;
                r3.A01 = new BusinessConversionFlowStatus(businessConversionFlowStatus3.A01, businessConversionFlowStatus3.A00 - 1);
            } else {
                r3.A01 = (BusinessConversionFlowStatus) r3.A04.get(A012);
            }
        }
        boolean z2 = false;
        if (bundle != null && bundle.getBoolean("EXTRA_FORCE_FETCH_FB_PAGES", false)) {
            z2 = true;
        }
        if (AJZ == ConversionStep.CREATE_PAGE) {
            AnonymousClass657 r6 = this.A02;
            BusinessConversionFlowStatus businessConversionFlowStatus4 = r6.A01;
            boolean z3 = false;
            if (businessConversionFlowStatus4.A00 < businessConversionFlowStatus4.A01.size() - 1) {
                z3 = true;
            }
            AnonymousClass0a4.A0A(z3);
            int i = businessConversionFlowStatus4.A00;
            r6.A01 = AnonymousClass659.A01(businessConversionFlowStatus4, i + 1, i);
            if (!z2) {
                AnonymousClass62I r2 = this.A01;
                if (r2.A01 == ConversionStep.PAGE_SELECTION && r2.A05 != null && !r2.A02()) {
                    Be6();
                }
            }
        } else if (this.A08.contains(AJZ)) {
            AnonymousClass657 r62 = this.A02;
            BusinessConversionFlowStatus businessConversionFlowStatus5 = r62.A01;
            boolean z4 = false;
            if (businessConversionFlowStatus5.A00 < businessConversionFlowStatus5.A01.size() - 1) {
                z4 = true;
            }
            AnonymousClass0a4.A0A(z4);
            int i2 = businessConversionFlowStatus5.A00;
            r62.A01 = AnonymousClass659.A01(businessConversionFlowStatus5, i2 + 1, i2);
        }
        this.A08.remove(AJZ);
        ConversionStep AJZ2 = AJZ();
        if (AJZ2 == null) {
            finish();
            return;
        }
        if (AJZ2 == ConversionStep.PAGE_SELECTION || AJZ2 == ConversionStep.CREATE_PAGE) {
            this.A01.A0F = null;
        }
        FragmentActivity fragmentActivity = this.A04.A0O;
        fragmentActivity.A05().A16(AJZ2.name(), 0);
    }

    public final void Bou(Bundle bundle) {
        A08(bundle);
        C1413162h.A03(C1413162h.A01(this.A06), A01(), "skip", (String) null, bundle);
        A07();
        Integer num = this.A07;
        if (num == Constants.ONE) {
            AnonymousClass657 r3 = this.A02;
            AnonymousClass267 r2 = new AnonymousClass267();
            r2.A08(new BusinessConversionStep(ConversionStep.CHOOSE_CATEGORY));
            r2.A08(new BusinessConversionStep(ConversionStep.SIGNUP_CONFIRMATION));
            r3.A03(r2.A06());
        } else {
            if (num == Constants.ZERO) {
                if (!C1415763o.A04(this.A06) && AJZ() == ConversionStep.PAGE_SELECTION) {
                    AnonymousClass657 r32 = this.A02;
                    AnonymousClass267 r22 = new AnonymousClass267();
                    r22.A08(new BusinessConversionStep(ConversionStep.CHOOSE_CATEGORY));
                    r32.A03(r22.A06());
                } else if (AJZ() == ConversionStep.FACEBOOK_CONNECT) {
                    AnonymousClass657 r33 = this.A02;
                    AnonymousClass267 A002 = ImmutableList.A00();
                    A002.A08(new BusinessConversionStep(ConversionStep.ONBOARDING_CHECKLIST));
                    r33.A03(A002.A06());
                }
            } else if (AnonymousClass62H.A0D(this)) {
                if (!(AJZ() == ConversionStep.EDIT_CONTACT || AJZ() == ConversionStep.PROFILE_DISPLAY_OPTIONS || (this.A02.A01.A01() != null && this.A02.A01.A01().A01 == ConversionStep.CHOOSE_CATEGORY))) {
                    C1413162h.A03(C1413162h.A01(this.A06), A01(), "skip", (String) null, (Bundle) null);
                    this.A02.A02();
                    finish();
                }
            }
            AnonymousClass657.A01(this.A02, false);
        }
        C1413162h.A03(C1413162h.A01(this.A06), A01(), "start_step", (String) null, this.A00);
        A04();
    }

    public final void finish() {
        super.finish();
        if (this.A0C) {
            overridePendingTransition(0, 0);
        }
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass657 r0;
        Parcelable parcelableExtra;
        AnonymousClass267 r4;
        BusinessConversionFlowStatus businessConversionFlowStatus;
        ImmutableList A032;
        int A002 = AnonymousClass0Z0.A00(-2126359644);
        this.A06 = AnonymousClass0J1.A00(getIntent().getExtras());
        this.A0B = UUID.randomUUID().toString();
        C06590Pq r1 = this.A06;
        AnonymousClass0a4.A06(r1);
        this.A03 = new AnonymousClass656(r1);
        Bundle extras = getIntent().getExtras();
        this.A01 = new AnonymousClass62I(this.A06, extras);
        boolean z = false;
        this.A0A = extras.getBoolean("sign_up_suma_entry", false);
        int i = extras.getInt("business_account_flow");
        for (Integer num : Constants.ZERO(7)) {
            if (C53892Uu.A00(num) == i) {
                this.A07 = num;
                this.A04 = new C1418364p(this, this, this.A03, new C1418464q());
                A06();
                this.A0C = getIntent().getBooleanExtra("EXTRA_DISABLE_ACTIVITY_TRANSITION_ANIMATION", false);
                String A052 = C05210Iq.A05(this.A06);
                if (A052 == null) {
                    r0 = null;
                } else {
                    r0 = (AnonymousClass657) AnonymousClass657.A05.get(A052);
                }
                this.A02 = r0;
                if (this.A07 != Constants.ONE) {
                    z = C12800hP.A0J(this.A06);
                } else if (this.A01.A0C != null || C12800hP.A0J(this.A06)) {
                    z = true;
                }
                this.A09 = z;
                if (this.A02 == null) {
                    if (bundle != null) {
                        businessConversionFlowStatus = (BusinessConversionFlowStatus) bundle.getParcelable("conversion_flow_status");
                    } else {
                        Integer num2 = this.A07;
                        boolean z2 = true;
                        boolean z3 = false;
                        if (this.A01.A00 == -1) {
                            z3 = true;
                        }
                        if (!this.A0A || !((Boolean) new AnonymousClass0I1("skip_value_prop", AnonymousClass0L7.SUMA_LANDING_PAGE, false, (String[]) null).A00()).booleanValue()) {
                            z2 = false;
                        }
                        C06590Pq r5 = this.A06;
                        switch (num2.intValue()) {
                            case 0:
                                businessConversionFlowStatus = new BusinessConversionFlowStatus((List) C1410461e.A02(z3, z));
                                break;
                            case 1:
                                businessConversionFlowStatus = new BusinessConversionFlowStatus((List) C1410461e.A04(z2, z));
                                break;
                            case 2:
                                if (C136395rv.A01(r5, false)) {
                                    A032 = C1410461e.A00(r5, z3);
                                } else {
                                    A032 = C1410461e.A03(z, z3);
                                }
                                businessConversionFlowStatus = new BusinessConversionFlowStatus((List) A032);
                                break;
                            case 3:
                                r4 = new AnonymousClass267();
                                if (!((Boolean) C134405oU.A00(new C05000Hl("is_enabled", AnonymousClass0L7.SMB_GROWTH_ANDROID_DETERMINE_BUSINESS_CREATOR_LAUNCHER, false, (String[]) null, (AnonymousClass04H) null), r5, true)).booleanValue()) {
                                    r4.A08(new BusinessConversionStep(ConversionStep.ACCOUNT_TYPE_SELECTION));
                                    break;
                                } else {
                                    r4.A08(new BusinessConversionStep(ConversionStep.ACCOUNT_TYPE_SELECTION_WITH_VALUE_PROP));
                                    break;
                                }
                            case 4:
                                r4 = new AnonymousClass267();
                                r4.A08(new BusinessConversionStep(ConversionStep.CHOOSE_CATEGORY));
                                if (r5.AgN()) {
                                    AnonymousClass0C1 A022 = C05210Iq.A02(r5);
                                    if (TextUtils.isEmpty(A022.A06.A2d) && TextUtils.isEmpty(A022.A06.A2e) && !C136395rv.A01(r5, false)) {
                                        r4.A08(new BusinessConversionStep(ConversionStep.EDIT_CONTACT));
                                    }
                                }
                                if (!C136395rv.A00(r5, false)) {
                                    r4.A08(new BusinessConversionStep(ConversionStep.PROFILE_DISPLAY_OPTIONS));
                                    break;
                                }
                                break;
                            case 5:
                                r4 = new AnonymousClass267();
                                r4.A08(new BusinessConversionStep(ConversionStep.PAGE_SELECTION));
                                break;
                            default:
                                throw new UnsupportedOperationException();
                        }
                        businessConversionFlowStatus = new BusinessConversionFlowStatus((List) r4.A06());
                    }
                    AnonymousClass656 r52 = this.A03;
                    AnonymousClass657 r42 = (AnonymousClass657) AnonymousClass657.A05.get(r52.A00());
                    if (r42 == null) {
                        r42 = new AnonymousClass657(r52, businessConversionFlowStatus);
                        if (r52.A00() != null) {
                            AnonymousClass657.A05.put(r52.A00(), r42);
                        }
                    }
                    this.A02 = r42;
                    r42.A02.add(new AnonymousClass51Q(this));
                    this.A02.A03.add(new AnonymousClass666(this));
                }
                if (bundle == null || bundle.getParcelable("business_info") == null) {
                    this.A01.A01(new AnonymousClass612().A00());
                } else {
                    this.A01.A01((BusinessInfo) bundle.getParcelable("business_info"));
                }
                if (bundle == null || bundle.getParcelable("EXTRA_FB_OVERRIDE_DATA") == null) {
                    parcelableExtra = getIntent().getParcelableExtra("EXTRA_FB_OVERRIDE_DATA");
                } else {
                    parcelableExtra = bundle.getParcelable("EXTRA_FB_OVERRIDE_DATA");
                }
                PageSelectionOverrideData pageSelectionOverrideData = (PageSelectionOverrideData) parcelableExtra;
                this.A05 = pageSelectionOverrideData;
                this.A04.A0K = pageSelectionOverrideData;
                super.onCreate(bundle);
                AnonymousClass0Z0.A07(-1954870128, A002);
                return;
            }
        }
        throw new IllegalArgumentException("Unsupported BusinessAccountFlowType");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass657 r0 = this.A02;
        if (r0 != null) {
            bundle.putParcelable("conversion_flow_status", r0.A01);
        }
        bundle.putParcelable("business_info", this.A01.A06);
        PageSelectionOverrideData pageSelectionOverrideData = this.A05;
        if (pageSelectionOverrideData != null) {
            bundle.putParcelable("EXTRA_FB_OVERRIDE_DATA", pageSelectionOverrideData);
        }
    }
}
