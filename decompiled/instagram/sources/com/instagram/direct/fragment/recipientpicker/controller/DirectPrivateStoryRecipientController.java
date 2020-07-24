package com.instagram.direct.fragment.recipientpicker.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediatype.MediaType;
import com.instagram.p009ui.widget.search.SearchController;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0PK;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1TY;
import p000X.AnonymousClass1US;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass28B;
import p000X.AnonymousClass3GP;
import p000X.AnonymousClass3LX;
import p000X.AnonymousClass4UO;
import p000X.AnonymousClass4US;
import p000X.AnonymousClass4W4;
import p000X.AnonymousClass4XN;
import p000X.AnonymousClass4q1;
import p000X.AnonymousClass51z;
import p000X.AnonymousClass520;
import p000X.AnonymousClass529;
import p000X.AnonymousClass52F;
import p000X.AnonymousClass537;
import p000X.AnonymousClass53I;
import p000X.AnonymousClass53L;
import p000X.AnonymousClass53R;
import p000X.AnonymousClass53U;
import p000X.AnonymousClass53X;
import p000X.AnonymousClass542;
import p000X.AnonymousClass54B;
import p000X.AnonymousClass54J;
import p000X.AnonymousClass54M;
import p000X.AnonymousClass54V;
import p000X.AnonymousClass551;
import p000X.AnonymousClass552;
import p000X.AnonymousClass553;
import p000X.AnonymousClass554;
import p000X.AnonymousClass556;
import p000X.AnonymousClass557;
import p000X.AnonymousClass55I;
import p000X.AnonymousClass55L;
import p000X.AnonymousClass55P;
import p000X.AnonymousClass55Q;
import p000X.AnonymousClass55T;
import p000X.AnonymousClass55W;
import p000X.AnonymousClass55X;
import p000X.AnonymousClass56C;
import p000X.AnonymousClass5A3;
import p000X.AnonymousClass67D;
import p000X.AnonymousClass67G;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06360Ot;
import p000X.C107504kF;
import p000X.C107694kY;
import p000X.C108264lX;
import p000X.C108684mG;
import p000X.C109734o6;
import p000X.C109754o8;
import p000X.C111064qK;
import p000X.C11200ea;
import p000X.C11590fD;
import p000X.C1173652g;
import p000X.C1175853d;
import p000X.C1179154l;
import p000X.C1179254m;
import p000X.C1179354n;
import p000X.C1179454o;
import p000X.C1179554p;
import p000X.C1179654q;
import p000X.C1179854t;
import p000X.C1180054v;
import p000X.C1180354y;
import p000X.C1181755m;
import p000X.C1182255r;
import p000X.C1182455t;
import p000X.C1182655w;
import p000X.C11870fo;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C16180oA;
import p000X.C17780qn;
import p000X.C197238cH;
import p000X.C23300zv;
import p000X.C256219o;
import p000X.C256319p;
import p000X.C27341Hl;
import p000X.C27651Ir;
import p000X.C28051Kf;
import p000X.C28351Lj;
import p000X.C28871Co6;
import p000X.C30231Ta;
import p000X.C31201Wx;
import p000X.C31221Wz;
import p000X.C31691Zj;
import p000X.C476524w;
import p000X.C476624x;
import p000X.C59032gv;
import p000X.C67712xi;
import p000X.C689930o;

