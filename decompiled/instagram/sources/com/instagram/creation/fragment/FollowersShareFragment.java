package com.instagram.creation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.venue.Venue;
import com.instagram.p009ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.tagging.activity.MediaTaggingInfo;
import com.instagram.user.model.MicroUser;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0OX;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0PB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1KT;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NR;
import p000X.AnonymousClass1NW;
import p000X.AnonymousClass1OC;
import p000X.AnonymousClass22V;
import p000X.AnonymousClass2O0;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass33U;
import p000X.AnonymousClass43Y;
import p000X.AnonymousClass43Z;
import p000X.AnonymousClass4BD;
import p000X.AnonymousClass4BS;
import p000X.AnonymousClass4BT;
import p000X.AnonymousClass56Y;
import p000X.AnonymousClass5CA;
import p000X.AnonymousClass5CC;
import p000X.AnonymousClass5CF;
import p000X.AnonymousClass5CY;
import p000X.AnonymousClass6K4;
import p000X.AnonymousClass6KE;
import p000X.AnonymousClass6OZ;
import p000X.AnonymousClass6k9;
import p000X.AnonymousClass6u9;
import p000X.AnonymousClass81L;
import p000X.AnonymousClass95U;
import p000X.BBJ;
import p000X.BBO;
import p000X.C05700Lp;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C105444gs;
import p000X.C105454gt;
import p000X.C107994l3;
import p000X.C11130eT;
import p000X.C11200ea;
import p000X.C1192059m;
import p000X.C1192259o;
import p000X.C1193059w;
import p000X.C119895Cj;
import p000X.C119905Ck;
import p000X.C119925Cn;
import p000X.C120555Fb;
import p000X.C122965Ox;
import p000X.C12800hP;
import p000X.C12890hY;
import p000X.C13300iJ;
import p000X.C13460iZ;
import p000X.C144886Hm;
import p000X.C145046Ic;
import p000X.C145076If;
import p000X.C145116Ij;
import p000X.C145126Ik;
import p000X.C145136Il;
import p000X.C145186Iq;
import p000X.C145216It;
import p000X.C145226Iu;
import p000X.C155216k2;
import p000X.C155226k3;
import p000X.C155236k4;
import p000X.C156176li;
import p000X.C156976n8;
import p000X.C160316si;
import p000X.C160406sr;
import p000X.C160446sv;
import p000X.C160686tN;
import p000X.C160696tO;
import p000X.C160706tP;
import p000X.C160716tQ;
import p000X.C160736tS;
import p000X.C160746tT;
import p000X.C160756tU;
import p000X.C160766tV;
import p000X.C160776tW;
import p000X.C160796tY;
import p000X.C160806tZ;
import p000X.C160816tb;
import p000X.C160846te;
import p000X.C160856tf;
import p000X.C160906tk;
import p000X.C160916tl;
import p000X.C160926tm;
import p000X.C160936tn;
import p000X.C160946to;
import p000X.C160956tp;
import p000X.C161016tv;
import p000X.C161026tw;
import p000X.C161036tx;
import p000X.C161046ty;
import p000X.C161096u4;
import p000X.C161106u5;
import p000X.C161126u7;
import p000X.C161136u8;
import p000X.C161156uB;
import p000X.C161166uC;
import p000X.C161186uE;
import p000X.C161196uF;
import p000X.C161206uG;
import p000X.C161216uH;
import p000X.C161266uM;
import p000X.C161276uN;
import p000X.C161286uO;
import p000X.C161296uP;
import p000X.C161316uR;
import p000X.C161326uS;
import p000X.C161456ug;
import p000X.C16180oA;
import p000X.C162116vu;
import p000X.C16230oG;
import p000X.C17510qM;
import p000X.C17640qZ;
import p000X.C17870qw;
import p000X.C181987pp;
import p000X.C182797rM;
import p000X.C182887rW;
import p000X.C18510ry;
import p000X.C185337vu;
import p000X.C185367vx;
import p000X.C185947ww;
import p000X.C185997x2;
import p000X.C187197z0;
import p000X.C18900sb;
import p000X.C23160zf;
import p000X.C23190zi;
import p000X.C23300zv;
import p000X.C26441Dh;
import p000X.C26571Ea;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C27665CMj;
import p000X.C27666CMk;
import p000X.C27673CMr;
import p000X.C27738CPh;
import p000X.C28351Lj;
import p000X.C28654CkW;
import p000X.C31201Wx;
import p000X.C31221Wz;
import p000X.C32621bZ;
import p000X.C33441cv;
import p000X.C33451cw;
import p000X.C35251g3;
import p000X.C42251s2;
import p000X.C43921vI;
import p000X.C51512Ky;
import p000X.C51522Kz;
import p000X.C52952Qw;
import p000X.C53502Ta;
import p000X.C56142c0;
import p000X.C56162c2;
import p000X.C56202c6;
import p000X.C67672xe;
import p000X.C67682xf;
import p000X.C72663Gk;
import p000X.C86113oV;
import p000X.C88843t5;
import p000X.C935743b;

