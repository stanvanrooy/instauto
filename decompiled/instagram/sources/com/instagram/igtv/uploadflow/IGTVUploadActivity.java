package com.instagram.igtv.uploadflow;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.feed.media.CropCoordinates;
import com.instagram.igtv.uploadflow.reactions.model.IGTVReactionsSettings;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.PendingMedia;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1GZ;
import p000X.AnonymousClass2GT;
import p000X.AnonymousClass2QA;
import p000X.AnonymousClass2QB;
import p000X.AnonymousClass2VU;
import p000X.AnonymousClass67A;
import p000X.AnonymousClass77D;
import p000X.AnonymousClass7A3;
import p000X.AnonymousClass7D1;
import p000X.AnonymousClass7D3;
import p000X.AnonymousClass7D7;
import p000X.AnonymousClass7D8;
import p000X.AnonymousClass7DE;
import p000X.AnonymousClass7DF;
import p000X.AnonymousClass7DG;
import p000X.AnonymousClass7DH;
import p000X.AnonymousClass7DI;
import p000X.AnonymousClass7DJ;
import p000X.AnonymousClass7DK;
import p000X.AnonymousClass7DL;
import p000X.AnonymousClass7DN;
import p000X.AnonymousClass7DO;
import p000X.AnonymousClass7DP;
import p000X.AnonymousClass7DQ;
import p000X.AnonymousClass7DR;
import p000X.AnonymousClass7KE;
import p000X.C06590Pq;
import p000X.C11850fm;
import p000X.C13150hy;
import p000X.C15330mi;
import p000X.C167047Ba;
import p000X.C167467Da;
import p000X.C167477Db;
import p000X.C167547Dj;
import p000X.C167567Dl;
import p000X.C167877Eq;
import p000X.C169137Kp;
import p000X.C169147Kq;
import p000X.C173777bc;
import p000X.C18750sM;
import p000X.C255219c;
import p000X.C26581Eb;
import p000X.C27371Ho;
import p000X.C63022ol;

public final class IGTVUploadActivity extends IgFragmentActivity implements C11850fm {
    public static final AnonymousClass7DO A09 = new AnonymousClass7DO();
    public AnonymousClass7D7 A00;
    public C167467Da A01;
    public AnonymousClass7D8 A02;
    public AnonymousClass0C1 A03;
    public Integer A04;
    public String A05;
    public String A06;
    public final C255219c A07 = new C255219c(this);
    public final C18750sM A08 = new AnonymousClass7A3(C63022ol.A00(AnonymousClass7D1.class), new AnonymousClass77D(this), new AnonymousClass7D3(this));

    public static final AnonymousClass7D1 A01(IGTVUploadActivity iGTVUploadActivity) {
        return (AnonymousClass7D1) iGTVUploadActivity.A08.getValue();
    }

    private final void A04(Medium medium, AnonymousClass2GT r6, AnonymousClass2GT r7) {
        C167877Eq r3 = new C167877Eq(this);
        C169147Kq r2 = new C169147Kq(this);
        AnonymousClass0C1 r1 = this.A03;
        if (r1 == null) {
            C13150hy.A03("userSession");
        }
        AnonymousClass7DR A002 = C169137Kp.A00(medium, r1, r3, r2);
        if (A002 instanceof AnonymousClass7DP) {
            r6.invoke(((AnonymousClass7DP) A002).A00);
        } else if (A002 instanceof AnonymousClass7DQ) {
            r7.invoke(((AnonymousClass7DQ) A002).A00);
        }
    }

    public final C06590Pq A0L() {
        AnonymousClass0C1 r1 = this.A03;
        if (r1 == null) {
            C13150hy.A03("userSession");
        }
        return r1;
    }