public class DirectPrivateStoryRecipientController extends C256319p implements AnonymousClass67D, C11200ea {
    public int A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public TextView A04;
    public RecyclerView A05;
    public AnonymousClass4q1 A06;
    public C11590fD A07;
    public ArchivePendingUpload A08;
    public AnonymousClass1US A09;
    public C17780qn A0A;
    public IngestSessionShim A0B;
    public AnonymousClass51z A0C;
    public AnonymousClass542 A0D;
    public C108264lX A0E;
    public AnonymousClass54J A0F;
    public AnonymousClass53L A0G;
    public C1180354y A0H;
    public DirectShareTarget A0I;
    public DirectShareTarget A0J;
    public MediaType A0K;
    public C107694kY A0L;
    public C67712xi A0M;
    public AnonymousClass0C1 A0N;
    public AnonymousClass3GP A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public List A0S;
    public List A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public AnonymousClass28B A0l;
    public C28051Kf A0m;
    public final C28871Co6 A0n = new C28871Co6();
    public final C27341Hl A0o;
    public final C11200ea A0p = new AnonymousClass557(this);
    public final AnonymousClass53I A0q = new AnonymousClass529(this);
    public final AnonymousClass53U A0r = new AnonymousClass54M(this);
    public final AnonymousClass1I1 A0s = new AnonymousClass1I1();
    public final List A0t = new ArrayList();
    public final Map A0u = new HashMap();
    public final Set A0v = new HashSet();
    public final boolean A0w;
    public final C1182455t A0x = new C1182455t(this);
    public final C1179654q A0y = new C1179654q(this);
    public final AnonymousClass54B A0z = new AnonymousClass54B(this);
    public final AnonymousClass552 A10 = new AnonymousClass552(this);
    public final AnonymousClass55I A11 = new AnonymousClass55I(this);
    public final C1182255r A12 = new C1182255r(this);
    public final AnonymousClass554 A13 = new C1179554p(this);
    public final AnonymousClass554 A14 = new AnonymousClass554(this);
    public final AnonymousClass554 A15 = new AnonymousClass553(this);
    public final AnonymousClass54V A16 = new AnonymousClass556(this);
    public final AnonymousClass54V A17 = new C1179354n(this);
    public final AnonymousClass56C A18 = new AnonymousClass55Q(this);
    public final AnonymousClass56C A19 = new AnonymousClass55P(this);
    public final AnonymousClass53X A1A = new C1179154l(this);
    public final AnonymousClass55X A1B = new AnonymousClass551(this);
    public final AnonymousClass55X A1C = new C1179454o(this);
    public final C689930o A1D = new AnonymousClass52F(this);
    public final boolean A1E;
    public C197238cH mFastScrollController;
    public FrameLayout mListContainer;
    public SearchController mSearchController;

    public DirectPrivateStoryRecipientController(C27341Hl r3, C28051Kf r4, AnonymousClass51z r5) {
        this.A0o = r3;
        this.A0m = r4;
        this.A0C = r5;
        this.A06 = AnonymousClass4q1.LANDING_STATE;
        this.A1E = true;
        this.A0w = true;
    }