public class FollowersShareFragment extends C27341Hl implements C27371Ho, AnonymousClass1HK, C27673CMr, C160406sr, C1192059m, C1193059w {
    public static boolean A0w;
    public C11200ea A00 = new C160446sv(this);
    public int A01 = 5;
    public long A02 = 0;
    public long A03 = -1;
    public Location A04;
    public Location A05;
    public C86113oV A06;
    public C11200ea A07;
    public CreationSession A08;
    public C160686tN A09;
    public C27666CMk A0A;
    public C51522Kz A0B;
    public LocationSignalPackage A0C;
    public PendingMedia A0D;
    public C161106u5 A0E;
    public AnonymousClass1OC A0F;
    public AnonymousClass1NR A0G;
    public AnonymousClass0C1 A0H;
    public AnonymousClass56Y A0I;
    public C155226k3 A0J;
    public AnonymousClass1KT A0K;
    public C161206uG A0L;
    public BBJ A0M;
    public C105454gt A0N;
    public C28654CkW A0O;
    public Integer A0P = Constants.ZERO;
    public String A0Q;
    public String A0R = null;
    public HashSet A0S;
    public List A0T;
    public List A0U;
    public List A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public AnonymousClass6u9 A0Z;
    public C161096u4 A0a;
    public C51522Kz A0b;
    public C51522Kz A0c;
    public C51522Kz A0d;
    public boolean A0e;
    public final View.OnClickListener A0f = new C160706tP(this);
    public final C161196uF A0g = new C161196uF(this);
    public final C161276uN A0h = new C161276uN(this);
    public final C32621bZ A0i = new C161326uS(this);
    public final AtomicBoolean A0j = new AtomicBoolean(false);
    public final TextWatcher A0k = new C160716tQ(this);
    public final TextWatcher A0l = new C160946to(this);
    public final C11200ea A0m = new C119925Cn(this);
    public final C11200ea A0n = new C145216It(this);
    public final C11200ea A0o = new C160766tV(this);
    public final C11200ea A0p = new C160796tY(this);
    public final C11200ea A0q = new AnonymousClass5CF(this);
    public final C11200ea A0r = new C145226Iu(this);
    public final C11200ea A0s = new C160916tl(this);
    public final AnonymousClass22V A0t = new C161016tv(this);
    public final C107994l3 A0u = new C161026tw(this);
    public final BBO A0v = new AnonymousClass5CC(this);
    public View mAdvancedSettingRow;
    public C1192259o mAppShareTable;
    public View mAppShareTitleContainer;
    public IgAutoCompleteTextView mCaptionBox;
    public C1192259o mIgShareTable;
    public View mIgShareTitleContainer;
    public C160316si mLocationSuggestionsRow;
    public View mPeopleTagRow;
    public TextView mPeopleTextView;
    public View mPostOverlayView;
    public C26571Ea mTagPeopleInfoIconViewStubHolder;
    public TextView mUploadButtonTextView;

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "metadata_followers_share";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (p000X.C27665CMj.A00(r7.A0H).getString(com.facebook.flipper.core.StateSummary.$const$string(77), (java.lang.String) null) == null) goto L_0x003b;
     */
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3 = i2;
        Intent intent2 = intent;
        int i4 = i;
        super.onActivityResult(i, i2, intent);
        if (i == 1000 || i == 1001) {
            if (i2 == -1) {
                Iterator it = intent.getParcelableArrayListExtra("media_tagging_info_list").iterator();
                while (it.hasNext()) {
                    MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) it.next();
                    PendingMedia ARi = this.A0E.ARi(mediaTaggingInfo.A05);
                    if (ARi != null) {
                        ARi.A2B = mediaTaggingInfo.A07;
                        ArrayList arrayList = mediaTaggingInfo.A09;
                        ARi.A2D = arrayList;
                        ARi.A2E = mediaTaggingInfo.A0A;
                        ARi.A0l = mediaTaggingInfo.A04;
                        if (!arrayList.isEmpty()) {
                            C182887rW.A01().A09 = mediaTaggingInfo.A09.size();
                        }
                        A06();
                    }
                }
                this.A0E.A95();
            }
        } else if (i == 1002) {
            if (i2 == -1) {
                AnonymousClass0C1 r1 = this.A0H;
                if (r1.A06.A0T() && C27665CMj.A02(r1) == C53502Ta.BRAND) {
                    z = true;
                }
                z = false;
                if (C52952Qw.A0F(this.A0H) || z) {
                    A09(this);
                }
            }
        } else if (i == 1003 && i2 == -1 && this.A0A != null) {
            ProductSource A012 = C27665CMj.A01(this.A0H);
            if (A012 != null) {
                this.A0A.A03(A012);
            }
        } else if (i == 4 && i2 == -1) {
            A04();
        } else {
            AnonymousClass5CY.A00(this.A0H, i4, i3, intent2, this.A0K.A04, this.A0D);
            C1192259o r12 = this.mAppShareTable;
            if (r12 != null) {
                r12.A02(this.A0D);
            }
            A0B(this);
        }
    }

    public static String A01(FollowersShareFragment followersShareFragment) {
        return ((IgAutoCompleteTextView) followersShareFragment.mView.findViewById(C0003R.C0005id.row_caption_followshare).findViewById(C0003R.C0005id.caption_text_view)).getText().toString();
    }

    private ArrayList A02() {
        View findViewById = this.mView.findViewById(C0003R.C0005id.row_caption_followshare);
        AnonymousClass0C1 r1 = this.A0H;
        IgAutoCompleteTextView igAutoCompleteTextView = (IgAutoCompleteTextView) findViewById.findViewById(C0003R.C0005id.caption_text_view);
        if (igAutoCompleteTextView == null) {
            return new ArrayList();
        }
        return C162116vu.A01(r1, igAutoCompleteTextView.getText());
    }

    private void A05() {
        C16230oG.A00.removeLocationUpdates(this.A0H, this.A0t);
        C16230oG.A00.cancelSignalPackageRequest(this.A0H, this.A0u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r9.A08.A0M() != false) goto L_0x0029;
     */
    private void A06() {
        boolean z;
        String string;
        if (this.A0D.A0g != MediaType.PHOTO) {
            CreationSession creationSession = this.A08;
            if ((!creationSession.A0M() || !creationSession.A0K()) && this.A0D.A0g != MediaType.VIDEO) {
                z = false;
            }
        }
        z = true;
        if (!z) {
            this.mPeopleTagRow.setVisibility(8);
        } else {
            this.mPeopleTagRow.setAlpha(1.0f);
            this.mTagPeopleInfoIconViewStubHolder.A02(8);
            this.mPeopleTagRow.setOnClickListener(this.A0f);
            AnonymousClass0C1 r7 = this.A0H;
            CreationSession creationSession2 = this.A08;
            ArrayList arrayList = new ArrayList();
            for (MediaSession A012 : creationSession2.A08()) {
                Iterator it = PendingMediaStore.A01(r7).A04(A012.A01()).A2B.iterator();
                while (it.hasNext()) {
                    PeopleTag peopleTag = (PeopleTag) it.next();
                    if (!arrayList.contains(peopleTag.A00.A03)) {
                        arrayList.add(peopleTag.A00.A03);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                TextView textView = this.mPeopleTextView;
                if (arrayList.size() == 1) {
                    string = (String) arrayList.get(0);
                } else {
                    string = getString(C0003R.string.people_tagging_x_people, Integer.valueOf(arrayList.size()));
                }
                textView.setText(string);
                this.mPeopleTextView.setVisibility(0);
            } else {
                this.mPeopleTextView.setVisibility(8);
            }
        }
        C161206uG r0 = this.A0L;
        AnonymousClass0a4.A06(r0);
        r0.A03();
    }

    public static void A07(FollowersShareFragment followersShareFragment) {
        Location lastLocation = C16230oG.A00.getLastLocation(followersShareFragment.A0H);
        if (lastLocation == null || !C16230oG.A00.isLocationValid(lastLocation)) {
            C16230oG.A00.requestLocationUpdates(followersShareFragment.A0H, followersShareFragment.A0t, "FollowersShareFragment");
        } else {
            A0C(followersShareFragment, lastLocation);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ca, code lost:
        if (r3.A0K() != false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0300  */
    public static void A08(FollowersShareFragment followersShareFragment) {
        PendingMedia pendingMedia;
        String str;
        Integer num;
        FollowersShareFragment followersShareFragment2 = followersShareFragment;
        if (followersShareFragment2.mView != null) {
            Intent intent = new Intent();
            followersShareFragment2.A0D.A1T = A01(followersShareFragment2);
            followersShareFragment2.A0D.A2C = followersShareFragment2.A02();
            PendingMedia pendingMedia2 = followersShareFragment2.A0D;
            pendingMedia2.A0c(ShareType.FOLLOWERS_SHARE);
            HashSet<String> hashSet = followersShareFragment2.A0S;
            if (hashSet != null) {
                if (pendingMedia2.A2F == null) {
                    pendingMedia2.A2F = new ArrayList();
                }
                for (String r5 : hashSet) {
                    pendingMedia2.A2F.add(new C161316uR(r5, Constants.A0C));
                }
            }
            if (((Boolean) AnonymousClass0L6.A02(followersShareFragment2.A0H, AnonymousClass0L7.VIDEO_CALL_FINISH, "is_enabled_finish_call_feed", false, (AnonymousClass04H) null)).booleanValue()) {
                PendingMedia pendingMedia3 = followersShareFragment2.A0D;
                if (pendingMedia3.A0x() && !pendingMedia3.A0q()) {
                    C23190zi r1 = new C23190zi();
                    C17870qw.A03(pendingMedia3);
                    pendingMedia3.A2c = true;
                    pendingMedia3.A0b(r1);
                    pendingMedia3.A2s = true;
                }
            }
            followersShareFragment2.A0D.A1V = followersShareFragment2.A0Q;
            C17870qw.A00(followersShareFragment2.getActivity(), followersShareFragment2.A0H).A0I(followersShareFragment2.A0D, (C23160zf) null);
            C182887rW.A01().A07(followersShareFragment2.A0H, "post_attempt");
            PendingMedia pendingMedia4 = followersShareFragment2.A0D;
            int i = 1;
            if (pendingMedia4.A0g != MediaType.PHOTO) {
                CreationSession creationSession = followersShareFragment2.A08;
                if (creationSession.A0M()) {
                    for (PhotoSession photoSession : creationSession.A0A()) {
                        followersShareFragment2.A0H(followersShareFragment2.A0E.ARi(photoSession.A06));
                    }
                }
            } else if (pendingMedia4.A2u) {
                followersShareFragment2.A0H(pendingMedia4);
            } else {
                C187197z0 r52 = (C187197z0) followersShareFragment2.getActivity();
                r52.AKF().A04(Constants.ONE);
                C88843t5 AU5 = r52.AU5(followersShareFragment2.A08.A07());
                Context context = followersShareFragment2.getContext();
                AnonymousClass0C1 r10 = followersShareFragment2.A0H;
                CreationSession creationSession2 = followersShareFragment2.A08;
                AU5.A08(new C185337vu(context, r10, creationSession2.A07.A00, r52.AKF(), (C185367vx) context, creationSession2.A09, creationSession2.A02, r52.ARX()), creationSession2.A05(), C156176li.GALLERY);
            }
            if (followersShareFragment2.A0D.A0g != MediaType.PHOTO) {
                CreationSession creationSession3 = followersShareFragment2.A08;
                if (creationSession3.A0M()) {
                }
                AnonymousClass0C1 r3 = followersShareFragment2.A0H;
                String id = followersShareFragment2.A0D.getId();
                C119905Ck r32 = new C119905Ck(AnonymousClass0QT.A00(r3, followersShareFragment2).A02("external_share_clicked"));
                r32.A08("media_id", id);
                r32.A08("share_location", "composer");
                r32.A01();
                intent.putExtra("CaptureFlowHelper.RESULT_KEY_POST_TYPE", "CaptureFlowHelper.RESULT_VALUE_MEDIA_POSTED");
                if (!TextUtils.isEmpty(followersShareFragment2.A0R)) {
                    intent.putExtra("CaptureFlowHelper.RESULT_KEY_CAPTION_WARNING_SURVEY_ID", followersShareFragment2.A0R);
                }
                followersShareFragment2.getActivity().setResult(-1, intent);
                followersShareFragment2.getActivity().finish();
                pendingMedia = followersShareFragment2.A0D;
                switch (pendingMedia.A0g.ordinal()) {
                    case 0:
                        break;
                    case 1:
                        i = 2;
                        break;
                    case 4:
                        i = 8;
                        break;
                    default:
                        i = 3;
                        break;
                }
                ArrayList arrayList = new ArrayList();
                str = pendingMedia.A1b;
                if (str != null) {
                    arrayList.add(str);
                }
                PendingMedia pendingMedia5 = followersShareFragment2.A0D;
                ArrayList arrayList2 = new ArrayList();
                for (PendingMedia pendingMedia6 : pendingMedia5.A2J) {
                    String str2 = pendingMedia6.A1b;
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                }
                arrayList.addAll(Collections.unmodifiableList(arrayList2));
                C181987pp.A01(followersShareFragment2.A0H).A07(i, arrayList);
                C23300zv.A00(followersShareFragment2.A0H).A04(new C161286uO());
            }
            AnonymousClass0C1 r7 = followersShareFragment2.A0H;
            if (r7.A06.AeV() && C52952Qw.A0E(r7)) {
                String str3 = followersShareFragment2.A0Q;
                boolean A0M2 = followersShareFragment2.A08.A0M();
                PendingMedia pendingMedia7 = followersShareFragment2.A0D;
                C161136u8 r6 = new C161136u8(AnonymousClass0QT.A00(r7, followersShareFragment2).A02("ig_suggested_tags_publish_post"));
                r6.A08("session_id", str3);
                r6.A08("ig_user_id", r7.A04());
                r6.A04("is_album", Boolean.valueOf(A0M2));
                HashMap hashMap = new HashMap();
                if (pendingMedia7.A0q()) {
                    for (PendingMedia pendingMedia8 : pendingMedia7.A0J()) {
                        if (pendingMedia8.A0g == MediaType.PHOTO && pendingMedia8.A0o()) {
                            hashMap.put(C160696tO.A01(r7.A04(), pendingMedia8.A24), C160696tO.A02(pendingMedia8.A2D));
                        }
                    }
                } else if (pendingMedia7.A0o()) {
                    hashMap.put(C160696tO.A01(r7.A04(), pendingMedia7.A24), C160696tO.A02(pendingMedia7.A2D));
                }
                r6.A08("final_tagged_products", new JSONObject(hashMap).toString());
                if (A0M2) {
                    int i2 = 0;
                    for (PendingMedia pendingMedia9 : pendingMedia7.A0J()) {
                        if (pendingMedia9.A0g == MediaType.PHOTO && (!pendingMedia9.A2B.isEmpty())) {
                            i2 += pendingMedia9.A2B.size();
                        }
                    }
                    r6.A06("final_people_tags_count", Integer.valueOf(i2));
                    int i3 = 0;
                    if (!hashMap.isEmpty()) {
                        for (Map.Entry value : hashMap.entrySet()) {
                            Map map = (Map) value.getValue();
                            if (map != null) {
                                i3 += map.size();
                            }
                        }
                    }
                    num = Integer.valueOf(i3);
                } else {
                    r6.A06("final_people_tags_count", Integer.valueOf(pendingMedia7.A2B.size()));
                    num = Integer.valueOf(pendingMedia7.A2D.size());
                }
                r6.A06("final_product_tags_count", num);
                r6.A08("upload_key", C160696tO.A01(r7.A04(), pendingMedia7.A24));
                r6.A01();
            }
            AnonymousClass0C1 r33 = followersShareFragment2.A0H;
            String id2 = followersShareFragment2.A0D.getId();
            C119905Ck r322 = new C119905Ck(AnonymousClass0QT.A00(r33, followersShareFragment2).A02("external_share_clicked"));
            r322.A08("media_id", id2);
            r322.A08("share_location", "composer");
            r322.A01();
            intent.putExtra("CaptureFlowHelper.RESULT_KEY_POST_TYPE", "CaptureFlowHelper.RESULT_VALUE_MEDIA_POSTED");
            if (!TextUtils.isEmpty(followersShareFragment2.A0R)) {
            }
            followersShareFragment2.getActivity().setResult(-1, intent);
            followersShareFragment2.getActivity().finish();
            pendingMedia = followersShareFragment2.A0D;
            switch (pendingMedia.A0g.ordinal()) {
                case 0:
                    break;
                case 1:
                    break;
                case 4:
                    break;
            }
            ArrayList arrayList3 = new ArrayList();
            str = pendingMedia.A1b;
            if (str != null) {
            }
            PendingMedia pendingMedia52 = followersShareFragment2.A0D;
            ArrayList arrayList22 = new ArrayList();
            while (r3.hasNext()) {
            }
            arrayList3.addAll(Collections.unmodifiableList(arrayList22));
            C181987pp.A01(followersShareFragment2.A0H).A07(i, arrayList3);
            C23300zv.A00(followersShareFragment2.A0H).A04(new C161286uO());
        }
    }

    public static void A09(FollowersShareFragment followersShareFragment) {
        AnonymousClass0C1 r2 = followersShareFragment.A0H;
        C13300iJ r3 = r2.A06;
        boolean A0T2 = r3.A0T();
        boolean A0F2 = C52952Qw.A0F(r2);
        if (!A0F2 && !A0T2) {
            A0w = true;
            C52952Qw.A0C(r2, r3, followersShareFragment.getModuleName(), AnonymousClass0C5.$const$string(82), followersShareFragment.getActivity(), true);
        } else if ((A0F2 || A0T2) && !C52952Qw.A0D(followersShareFragment, r2, followersShareFragment.getModuleName())) {
            followersShareFragment.A04();
        }
    }

    public static void A0B(FollowersShareFragment followersShareFragment) {
        C1192259o r1 = followersShareFragment.mIgShareTable;
        if (r1 != null) {
            r1.A03(followersShareFragment.A0S);
        }
        C1192259o r12 = followersShareFragment.mAppShareTable;
        if (r12 != null) {
            r12.setEnabled(!followersShareFragment.A0e);
            followersShareFragment.mAppShareTable.A04(followersShareFragment.A0e);
        }
    }

    public static void A0C(FollowersShareFragment followersShareFragment, Location location) {
        FragmentActivity activity;
        followersShareFragment.A05 = location;
        followersShareFragment.A05();
        if ((followersShareFragment.A04 == null || followersShareFragment.A0C != null) && (activity = followersShareFragment.getActivity()) != null) {
            NearbyVenuesService.A01(activity, followersShareFragment.A0H, location, followersShareFragment.A0C, Long.valueOf(followersShareFragment.A03));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01ac, code lost:
        if (p000X.C52952Qw.A0E(r7) != false) goto L_0x01ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0483  */
    public static void A0D(FollowersShareFragment followersShareFragment, View view) {
        PendingMedia pendingMedia;
        Context context;
        int i;
        String str;
        AnonymousClass0C1 r7;
        boolean z;
        C161206uG r1;
        Venue venue;
        C161206uG r3;
        Location location;
        C161456ug A002;
        Location location2;
        ViewStub viewStub;
        BrandedContentTag brandedContentTag;
        String str2;
        C105454gt r0;
        FollowersShareFragment followersShareFragment2 = followersShareFragment;
        boolean A022 = C160846te.A02(followersShareFragment2.A0D, followersShareFragment2.A0H);
        View view2 = followersShareFragment2.mAppShareTitleContainer;
        int i2 = 8;
        if (view2 != null) {
            int i3 = 0;
            if (A022) {
                i3 = 8;
            }
            view2.setVisibility(i3);
        }
        View view3 = followersShareFragment2.mIgShareTitleContainer;
        if (view3 != null) {
            followersShareFragment2.mIgShareTitleContainer.setOnClickListener(new C160936tn(followersShareFragment2, view3.findViewById(C0003R.C0005id.ig_share_title_caret)));
            View view4 = followersShareFragment2.mIgShareTitleContainer;
            if (A022) {
                i2 = 0;
            }
            view4.setVisibility(i2);
        }
        View view5 = view;
        LinearLayout linearLayout = (LinearLayout) view5.findViewById(C0003R.C0005id.caption_row_linear_layout);
        CircularImageView circularImageView = (CircularImageView) linearLayout.findViewById(C0003R.C0005id.metadata_user_avatar);
        View findViewById = linearLayout.findViewById(C0003R.C0005id.thumbnail_and_edit_container);
        ViewGroup viewGroup = (ViewGroup) view5.findViewById(C0003R.C0005id.followers_share_content);
        if (followersShareFragment2.A0H.A05.A08() || followersShareFragment2.A0D.A2u) {
            circularImageView.setVisibility(0);
            if (followersShareFragment2.A08.A0A == Constants.ONE) {
                int dimensionPixelSize = followersShareFragment2.getResources().getDimensionPixelSize(C0003R.dimen.avatar_size_xxxsmall);
                circularImageView.setImageBitmap(C72663Gk.A0A(followersShareFragment2.A0D.A1g, dimensionPixelSize, dimensionPixelSize));
            } else {
                circularImageView.setUrl(followersShareFragment2.A0H.A06.ASv(), followersShareFragment2.getModuleName());
            }
            linearLayout.removeView(findViewById);
            linearLayout.addView(findViewById);
            C06220Of.A0O(followersShareFragment2.mCaptionBox, followersShareFragment2.getResources().getDimensionPixelSize(C0003R.dimen.row_text_padding));
        }
        int dimensionPixelSize2 = followersShareFragment2.getResources().getDimensionPixelSize(C0003R.dimen.autocomplete_list_item_height);
        IgAutoCompleteTextView igAutoCompleteTextView = followersShareFragment2.mCaptionBox;
        igAutoCompleteTextView.A00 = 2.5f;
        igAutoCompleteTextView.A01 = dimensionPixelSize2;
        igAutoCompleteTextView.setDropDownVerticalOffset(igAutoCompleteTextView.getTop());
        CreationSession creationSession = followersShareFragment2.A08;
        if (creationSession.A0M()) {
            pendingMedia = followersShareFragment2.A0E.ARi(((MediaSession) creationSession.A08().get(0)).A01());
        } else {
            pendingMedia = followersShareFragment2.A0D;
        }
        String str3 = pendingMedia.A1g;
        C27666CMk cMk = new C27666CMk(followersShareFragment2, followersShareFragment2, followersShareFragment2.A0H, followersShareFragment2);
        followersShareFragment2.A0A = cMk;
        AnonymousClass0C1 r9 = followersShareFragment2.A0H;
        PendingMedia pendingMedia2 = followersShareFragment2.A0D;
        C160686tN r8 = new C160686tN(r9, followersShareFragment2, view5, pendingMedia2, str3, pendingMedia2.A2u, cMk);
        followersShareFragment2.A09 = r8;
        r8.A00 = r8.A03.findViewById(C0003R.C0005id.row_caption_followshare);
        r8.A02 = (IgAutoCompleteTextView) r8.A03.findViewById(C0003R.C0005id.caption_text_view);
        FrameLayout frameLayout = (FrameLayout) r8.A03.findViewById(C0003R.C0005id.metadata_thumbnail_container);
        C160686tN.A00(r8, frameLayout);
        PendingMedia pendingMedia3 = r8.A08;
        if (pendingMedia3.A0q()) {
            ((ColorFilterAlphaImageView) r8.A03.findViewById(C0003R.C0005id.album_indicator)).setVisibility(0);
            context = r8.A05.getContext();
            i = C0003R.string.album_thumbnails;
        } else if (pendingMedia3.A0g == MediaType.PHOTO) {
            context = r8.A05.getContext();
            i = C0003R.string.photo_thumbnail;
        } else {
            if (pendingMedia3.A0x()) {
                r8.A03.findViewById(C0003R.C0005id.caption_video_overlay).setVisibility(0);
                context = r8.A05.getContext();
                i = C0003R.string.video_thumbnail;
            }
            frameLayout.setOnClickListener(new C160906tk(r8));
            str = r8.A08.A1T;
            String str4 = str;
            if (str != null) {
                r8.A02.setText(str4);
                IgAutoCompleteTextView igAutoCompleteTextView2 = r8.A02;
                igAutoCompleteTextView2.setSelection(igAutoCompleteTextView2.getText().length());
            }
            C27341Hl r12 = r8.A05;
            Context context2 = r12.getContext();
            r8.A01 = C67682xf.A00(context2, r8.A0A, new C28351Lj(context2, AnonymousClass1L8.A00(r12)), (List) null, false, "share_post_page", new C67672xe(r8.A05.getActivity(), r8.A0A, AnonymousClass0C5.$const$string(110)));
            IgAutoCompleteTextView igAutoCompleteTextView3 = r8.A02;
            igAutoCompleteTextView3.setAlwaysShowWhenEnoughToFilter(true);
            igAutoCompleteTextView3.setOnTouchListener(new C160956tp(r8));
            r7 = r8.A0A;
            if (!r7.A06.A0T()) {
                z = false;
            }
            z = true;
            if (z && ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.SHOPPING_PRODUCT_MENTION_CREATION_ANDROID, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                r8.A06.A04(r8.A02, r8.A00, r8.A09, true);
                r8.A06.A05(r8.A08.A2C);
            } else if (((Boolean) AnonymousClass0L6.A02(r8.A0A, AnonymousClass0L7.MENTION_HASHTAG_SEARCH_MIGRATION, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                r8.A06.A04(r8.A02, r8.A00, r8.A09, false);
            } else {
                r8.A02.setAdapter(r8.A01);
                r8.A02.setOnItemClickListener(r8.A04);
                r8.A02.addTextChangedListener(r8.A07);
            }
            if (r8.A0B) {
                ((LinearLayout) r8.A03.findViewById(C0003R.C0005id.thumbnail_and_edit_container)).setPadding(0, 0, 0, 0);
                ((ViewStub) r8.A03.findViewById(C0003R.C0005id.edit_media_button_stub)).inflate().setOnClickListener(new C161126u7(r8));
            }
            if (C160846te.A02(followersShareFragment2.A0D, followersShareFragment2.A0H)) {
                if (followersShareFragment2.A0S == null) {
                    HashSet hashSet = new HashSet();
                    followersShareFragment2.A0S = hashSet;
                    hashSet.add(followersShareFragment2.A0H.A04());
                }
                C1192259o r82 = new C1192259o(followersShareFragment2.getContext(), followersShareFragment2, view5, (List) null, followersShareFragment2.A0U, followersShareFragment2.A0H, new C161186uE(followersShareFragment2));
                followersShareFragment2.mIgShareTable = r82;
                r82.A05 = followersShareFragment2;
                int dimensionPixelSize3 = followersShareFragment2.getResources().getDimensionPixelSize(C0003R.dimen.row_padding);
                int dimensionPixelSize4 = followersShareFragment2.getResources().getDimensionPixelSize(C0003R.dimen.row_padding_small);
                followersShareFragment2.mIgShareTable.setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
                followersShareFragment2.mIgShareTable.A03(followersShareFragment2.A0S);
                viewGroup.addView(followersShareFragment2.mIgShareTable);
            }
            C1192259o r83 = new C1192259o(followersShareFragment2.getContext(), followersShareFragment2, view5, followersShareFragment2.A0T, (List) null, followersShareFragment2.A0H, new C120555Fb(followersShareFragment2));
            followersShareFragment2.mAppShareTable = r83;
            r83.A04 = followersShareFragment2;
            int dimensionPixelSize5 = followersShareFragment2.getResources().getDimensionPixelSize(C0003R.dimen.row_padding);
            followersShareFragment2.mAppShareTable.setPadding(dimensionPixelSize5, 0, dimensionPixelSize5, 0);
            followersShareFragment2.mAppShareTable.A02(followersShareFragment2.A0D);
            viewGroup.addView(followersShareFragment2.mAppShareTable);
            A0A(followersShareFragment2);
            C161206uG r2 = followersShareFragment2.A0L;
            AnonymousClass0a4.A06(r2);
            r2.A01 = (ViewStub) view5.findViewById(C0003R.C0005id.tag_products_stub);
            r2.A00 = null;
            r2.A02 = null;
            r2.A03 = null;
            View inflate = LayoutInflater.from(followersShareFragment2.getContext()).inflate(C0003R.layout.location_suggestions_two_rows, (ViewGroup) view5, false);
            C160316si r22 = new C160316si(inflate.findViewById(C0003R.C0005id.metadata_location_row));
            followersShareFragment2.mLocationSuggestionsRow = r22;
            r22.A01(followersShareFragment2, followersShareFragment2.A0D.A0h);
            r1 = followersShareFragment2.A0L;
            AnonymousClass0a4.A06(r1);
            int i4 = 3;
            if (r1.A05()) {
                i4 = 4;
            }
            if (C145046Ic.A00(followersShareFragment2.A0H).booleanValue()) {
                i4++;
            }
            viewGroup.addView(inflate, i4);
            C160316si r13 = followersShareFragment2.mLocationSuggestionsRow;
            venue = followersShareFragment2.A0D.A0h;
            r13.A01 = venue;
            if (venue != null) {
                C160316si.A00(r13, Constants.ONE);
            }
            ((ImageView) inflate.findViewById(C0003R.C0005id.location_balloon)).setVisibility(8);
            A07(followersShareFragment2);
            followersShareFragment2.mPeopleTagRow = view5.findViewById(C0003R.C0005id.metadata_row_people);
            followersShareFragment2.mTagPeopleInfoIconViewStubHolder = new C26571Ea((ViewStub) view5.findViewById(C0003R.C0005id.tag_people_info_button_view_stub));
            followersShareFragment2.mPeopleTextView = (TextView) followersShareFragment2.mPeopleTagRow.findViewById(C0003R.C0005id.metadata_textview_people);
            r3 = followersShareFragment2.A0L;
            AnonymousClass0a4.A06(r3);
            if (r3.A01 != null) {
                AnonymousClass0QD.A02("ProductTagRowControllerImpl", "maybeShow called before setRootView");
            } else if (r3.A05()) {
                View inflate2 = r3.A01.inflate();
                r3.A00 = inflate2;
                r3.A02 = (TextView) inflate2.findViewById(C0003R.C0005id.metadata_textview_product);
                C161196uF r23 = r3.A08;
                if (r23 != null) {
                    View view6 = r3.A00;
                    C182887rW.A01().A0Z = true;
                    FollowersShareFragment followersShareFragment3 = r23.A00;
                    if (!followersShareFragment3.A0X) {
                        followersShareFragment3.A0G.A00(followersShareFragment3.A0F, QPTooltipAnchor.TAG_PRODUCTS_ROW, view6);
                    }
                }
            }
            if (followersShareFragment2.mView != null) {
                C161206uG r02 = followersShareFragment2.A0L;
                AnonymousClass0a4.A06(r02);
                if (r02.A05() && followersShareFragment2.A0X && (r0 = followersShareFragment2.A0N) != null) {
                    int i5 = C27665CMj.A00(r0.A01).getInt(AnonymousClass0C5.$const$string(293), 0);
                    boolean z2 = false;
                    if (i5 < 10) {
                        z2 = true;
                    }
                    if (z2) {
                        C105454gt r32 = followersShareFragment2.A0N;
                        View view7 = followersShareFragment2.mView;
                        View view8 = followersShareFragment2.A0L.A00;
                        View view9 = view8;
                        if (view8 != null) {
                            view7.post(new C105444gs(r32, view7, view9));
                        }
                    }
                }
            }
            if (C144886Hm.A06(C16180oA.A00(followersShareFragment2.A0H).A04()) && C145046Ic.A00(followersShareFragment2.A0H).booleanValue() && (viewStub = (ViewStub) view5.findViewById(C0003R.C0005id.tag_business_partner_stub)) != null) {
                View inflate3 = viewStub.inflate();
                inflate3.setOnClickListener(new C145186Iq(followersShareFragment2));
                TextView textView = (TextView) AnonymousClass1E1.A07(inflate3, C0003R.C0005id.tagged_business_partner);
                brandedContentTag = followersShareFragment2.A0D.A0j;
                if (brandedContentTag == null) {
                    str2 = brandedContentTag.A02;
                } else {
                    str2 = "";
                }
                textView.setText(str2);
            }
            followersShareFragment2.A06();
            followersShareFragment2.A07 = new C160776tW(followersShareFragment2);
            location = followersShareFragment2.A04;
            if (location == null) {
                location = followersShareFragment2.A05;
            }
            A002 = NearbyVenuesService.A00(location);
            if (A002 != null) {
                A0E(followersShareFragment2, A002.AOJ(), A002.ATX());
            }
            C23300zv.A00(followersShareFragment2.A0H).A02(C161166uC.class, followersShareFragment2.A07);
            location2 = followersShareFragment2.A04;
            if (location2 != null) {
                NearbyVenuesService.A01(followersShareFragment2.getActivity(), followersShareFragment2.A0H, location2, followersShareFragment2.A0C, Long.valueOf(followersShareFragment2.A03));
            }
            followersShareFragment2.mUploadButtonTextView = (TextView) followersShareFragment2.getActivity().findViewById(C0003R.C0005id.next_button_textview);
            A0G(followersShareFragment2, false);
            followersShareFragment2.mUploadButtonTextView.setOnClickListener(new C160746tT(followersShareFragment2));
            if (!((Boolean) AnonymousClass0L6.A02(followersShareFragment2.A0H, AnonymousClass0L7.CREATION_ADV_SETTINGS_PARITY_MENU_ITEM, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                followersShareFragment2.mAdvancedSettingRow = ((ViewStub) view5.findViewById(C0003R.C0005id.advanced_settings_row_item_viewstub)).inflate();
            } else {
                View inflate4 = ((ViewStub) view5.findViewById(C0003R.C0005id.advanced_settings_viewstub)).inflate();
                followersShareFragment2.mAdvancedSettingRow = inflate4;
                inflate4.findViewById(C0003R.C0005id.advanced_settings_row_divider).setVisibility(0);
            }
            followersShareFragment2.mAdvancedSettingRow.setOnClickListener(new C161036tx(followersShareFragment2));
            followersShareFragment2.A0G.A00(followersShareFragment2.A0F, QPTooltipAnchor.ADVANCED_SETTINGS_ROW, followersShareFragment2.mAdvancedSettingRow.findViewById(C0003R.C0005id.advanced_settings_text_view));
            if (!followersShareFragment2.A0H.A06.A0R()) {
                C182887rW.A01().A0H = true;
                return;
            }
            return;
        }
        frameLayout.setContentDescription(context.getString(i));
        frameLayout.setOnClickListener(new C160906tk(r8));
        str = r8.A08.A1T;
        String str42 = str;
        if (str != null) {
        }
        C27341Hl r122 = r8.A05;
        Context context22 = r122.getContext();
        r8.A01 = C67682xf.A00(context22, r8.A0A, new C28351Lj(context22, AnonymousClass1L8.A00(r122)), (List) null, false, "share_post_page", new C67672xe(r8.A05.getActivity(), r8.A0A, AnonymousClass0C5.$const$string(110)));
        IgAutoCompleteTextView igAutoCompleteTextView32 = r8.A02;
        igAutoCompleteTextView32.setAlwaysShowWhenEnoughToFilter(true);
        igAutoCompleteTextView32.setOnTouchListener(new C160956tp(r8));
        r7 = r8.A0A;
        if (!r7.A06.A0T()) {
        }
        z = true;
        if (z || ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.SHOPPING_PRODUCT_MENTION_CREATION_ANDROID, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
        }
        if (r8.A0B) {
        }
        if (C160846te.A02(followersShareFragment2.A0D, followersShareFragment2.A0H)) {
        }
        C1192259o r832 = new C1192259o(followersShareFragment2.getContext(), followersShareFragment2, view5, followersShareFragment2.A0T, (List) null, followersShareFragment2.A0H, new C120555Fb(followersShareFragment2));
        followersShareFragment2.mAppShareTable = r832;
        r832.A04 = followersShareFragment2;
        int dimensionPixelSize52 = followersShareFragment2.getResources().getDimensionPixelSize(C0003R.dimen.row_padding);
        followersShareFragment2.mAppShareTable.setPadding(dimensionPixelSize52, 0, dimensionPixelSize52, 0);
        followersShareFragment2.mAppShareTable.A02(followersShareFragment2.A0D);
        viewGroup.addView(followersShareFragment2.mAppShareTable);
        A0A(followersShareFragment2);
        C161206uG r24 = followersShareFragment2.A0L;
        AnonymousClass0a4.A06(r24);
        r24.A01 = (ViewStub) view5.findViewById(C0003R.C0005id.tag_products_stub);
        r24.A00 = null;
        r24.A02 = null;
        r24.A03 = null;
        View inflate5 = LayoutInflater.from(followersShareFragment2.getContext()).inflate(C0003R.layout.location_suggestions_two_rows, (ViewGroup) view5, false);
        C160316si r222 = new C160316si(inflate5.findViewById(C0003R.C0005id.metadata_location_row));
        followersShareFragment2.mLocationSuggestionsRow = r222;
        r222.A01(followersShareFragment2, followersShareFragment2.A0D.A0h);
        r1 = followersShareFragment2.A0L;
        AnonymousClass0a4.A06(r1);
        int i42 = 3;
        if (r1.A05()) {
        }
        if (C145046Ic.A00(followersShareFragment2.A0H).booleanValue()) {
        }
        viewGroup.addView(inflate5, i42);
        C160316si r132 = followersShareFragment2.mLocationSuggestionsRow;
        venue = followersShareFragment2.A0D.A0h;
        r132.A01 = venue;
        if (venue != null) {
        }
        ((ImageView) inflate5.findViewById(C0003R.C0005id.location_balloon)).setVisibility(8);
        A07(followersShareFragment2);
        followersShareFragment2.mPeopleTagRow = view5.findViewById(C0003R.C0005id.metadata_row_people);
        followersShareFragment2.mTagPeopleInfoIconViewStubHolder = new C26571Ea((ViewStub) view5.findViewById(C0003R.C0005id.tag_people_info_button_view_stub));
        followersShareFragment2.mPeopleTextView = (TextView) followersShareFragment2.mPeopleTagRow.findViewById(C0003R.C0005id.metadata_textview_people);
        r3 = followersShareFragment2.A0L;
        AnonymousClass0a4.A06(r3);
        if (r3.A01 != null) {
        }
        if (followersShareFragment2.mView != null) {
        }
        View inflate32 = viewStub.inflate();
        inflate32.setOnClickListener(new C145186Iq(followersShareFragment2));
        TextView textView2 = (TextView) AnonymousClass1E1.A07(inflate32, C0003R.C0005id.tagged_business_partner);
        brandedContentTag = followersShareFragment2.A0D.A0j;
        if (brandedContentTag == null) {
        }
        textView2.setText(str2);
        followersShareFragment2.A06();
        followersShareFragment2.A07 = new C160776tW(followersShareFragment2);
        location = followersShareFragment2.A04;
        if (location == null) {
        }
        A002 = NearbyVenuesService.A00(location);
        if (A002 != null) {
        }
        C23300zv.A00(followersShareFragment2.A0H).A02(C161166uC.class, followersShareFragment2.A07);
        location2 = followersShareFragment2.A04;
        if (location2 != null) {
        }
        followersShareFragment2.mUploadButtonTextView = (TextView) followersShareFragment2.getActivity().findViewById(C0003R.C0005id.next_button_textview);
        A0G(followersShareFragment2, false);
        followersShareFragment2.mUploadButtonTextView.setOnClickListener(new C160746tT(followersShareFragment2));
        if (!((Boolean) AnonymousClass0L6.A02(followersShareFragment2.A0H, AnonymousClass0L7.CREATION_ADV_SETTINGS_PARITY_MENU_ITEM, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
        }
        followersShareFragment2.mAdvancedSettingRow.setOnClickListener(new C161036tx(followersShareFragment2));
        followersShareFragment2.A0G.A00(followersShareFragment2.A0F, QPTooltipAnchor.ADVANCED_SETTINGS_ROW, followersShareFragment2.mAdvancedSettingRow.findViewById(C0003R.C0005id.advanced_settings_text_view));
        if (!followersShareFragment2.A0H.A06.A0R()) {
        }
    }

    public static void A0E(FollowersShareFragment followersShareFragment, List list, String str) {
        followersShareFragment.mLocationSuggestionsRow.A02(list.subList(0, Math.min(5, list.size())));
        C160316si r1 = followersShareFragment.mLocationSuggestionsRow;
        C160316si.A00(r1, r1.A02);
        followersShareFragment.A0a = new C161096u4(followersShareFragment.A0H, followersShareFragment, list, str);
    }

    public static void A0G(FollowersShareFragment followersShareFragment, boolean z) {
        TextView textView = followersShareFragment.mUploadButtonTextView;
        int i = C0003R.string.share;
        if (z) {
            i = C0003R.string.sharing;
        }
        textView.setText(i);
        followersShareFragment.mUploadButtonTextView.setEnabled(!z);
        View view = followersShareFragment.mPostOverlayView;
        if (view != null) {
            int i2 = 8;
            if (z) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }

    public static boolean A0I(FollowersShareFragment followersShareFragment) {
        C161206uG r0 = followersShareFragment.A0L;
        if (r0 == null || !r0.A05() || !followersShareFragment.A0L.A04()) {
            return false;
        }
        return true;
    }

    public final String AH5() {
        r1 = this.A0D;
        if (!r1.Abe()) {
            if (!this.A08.A0M()) {
                return null;
            }
            for (PendingMedia pendingMedia : pendingMedia.A0J()) {
                if (pendingMedia.Abe()) {
                }
            }
            return null;
        }
        return pendingMedia.A0j.A01;
    }

    public final String AXj() {
        ArrayList arrayList;
        if (!AnonymousClass0OX.A00(this.A0D.A2D)) {
            arrayList = this.A0D.A2D;
        } else if (!this.A08.A0M()) {
            return null;
        } else {
            for (PendingMedia pendingMedia : this.A0D.A0J()) {
                if (!AnonymousClass0OX.A00(pendingMedia.A2D)) {
                    arrayList = pendingMedia.A2D;
                }
            }
            return null;
        }
        return ((ProductTag) arrayList.get(0)).A01.A02.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fd, code lost:
        if (r1 == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r5, p000X.AnonymousClass0L7.FEED_AUTO_SHARE_TO_FACEBOOK_DIALOG, "dialog_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (p000X.C42251s2.A04(r3) == false) goto L_0x002d;
     */
    public final void As3(AnonymousClass33U r10) {
        boolean z;
        C56202c6 r1;
        AnonymousClass1OC r12;
        Trigger trigger;
        boolean z2;
        boolean z3;
        if (this.mAdvancedSettingRow != null && r10.equals(AnonymousClass33U.A05)) {
            if (r10.A07(this.A0D)) {
                AnonymousClass0C1 r3 = this.A0H;
                if (C16180oA.A00(r3).A00.getInt("fb_feed_crossposting_advanced_settings_tooltip", 0) < 3) {
                    z3 = true;
                }
                z3 = false;
                if (z3) {
                    if (((Boolean) AnonymousClass0L6.A02(this.A0H, AnonymousClass0L7.QP_XSHARE_TO_FB, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                        r12 = this.A0F;
                        trigger = Trigger.SHARE_TO_FB_SWITCHED_OFF;
                    } else {
                        C155226k3 r5 = this.A0J;
                        if (r5 != null) {
                            AnonymousClass0C1 r6 = this.A0H;
                            View findViewById = this.mAdvancedSettingRow.findViewById(C0003R.C0005id.advanced_settings_text_view);
                            if (r5.A00 == null) {
                                C56142c0 r4 = new C56142c0((Activity) findViewById.getContext(), new AnonymousClass95U((CharSequence) findViewById.getResources().getString(C0003R.string.story_auto_xpost_to_fb_tooltip_text)));
                                r4.A0B = true;
                                r4.A02(findViewById);
                                r4.A05 = C56162c2.BELOW_ANCHOR;
                                r4.A09 = true;
                                r4.A00 = 3000;
                                r4.A04 = new C155236k4(r5, r6);
                                r5.A00 = r4.A00();
                            }
                            r5.A00.A05();
                        }
                    }
                }
            } else {
                AnonymousClass0C1 r52 = this.A0H;
                C16180oA A002 = C16180oA.A00(r52);
                if (!C42251s2.A04(r52) && C12800hP.A0J(r52) && A002.A00.getInt("feed_fb_autoshare_upsell_dialog_display_count", 0) < 3) {
                    long j = A002.A00.getLong("feed_fb_autoshare_upsell_dialog_last_seen_sec", 0);
                    boolean z4 = true;
                    if (j != 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - j <= 604800) {
                        z4 = false;
                    }
                    if (z4) {
                        Boolean bool = r52.A06.A13;
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            z2 = true;
                        }
                        z2 = false;
                        if (z2) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (z) {
                    if (((Boolean) AnonymousClass0L6.A02(this.A0H, AnonymousClass0L7.QP_XSHARE_TO_FB, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                        r12 = this.A0F;
                        trigger = Trigger.SHARE_TO_FB_SWITCHED_ON;
                    } else {
                        AnonymousClass0C1 r32 = this.A0H;
                        AnonymousClass2OA r2 = new AnonymousClass2OA(getContext());
                        r2.A07(C0003R.string.feed_auto_xpost_to_fb_upsell_dialog_title);
                        r2.A06(C0003R.string.feed_auto_xpost_to_fb_upsell_dialog_message);
                        r2.A0U(true);
                        r2.A0V(true);
                        r2.A0A(C0003R.string.feed_auto_xpost_to_fb_upsell_dialog_confirm, new AnonymousClass43Z(r32, this));
                        r2.A09(C0003R.string.not_now, new AnonymousClass43Y(r32, this));
                        r2.A0F(new C935743b(r32, this));
                        r2.A03().show();
                        AnonymousClass0P4 A003 = AnonymousClass0P4.A00("ig_feed_share_sheet_share_to_fb_dialog", this);
                        A003.A0A("dialog_impression", true);
                        AnonymousClass0WN.A01(r32).BcG(A003);
                        C16180oA A004 = C16180oA.A00(r32);
                        A004.A00.edit().putInt("feed_fb_autoshare_upsell_dialog_display_count", A004.A00.getInt("feed_fb_autoshare_upsell_dialog_display_count", 0) + 1).apply();
                        A004.A00.edit().putLong("feed_fb_autoshare_upsell_dialog_last_seen_sec", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).apply();
                        C155226k3 r0 = this.A0J;
                        if (!(r0 == null || (r1 = r0.A00) == null || !r1.A07())) {
                            r1.A06(true);
                        }
                    }
                }
            }
            r12.BSq(EnumSet.of(trigger));
        }
        if (r10.A0A(this.A0H, this.A0D)) {
            r10.A04(this.A0D, this, this.A0K, this.A0H);
            this.mAppShareTable.A02(this.A0D);
        }
    }

    public final void B6w(MicroUser microUser, IgSwitch igSwitch) {
        HashSet hashSet = this.A0S;
        if (hashSet != null && !hashSet.isEmpty()) {
            String str = microUser.A03;
            boolean z = true;
            if (!this.A0S.contains(str)) {
                this.A0S.add(str);
            } else if (this.A0S.size() == 1) {
                C11130eT.A01.BXT(new C33441cv(this.A0d));
                return;
            } else {
                this.A0S.remove(str);
            }
            if (this.A0S.size() <= 1 && this.A0S.contains(this.A0H.A04())) {
                z = false;
            }
            this.A0e = z;
            boolean z2 = false;
            for (AnonymousClass33U r3 : this.A0T) {
                PendingMedia pendingMedia = this.A0D;
                if (r3.A07(pendingMedia)) {
                    r3.A04(pendingMedia, this, this.A0K, this.A0H);
                    this.mAppShareTable.A02(this.A0D);
                    z2 = true;
                }
            }
            if (z2) {
                C11130eT.A01.BXT(new C33441cv(this.A0B));
            }
            A0B(this);
        }
    }

    public final void B9s(Venue venue, int i) {
        PendingMedia pendingMedia = this.A0D;
        pendingMedia.A0h = venue;
        pendingMedia.A0J = i;
        Location location = this.A04;
        this.A04 = location;
        if (location != null) {
            pendingMedia.A00 = location.getLatitude();
            this.A0D.A01 = location.getLongitude();
        }
        this.A05 = this.A05;
        A05();
        Location location2 = this.A04;
        if (location2 != null) {
            this.A0D.A02 = location2.getLatitude();
            this.A0D.A03 = this.A04.getLongitude();
        }
        if (this.mView != null) {
            C160316si r1 = this.mLocationSuggestionsRow;
            r1.A01 = venue;
            if (venue != null) {
                C160316si.A00(r1, Constants.ONE);
            }
            this.mAppShareTable.A02(this.A0D);
            A0B(this);
        }
        C182887rW.A01().A0R = true;
        PendingMediaStoreSerializer.A00(this.A0H).A01();
        C23300zv.A00(this.A0H).BXT(new C43921vI(venue, Constants.ONE));
        C161096u4 r4 = this.A0a;
        if (r4 != null) {
            C156976n8 A022 = C156976n8.A02(r4.A01, r4.A00, Constants.A0C);
            A022.A05();
            A022.A07("", r4.A03, r4.A02);
            A022.A06(venue.A04, r4.A03, i);
        }
    }

    public final void onCreate(Bundle bundle) {
        Location location;
        String str;
        Bundle bundle2 = bundle;
        int A022 = AnonymousClass0Z0.A02(804483905);
        super.onCreate(bundle2);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A0H = A062;
        C23300zv.A00(A062).A02(C161286uO.class, this.A0m);
        C17640qZ r7 = C17640qZ.A00;
        AnonymousClass0C1 r6 = this.A0H;
        HashMap hashMap = new HashMap();
        hashMap.put(QPTooltipAnchor.TAG_PRODUCTS_ROW, new AnonymousClass4BT());
        hashMap.put(QPTooltipAnchor.SWITCH_ACCOUNT, new AnonymousClass4BD());
        hashMap.put(QPTooltipAnchor.ADVANCED_SETTINGS_ROW, new AnonymousClass4BS());
        AnonymousClass1NR A0B2 = r7.A0B(r6, hashMap);
        this.A0G = A0B2;
        C17640qZ r72 = C17640qZ.A00;
        AnonymousClass0C1 r4 = this.A0H;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.SHARE_POST;
        AnonymousClass1NW A032 = r72.A03();
        A032.A04 = new C160926tm(this);
        A032.A06 = A0B2;
        this.A0F = r72.A09(this, this, r4, quickPromotionSlot, A032.A00());
        this.A06 = new C86113oV(getActivity());
        this.A08 = ((C182797rM) getContext()).AJ7();
        this.A0Q = C181987pp.A01(this.A0H).A01;
        this.A0E = (C161106u5) getActivity();
        C51512Ky r8 = new C51512Ky();
        r8.A00 = -1;
        r8.A07 = Constants.A0C;
        r8.A09 = getString(C0003R.string.too_many_hashtags_error_message, 30);
        this.A0b = r8.A00();
        if (C12800hP.A0L(this.A0H) && C52952Qw.A0E(this.A0H) && !this.A08.A0L() && ((Boolean) AnonymousClass0L6.A02(this.A0H, AnonymousClass0L7.FB_PRODUCT_CROSS_TAGGING, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C17510qM r62 = C17510qM.A00;
            Context requireContext = requireContext();
            AnonymousClass1L8 A002 = AnonymousClass1L8.A00(this);
            AnonymousClass0C1 r9 = this.A0H;
            this.A0M = r62.A0P(requireContext, A002, r9, C12800hP.A01(r9, true).A01, this.A0v);
        }
        int intValue = ((Integer) AnonymousClass0L6.A02(this.A0H, AnonymousClass0L7.SHOPPING_PRODUCT_MENTION_CREATION_ANDROID, "max_mentions_allowed", 5, (AnonymousClass04H) null)).intValue();
        this.A01 = intValue;
        C51512Ky r82 = new C51512Ky();
        r82.A00 = -1;
        r82.A07 = Constants.A0C;
        r82.A09 = getString(C0003R.string.too_many_product_mentions_error_message, Integer.valueOf(intValue));
        this.A0c = r82.A00();
        C51512Ky r63 = new C51512Ky();
        r63.A07 = Constants.A0C;
        r63.A09 = getString(C0003R.string.select_at_least_one_account);
        this.A0d = r63.A00();
        C51512Ky r64 = new C51512Ky();
        r64.A07 = Constants.A0C;
        r64.A09 = getString(C0003R.string.one_ig_account_when_share_to_app_account);
        r64.A00 = 3000;
        this.A0B = r64.A00();
        MediaSession mediaSession = this.A08.A07;
        if (mediaSession == null) {
            location = null;
        } else if (mediaSession.A02 == Constants.ZERO) {
            location = mediaSession.A00.A02;
        } else {
            location = mediaSession.A01.A09;
        }
        this.A04 = location;
        this.A0K = new AnonymousClass1KT(this.A0H, this, this, new AnonymousClass5CA(this));
        this.A0E.BZq(new C155216k2(this));
        if (bundle == null) {
            bundle2 = this.mArguments;
        }
        if (bundle2 != null && bundle2.getBoolean("INTENT_EXTRA_RENDER_IMAGE", false)) {
            this.A0Y = true;
            C187197z0 r65 = (C187197z0) getActivity();
            r65.AKF().A04(Constants.ONE);
            C88843t5 AU5 = r65.AU5(this.A08.A07());
            Context context = getContext();
            AnonymousClass0C1 r10 = this.A0H;
            CreationSession creationSession = this.A08;
            AU5.A08(new C185337vu(context, r10, creationSession.A07.A00, r65.AKF(), new C160816tb(this), creationSession.A09, creationSession.A02, r65.ARX()), creationSession.A05(), C156176li.UPLOAD);
        }
        boolean equals = C182887rW.A01().A0D.equals(AnonymousClass6KE.A00(Constants.A04));
        this.A0X = equals;
        if (equals) {
            C105454gt A0f2 = C17510qM.A00.A0f(this.A0H);
            this.A0N = A0f2;
            registerLifecycleListener(A0f2);
        }
        C23300zv A003 = C23300zv.A00(this.A0H);
        A003.A02(C161296uP.class, this.A0s);
        A003.A02(C145116Ij.class, this.A0n);
        A003.A02(C145126Ik.class, this.A0q);
        A003.A02(C145076If.class, this.A0o);
        A003.A02(C145136Il.class, this.A0r);
        A003.A02(C161156uB.class, this.A0p);
        AnonymousClass0C1 r5 = this.A0H;
        PendingMedia pendingMedia = this.A0D;
        if (pendingMedia != null) {
            str = pendingMedia.getId();
        } else {
            str = "null";
        }
        C119895Cj r1 = new C119895Cj(AnonymousClass0QT.A00(r5, this).A02("external_share_view_impression"));
        r1.A08("media_id", str);
        r1.A08("share_location", "composer");
        r1.A01();
        AnonymousClass0Z0.A09(1867456787, A022);
    }

    public static C51522Kz A00(FollowersShareFragment followersShareFragment, Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                return followersShareFragment.A0b;
            case 2:
                return followersShareFragment.A0c;
            default:
                if (num != null) {
                    switch (intValue) {
                        case 1:
                            str = "HASHTAG";
                            break;
                        case 2:
                            str = "PRODUCT_MENTION";
                            break;
                        default:
                            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                            break;
                    }
                } else {
                    str = "null";
                }
                throw new IllegalArgumentException(AnonymousClass000.A0E("Invalid error type ", str));
        }
    }

    private void A03() {
        ArrayList A022 = A02();
        this.A0D.A2C = A022;
        CreationSession creationSession = this.A08;
        if (creationSession.A0M()) {
            for (MediaSession A012 : creationSession.A08()) {
                this.A0E.ARi(A012.A01()).A2C = A022;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1.A0K() != false) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    private void A04() {
        A03();
        if (this.A0D.A0g != MediaType.PHOTO) {
            CreationSession creationSession = this.A08;
            if (creationSession.A0M()) {
            }
            if (C27665CMj.A01(this.A0H) != null) {
                AnonymousClass0C1 r2 = this.A0H;
                String moduleName = getModuleName();
                FragmentActivity activity = getActivity();
                AnonymousClass0a4.A06(activity);
                C17510qM.A00.A1G(activity, r2, false, moduleName, (String) null, (String) null, 1002, this, (FragmentActivity) null);
                return;
            }
            C26441Dh.A00(this.A0H).A02(getActivity());
            Context context = getContext();
            AnonymousClass0a4.A06(context);
            C161216uH r4 = new C161216uH(context, C27738CPh.PRODUCT);
            r4.A02 = this.A0H.getToken();
            r4.A04 = A0I(this);
            CreationSession creationSession2 = this.A08;
            if (creationSession2.A0M()) {
                ArrayList arrayList = new ArrayList();
                for (MediaSession A012 : creationSession2.A08()) {
                    arrayList.add(this.A0E.ARi(A012.A01()));
                }
                r4.A02(this.A08, arrayList);
            } else {
                r4.A01(creationSession2, this.A0D);
            }
            AnonymousClass1BH.A0B(r4.A00(), 1001, this);
            return;
        }
        AnonymousClass0C1 r3 = this.A0H;
        if (r3.A06.AeV() && C52952Qw.A0E(r3)) {
            String str = this.A0Q;
            PendingMedia pendingMedia = this.A0D;
            String str2 = pendingMedia.A24;
            boolean A0M2 = this.A08.A0M();
            ArrayList arrayList2 = pendingMedia.A2E;
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_suggested_tags_open_tagging", this);
            Pair A003 = C160696tO.A00(arrayList2);
            C160696tO.A03(r3, A002, str, str2, 0, A0M2, ((Integer) A003.first).intValue(), ((Integer) A003.second).intValue(), (Integer) null, (String) null);
        }
        if (C27665CMj.A01(this.A0H) != null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r6.A0e != false) goto L_0x003e;
     */
    public static void A0A(FollowersShareFragment followersShareFragment) {
        float f;
        boolean z = false;
        for (AnonymousClass33U r2 : AnonymousClass33U.A00(followersShareFragment.getContext(), followersShareFragment.A0H)) {
            if (r2.A0A(followersShareFragment.A0H, followersShareFragment.A0D)) {
                z = true;
            } else {
                r2.A05(followersShareFragment.A0D, false);
            }
        }
        followersShareFragment.mAppShareTable.A02(followersShareFragment.A0D);
        if (z) {
            f = 1.0f;
        }
        f = 0.3f;
        followersShareFragment.mAppShareTitleContainer.setAlpha(f);
        C1192259o r1 = followersShareFragment.mAppShareTable;
        r1.A04 = followersShareFragment;
        r1.setEnabled(!followersShareFragment.A0e);
        followersShareFragment.mAppShareTable.A04(followersShareFragment.A0e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (p000X.C144886Hm.A05(r1, p000X.C16180oA.A00(r1).A04()) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    public static void A0F(FollowersShareFragment followersShareFragment, boolean z) {
        String str;
        PendingMedia pendingMedia;
        boolean z2;
        boolean z3;
        followersShareFragment.A03();
        BrandedContentTag brandedContentTag = followersShareFragment.A0D.A0j;
        if (brandedContentTag != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                C13460iZ A052 = C12890hY.A00.A05(stringWriter);
                AnonymousClass2O0.A00(A052, brandedContentTag);
                A052.close();
                str = stringWriter.toString();
            } catch (IOException e) {
                AnonymousClass0QD.A0A(followersShareFragment.getModuleName(), e);
            }
            pendingMedia = followersShareFragment.A0D;
            if (!pendingMedia.A0q()) {
                Iterator it = pendingMedia.A0J().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((PendingMedia) it.next()).A0x()) {
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z) {
                    AnonymousClass0C1 r1 = followersShareFragment.A0H;
                    z3 = true;
                }
                z3 = false;
                AnonymousClass0C1 r12 = followersShareFragment.A0H;
                PendingMedia pendingMedia2 = followersShareFragment.A0D;
                C185947ww.A00(r12, new C185997x2(pendingMedia2.A2f, str, pendingMedia2.getId(), pendingMedia2.A36, pendingMedia2.A0o(), z2, z3));
            }
            z2 = true;
            if (!pendingMedia.A0x()) {
                z2 = false;
            }
            if (z) {
            }
            z3 = false;
            AnonymousClass0C1 r122 = followersShareFragment.A0H;
            PendingMedia pendingMedia22 = followersShareFragment.A0D;
            C185947ww.A00(r122, new C185997x2(pendingMedia22.A2f, str, pendingMedia22.getId(), pendingMedia22.A36, pendingMedia22.A0o(), z2, z3));
            z2 = false;
            if (z) {
            }
            z3 = false;
            AnonymousClass0C1 r1222 = followersShareFragment.A0H;
            PendingMedia pendingMedia222 = followersShareFragment.A0D;
            C185947ww.A00(r1222, new C185997x2(pendingMedia222.A2f, str, pendingMedia222.getId(), pendingMedia222.A36, pendingMedia222.A0o(), z2, z3));
        }
        str = null;
        pendingMedia = followersShareFragment.A0D;
        if (!pendingMedia.A0q()) {
        }
        z2 = false;
        if (z) {
        }
        z3 = false;
        AnonymousClass0C1 r12222 = followersShareFragment.A0H;
        PendingMedia pendingMedia2222 = followersShareFragment.A0D;
        C185947ww.A00(r12222, new C185997x2(pendingMedia2222.A2f, str, pendingMedia2222.getId(), pendingMedia2222.A36, pendingMedia2222.A0o(), z2, z3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (p000X.C16180oA.A00(r3.A0H).A00.getBoolean("save_posted_photos", true) == false) goto L_0x001e;
     */
    private void A0H(PendingMedia pendingMedia) {
        boolean z;
        if (C35251g3.A07(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            z = true;
        }
        z = false;
        if (z) {
            C05700Lp.A00().ADc(new C160756tU(this, pendingMedia.A1g));
        }
    }

    public final void B9o() {
        A05();
        PendingMedia pendingMedia = this.A0D;
        pendingMedia.A0h = null;
        pendingMedia.A0J = -1;
        pendingMedia.A02 = 0.0d;
        pendingMedia.A03 = 0.0d;
        this.mAppShareTable.A02(pendingMedia);
        A0B(this);
        PendingMediaStoreSerializer.A00(this.A0H).A01();
    }

    public final void B9r() {
        C182887rW.A01().A0R = true;
        Location location = this.A04;
        if (location == null) {
            location = this.A05;
        }
        C185947ww.A00(this.A0H, new C161266uM(AnonymousClass6K4.A00(Constants.ONE), location, this.A03));
    }

    public final C06590Pq getSession() {
        return this.A0H;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A0Z = (AnonymousClass6u9) getActivity();
    }

    public final boolean onBackPressed() {
        C31221Wz A012 = C31201Wx.A01(getContext());
        if (A012 != null && A012.A0O()) {
            return true;
        }
        this.A0E.BZq(new AnonymousClass6k9(this));
        return false;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AnonymousClass81L.A02(this, z, i2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1541169668);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_followers_share_metadata, viewGroup, false);
        this.mCaptionBox = (IgAutoCompleteTextView) inflate.findViewById(C0003R.C0005id.caption_text_view);
        this.mAppShareTitleContainer = inflate.findViewById(C0003R.C0005id.app_share_title_container);
        this.mIgShareTitleContainer = inflate.findViewById(C0003R.C0005id.ig_share_title_container);
        this.mPostOverlayView = inflate.findViewById(C0003R.C0005id.content_overlay);
        registerLifecycleListener(this.A0G);
        registerLifecycleListener(this.A0F);
        AnonymousClass0Z0.A09(116749413, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(2131607319);
        super.onDestroy();
        PendingMedia pendingMedia = this.A0D;
        if (pendingMedia != null) {
            pendingMedia.A0Y(this.A0i);
            this.A02 = 0;
        }
        C23300zv A002 = C23300zv.A00(this.A0H);
        A002.A03(C161296uP.class, this.A0s);
        A002.A03(C145116Ij.class, this.A0n);
        A002.A03(C122965Ox.class, this.A00);
        A002.A03(C145126Ik.class, this.A0q);
        A002.A03(C145076If.class, this.A0o);
        A002.A03(C145136Il.class, this.A0r);
        A002.A03(C161156uB.class, this.A0p);
        AnonymousClass0Z0.A09(-318735711, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(996345453);
        super.onDestroyView();
        this.mUploadButtonTextView.setEnabled(true);
        A05();
        unregisterLifecycleListener(this.A0G);
        unregisterLifecycleListener(this.A0F);
        if (this.A07 != null) {
            C23300zv.A00(this.A0H).A03(C161166uC.class, this.A07);
        }
        String str = null;
        this.A09 = null;
        FollowersShareFragmentLifecycleUtil.cleanupReferences(this);
        C28654CkW ckW = this.A0O;
        if (ckW != null) {
            ckW.A05();
            this.A0O = null;
        }
        if (C144886Hm.A06(C16180oA.A00(this.A0H).A04()) && C145046Ic.A00(this.A0H).booleanValue()) {
            AnonymousClass0C1 r2 = this.A0H;
            PendingMedia pendingMedia = this.A0D;
            boolean z = pendingMedia.A36;
            BrandedContentTag brandedContentTag = pendingMedia.A0j;
            if (brandedContentTag != null) {
                str = brandedContentTag.A01;
            }
            AnonymousClass6OZ.A06(r2, this, false, z, str, IgReactGeoGatingModule.SETTING_TYPE_FEED, (String) null);
        }
        AnonymousClass0Z0.A09(817938007, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0Z0.A02(-77477914);
        super.onDetach();
        C23300zv.A00(this.A0H).A03(C161286uO.class, this.A0m);
        AnonymousClass0Z0.A09(-2010916673, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1404160504);
        super.onPause();
        C06220Of.A0E(this.mView);
        getActivity().getWindow().setSoftInputMode(0);
        this.A0E.BZq(new C160806tZ(this));
        Integer num = this.A0P;
        if (num != Constants.ZERO) {
            C11130eT.A01.BXT(new C33451cw(A00(this, num)));
            this.A0P = Constants.ZERO;
        }
        PendingMediaStoreSerializer.A00(this.A0H).A01();
        A05();
        C18900sb.A00.A01(this.A0H, this);
        AnonymousClass0Z0.A09(1816313596, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(2125116302);
        super.onResume();
        getActivity().setRequestedOrientation(-1);
        getActivity().getWindow().setSoftInputMode(16);
        if (!AnonymousClass0PB.A06()) {
            getActivity().getWindow().clearFlags(1024);
        }
        if (A0w && C52952Qw.A0F(this.A0H)) {
            A0w = false;
            A09(this);
        }
        if (!TextUtils.isEmpty(this.mCaptionBox.getText())) {
            this.A0k.afterTextChanged(this.mCaptionBox.getText());
        }
        this.A0E.BZq(new C161046ty(this));
        if (this.A0M != null) {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            Iterator it = this.A0D.A2D.iterator();
            while (it.hasNext()) {
                ProductTag productTag = (ProductTag) it.next();
                arrayList.add(productTag.A03());
                if (!this.A0H.A04().equals(productTag.A01.A02.A02)) {
                    z = true;
                }
            }
            CreationSession creationSession = this.A08;
            if (creationSession.A0M()) {
                for (MediaSession A012 : creationSession.A08()) {
                    Iterator it2 = this.A0E.ARi(A012.A01()).A2D.iterator();
                    while (it2.hasNext()) {
                        ProductTag productTag2 = (ProductTag) it2.next();
                        arrayList.add(productTag2.A03());
                        if (!this.A0H.A04().equals(productTag2.A01.A02.A02)) {
                            z = true;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() || z) {
                TextView textView = this.mAppShareTable.A00;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else {
                this.A0M.A00(arrayList);
            }
        }
        AnonymousClass0Z0.A09(1926135775, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("INTENT_EXTRA_RENDER_IMAGE", this.A0Y);
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(-279354869);
        super.onStart();
        C161206uG r1 = this.A0L;
        if (r1 != null && r1.A04()) {
            r1.A0B.A02();
        }
        AnonymousClass0Z0.A09(-1358707500, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0Z0.A02(1188762401);
        A05();
        super.onStop();
        AnonymousClass0Z0.A09(1846157224, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0Z.APl().setShouldShowUserSpinner(false);
        this.A0E.BZq(new C160736tS(this, view));
        this.A0F.BL4();
        this.mCaptionBox.addTextChangedListener(this.A0k);
        C18510ry r1 = C18510ry.A00;
        this.A0O = r1.A02(this.A0H, this, r1.A00(), (ViewStub) view.findViewById(C0003R.C0005id.warning_nudge), new C160856tf(this));
        if (C18510ry.A00.A00().A00(this.A0H)) {
            this.mCaptionBox.addTextChangedListener(this.A0l);
            String A012 = A01(this);
            if (!TextUtils.isEmpty(A012)) {
                this.A0O.A06(A012);
            }
        }
    }
}
