package com.instagram.clips.viewer;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1F3;
import p000X.AnonymousClass1F6;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1N4;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass1WV;
import p000X.AnonymousClass1bM;
import p000X.AnonymousClass2T0;
import p000X.AnonymousClass2xx;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass6XT;
import p000X.AnonymousClass6XW;
import p000X.AnonymousClass6XX;
import p000X.AnonymousClass8CF;
import p000X.AnonymousClass8CJ;
import p000X.AnonymousClass8CK;
import p000X.AnonymousClass8CN;
import p000X.AnonymousClass8CO;
import p000X.AnonymousClass8CP;
import p000X.AnonymousClass8D0;
import p000X.AnonymousClass8D2;
import p000X.C019000b;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C120125Dh;
import p000X.C148566Xc;
import p000X.C158826qG;
import p000X.C158896qN;
import p000X.C15890nh;
import p000X.C159046qc;
import p000X.C159056qd;
import p000X.C159156qn;
import p000X.C159166qo;
import p000X.C163756yg;
import p000X.C163776yi;
import p000X.C163786yk;
import p000X.C190478Cc;
import p000X.C190488Cd;
import p000X.C190498Ce;
import p000X.C190508Cf;
import p000X.C190518Cg;
import p000X.C190538Cj;
import p000X.C190548Ck;
import p000X.C190568Cm;
import p000X.C190598Cp;
import p000X.C190608Cq;
import p000X.C190618Cr;
import p000X.C190638Ct;
import p000X.C190648Cu;
import p000X.C190658Cv;
import p000X.C190668Cw;
import p000X.C190698Cz;
import p000X.C23300zv;
import p000X.C27341Hl;
import p000X.C28051Kf;
import p000X.C29191Oy;
import p000X.C29631Qq;
import p000X.C29671Qu;
import p000X.C30541Ug;
import p000X.C30841Vk;
import p000X.C30901Vq;
import p000X.C30921Vs;
import p000X.C32471bJ;
import p000X.C32711bj;
import p000X.C33431cu;
import p000X.C33831dZ;
import p000X.C35151ft;
import p000X.C36791ic;
import p000X.C38911m3;
import p000X.C39381mp;
import p000X.C44391w5;
import p000X.C45541y6;
import p000X.C53432St;
import p000X.C53492Sz;
import p000X.C54242Wl;
import p000X.C67852xw;

public class ClipsViewerFragment extends C27341Hl implements AnonymousClass1I6, C30541Ug, AnonymousClass1HK, C33431cu {
    public static final AnonymousClass1EA A0Q = AnonymousClass1EA.A01(40.0d, 9.0d);
    public AnonymousClass1HD A00;
    public AnonymousClass2T0 A01;
    public C158826qG A02;
    public C190478Cc A03;
    public C29671Qu A04;
    public AnonymousClass0C1 A05;
    public String A06;
    public float A07;
    public ClipsViewerConfig A08;
    public ClipsViewerSource A09;
    public C190568Cm A0A;
    public C190538Cj A0B;
    public AnonymousClass6XX A0C;
    public C190518Cg A0D;
    public C190548Ck A0E;
    public C190508Cf A0F;
    public AnonymousClass6XW A0G;
    public AnonymousClass8CP A0H;
    public C11200ea A0I;
    public C28051Kf A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public final C11200ea A0P = new C159156qn(this);
    public ReboundViewPager mClipsViewerViewPager;
    public C163756yg mDrawerController;

