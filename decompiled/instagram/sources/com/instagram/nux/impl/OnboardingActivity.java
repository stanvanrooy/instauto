package com.instagram.nux.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0LZ;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1B9;
import p000X.AnonymousClass1H7;
import p000X.AnonymousClass5W2;
import p000X.AnonymousClass5WI;
import p000X.AnonymousClass5WK;
import p000X.AnonymousClass6AG;
import p000X.C05230Is;
import p000X.C05570Lc;
import p000X.C05640Lj;
import p000X.C06590Pq;
import p000X.C116444zJ;
import p000X.C1171651g;
import p000X.C120125Dh;
import p000X.C120405Em;
import p000X.C120425Eo;
import p000X.C126885cA;
import p000X.C127705dV;
import p000X.C12810hQ;
import p000X.C128555es;
import p000X.C128565et;
import p000X.C128575eu;
import p000X.C128625f0;
import p000X.C128635f1;
import p000X.C128645f2;
import p000X.C128655f3;
import p000X.C128665f4;
import p000X.C128695f7;
import p000X.C128935fX;
import p000X.C128985fc;
import p000X.C129085fm;
import p000X.C129135fr;
import p000X.C129145fs;
import p000X.C129195fx;
import p000X.C134605oq;
import p000X.C134625os;
import p000X.C134645ou;
import p000X.C134825pD;
import p000X.C134845pF;
import p000X.C134865pH;
import p000X.C135035pZ;
import p000X.C135065pc;
import p000X.C13910jS;
import p000X.C14100jl;
import p000X.C1427468o;
import p000X.C1428268x;
import p000X.C15940nm;
import p000X.C17530qO;
import p000X.C22100xq;
import p000X.C35251g3;
import p000X.C52362Om;

public class OnboardingActivity extends BaseFragmentActivity implements AnonymousClass0RN, AnonymousClass5WK, AnonymousClass1B9 {
    public C134645ou A00;
    public C128565et A01;
    public AnonymousClass0C1 A02;

    public final String getModuleName() {
        return "onboarding_activity";
    }