    public final AnonymousClass1EW AFO() {
        AnonymousClass1EW r1 = this.A07.A00;
        if (r1 == null) {
            C13150hy.A03("actionBarService");
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0102, code lost:
        if (r0 != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005e, code lost:
        if (r1 == 0) goto L_0x0060;
     */
    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        C13150hy.A02(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("uploadflow.extra.is_activity_restart", true);
        C167467Da r2 = this.A01;
        if (r2 == null) {
            C13150hy.A03("navigator");
        }
        C13150hy.A02(bundle, "outState");
        C167477Db r1 = new C167477Db();
        AnonymousClass67A r22 = (AnonymousClass67A) r2.A01.A00;
        C13150hy.A01(r22, "navigationGraph.currentState");
        C13150hy.A02(bundle, "saveBundle");
        C13150hy.A02(r22, "navigationState");
        Integer num = (Integer) r1.A01.get(r22);
        if (num != null) {
            bundle.putInt("uploadnavigator.extra.saved_state", num.intValue());
            AnonymousClass7D1 A012 = A01(this);
            C13150hy.A02(bundle, "toBundle");
            C167047Ba r23 = A012.A0A;
            C13150hy.A02(bundle, "toBundle");
            String str = r23.A05;
            if (str != null) {
                int length = str.length();
                z = false;
            }
            z = true;
            if (!z) {
                bundle.putString("uploadviewmodel.key.custom.reactions.prompt", r23.A05);
            }
            bundle.putParcelable("uploadviewmodel.key.reactions.settings", r23.A03);
            CropCoordinates ALg = r23.ALg();
            if (ALg != null) {
                bundle.putParcelable("uploadviewmodel.key.feed.preview.crop.coordinates", ALg);
            }
            CropCoordinates ASu = r23.ASu();
            if (ASu != null) {
                bundle.putParcelable("uploadviewmodel.key.profile.crop.coordinates", ASu);
            }
            BrandedContentTag AH6 = r23.AH6();
            if (AH6 != null) {
                bundle.putParcelable("uploadviewmodel.key.branded.content.tag", AH6);
            }
            bundle.putBoolean("uploadviewmodel.key.is.fuego.deal", r23.Afb());
            Integer num2 = this.A04;
            if (num2 == null) {
                C13150hy.A03("startingScreen");
            }
            int i = AnonymousClass7DL.A00[num2.intValue()];
            if (i != 1) {
                if (i == 2) {
                    boolean z2 = false;
                    if (A01(this).A01 != null) {
                        z2 = true;
                    }
                } else if (i == 3) {
                    boolean z3 = false;
                    if (A01(this).A01 != null) {
                        z3 = true;
                    }
                    if (z3) {
                        PendingMedia pendingMedia = A01(this).A00().A01;
                        bundle.putString("uploadflow.extra.live_pending_media_id", pendingMedia.A24);
                        bundle.putString("uploadflow.extra.live_broadcast_id", pendingMedia.A1O);
                        bundle.putLong("uploadflow.extra.live_duration_msec", pendingMedia.A0V);
                        bundle.putBoolean("uploadflow.extra.live_is_internal_only", pendingMedia.A2m);
                        return;
                    }
                } else {
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            boolean z4 = false;
            if (A01(this).A01 != null) {
                z4 = true;
            }
            if (!z4) {
                return;
            }
            bundle.putParcelable("uploadflow.extra.gallery_medium", A01(this).A00().A00);
            return;
        }
        throw new IllegalStateException(("Unrecognized navigation state: " + r22).toString());
    }

    public static final AnonymousClass7DK A00(String str, Bundle bundle, boolean z) {
        PendingMedia A022 = PendingMedia.A02(str);
        A022.A1O = bundle.getString("uploadflow.extra.live_broadcast_id");
        A022.A0V = bundle.getLong("uploadflow.extra.live_duration_msec");
        A022.A3B = false;
        A022.A2m = z;
        C13150hy.A01(A022, "PendingMedia.createImage…sEmployeeOnly\n          }");
        Medium A012 = Medium.A01(true, 0, 0, str);
        C13150hy.A01(A012, "Medium.newMediaPlacehold…ue, 0, 0, pendingMediaId)");
        return new AnonymousClass7DK(A022, A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r1 != p000X.Constants.ZERO) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4.A02 != false) goto L_0x0014;
     */
    public final void finish() {
        boolean z;
        super.finish();
        AnonymousClass7D1 A012 = A01(this);
        boolean z2 = true;
        if (A012.A00 == AnonymousClass2VU.CAMERA_BUTTON) {
            z = true;
        }
        z = false;
        if (z) {
            Integer num = this.A04;
            if (num == null) {
                C13150hy.A03("startingScreen");
            }
        }
        z2 = false;
        int i = C0003R.anim.bottom_out;
        if (z2) {
            i = C0003R.anim.right_out;
        }
        overridePendingTransition(0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013e, code lost:
        if (r2 != null) goto L_0x0140;
     */
    public final void onCreate(Bundle bundle) {
        Integer num;
        ViewStub viewStub;
        int A002 = AnonymousClass0Z0.A00(1823413795);
        C15330mi.A01(this);
        setContentView((int) C0003R.layout.upload_flow_activity);
        Intent intent = getIntent();
        C13150hy.A01(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C13150hy.A00();
        }
        C13150hy.A01(extras, "intent.extras!!");
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(extras);
        C13150hy.A01(A062, "IgSessionManager.getUserSession(extras)");
        this.A03 = A062;
        this.A06 = extras.getString("uploadflow.extra.viewer_session_id");
        String string = extras.getString("igtv_creation_session_id_arg");
        if (string == null) {
            C13150hy.A00();
        }
        this.A05 = string;
        AnonymousClass0C1 r0 = this.A03;
        if (r0 == null) {
            C13150hy.A03("userSession");
        }
        this.A02 = new AnonymousClass7D8(r0);
        AnonymousClass0C1 r2 = this.A03;
        if (r2 == null) {
            C13150hy.A03("userSession");
        }
        String str = this.A05;
        if (str == null) {
            C13150hy.A03("composerSessionId");
        }
        this.A00 = new AnonymousClass7D7(r2, str, this.A06);
        String string2 = extras.getString("igtv_creation_entry_point_arg");
        if (string2 == null) {
            C13150hy.A00();
        }
        C13150hy.A01(string2, "extras.getString(IGTVCon…EATION_ENTRY_POINT_ARG)!!");
        AnonymousClass2VU r1 = (AnonymousClass2VU) AnonymousClass2VU.A01.get(string2);
        if (r1 == null) {
            r1 = AnonymousClass2VU.UNKNOWN;
        }
        AnonymousClass0C1 r14 = this.A03;
        if (r14 == null) {
            C13150hy.A03("userSession");
        }
        AnonymousClass7D7 r15 = this.A00;
        if (r15 == null) {
            C13150hy.A03("loggerFactory");
        }
        C13150hy.A01(r1, "entryPoint");
        Bundle bundle2 = bundle;
        this.A01 = new C167467Da(this, r14, r15, r1, bundle2);
        AnonymousClass7D1 A012 = A01(this);
        C13150hy.A02(r1, "<set-?>");
        A012.A00 = r1;
        C255219c r10 = this.A07;
        r10.A00 = new AnonymousClass1EW((ViewGroup) r10.A04.findViewById(r10.A02), r10.A03);
        r10.A04.A05().A0r(new AnonymousClass7DN(r10));
        if (C255219c.A05 && (viewStub = (ViewStub) r10.A04.findViewById(C0003R.C0005id.tool_bar_stub)) != null) {
            viewStub.inflate();
            ViewGroup viewGroup = (ViewGroup) r10.A04.findViewById(C0003R.C0005id.tool_bar_container);
            C13150hy.A01(viewGroup, "toolbarContainer");
            r10.A01 = new AnonymousClass7KE(viewGroup, r10.A03);
            r10.A04.A0K().A0U((Toolbar) viewGroup.findViewById(C0003R.C0005id.tool_bar));
            AnonymousClass7KE r12 = r10.A01;
            if (r12 != null) {
                r12.Bnz(false);
            }
        }
        String string3 = extras.getString("uploadflow.extra.start_screen");
        if (string3 != null) {
            C13150hy.A01(string3, "it");
            if (string3.equals("GALLERY")) {
                num = Constants.ZERO;
            } else if (string3.equals("COVER_PICKER")) {
                num = Constants.ONE;
            } else if (string3.equals("POST_LIVE_COVER_PICKER")) {
                num = Constants.A0C;
            } else {
                throw new IllegalArgumentException(string3);
            }
        }
        num = Constants.ZERO;
        this.A04 = num;
        if (bundle != null) {
            AnonymousClass2QB r9 = new AnonymousClass2QB();
            r9.A00 = true;
            if (num == null) {
                C13150hy.A03("startingScreen");
            }
            int i = AnonymousClass7DL.A01[num.intValue()];
            if (i != 1) {
                if (i == 2) {
                    Parcelable parcelable = bundle2.getParcelable("uploadflow.extra.gallery_medium");
                    if (parcelable != null) {
                        Medium medium = (Medium) parcelable;
                        A04(medium, new AnonymousClass7DJ(this, medium), new AnonymousClass7DG(this, r9));
                    }
                } else if (i == 3) {
                    String string4 = bundle2.getString("uploadflow.extra.live_pending_media_id");
                    if (string4 != null) {
                        boolean z = bundle2.getBoolean("uploadflow.extra.live_is_internal_only", false);
                        AnonymousClass7D1 A013 = A01(this);
                        AnonymousClass7DK A003 = A00(string4, bundle2, z);
                        C13150hy.A02(A003, "<set-?>");
                        A013.A01 = A003;
                    }
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            Medium medium2 = (Medium) bundle2.getParcelable("uploadflow.extra.gallery_medium");
            if (medium2 != null) {
                C13150hy.A01(medium2, "medium");
                A04(medium2, new AnonymousClass7DE(medium2, this, r9), new AnonymousClass7DF(this, r9));
            }
            if (r9.A00) {
                AnonymousClass7D1 A014 = A01(this);
                C13150hy.A02(bundle2, "fromBundle");
                C167047Ba r13 = A014.A0A;
                C13150hy.A02(bundle2, "fromBundle");
                String string5 = bundle2.getString("uploadviewmodel.key.custom.reactions.prompt", "");
                C13150hy.A01(string5, "fromBundle.getString(KEY…TOM_REACTIONS_PROMPT, \"\")");
                C13150hy.A02(string5, "<set-?>");
                r13.A05 = string5;
                Parcelable parcelable2 = bundle2.getParcelable("uploadviewmodel.key.reactions.settings");
                if (parcelable2 == null) {
                    C13150hy.A00();
                }
                IGTVReactionsSettings iGTVReactionsSettings = (IGTVReactionsSettings) parcelable2;
                C13150hy.A02(iGTVReactionsSettings, "<set-?>");
                r13.A03 = iGTVReactionsSettings;
                r13.A01 = (CropCoordinates) bundle2.getParcelable("uploadviewmodel.key.feed.preview.crop.coordinates");
                r13.A02 = (CropCoordinates) bundle2.getParcelable("uploadviewmodel.key.profile.crop.coordinates");
                r13.A04 = (BrandedContentTag) bundle2.getParcelable("uploadviewmodel.key.branded.content.tag");
                r13.Bhe(bundle2.getBoolean("uploadviewmodel.key.is.fuego.deal"));
            } else {
                finish();
            }
        }
        super.onCreate(bundle2);
        C26581Eb.A00(this, 1);
        new AnonymousClass1GZ("igtv_upload_activity").A00(Constants.A15);
        if (bundle == null) {
            AnonymousClass2QA r6 = new AnonymousClass2QA();
            r6.A00 = null;
            Integer num2 = this.A04;
            if (num2 == null) {
                C13150hy.A03("startingScreen");
            }
            int i2 = AnonymousClass7DL.A02[num2.intValue()];
            if (i2 == 1) {
                r6.A00 = C167567Dl.A00;
            } else if (i2 == 2) {
                Parcelable parcelable3 = extras.getParcelable("uploadflow.extra.gallery_medium");
                if (parcelable3 == null) {
                    C13150hy.A00();
                }
                Medium medium3 = (Medium) parcelable3;
                A04(medium3, new AnonymousClass7DI(this, medium3, r6), new AnonymousClass7DH(this));
            } else if (i2 == 3) {
                String valueOf = String.valueOf(System.nanoTime());
                AnonymousClass0C1 r02 = this.A03;
                if (r02 == null) {
                    C13150hy.A03("userSession");
                }
                C173777bc A004 = C173777bc.A00(r02);
                C13150hy.A01(A004, "IgLivePreferences.getInstance(userSession)");
                boolean A015 = A004.A01();
                AnonymousClass7D1 A016 = A01(this);
                AnonymousClass7DK A005 = A00(valueOf, extras, A015);
                C13150hy.A02(A005, "<set-?>");
                A016.A01 = A005;
                r6.A00 = C167547Dj.A00;
            }
            Object obj = r6.A00;
            if (obj != null) {
                A01(this).A02(obj, (C27371Ho) null);
            } else {
                finish();
            }
        }
        AnonymousClass0Z0.A07(241762281, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0Z0.A00(-2075984166);
        super.onResume();
        C255219c.A00(this.A07);
        AnonymousClass0Z0.A07(677718841, A002);
    }
}