    public static void A09(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, int i, boolean z, DirectShareTarget directShareTarget) {
        ImageView imageView;
        if (z) {
            AnonymousClass55L A002 = AnonymousClass55L.A00();
            Bitmap bitmap = null;
            try {
                View view = directPrivateStoryRecipientController.A0o.mView;
                if (view != null) {
                    View rootView = view.getRootView();
                    bitmap = Bitmap.createBitmap(rootView.getWidth() / 2, rootView.getHeight() / 2, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(bitmap);
                    canvas.scale(0.5f, 0.5f);
                    rootView.draw(canvas);
                }
            } catch (OutOfMemoryError e) {
                AnonymousClass0QD.A05("DirectPrivateStoryRecipientController", "Failed to create screenshot", e);
            }
            A002.A00 = bitmap;
            WeakReference weakReference = A002.A01;
            if (weakReference != null) {
                imageView = (ImageView) weakReference.get();
            } else {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                imageView.setVisibility(0);
            }
            directPrivateStoryRecipientController.A02(i, true, (DirectShareTarget) null);
        } else if (directShareTarget != null) {
            directPrivateStoryRecipientController.A02(i, false, directShareTarget);
        } else {
            directPrivateStoryRecipientController.A02(i, false, (DirectShareTarget) null);
        }
    }

    public static void A0A(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, View view, DirectShareTarget directShareTarget, int i, int i2, AnonymousClass53I r13) {
        if (view != null && directPrivateStoryRecipientController.A0m != null) {
            C30231Ta A002 = AnonymousClass1TY.A00(directShareTarget, new C1173652g(i, (long) i2, (long) 0), String.valueOf(directShareTarget.A02()));
            A002.A00(new AnonymousClass537(r13));
            directPrivateStoryRecipientController.A0m.A03(view, A002.A02());
        }
    }

    public final float AFw(SearchController searchController, Integer num) {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final void Arn(SearchController searchController, float f, float f2, Integer num) {
    }

    private Intent A00(boolean z, DirectShareTarget directShareTarget) {
        ArrayList arrayList;
        List list;
        Intent intent = new Intent();
        ArrayList A032 = this.A0D.A03(C1175853d.class);
        intent.putExtra("bundle_extra_user_tapped_done_button", z);
        intent.putExtra("bundle_extra_user_see_chat_target", directShareTarget);
        intent.putExtra("bundle_extra_one_tap_send_taps", this.A01).putExtra("bundle_extra_one_tap_undo_taps", this.A02).putExtra("bundle_extra_ingest_session", this.A0B).putParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets", A032).putExtra("bundle_extra_user_story_targets", new ArrayList(this.A0v));
        if (this.A0Z) {
            intent.putExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", this.A0O.A07());
        }
        if (AnonymousClass55T.A00(this.A0N).booleanValue() && (list = this.A0S) != null) {
            intent.putExtra("DirectPrivateStoryRecipientFragment.PER_MEDIA_BLACKLIST_USER_IDS", new ArrayList(list));
        }
        intent.putParcelableArrayListExtra("bundle_extra_direct_share_targets", this.A0D.A03(C1179854t.class));
        if (this.A0X) {
            List A042 = this.A0D.A04(C1180054v.class, AnonymousClass542.A03);
            if (A042.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(((C1180054v) A042.get(0)).AKJ());
            }
            intent.putParcelableArrayListExtra("bundle_extra_blast_list_direct_share_targets", arrayList);
        }
        if (this.A0I != null) {
            intent.putExtra("DirectPrivateStoryRecipientController.DIRECT_FORGOT_TO_SEND_TO_ORIGINAL_RECIPIENT", this.A0f);
            intent.putExtra("DirectPrivateStoryRecipientController.DIRECT_SEND_TO_ORIGINAL_RECIPIENT_WITH_DIALOG", this.A0b);
        }
        intent.putExtra("ARGUMENTS_MEDIA_SHARED_TO_FEED", false);
        return intent;
    }

    private void A01() {
        ArrayList arrayList;
        AnonymousClass4XN A012 = this.A0l.A01("story_share_sheet");
        List list = A012.A01;
        this.A0R = A012.A00;
        AnonymousClass0C1 r0 = this.A0N;
        C109754o8 r4 = new C109754o8();
        C109734o6.A00(r0, list, (List) null, r4);
        if (this.A0X) {
            AnonymousClass0C1 r6 = this.A0N;
            Set set = AnonymousClass4US.A02;
            try {
                String string = C16180oA.A00(r6).A00.getString("direct_blast_list_candidates", (String) null);
                if (string != null) {
                    C13080hr A0A2 = C12890hY.A00.A0A(string);
                    A0A2.A0p();
                    AnonymousClass4US parseFromJson = AnonymousClass4UO.parseFromJson(A0A2);
                    if (parseFromJson.A00.size() >= 2) {
                        set = AnonymousClass4US.A00(new LinkedHashSet(parseFromJson.A00), set);
                    } else {
                        throw new IOException("Not enough targets parsed");
                    }
                }
            } catch (IOException e) {
                C16180oA.A00(r6).A00.edit().putString("direct_blast_list_candidates", (String) null).apply();
                AnonymousClass0QD.A0A("BlastListCandidatesManager_error_deserializing_last_send", e);
            }
            arrayList = new ArrayList(set);
        } else {
            arrayList = null;
        }
        A0B(this, r4.A04, r4.A00, (List) null, (List) null, arrayList, (List) null);
    }

    private void A02(int i, boolean z, DirectShareTarget directShareTarget) {
        FragmentActivity activity = this.A0o.getActivity();
        activity.setResult(i, A00(z, directShareTarget));
        activity.finish();
        if (i == -1) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public static void A03(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        C31221Wz A012 = C31201Wx.A01(directPrivateStoryRecipientController.A0o.getContext());
        if (A012 != null) {
            A012.A09();
        }
    }

    public static void A04(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        directPrivateStoryRecipientController.A0D.A05();
        if (directPrivateStoryRecipientController.A0g) {
            directPrivateStoryRecipientController.A0o.getActivity().onBackPressed();
        } else {
            A09(directPrivateStoryRecipientController, -1, directPrivateStoryRecipientController.A0c, directPrivateStoryRecipientController.A0J);
        }
    }

    public static void A05(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        int i;
        C31691Zj r3 = (C31691Zj) directPrivateStoryRecipientController.mListContainer.getLayoutParams();
        int i2 = 0;
        if (directPrivateStoryRecipientController.A04 == null || !directPrivateStoryRecipientController.A0D.A08()) {
            i = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) directPrivateStoryRecipientController.A04.getLayoutParams();
            i = marginLayoutParams.bottomMargin + directPrivateStoryRecipientController.A04.getHeight() + marginLayoutParams.topMargin;
        }
        int i3 = r3.leftMargin;
        if (!directPrivateStoryRecipientController.A0g && !directPrivateStoryRecipientController.A0h) {
            i2 = C27651Ir.A00(directPrivateStoryRecipientController.A0o.getContext());
        }
        r3.setMargins(i3, i2, r3.rightMargin, i);
        directPrivateStoryRecipientController.mListContainer.setLayoutParams(r3);
    }

    public static void A06(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        TextView textView = directPrivateStoryRecipientController.A04;
        if (textView != null) {
            textView.setText(C0003R.string.done);
            if (directPrivateStoryRecipientController.A0D.A08()) {
                SearchController searchController = directPrivateStoryRecipientController.mSearchController;
                if (!searchController.A04()) {
                    boolean z = false;
                    if (searchController.A05 == Constants.ONE) {
                        z = true;
                    }
                    if (!z && !directPrivateStoryRecipientController.A0V) {
                        C476524w A072 = C476624x.A07(directPrivateStoryRecipientController.A04);
                        A072.A0N();
                        C476524w A0T2 = A072.A0T(true);
                        A0T2.A0E(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        A0T2.A08 = 0;
                        A0T2.A09 = new AnonymousClass55W(directPrivateStoryRecipientController);
                        A0T2.A0O();
                        return;
                    }
                }
            }
            A05(directPrivateStoryRecipientController);
            A0C(directPrivateStoryRecipientController, true);
        }
    }

    public static void A07(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        AnonymousClass54J r0 = directPrivateStoryRecipientController.A0F;
        if (r0 != null) {
            r0.A0K();
        }
    }

    public static void A08(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        directPrivateStoryRecipientController.A0F.A0K();
        A06(directPrivateStoryRecipientController);
        A05(directPrivateStoryRecipientController);
    }

    public static void A0B(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, List list, List list2, List list3, List list4, List list5, List list6) {
        if (list != null) {
            AnonymousClass54J r1 = directPrivateStoryRecipientController.A0F;
            r1.A0V.clear();
            r1.A0f.clear();
            r1.A0g.clear();
            AnonymousClass54J.A03(r1);
            r1.A0V.addAll(list);
        }
        if (list2 != null) {
            AnonymousClass54J r12 = directPrivateStoryRecipientController.A0F;
            r12.A0U.clear();
            r12.A0f.clear();
            r12.A0g.clear();
            r12.A0U.addAll(list2);
        }
        if (list3 != null) {
            AnonymousClass54J r13 = directPrivateStoryRecipientController.A0F;
            r13.A0e.clear();
            r13.A0f.clear();
            r13.A0g.clear();
            r13.A0e.addAll(list3);
        }
        if (list4 != null) {
            AnonymousClass54J r0 = directPrivateStoryRecipientController.A0F;
            AnonymousClass54J.A03(r0);
            AnonymousClass0a4.A06(list4);
            r0.A04 = list4;
        }
        if (list5 != null) {
            AnonymousClass54J r14 = directPrivateStoryRecipientController.A0F;
            r14.A0d.clear();
            r14.A0d.addAll(list5);
        }
        if (list6 != null) {
            AnonymousClass54J r15 = directPrivateStoryRecipientController.A0F;
            r15.A05.clear();
            r15.A05.addAll(list6);
        }
        directPrivateStoryRecipientController.A0F.A0K();
    }

    public static void A0C(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, boolean z) {
        TextView textView = directPrivateStoryRecipientController.A04;
        if (textView != null && textView.getVisibility() != 8) {
            if (z) {
                directPrivateStoryRecipientController.A04.setClickable(false);
                C476524w A072 = C476624x.A07(directPrivateStoryRecipientController.A04);
                A072.A0N();
                C476524w A0T2 = A072.A0T(true);
                A0T2.A0E((float) C27651Ir.A00(directPrivateStoryRecipientController.A0o.getContext()));
                A0T2.A07 = 8;
                A0T2.A0O();
                return;
            }
            directPrivateStoryRecipientController.A04.setVisibility(8);
        }
    }

    public final Intent A0D() {
        boolean z;
        if (this.A0c || (this.A0g && this.A0D.A08())) {
            z = true;
        } else {
            z = false;
        }
        return A00(z, this.A0J);
    }

    public final C1175853d A0E(DirectShareTarget directShareTarget, int i, int i2) {
        Context context = this.A0o.getContext();
        AnonymousClass0a4.A06(context);
        DirectShareTarget directShareTarget2 = directShareTarget;
        AnonymousClass520 r5 = new AnonymousClass520(this, directShareTarget, i, i2);
        String str = this.A0P;
        if (str != null) {
            return new AnonymousClass4W4(this.A0N, str, directShareTarget, r5);
        }
        C17780qn r3 = this.A0A;
        if (r3 != null) {
            return new C107504kF(context, this.A0N, r3, directShareTarget2, r5);
        }
        AnonymousClass0C1 r2 = this.A0N;
        IngestSessionShim ingestSessionShim = this.A0B;
        AnonymousClass0a4.A06(ingestSessionShim);
        return new C1179854t(context, r2, ingestSessionShim, directShareTarget2, r5, this.A0L);
    }

    public final void A0F() {
        Bundle bundle = new Bundle();
        bundle.putString("DirectVisualMessageCreateGroupFragment.DIRECT_MODULE", this.A0o.getModuleName());
        if (this.A0C != null) {
            bundle.putBoolean("DirectVisualMessageCreateGroupFragment.SHOULD_REWRITE_LOGGING", true);
            this.A0C.A04();
        }
        new C59032gv(this.A0N, TransparentModalActivity.class, "direct_story_create_group", bundle, (Activity) AnonymousClass0PK.A01(this.A0o.getContext(), Activity.class)).A07(this.A0o, 2001);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (((com.instagram.pendingmedia.model.PendingMedia) r10.A0t.get(0)).A0x() == false) goto L_0x0046;
     */
    public final void A0G(View view, FrameLayout frameLayout, ViewStub viewStub) {
        boolean z;
        String str;
        ViewGroup viewGroup;
        View view2 = view;
        FrameLayout frameLayout2 = frameLayout;
        if (this.A0g) {
            view2.setBackground((Drawable) null);
            frameLayout2.setBackgroundColor(C019000b.A00(this.A0o.getActivity(), C0003R.color.igds_elevated_background));
            viewStub.inflate();
        }
        this.mListContainer = frameLayout2;
        List list = this.A0t;
        if (!(list == null || list.isEmpty() || this.A0t.get(0) == null)) {
            z = true;
        }
        z = false;
        Context context = this.A0o.getContext();
        AnonymousClass0C1 r8 = this.A0N;
        C689930o r64 = this.A1D;
        AnonymousClass54V r63 = this.A17;
        AnonymousClass54V r62 = this.A16;
        C1179654q r61 = this.A0y;
        AnonymousClass55X r60 = this.A1B;
        AnonymousClass54B r59 = this.A0z;
        AnonymousClass554 r58 = this.A13;
        AnonymousClass554 r57 = this.A15;
        AnonymousClass554 r26 = this.A14;
        AnonymousClass552 r27 = this.A10;
        AnonymousClass55I r28 = this.A11;
        C1182255r r29 = this.A12;
        C1182455t r30 = this.A0x;
        AnonymousClass53U r25 = this.A0r;
        AnonymousClass56C r24 = this.A18;
        AnonymousClass56C r23 = this.A19;
        boolean z2 = this.A0k;
        boolean z3 = this.A0Y;
        boolean z4 = this.A0Z;
        boolean z5 = this.A0a;
        boolean z6 = this.A0X;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.DIRECT_VIEW_MORE_QE, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        boolean z7 = this.A0i;
        AnonymousClass0C1 r5 = this.A0N;
        AnonymousClass0L7 r3 = AnonymousClass0L7.PARTIAL_SHARE_SHEET;
        AnonymousClass0C1 r17 = r8;
        C689930o r18 = r64;
        AnonymousClass54V r19 = r63;
        AnonymousClass54V r20 = r62;
        C1179654q r21 = r61;
        AnonymousClass55X r22 = r60;
        AnonymousClass54B r232 = r59;
        AnonymousClass554 r242 = r58;
        AnonymousClass554 r252 = r57;
        this.A0F = new AnonymousClass54J(context, r17, r18, r19, r20, r21, r22, r232, r242, r252, r26, r27, r28, r29, r30, r25, r24, r23, z2, z3, z4, z5, z6, booleanValue, z7, ((Boolean) AnonymousClass0L6.A02(r5, r3, "enable_suggested_recipients_hscroll", false, (AnonymousClass04H) null)).booleanValue(), this.A00, this.A0d, this.A0S, z, ((Boolean) AnonymousClass0L6.A02(this.A0N, r3, "enable_expandable_recipient_list", false, (AnonymousClass04H) null)).booleanValue(), this.A09, this.A07, this.A0O, this.A0H, this.A0T, this.A0B, this.A0I, this.A0L, this, this.A0o);
        this.A05 = (RecyclerView) view2.findViewById(C0003R.C0005id.recipients_rv);
        C27341Hl r1 = this.A0o;
        Context context2 = r1.getContext();
        AnonymousClass0C1 r14 = this.A0N;
        C28351Lj r15 = new C28351Lj(context2, AnonymousClass1L8.A00(r1));
        if (this.A0j) {
            str = "raven";
        } else {
            str = "story_share_sheet";
        }
        this.A0M = C108684mG.A00(context2, r14, r15, str, true, (String) AnonymousClass0L6.A02(this.A0N, AnonymousClass0L7.DIRECT_REAL_NAMES_LAUNCHER, "display_name_type", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, (AnonymousClass04H) null), "story_share_sheet");
        this.A0l = AnonymousClass28B.A00(this.A0N);
        C27341Hl r12 = this.A0o;
        Context context3 = r12.getContext();
        AnonymousClass0C1 r6 = this.A0N;
        AnonymousClass53X r7 = this.A1A;
        AnonymousClass55X r82 = this.A1C;
        C11590fD r9 = this.A07;
        AnonymousClass53R r10 = new AnonymousClass53R(this);
        IngestSessionShim ingestSessionShim = this.A0B;
        int i = this.A00;
        AnonymousClass53L r4 = new AnonymousClass53L(context3, r6, r7, r82, r9, r10, ingestSessionShim, this, i, this.A0j, r12.getModuleName(), this.A0l);
        this.A0G = r4;
        this.A0M.BiZ(r4);
        FragmentActivity activity = this.A0o.getActivity();
        if (activity instanceof C11870fo) {
            viewGroup = ((C11870fo) activity).AVK();
        } else {
            viewGroup = (ViewGroup) view2;
        }
        SearchController searchController = new SearchController((Activity) this.A0o.getActivity(), viewGroup, -1, -1, (ListAdapter) this.A0G, (AnonymousClass67D) this, true, (AnonymousClass67G) null, (C256219o) null);
        this.mSearchController = searchController;
        this.A0o.registerLifecycleListener(searchController);
        this.mSearchController.A06 = true;
        this.A05.setAdapter(this.A0F);
        this.A0F.A0K();
        this.A05.A0w(this);
        TextView textView = (TextView) LayoutInflater.from(this.A0o.getContext()).inflate(C0003R.layout.direct_private_story_recipient_send_button, (ViewGroup) this.A0o.getActivity().findViewById(16908290), false);
        this.A04 = textView;
        textView.setOnClickListener(new C1179254m(this));
        this.A04.setVisibility(8);
        ((ViewGroup) this.A0o.getActivity().findViewById(16908290)).addView(this.A04);
        if (AnonymousClass55T.A00(this.A0N).booleanValue()) {
            C23300zv.A00(this.A0N).A02(C1181755m.class, this.A0p);
        }
        C23300zv.A00(this.A0N).A02(C1182655w.class, this);
        A01();
        this.A0o.schedule(new C111064qK(this));
        A05(this);
        A06(this);
        int A002 = C27651Ir.A00(this.A0o.getContext());
        if (!this.A0W) {
            this.A05.setVerticalScrollBarEnabled(false);
            return;
        }
        this.A05.setVerticalScrollBarEnabled(false);
        ViewStub viewStub2 = (ViewStub) view2.findViewById(C0003R.C0005id.direct_fast_scroll_container);
        AnonymousClass5A3 r32 = new AnonymousClass5A3(this.A05);
        AnonymousClass54J r2 = this.A0F;
        C197238cH A022 = C197238cH.A02(r32, r2, r2, viewStub2.inflate(), this.A0F);
        this.mFastScrollController = A022;
        this.A0s.A0E(A022);
        C06220Of.A0S(viewStub2, A002);
    }

    public final void B3D() {
        AnonymousClass3LX.A0F(this.A0N, this.A0o, this.A0M.ATP());
        AnonymousClass51z r1 = this.A0C;
        if (r1 != null) {
            this.A06 = AnonymousClass4q1.LANDING_STATE;
            r1.A06();
            this.A0Q = null;
        }
    }

    public final void BLV(SearchController searchController, boolean z) {
        if (this.A1E) {
            AnonymousClass1EW.A03(this.A0o.getActivity()).Bnz(!z);
            C27341Hl r0 = this.A0o;
            AnonymousClass1X4.A02(r0.getActivity(), AnonymousClass1BA.A01(r0.getContext(), C0003R.attr.statusBarBackgroundColor));
        }
    }

    public final void onSearchTextChanged(String str) {
        AnonymousClass4q1 r0;
        String ATP = this.A0M.ATP();
        String A012 = C06360Ot.A01(str);
        if (!TextUtils.isEmpty(A012)) {
            AnonymousClass3LX.A0G(this.A0N, this.A0o, A012);
        }
        this.A0M.Bjv(A012);
        if (this.A0C != null) {
            boolean isEmpty = TextUtils.isEmpty(ATP);
            boolean isEmpty2 = TextUtils.isEmpty(A012);
            if (isEmpty && !isEmpty2) {
                r0 = AnonymousClass4q1.SEARCH_QUERY_STATE;
            } else if (!isEmpty && isEmpty2) {
                r0 = AnonymousClass4q1.SEARCH_NULL_STATE;
            } else {
                return;
            }
            this.A06 = r0;
        }
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0Z0.A03(-1716334795);
        int A033 = AnonymousClass0Z0.A03(-1134982440);
        if (TextUtils.isEmpty(this.A0M.ATP())) {
            A01();
        }
        AnonymousClass0Z0.A0A(243720563, A033);
        AnonymousClass0Z0.A0A(733977332, A032);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A032 = AnonymousClass0Z0.A03(-256712941);
        super.onScrollStateChanged(recyclerView, i);
        this.A0s.onScrollStateChanged(recyclerView, i);
        AnonymousClass0Z0.A0A(2141352935, A032);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0Z0.A03(711849054);
        super.onScrolled(recyclerView, i, i2);
        this.A0s.onScrolled(recyclerView, i, i2);
        AnonymousClass0Z0.A0A(632236414, A032);
    }

    public final void BOo(SearchController searchController, Integer num, Integer num2) {
        A06(this);
    }
}