    private void A01() {
        C128935fX r4;
        Integer num;
        String $const$string;
        C134645ou r0 = this.A00;
        C134865pH r1 = r0.A00;
        if (r1 == null) {
            finish();
            return;
        }
        C128565et r5 = this.A01;
        C134845pF r02 = (C134845pF) r0.A02;
        switch (C135065pc.A01[((C135035pZ) r1.A00.A5r()).ordinal()]) {
            case 1:
                AnonymousClass0C1 AZl = r02.AZl();
                if (C1171651g.A00(AZl) == null) {
                    C1171651g.A01(this, AZl, "auto_confirmation", (List) null, new C120405Em(AZl));
                    break;
                }
                break;
            case 2:
                AnonymousClass0C1 AZl2 = r02.AZl();
                AnonymousClass0WN.A01(AZl2).BcG(C13910jS.FetchEmailInNux.A01(AZl2).A00());
                C12810hQ.A02(new C128635f1(this, AZl2));
                if (((Boolean) C05640Lj.A01(AnonymousClass0L7.NUX_ADD_EMAIL_DEVICE, "prefetch_email_without_oauth", false)).booleanValue()) {
                    C1171651g.A01(this, AZl2, "add_email_nux", (List) null, new C128625f0(AZl2, false));
                    break;
                }
                break;
            case 3:
                C120425Eo A002 = C1171651g.A00(r02.AZl());
                if (A002 != null) {
                    C1171651g.A02(this, r02.AZl(), A002.A01, A002.A00);
                    return;
                } else {
                    r5.A00.Aod(-1);
                    return;
                }
            case 4:
                C15940nm.A02().A03();
                Bundle A003 = C128565et.A00(r02);
                C128985fc r12 = new C128985fc();
                r12.setArguments(A003);
                C128565et.A01(this, r12, r02);
                return;
            case 5:
                C17530qO.A00.A00();
                C128565et.A01(this, C116444zJ.A01(Constants.ZERO, C14100jl.A00(r02.AZl()), getString(C0003R.string.find_facebook_friends_nux_title), true, false, (ArrayList) null, r02.AZl()), r02);
                return;
            case 6:
                Bundle A004 = C128565et.A00(r02);
                C128665f4.A01(Constants.A0C, A004, C14100jl.A00(r02.AZl()), C14100jl.A01(r02.AZl()));
                C15940nm.A02().A03();
                C128695f7 r13 = new C128695f7();
                r13.setArguments(A004);
                C128565et.A01(this, r13, r02);
                return;
            case 7:
                if (r02.AU0() == C134605oq.A05) {
                    C17530qO.A00.A00();
                    C128565et.A01(this, C116444zJ.A01(Constants.ONE, (String) null, getString(C0003R.string.find_contacts_nux_title), true, false, (ArrayList) null, r02.AZl()), r02);
                    return;
                }
                AnonymousClass0WN.A01(r02.AZl()).BcG(C13910jS.ContactsUpsellViewed.A01(r02.AZl()).A01(C129145fs.CONTACTS_UPSELL));
                C35251g3.A02(this, new C128555es(r5, r02, this, this), "android.permission.READ_CONTACTS");
                return;
            case 8:
                C15940nm.A02().A03();
                Bundle A005 = C128565et.A00(r02);
                C127705dV r14 = new C127705dV();
                r14.setArguments(A005);
                C128565et.A01(this, r14, r02);
                return;
            case 9:
                C15940nm.A02().A03();
                Bundle A006 = C128565et.A00(r02);
                C1427468o r15 = new C1427468o();
                r15.setArguments(A006);
                C128565et.A01(this, r15, r02);
                return;
            case 10:
                C22100xq.A00().A02();
                String A007 = AnonymousClass5WI.A00(Constants.A0Y);
                Bundle bundle = new Bundle();
                bundle.putString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT", "nux");
                bundle.putString("ExplorePeopleFragment.ARGUMENT_TYPE", A007);
                bundle.putBoolean("ExplorePeopleFragment.ARGUMENT_NO_SCROLLABLE_NAVIGATION_HELPER", false);
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    bundle.putString("ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE", (String) null);
                }
                C128565et.A01(this, AnonymousClass5W2.A00(bundle), r02);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                AnonymousClass0a4.A06(r02.AZi());
                C15940nm.A02().A03();
                AnonymousClass0C1 AZl3 = r02.AZl();
                Bundle A008 = C128565et.A00(r02);
                C129135fr r2 = new C129135fr();
                C05230Is.A00(AZl3, A008);
                C52362Om r16 = new C52362Om(this, r02.AZl());
                r16.A02 = r2;
                r16.A04 = C135035pZ.FIND_FRIENDS.name();
                r16.A07 = true;
                r16.A02();
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                C128645f2 A009 = C128645f2.A00(r02.AZl());
                C128645f2 A0010 = C128645f2.A00(r02.AZl());
                synchronized (A0010) {
                    r4 = A0010.A00;
                }
                AnonymousClass0a4.A06(r4);
                AnonymousClass0P4 A0011 = C13910jS.AddEmailEmailSourceInfo.A01(r02.AZl()).A00();
                synchronized (A009) {
                    num = A009.A01;
                }
                switch (num.intValue()) {
                    case 1:
                        $const$string = AnonymousClass0C5.$const$string(167);
                        break;
                    case 2:
                        $const$string = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                        break;
                    default:
                        $const$string = "AVAILABLE";
                        break;
                }
                A0011.A0G("device_oauth_available", $const$string);
                A0011.A0A("email_fetched_with_oauth", Boolean.valueOf(r4.A01));
                A0011.A0G("email_prefetch_location", (String) C05570Lc.A00(AnonymousClass0LZ.A0t));
                A0011.A0A("prefetch_without_oauth", (Boolean) C05570Lc.A00(AnonymousClass0LZ.A0u));
                AnonymousClass0WN.A01(r02.AZl()).BcG(A0011);
                synchronized (A009) {
                    A009.A02 = true;
                }
                AnonymousClass0C1 AZl4 = r02.AZl();
                String str = r4.A00;
                C52362Om r42 = new C52362Om(this, AZl4);
                C15940nm.A02().A03();
                C126885cA r3 = new C126885cA();
                Bundle bundle2 = new Bundle();
                bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", AZl4.getToken());
                bundle2.putString("argument_email", str);
                r3.setArguments(bundle2);
                r42.A02 = r3;
                r42.A02();
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                C15940nm.A02().A03();
                Bundle A0012 = C128565et.A00(r02);
                C129085fm r17 = new C129085fm();
                r17.setArguments(A0012);
                C128565et.A01(this, r17, r02);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                AnonymousClass0a4.A06(r02.AZi());
                C15940nm.A02().A03();
                Bundle A0013 = C128565et.A00(r02);
                C129195fx r22 = new C129195fx();
                r22.setArguments(A0013);
                C52362Om r18 = new C52362Om(this, r02.AZl());
                r18.A02 = r22;
                r18.A04 = C135035pZ.FOLLOW_FROM_LOGGED_IN_ACCOUNTS.name();
                r18.A07 = true;
                r18.A02();
                return;
            case 15:
                C15940nm.A02().A03();
                Bundle A0014 = C128565et.A00(r02);
                AnonymousClass6AG r19 = new AnonymousClass6AG();
                r19.setArguments(A0014);
                C128565et.A01(this, r19, r02);
                return;
            default:
                r5.A00.Aod(-2);
                return;
        }
        r5.A00.Aod(1);
    }

    public final void Aod(int i) {
        this.A00.Aod(i);
        A01();
    }

    public final void onBackPressed() {
        C135035pZ r0;
        C134865pH r02 = this.A00.A00;
        if (r02 != null) {
            Enum A5r = r02.A00.A5r();
            C135035pZ r03 = C135035pZ.FIND_FRIENDS;
            if ((A5r == r03 && !A04(r03)) || (this.A00.A00.A00.A5r() == (r0 = C135035pZ.FOLLOW_FROM_LOGGED_IN_ACCOUNTS) && !A04(r0))) {
                super.onBackPressed();
            }
        }
    }

    private boolean A04(C135035pZ r4) {
        AnonymousClass1AM A05 = A05();
        int A0I = A05.A0I();
        if (A0I == 0) {
            return true;
        }
        return r4.name().equals(((AnonymousClass1H7) A05.A09.get(A0I - 1)).getName());
    }

    public final C06590Pq A0L() {
        return this.A02;
    }

    public final void A0V(Bundle bundle) {
        C134625os r1;
        C134625os r0;
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(getIntent().getExtras());
        this.A02 = A06;
        AnonymousClass0a4.A06(A06);
        String A04 = A06.A04();
        Class<C134625os> cls = C134625os.class;
        synchronized (cls) {
            r1 = (C134625os) C134625os.A02.get(A04);
        }
        this.A00 = r1;
        this.A01 = new C128565et(this);
        if (r1 == null) {
            synchronized (cls) {
                r0 = (C134625os) C134625os.A02.get((Object) null);
            }
            this.A00 = r0;
            if (r0 == null) {
                C128575eu r3 = new C128575eu();
                r3.A01 = C134605oq.EMAIL;
                r3.A02 = Constants.ZERO;
                AnonymousClass0C1 r12 = this.A02;
                r3.A00 = r12;
                C134625os r2 = new C134625os(this, r12, r3, new C134825pD());
                this.A00 = r2;
                r2.A03.add(new C128655f3(this));
            }
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_dynamic_onboarding_missing_business_logic", this);
            boolean z = false;
            if (this.A00 != null) {
                z = true;
            }
            A002.A0A("found", Boolean.valueOf(z));
            AnonymousClass0WN.A01(this.A02).BcG(A002);
        }
        if (this.A00.A00 == null) {
            Aod(1);
        } else {
            A01();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-784194641);
        super.onCreate(bundle);
        C1428268x.A00().A03();
        AnonymousClass0Z0.A07(1141948697, A002);
    }
}