    public final boolean Ae1() {
        return true;
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A01(ClipsViewerFragment clipsViewerFragment, C38911m3 r7) {
        if (clipsViewerFragment.A01 != null) {
            C158826qG r0 = clipsViewerFragment.A02;
            Integer num = Constants.ZERO;
            ArrayList arrayList = new ArrayList();
            for (C38911m3 r1 : r0.A05) {
                if (r1.A02 == num) {
                    arrayList.add(r1);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.remove(r7);
            AnonymousClass2T0 r02 = clipsViewerFragment.A01;
            C190658Cv r3 = (C190658Cv) r02.A00.get(clipsViewerFragment.A06);
            if (r3 != null) {
                r3.A01.clear();
                r3.A01.addAll(arrayList2);
                for (C53492Sz Awp : r3.A02) {
                    Awp.Awp(arrayList2, r3.A00);
                }
            }
        }
    }

    public final void A02(C38911m3 r12, boolean z) {
        C190608Cq r10;
        C190648Cu r8;
        String str;
        C36791ic.A00(this.A05).A01(r12.A00, z);
        if (!z) {
            r12.A01 = null;
        }
        if (z) {
            this.A03.A08("hide", false);
        } else {
            A00(this);
        }
        AnonymousClass0Z1.A00(this.A02, -1841782564);
        A01(this, r12);
        AnonymousClass0C1 r2 = this.A05;
        AnonymousClass1NJ r4 = r12.A00;
        long position = (long) this.A02.A03(r12).A03.getPosition();
        String str2 = this.A0N;
        String str3 = this.A0L;
        if (z) {
            r10 = C190608Cq.HIDE;
        } else {
            r10 = C190608Cq.UNHIDE;
        }
        if (z) {
            r8 = C190648Cu.MENU;
        } else {
            r8 = C190648Cu.UNDO_BUTTON;
        }
        AnonymousClass8D0 r3 = new AnonymousClass8D0(AnonymousClass0QT.A00(r2, this).A02("instagram_clips_see_less"));
        r3.A02("action", r10);
        r3.A02(AnonymousClass40t.$const$string(17), r8);
        r3.A08("containermodule", getModuleName());
        r3.A08("media_compound_key", r4.getId());
        r3.A07("media_index", Long.valueOf(position));
        r3.A08("viewer_session_id", str2);
        r3.A08("viewer_init_media_compound_key", str3);
        r3.A08("ranking_connection_id", r4.A1n);
        r3.A08("ranking_source_token", r4.A0o());
        r3.A08("mezql_token", r4.A25);
        r3.A01();
        AnonymousClass0C1 r32 = this.A05;
        String str4 = r12.A00.A27;
        C15890nh r22 = new C15890nh(r32);
        r22.A09 = Constants.ONE;
        if (z) {
            str = "clips/hide/";
        } else {
            str = "clips/unhide/";
        }
        r22.A0C = str;
        r22.A09("clips_media_id", str4);
        r22.A06(AnonymousClass1N4.class, false);
        schedule(r22.A03());
    }

    public final void configureActionBar(AnonymousClass1EX r6) {
        C190548Ck r2 = this.A0E;
        C163756yg r1 = r2.A07;
        if (r1 == null || r1.A00 == null) {
            AnonymousClass2xx A002 = C67852xw.A00(Constants.ZERO);
            A002.A0C = false;
            A002.A06 = C019000b.A00(r2.A01, C0003R.color.black);
            A002.A0A = C019000b.A03(r2.A01, C0003R.C0004drawable.clips_viewer_action_bar_gradient_background);
            r6.BmE(A002.A00());
            r6.BlI(C0003R.string.clips_name);
            r6.AYT().setTextColor(C019000b.A00(r2.A01, C0003R.color.white));
            r6.Bgw(r2.A01.getResources().getDimensionPixelSize(C0003R.dimen.clips_viewer_media_action_bar_height));
            r6.Bo0(false);
            C33831dZ r12 = new C33831dZ();
            r12.A04 = r2.A02;
            r12.A01 = C0003R.string.clips_viewer_back_button;
            r12.A05 = new C190668Cw(r2);
            r6.A3K(r12.A00());
            C33831dZ r13 = new C33831dZ();
            r13.A04 = r2.A03;
            r13.A01 = C0003R.string.clips_viewer_camera_button;
            r13.A05 = new C190498Ce(r2);
            r6.A4J(r13.A00());
            return;
        }
        r1.configureActionBar(r6);
    }

    public final String getModuleName() {
        return AnonymousClass000.A0E("clips_viewer_", this.A09.A00);
    }

    public final boolean onBackPressed() {
        float f;
        C163756yg r0 = this.mDrawerController;
        if (r0 == null) {
            return false;
        }
        C163786yk r3 = r0.A07;
        AnonymousClass1EG r02 = r3.A04;
        if (r02 == null) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            f = (float) r02.A01;
        }
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return false;
        }
        r3.A03(true);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x007e, code lost:
        if (p000X.AnonymousClass1WV.A00(r4).A06 == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0232, code lost:
        if (r4.size() < 3) goto L_0x0182;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        C53432St r5;
        C39381mp r2;
        C39381mp r22;
        List list;
        int A022 = AnonymousClass0Z0.A02(-2082602985);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        int i = 0;
        AnonymousClass0a4.A0B(bundle2.getBoolean("ClipsViewerLauncher.KEY_OPENED_VIEWER_FROM_LAUNCHER", false), "The Clips viewer must be opened directly from the launcher.");
        this.A05 = AnonymousClass0J1.A06(bundle2);
        this.A0N = UUID.randomUUID().toString();
        ClipsViewerConfig clipsViewerConfig = (ClipsViewerConfig) bundle2.getParcelable("ClipsViewerLauncher.KEY_CONFIG");
        this.A08 = clipsViewerConfig;
        ClipsViewerSource clipsViewerSource = clipsViewerConfig.A03;
        AnonymousClass0a4.A06(clipsViewerSource);
        this.A09 = clipsViewerSource;
        this.A0L = clipsViewerConfig.A07;
        Context context = getContext();
        AnonymousClass0C1 r10 = this.A05;
        C190538Cj r11 = new C190538Cj(r10, this, this, this);
        this.A0B = r11;
        C190478Cc r8 = new C190478Cc(context, r10, r11, this, this.A0N, (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.A03 = r8;
        r8.A05.add(new AnonymousClass8D2(this.A05, this));
        AnonymousClass0C1 r4 = this.A05;
        if (AnonymousClass1WV.A03(r4)) {
            z = true;
        }
        z = false;
        this.A0O = z;
        C28051Kf A002 = C28051Kf.A00();
        this.A0J = A002;
        C158896qN r20 = new C158896qN(getContext(), this.A0L, A002, this.A05, this, this, z);
        if (this.A0O) {
            AnonymousClass1F6.A00(this.A05).A08(getModuleName(), new C30901Vq(this.A05), new C30921Vs(this.A05), AnonymousClass1F6.A0C.intValue());
        }
        AnonymousClass0C1 r82 = this.A05;
        String str = this.A0L;
        AnonymousClass6XW r15 = this.A0G;
        this.A0C = new AnonymousClass6XX(r82, str, this, r15);
        C158826qG r13 = new C158826qG(r82, new C148566Xc(r82, str, this, getActivity(), this, this.A03, new AnonymousClass6XT(this), r15, this, getParentFragmentManager(), this, this.A0C), new C159046qc(this, getActivity(), this, this.A05), r20, this);
        this.A02 = r13;
        ClipsViewerConfig clipsViewerConfig2 = this.A08;
        String str2 = clipsViewerConfig2.A06;
        this.A0K = str2;
        this.A06 = clipsViewerConfig2.A08;
        this.A0M = clipsViewerConfig2.A00;
        AnonymousClass0C1 r14 = this.A05;
        this.A0D = new C190518Cg(r14, getContext(), r13, this, this.A0O);
        ClipsViewerSource clipsViewerSource2 = clipsViewerConfig2.A03;
        switch (clipsViewerSource2.ordinal()) {
            case 0:
            case 2:
            case 5:
            case 6:
            case 9:
            case 10:
                r5 = new AnonymousClass8CJ(clipsViewerConfig2.A07, true, clipsViewerSource2);
                break;
            case 1:
                r5 = new AnonymousClass8CK(str2);
                break;
            case 7:
                r5 = new AnonymousClass8CN(str2);
                break;
            case 8:
            case C120125Dh.VIEW_TYPE_BANNER:
                r5 = new AnonymousClass8CO(str2);
                break;
            case C120125Dh.VIEW_TYPE_BADGE:
                r5 = new AnonymousClass8CF(new AudioPageAssetModel(clipsViewerConfig2.A02, str2, clipsViewerConfig2.A04));
                break;
            case C120125Dh.VIEW_TYPE_LINK:
                r5 = new AnonymousClass8CJ(clipsViewerConfig2.A05, true, clipsViewerSource2);
                break;
            default:
                r5 = new AnonymousClass8CJ((String) null, false, clipsViewerSource2);
                break;
        }
        AnonymousClass8CP r6 = new AnonymousClass8CP(r5, r14, this);
        this.A0H = r6;
        r6.A01(this.A0D);
        boolean z2 = true;
        if (this.A0K == null) {
            AnonymousClass1NJ A023 = AnonymousClass1PZ.A00(this.A05).A02(this.A0L);
            if (A023 != null) {
                C158826qG r3 = this.A02;
                C38911m3 r23 = new C38911m3(Constants.ZERO);
                r23.A00 = A023;
                r3.A05(Collections.singletonList(r23), true);
            }
            C158826qG r32 = this.A02;
            AnonymousClass8CP r42 = this.A0H;
            C190508Cf r24 = new C190508Cf(r32, r42, this.A0C, this.A0L, A023, this.A0M);
            this.A0F = r24;
            r42.A01(r24);
        } else {
            AnonymousClass8CP r43 = this.A0H;
            AnonymousClass2T0 A003 = AnonymousClass2T0.A00(this.A05);
            String str3 = this.A06;
            if (str3 == null) {
                r2 = null;
            } else {
                r2 = A003.A01(str3).A00;
            }
            r43.A00 = r2;
            AnonymousClass2T0 A004 = AnonymousClass2T0.A00(this.A05);
            this.A01 = A004;
            String str4 = this.A06;
            if (str4 == null) {
                r22 = null;
            } else {
                r22 = A004.A01(str4).A00;
            }
            if (r22 == null || !r22.A01) {
                z2 = false;
            }
            this.A0H.A01(new C190618Cr(this));
            AnonymousClass2T0 r33 = this.A01;
            String str5 = this.A06;
            if (str5 == null) {
                list = Collections.emptyList();
            } else {
                list = r33.A01(str5).A01;
            }
            while (true) {
                if (i < list.size()) {
                    if (((C38911m3) list.get(i)).getId().equals(this.A0L)) {
                        this.A07 = (float) i;
                    } else {
                        i++;
                    }
                }
            }
            this.A02.A05(list, z2);
        }
        this.A0H.A00();
        C29671Qu r25 = new C29671Qu(this, this, this.A05);
        this.A04 = r25;
        AnonymousClass1HU r44 = new AnonymousClass1HU();
        r44.A0C(r25);
        AnonymousClass0C1 r102 = this.A05;
        r44.A0C(new C30841Vk(r102, this.A02, this, this, C29191Oy.A02(r102), (AnonymousClass1I6) null));
        r44.A0C(new C29631Qq(this.A05, new C190638Ct(this)));
        C190508Cf r0 = this.A0F;
        if (r0 != null) {
            r44.A0C(r0);
        }
        registerLifecycleListenerSet(r44);
        C23300zv.A00(this.A05).A02(C159166qo.class, this.A0P);
        AnonymousClass0Z0.A09(-750072925, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C38911m3 r1;
        Bundle bundle2 = bundle;
        View view2 = view;
        super.onViewCreated(view2, bundle2);
        this.mClipsViewerViewPager = (ReboundViewPager) view2.findViewById(C0003R.C0005id.clips_viewer_view_pager);
        this.A0J.A04(C32711bj.A00(this), this.mClipsViewerViewPager);
        this.mClipsViewerViewPager.setAdapter((C44391w5) this.A02);
        ReboundViewPager reboundViewPager = this.mClipsViewerViewPager;
        reboundViewPager.setScrollDirection(AnonymousClass1bM.VERTICAL);
        reboundViewPager.setSpringConfig(C32471bJ.PAGING, A0Q);
        this.mClipsViewerViewPager.A0L(new C54242Wl(this, this.A05, this, this.A0H, this.A03, this, this.A0N, this.A0L));
        ReboundViewPager reboundViewPager2 = this.mClipsViewerViewPager;
        int i = 0;
        reboundViewPager2.setOverScrollOnStartItem(false);
        if (bundle != null) {
            reboundViewPager2.A0F(bundle2.getFloat("ClipsViewerFragment.SAVED_VIEW_PAGER_OFFSET_STATE", BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), true);
        } else {
            reboundViewPager2.A0F(this.A07, true);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view2.findViewById(C0003R.C0005id.clips_swipe_refresh_container);
        C190568Cm r5 = new C190568Cm(swipeRefreshLayout, this.A0H, this.mClipsViewerViewPager);
        this.A0A = r5;
        swipeRefreshLayout.setOnRefreshListener(r5);
        this.A0H.A01(r5);
        C163756yg r11 = new C163756yg(getActivity(), getChildFragmentManager(), (FrameLayout) view2.findViewById(C0003R.C0005id.drawer_container), (LinearLayout) view2.findViewById(C0003R.C0005id.drawer_content), this);
        this.mDrawerController = r11;
        this.A0E = new C190548Ck(getContext(), this.A05, getActivity(), this, this, this.A0N, r11, this, this.A09, this.A0L);
        AnonymousClass6XW r4 = this.A0G;
        C163756yg r2 = this.mDrawerController;
        AnonymousClass0a4.A06(r2);
        r4.A00 = r2;
        this.A0I = new C190598Cp(this);
        C23300zv.A00(this.A05).A02(C35151ft.class, this.A0I);
        view2.requestFocus();
        view2.setOnKeyListener(this.A03);
        AnonymousClass1NJ r52 = null;
        if (this.A02.getCount() > 0) {
            r1 = this.A02.getItem(this.mClipsViewerViewPager.A06);
        } else {
            r1 = null;
        }
        AnonymousClass0C1 r42 = this.A05;
        if (r1 != null) {
            r52 = r1.A00;
        }
        String str = this.A0N;
        String str2 = this.A0L;
        if (r1 != null) {
            i = this.mClipsViewerViewPager.A06;
        }
        C190698Cz r43 = new C190698Cz(AnonymousClass0QT.A00(r42, this).A02("instagram_clips_viewer_entry"));
        if (r52 != null) {
            r43.A08("containermodule", getModuleName());
            r43.A08("viewer_session_id", str);
            r43.A08("viewer_init_media_compound_key", str2);
            r43.A08("media_compound_key", r52.getId());
            r43.A07("media_index", Long.valueOf((long) i));
            r43.A08("ranking_connection_id", r52.A1n);
            r43.A08("ranking_source_token", r52.A0o());
            r43.A08("mezql_token", r52.A25);
            r43.A01();
            return;
        }
        r43.A08("containermodule", getModuleName());
        r43.A08("viewer_session_id", str);
        r43.A08("viewer_init_media_compound_key", str2);
        r43.A08("media_compound_key", str2);
        r43.A07("media_index", Long.valueOf((long) i));
        r43.A01();
    }

    public static void A00(ClipsViewerFragment clipsViewerFragment) {
        C159056qd A012;
        if (clipsViewerFragment.isResumed() && clipsViewerFragment.A02.getCount() != 0 && (A012 = clipsViewerFragment.A0B.A01()) != null) {
            if (!clipsViewerFragment.A02.A03(clipsViewerFragment.A0B.A00()).A00()) {
                clipsViewerFragment.A03.A05();
            } else {
                clipsViewerFragment.A03.A07(A012, clipsViewerFragment.A0B.A00(), clipsViewerFragment.A0B.A02.mClipsViewerViewPager.A06);
            }
        }
    }

    public final String AVo() {
        return this.A0N;
    }

    public final C06270Ok BYN() {
        C06270Ok A002 = C06270Ok.A00();
        A002.A09("chaining_session_id", this.A0N);
        A002.A09("parent_m_pk", this.A0L);
        return A002;
    }

    public final C06270Ok BYO(AnonymousClass1NJ r4) {
        C06270Ok BYN = BYN();
        BYN.A07("chaining_position", Integer.valueOf(this.A02.A04(r4).A03.getPosition()));
        return BYN;
    }

    public final C06590Pq getSession() {
        return this.A05;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && i2 == 9683 && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A0G = new AnonymousClass6XW();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-564617274);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_clips_viewer_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-472785884, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1382584060);
        super.onDestroy();
        if (this.A0O) {
            AnonymousClass1F6.A00(this.A05).A07(getModuleName());
        }
        C23300zv.A00(this.A05).A03(C159166qo.class, this.A0P);
        AnonymousClass0Z0.A09(-1014484021, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1912214526);
        super.onDestroyView();
        this.A00 = this.mDrawerController.A00;
        this.A07 = this.mClipsViewerViewPager.A00;
        this.A03.A05.clear();
        C23300zv.A00(this.A05).A03(C35151ft.class, this.A0I);
        this.A0I = null;
        this.mClipsViewerViewPager.A0C();
        ClipsViewerFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(821545051, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(264354174);
        super.onPause();
        C190478Cc r6 = this.A03;
        for (C190488Cd r3 : r6.A04.values()) {
            C45541y6 r0 = r3.A04;
            if (r0 != null) {
                r0.A0H("fragment_paused");
                r3.A04.A0I("fragment_paused");
                r3.A04 = null;
            }
            r3.A02 = null;
            r3.A0B.remove(r6);
        }
        r6.A04.clear();
        r6.A01.abandonAudioFocus(r6);
        if (this.A0O) {
            AnonymousClass1F6.A00(this.A05).A04();
        }
        AnonymousClass0Z0.A09(-490749695, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1487292537);
        super.onResume();
        A00(this);
        if (this.A0O) {
            AnonymousClass1F6.A00(this.A05).A05();
        }
        if (this.A00 != null) {
            this.mClipsViewerViewPager.post(new C163776yi(this));
        }
        AnonymousClass0Z0.A09(1580096880, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ReboundViewPager reboundViewPager = this.mClipsViewerViewPager;
        if (reboundViewPager != null) {
            bundle.putFloat("ClipsViewerFragment.SAVED_VIEW_PAGER_OFFSET_STATE", reboundViewPager.A00);
        }
    }

    public final void onStop() {
        int A022 = AnonymousClass0Z0.A02(-1398174418);
        super.onStop();
        AnonymousClass1F3.A00(this.A05).A0K();
        AnonymousClass0Z0.A09(243897488, A022);
    }
}
