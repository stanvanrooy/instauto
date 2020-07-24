package com.instagram.creation.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.gallery.GalleryItem;
import com.instagram.common.gallery.Medium;
import com.instagram.common.p004ui.widget.draggable.DraggableContainer;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.p029ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.capture.GalleryPreviewInfo;
import com.instagram.creation.capture.MediaCaptureFragment;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.filter.BasicAdjustFilter;
import com.instagram.creation.photo.edit.filter.BlurredLumAdjustFilter;
import com.instagram.creation.photo.edit.luxfilter.LocalLaplacianFilter;
import com.instagram.creation.photo.edit.luxfilter.LuxFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.creation.photo.util.ExifImageData;
import com.instagram.creation.state.CreationState;
import com.instagram.filterkit.filter.IgFilterGroup;
import com.instagram.gallery.p034ui.GalleryHomeTabbedFragment;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0KF;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0NR;
import p000X.AnonymousClass0P6;
import p000X.AnonymousClass0PB;
import p000X.AnonymousClass0Q6;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1D9;
import p000X.AnonymousClass1H4;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass2L0;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass81O;
import p000X.AnonymousClass82K;
import p000X.AnonymousClass84V;
import p000X.AnonymousClass8G9;
import p000X.C05700Lp;
import p000X.C06590Pq;
import p000X.C107894ks;
import p000X.C11130eT;
import p000X.C11200ea;
import p000X.C11880fp;
import p000X.C120125Dh;
import p000X.C12800hP;
import p000X.C137535to;
import p000X.C140255z7;
import p000X.C145086Ig;
import p000X.C145096Ih;
import p000X.C145106Ii;
import p000X.C145196Ir;
import p000X.C145206Is;
import p000X.C15330mi;
import p000X.C160836td;
import p000X.C161106u5;
import p000X.C161146uA;
import p000X.C161176uD;
import p000X.C161266uM;
import p000X.C16180oA;
import p000X.C16330oQ;
import p000X.C169147Kq;
import p000X.C175317eG;
import p000X.C175327eH;
import p000X.C17850qu;
import p000X.C17870qw;
import p000X.C181087oF;
import p000X.C181097oG;
import p000X.C181107oH;
import p000X.C181427ot;
import p000X.C181987pp;
import p000X.C182627r2;
import p000X.C182757rI;
import p000X.C182797rM;
import p000X.C182887rW;
import p000X.C182927rc;
import p000X.C182977rh;
import p000X.C183027rm;
import p000X.C183127rw;
import p000X.C183167s0;
import p000X.C183397sO;
import p000X.C183547sf;
import p000X.C183637so;
import p000X.C183657sq;
import p000X.C183667sr;
import p000X.C183677ss;
import p000X.C183697su;
import p000X.C183867tM;
import p000X.C183927tU;
import p000X.C184017td;
import p000X.C185077vU;
import p000X.C185347vv;
import p000X.C185357vw;
import p000X.C185367vx;
import p000X.C18550s2;
import p000X.C185557wH;
import p000X.C185567wI;
import p000X.C185577wJ;
import p000X.C185587wK;
import p000X.C185607wO;
import p000X.C185617wP;
import p000X.C185647wS;
import p000X.C185657wT;
import p000X.C185867wo;
import p000X.C185907ws;
import p000X.C185947ww;
import p000X.C185957wy;
import p000X.C185977x0;
import p000X.C185987x1;
import p000X.C185997x2;
import p000X.C186007x4;
import p000X.C186017x5;
import p000X.C186027x6;
import p000X.C186037x7;
import p000X.C186077xB;
import p000X.C186087xC;
import p000X.C186117xF;
import p000X.C186167xK;
import p000X.C186197xN;
import p000X.C186217xP;
import p000X.C186227xQ;
import p000X.C186237xR;
import p000X.C186247xS;
import p000X.C186257xT;
import p000X.C186267xU;
import p000X.C186297xX;
import p000X.C186307xY;
import p000X.C186317xZ;
import p000X.C186327xa;
import p000X.C186337xb;
import p000X.C186647y6;
import p000X.C186817yO;
import p000X.C187027yj;
import p000X.C187057ym;
import p000X.C187197z0;
import p000X.C187467zS;
import p000X.C187517zX;
import p000X.C1881781s;
import p000X.C18900sb;
import p000X.C191048Ep;
import p000X.C206718ty;
import p000X.C23300zv;
import p000X.C26101Br;
import p000X.C26441Dh;
import p000X.C26901Fs;
import p000X.C27341Hl;
import p000X.C31161Wr;
import p000X.C33441cv;
import p000X.C33451cw;
import p000X.C33461cx;
import p000X.C33471cy;
import p000X.C33481cz;
import p000X.C42251s2;
import p000X.C42571sZ;
import p000X.C43341uF;
import p000X.C486028s;
import p000X.C85273n5;
import p000X.C87453ql;
import p000X.C88633sj;
import p000X.C88843t5;
import p000X.C88953tG;
import p000X.C88993tK;
import p000X.C89173tm;

public class MediaCaptureActivity extends IgFragmentActivity implements C182797rM, C161106u5, C187197z0, AnonymousClass0Q6, C182757rI, C181107oH, C181087oF, C186647y6, C11200ea, C183127rw, C183547sf, C181097oG, C183927tU, C186337xb, C1881781s, C185367vx, C184017td, C185357vw, C183697su, C11880fp, C140255z7 {
    public View A00;
    public AnonymousClass1D9 A01;
    public C27341Hl A02;
    public C185557wH A03;
    public CreationSession A04;
    public C187057ym A05;
    public C185567wI A06;
    public C185347vv A07;
    public C17870qw A08;
    public AnonymousClass0C1 A09;
    public boolean A0A;
    public View A0B;
    public C183667sr A0C;
    public C185607wO A0D;
    public C175327eH A0E;
    public C175317eG A0F;
    public C181427ot A0G;
    public AnonymousClass2L0 A0H;
    public final C11200ea A0I = new C186017x5(this);
    public final C11200ea A0J = new C186037x7(this);
    public final C11200ea A0K = new C186087xC(this);
    public final C11200ea A0L = new C186007x4(this);
    public final C11200ea A0M = new C186027x6(this);
    public final List A0N = new ArrayList();
    public final Map A0O = new HashMap();
    public final Set A0P = new HashSet();

    public final void Ays(int i, int i2) {
    }

    public final void B4f(String str, Location location, CropInfo cropInfo, int i, int i2, String str2) {
        A06(this, str, location, cropInfo, i, i2, (String) null, str2, (String) null, (String) null, (String) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016c, code lost:
        if (r2.A02 != 0) goto L_0x016e;
     */
    private void A07(PhotoSession photoSession, boolean z, boolean z2) {
        boolean z3;
        PendingMedia ARi = ARi(photoSession.A06);
        this.A06.A03(photoSession.A07);
        if (ARi != null && ARi.A2u) {
            if (z2) {
                AnonymousClass0C1 r6 = this.A09;
                C43341uF r5 = ARi.A0z;
                IgFilterGroup igFilterGroup = photoSession.A04;
                Rect rect = photoSession.A03.A02;
                int i = photoSession.A01;
                Integer num = r5.A0P;
                if (num != null) {
                    PhotoFilter photoFilter = new PhotoFilter(r6, C18550s2.A00().A04(num.intValue()), igFilterGroup.A06, (C89173tm) null);
                    photoFilter.A0K(Math.round(r5.A07.floatValue() * 100.0f));
                    igFilterGroup.A05(15, photoFilter);
                    igFilterGroup.A06(15, true);
                }
                if (r5.A09 != null) {
                    LuxFilter luxFilter = new LuxFilter(r6);
                    luxFilter.A00 = Math.round(r5.A09.floatValue() * 100.0f);
                    luxFilter.invalidate();
                    igFilterGroup.A05(9, luxFilter);
                    igFilterGroup.A06(9, true);
                }
                BasicAdjustFilter basicAdjustFilter = new BasicAdjustFilter();
                Float f = r5.A03;
                if (f != null) {
                    basicAdjustFilter.A00 = Math.round(f.floatValue() * 100.0f);
                    basicAdjustFilter.invalidate();
                }
                Float f2 = r5.A04;
                if (f2 != null) {
                    basicAdjustFilter.A01 = Math.round(f2.floatValue() * 100.0f);
                    basicAdjustFilter.invalidate();
                }
                Float f3 = r5.A0D;
                if (f3 != null) {
                    basicAdjustFilter.A03 = Math.round(f3.floatValue() * 100.0f);
                    basicAdjustFilter.invalidate();
                }
                Float f4 = r5.A0H;
                if (f4 != null) {
                    basicAdjustFilter.A04 = Math.round(f4.floatValue() * 100.0f);
                    basicAdjustFilter.invalidate();
                }
                Float f5 = r5.A0M;
                if (f5 != null) {
                    basicAdjustFilter.A09 = Math.round(f5.floatValue() * 100.0f);
                    basicAdjustFilter.invalidate();
                }
                Float f6 = r5.A06;
                if (f6 != null) {
                    basicAdjustFilter.A02 = Math.round(f6.floatValue() * 100.0f);
                    basicAdjustFilter.invalidate();
                }
                Integer num2 = r5.A0S;
                if (num2 != null) {
                    basicAdjustFilter.A07 = num2.intValue();
                    basicAdjustFilter.invalidate();
                    basicAdjustFilter.A08 = Math.round(r5.A0L.floatValue() * 100.0f);
                    basicAdjustFilter.invalidate();
                }
                Integer num3 = r5.A0R;
                if (num3 != null) {
                    basicAdjustFilter.A05 = num3.intValue();
                    basicAdjustFilter.invalidate();
                    basicAdjustFilter.A06 = Math.round(r5.A0K.floatValue() * 100.0f);
                    basicAdjustFilter.invalidate();
                }
                if (basicAdjustFilter.A0C()) {
                    igFilterGroup.A05(13, basicAdjustFilter);
                    igFilterGroup.A06(13, true);
                }
                BlurredLumAdjustFilter blurredLumAdjustFilter = new BlurredLumAdjustFilter();
                Float f7 = r5.A0F;
                if (f7 != null) {
                    blurredLumAdjustFilter.A0E(Math.round(f7.floatValue() * 100.0f));
                }
                Float f8 = r5.A0E;
                if (f8 != null) {
                    blurredLumAdjustFilter.A0D(Math.round(f8.floatValue() * 100.0f));
                }
                Float f9 = r5.A08;
                if (f9 != null) {
                    blurredLumAdjustFilter.A0C(Math.round(f9.floatValue() * 100.0f));
                }
                if (blurredLumAdjustFilter.A00 == 0 && blurredLumAdjustFilter.A01 == 0) {
                    z3 = false;
                }
                z3 = true;
                if (z3) {
                    igFilterGroup.A05(12, blurredLumAdjustFilter);
                    igFilterGroup.A06(12, true);
                }
                LocalLaplacianFilter localLaplacianFilter = new LocalLaplacianFilter(r6);
                Float f10 = r5.A0G;
                if (f10 != null) {
                    localLaplacianFilter.A01 = Math.round(f10.floatValue() * 100.0f);
                    localLaplacianFilter.invalidate();
                    igFilterGroup.A05(10, localLaplacianFilter);
                    igFilterGroup.A06(10, true);
                }
                SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(r6);
                PointF pointF = r5.A01;
                if (pointF != null) {
                    surfaceCropFilter.A0N((int) pointF.x, (int) pointF.y, rect, i);
                }
                Float f11 = r5.A0A;
                if (f11 != null) {
                    surfaceCropFilter.A0I(f11.floatValue());
                }
                Float f12 = r5.A0B;
                if (f12 != null) {
                    surfaceCropFilter.A0J(f12.floatValue());
                }
                Float f13 = r5.A0C;
                if (f13 != null) {
                    surfaceCropFilter.A0K(f13.floatValue());
                }
                Integer num4 = r5.A0O;
                if (num4 != null) {
                    int intValue = num4.intValue();
                    synchronized (surfaceCropFilter) {
                        surfaceCropFilter.A06.A07 = intValue;
                        SurfaceCropFilter.A09(surfaceCropFilter);
                    }
                }
                igFilterGroup.A05(1, surfaceCropFilter);
                igFilterGroup.A06(1, true);
                AnonymousClass0C1 r1 = this.A09;
                IgFilterGroup igFilterGroup2 = photoSession.A04;
                AnonymousClass81O AHx = AHx(photoSession.A07);
                AnonymousClass82K AP9 = AP9(photoSession.A07);
                CropInfo cropInfo = photoSession.A03;
                C88953tG.A04(r1, igFilterGroup2, AHx, AP9, cropInfo.A01, cropInfo.A00, cropInfo.A02, photoSession.A01);
            }
            if (!z) {
                photoSession.A05 = photoSession.A04.A04();
            }
        }
        if (z) {
            ((SurfaceCropFilter) photoSession.A04.A03(1)).A0A = true;
        }
    }

    private void A08(boolean z, PendingMedia pendingMedia, PendingMedia pendingMedia2, String str) {
        String str2;
        if (z) {
            str2 = pendingMedia.A1g;
        } else {
            str2 = pendingMedia.A1v;
        }
        C05700Lp.A00().ADc(new AnonymousClass0KF(str2, str, new WeakReference(new C185977x0(this, z, pendingMedia2, str))));
    }

    private void A09(CreationState[] creationStateArr) {
        if (this.A0D == null) {
            C185607wO r3 = new C185607wO(this.A09, creationStateArr);
            this.A0D = r3;
            this.A03 = new C185557wH(this, this.A09, A05(), AJ7());
            CreationState creationState = CreationState.CAPTURE;
            Class<C186247xS> cls = C186247xS.class;
            r3.A01(creationState, cls, CreationState.PHOTO_EDIT);
            r3.A01(creationState, C186117xF.class, CreationState.CROP);
            r3.A01(CreationState.CROP, cls, CreationState.PHOTO_EDIT);
            CreationState creationState2 = CreationState.PHOTO_EDIT;
            Class<C186267xU> cls2 = C186267xU.class;
            r3.A01(creationState2, cls2, CreationState.ADJUST);
            Class<C186327xa> cls3 = C186327xa.class;
            r3.A01(creationState2, cls3, CreationState.MANAGE);
            Class<C161146uA> cls4 = C161146uA.class;
            CreationState creationState3 = CreationState.SHARE;
            r3.A01(creationState2, cls4, creationState3);
            CreationState creationState4 = CreationState.CAPTURE;
            Class<C183637so> cls5 = C183637so.class;
            r3.A01(creationState4, cls5, creationState3);
            r3.A01(creationState4, C182627r2.class, CreationState.MANAGE_DRAFTS);
            r3.A01(CreationState.MANAGE_DRAFTS, cls5, CreationState.SHARE);
            CreationState creationState5 = CreationState.CAPTURE;
            Class<C186227xQ> cls6 = C186227xQ.class;
            CreationState creationState6 = CreationState.VIDEO_EDIT;
            r3.A01(creationState5, cls6, creationState6);
            CreationState creationState7 = CreationState.VIDEO_CROP;
            r3.A01(creationState7, cls6, creationState6);
            CreationState creationState8 = CreationState.CAPTURE;
            r3.A01(creationState8, C186167xK.class, creationState7);
            CreationState creationState9 = CreationState.VIDEO_EDIT;
            r3.A01(creationState9, cls2, CreationState.ADJUST);
            r3.A01(creationState9, cls4, CreationState.SHARE);
            r3.A01(creationState9, cls3, CreationState.MANAGE);
            r3.A01(CreationState.PREPARE_VIDEO_EDIT, cls6, CreationState.VIDEO_EDIT);
            r3.A01(creationState8, C186257xT.class, CreationState.ALBUM_EDIT);
            CreationState creationState10 = CreationState.ALBUM_EDIT;
            Class<C186237xR> cls7 = C186237xR.class;
            r3.A01(creationState10, cls7, CreationState.PHOTO_EDIT);
            Class<C186217xP> cls8 = C186217xP.class;
            r3.A01(creationState10, cls8, CreationState.VIDEO_EDIT);
            r3.A01(creationState10, cls4, CreationState.SHARE);
            r3.A01(creationState10, C186317xZ.class, CreationState.GALLERY_PICKER);
            r3.A01(creationState10, cls2, CreationState.ADJUST);
            CreationState creationState11 = CreationState.SHARE;
            r3.A01(creationState11, C161266uM.class, CreationState.LOCATION_TAG);
            r3.A01(creationState11, C185997x2.class, CreationState.ADVANCED_SETTINGS);
            Class<C185987x1> cls9 = C185987x1.class;
            CreationState creationState12 = CreationState.BRANDED_CONTENT_TAG;
            r3.A01(creationState11, cls9, creationState12);
            Class<C145196Ir> cls10 = C145196Ir.class;
            CreationState creationState13 = CreationState.BRANDED_CONTENT_TAGGED_BUSINESS_PARTNER;
            r3.A01(creationState11, cls10, creationState13);
            r3.A01(creationState12, cls10, creationState13);
            r3.A01(creationState13, cls9, creationState12);
            CreationState creationState14 = CreationState.ADVANCED_SETTINGS;
            r3.A01(creationState14, cls9, creationState12);
            r3.A01(creationState14, C145096Ih.class, CreationState.BRANDED_CONTENT_TAG_OPT_IN);
            r3.A01(creationState11, cls7, CreationState.PHOTO_EDIT);
            r3.A01(creationState11, cls8, CreationState.VIDEO_EDIT);
            r3.A01(creationState11, C186307xY.class, CreationState.ALBUM_EDIT);
            r3.A01(creationState11, C161176uD.class, CreationState.THUMBNAIL_VIEW);
            CreationState creationState15 = CreationState.ADVANCED_SETTINGS;
            r3.A01(creationState15, C145086Ig.class, CreationState.LIMIT_LOCATIONS);
            r3.A01(creationState15, C145106Ii.class, CreationState.ACCESSIBILITY_SETTINGS);
            C23300zv.A00(this.A09).A02(C185947ww.class, this.A0D);
            this.A0D.A00(this);
            for (C11200ea A002 : this.A0N) {
                this.A0D.A00(A002);
            }
            return;
        }
        throw new RuntimeException("State machine already initialised.");
    }

    public final AnonymousClass2L0 A0O() {
        if (this.A0H == null) {
            this.A0H = new AnonymousClass2L0((ViewStub) findViewById(C0003R.C0005id.snack_bar_stub));
        }
        return this.A0H;
    }

    public final void A0P() {
        if (this.A0B != null) {
            CreationState creationState = (CreationState) this.A0D.A02.peek();
            if (creationState == CreationState.ADJUST || creationState == CreationState.ALBUM_EDIT || creationState == CreationState.PHOTO_EDIT || creationState == CreationState.VIDEO_EDIT || creationState == CreationState.PREPARE_VIDEO_EDIT || creationState == CreationState.MANAGE || creationState == CreationState.SHARE || creationState == CreationState.MANAGE_DRAFTS || creationState == CreationState.ADVANCED_SETTINGS || creationState == CreationState.LIMIT_LOCATIONS || creationState == CreationState.BRANDED_CONTENT_TAG_OPT_IN || creationState == CreationState.ACCESSIBILITY_SETTINGS) {
                this.A0B.setVisibility(0);
            } else {
                this.A0B.setVisibility(4);
            }
        }
    }

    public final void A8C() {
        C17870qw r1 = this.A08;
        r1.A08.A02.A02();
        C42571sZ r12 = r1.A08.A02;
        synchronized (r12) {
            AnonymousClass8G9 r0 = r12.A02;
            if (r0 != null) {
                r0.Bu6();
            }
        }
    }

    public final void A95() {
        PendingMediaStoreSerializer.A00(this.A09).A01();
    }

    public final void A9k(List list, boolean z) {
        Location location;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new GalleryItem((Medium) it.next()));
        }
        if (arrayList.size() == 1) {
            Medium medium = ((GalleryItem) arrayList.get(0)).A01;
            if (medium.A05()) {
                if (medium.A0W) {
                    location = new Location("photo");
                    double[] dArr = {medium.A00, medium.A01};
                    location.setLatitude(dArr[0]);
                    location.setLongitude(dArr[1]);
                } else {
                    location = null;
                }
                if ("image/jpeg".equals(medium.A03())) {
                    String str = medium.A0P;
                    String str2 = str;
                    A06(this, str2, location, (CropInfo) null, medium.AUk(), 0, medium.A0Q, str, medium.A0F, medium.A0I, medium.A0J, medium.A0L);
                    return;
                }
                A0N(new C183657sq(this, medium, location));
            } else if (medium.AiO()) {
                String str3 = medium.A0P;
                Context applicationContext = getApplicationContext();
                C191048Ep A002 = C191048Ep.A00(str3, 0);
                if (C107894ks.A00(new C169147Kq(this), A002, true, true)) {
                    CreationSession AJ7 = AJ7();
                    PendingMedia A003 = C183677ss.A00(applicationContext, 0);
                    if (AJ7 != null) {
                        AJ7.A0I(str3);
                        AJ7.A0G(A003.A1h);
                    }
                    String str4 = medium.A0Q;
                    if (str4 != null) {
                        A003.A1y = str4;
                    }
                    String str5 = medium.A0J;
                    if (str5 != null) {
                        A003.A1P = str5;
                    }
                    String str6 = medium.A0I;
                    if (str6 != null) {
                        A003.A1Q = str6;
                    }
                    String str7 = medium.A0F;
                    if (str7 != null) {
                        A003.A1b = str7;
                        String str8 = medium.A0L;
                        if (str8 != null) {
                            A003.A1a = str8;
                        }
                    }
                    Bq5(A003);
                    C183677ss.A02(A002, A003, AJ7(), 1.0f);
                    C185947ww.A00(this.A09, new C186227xQ());
                }
            }
        } else {
            C182977rh A004 = C182977rh.A00();
            Map map = A004.A02;
            HashMap hashMap = new HashMap();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Medium medium2 = (Medium) it2.next();
                GalleryPreviewInfo galleryPreviewInfo = (GalleryPreviewInfo) map.get(medium2.AOA());
                if (galleryPreviewInfo == null) {
                    galleryPreviewInfo = new GalleryPreviewInfo();
                    galleryPreviewInfo.A02 = AnonymousClass0P6.A04(this).getAbsolutePath();
                }
                ExifImageData exifImageData = new ExifImageData();
                double d = medium2.A01;
                exifImageData.A02 = Double.valueOf(new double[]{medium2.A00, d}[0]);
                exifImageData.A01 = Double.valueOf(d);
                exifImageData.A00 = medium2.AUk();
                galleryPreviewInfo.A01 = exifImageData;
                float A012 = AJ7().A01();
                int i = medium2.A09;
                int i2 = medium2.A04;
                if (medium2.A05() && (i == 0 || i2 == 0)) {
                    BitmapFactory.decodeFile(medium2.A0P, options);
                    i = options.outWidth;
                    i2 = options.outHeight;
                }
                galleryPreviewInfo.A00 = C88633sj.A00(i, i2, (Rect) null, exifImageData.A00, false, A012);
                hashMap.put(medium2.AOA(), galleryPreviewInfo);
            }
            HashMap hashMap2 = new HashMap();
            A004.A02 = hashMap2;
            hashMap2.putAll(hashMap);
            float A013 = AJ7().A01();
            ArrayList arrayList2 = arrayList;
            float f = A013;
            this.A0C.A03(arrayList2, A013, f, z, C182977rh.A00().A02, new HashMap());
            C181987pp.A01(this.A09).A06(8, -1);
        }
    }

    public final void ABp(String str) {
        AnonymousClass84V r0;
        C187467zS r1 = (C187467zS) this.A06.A05.remove(str);
        if (r1 != null && (r0 = r1.A01) != null) {
            r0.A00();
            r1.A01 = null;
        }
    }

    public final void ABr(String str) {
        C88843t5 r0 = (C88843t5) this.A06.A06.remove(str);
        if (r0 != null) {
            r0.A0G.BdI((Object) null);
        }
    }

    public final C187467zS AFg(String str, String str2) {
        C185567wI r2 = this.A06;
        if (!r2.A05.containsKey(str)) {
            r2.A05.put(str, new C187467zS(str2, r2));
        }
        return (C187467zS) r2.A05.get(str);
    }

    public final AnonymousClass81O AHx(String str) {
        return this.A06.A00(str);
    }

    public final C187027yj ALn(String str) {
        if (!this.A0O.containsKey(str)) {
            this.A0O.put(str, new C187027yj(this.A09, AHx(str)));
        }
        return (C187027yj) this.A0O.get(str);
    }

    public final C181427ot AMT() {
        if (this.A0G == null) {
            this.A0G = new C181427ot(this, this.A09);
        }
        return this.A0G;
    }

    public final C175327eH AMU() {
        if (this.A0E == null) {
            this.A0E = new C175327eH(this, AU3());
        }
        return this.A0E;
    }

    public final AnonymousClass82K AP9(String str) {
        return this.A06.A01(str);
    }

    public final PendingMedia ARi(String str) {
        return PendingMediaStore.A01(this.A09).A04(str);
    }

    public final C175317eG AU3() {
        if (this.A0F == null) {
            this.A0F = new C175317eG(this);
        }
        return this.A0F;
    }

    public final C88843t5 AU5(String str) {
        C185567wI r1 = this.A06;
        if (!r1.A06.containsKey(str)) {
            r1.A03(str);
        }
        return (C88843t5) r1.A06.get(str);
    }

    public final void ApK() {
        runOnUiThread(new C185957wy(this));
    }

    public final void ApM(Uri uri) {
        C185867wo A002;
        C137535to.A01(Constants.A0M, this.A09);
        if (this.A04.A0A == Constants.ONE) {
            A002 = new C185867wo(this);
            A002.A00.putParcelable("CropFragment.imageUri", uri);
            A002.A00.putBoolean("CropFragment.isAvatar", true);
            A002.A00.putInt("CropFragment.largestDimension", 1080);
        } else {
            A002 = C185867wo.A00(this, uri);
        }
        AJ7().A02 = 0;
        C185947ww.A00(this.A09, new C186117xF(A002.A00));
    }

    public final void Apd(PendingMedia pendingMedia) {
        C185947ww.A00(this.A09, new C186227xQ());
    }

    public final void ArV(boolean z) {
        ArrayList<PendingMedia> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (MediaSession mediaSession : this.A04.A08()) {
            PendingMedia ARi = ARi(mediaSession.A01());
            ARi.A1v = mediaSession.A00();
            if (mediaSession.A02 == Constants.ONE) {
                ARi.A04 = this.A04.A01();
            }
            arrayList.add(ARi);
            arrayList2.add(ARi.A1e);
        }
        PendingMedia A042 = PendingMediaStore.A01(this.A09).A04(this.A04.A0B);
        C17870qw r4 = this.A08;
        C17870qw.A06(r4, A042);
        A042.A0k(true);
        for (PendingMedia pendingMedia : arrayList) {
            pendingMedia.A1q = A042.A1h;
            pendingMedia.A0k(true);
            pendingMedia.A2t = true;
        }
        A042.A0j(arrayList);
        r4.A01.A01();
        if (z) {
            this.A04.A0F(this);
            C182977rh A002 = C182977rh.A00();
            ArrayList arrayList3 = new ArrayList();
            A002.A01 = arrayList3;
            arrayList3.addAll(arrayList2);
        }
        ApK();
    }

    public final void BKl() {
        String str;
        C175327eH r0 = this.A0E;
        if (r0 != null) {
            r0.A00();
            this.A0E.A02(false);
        }
        for (MediaSession mediaSession : this.A04.A08()) {
            PendingMedia ARi = ARi(mediaSession.A01());
            if (ARi.A2u && !ARi.A2t) {
                PendingMedia A012 = PendingMedia.A01(ARi, String.valueOf(System.nanoTime()));
                A012.A1q = null;
                ARi.A1e = A012.getId();
                PendingMediaStore.A01(this.A09).A0D(A012.A1h, A012);
                Integer num = mediaSession.A02;
                if (num == Constants.ZERO) {
                    File A002 = AnonymousClass0NR.A00(this);
                    if (A002 != null) {
                        str = A002.getAbsolutePath();
                    } else {
                        str = "";
                    }
                    A08(false, ARi, A012, str);
                } else if (num == Constants.ONE) {
                    VideoSession videoSession = mediaSession.A01;
                    int i = videoSession.A08;
                    int i2 = videoSession.A03;
                    int i3 = videoSession.A02;
                    int i4 = videoSession.A01;
                    boolean z = videoSession.A0D;
                    A012.A13.A01 = i;
                    A012.A05 = i2;
                    ClipInfo clipInfo = A012.A0l;
                    clipInfo.A08 = i3;
                    clipInfo.A06 = i4;
                    A012.A33 = z;
                    A08(true, ARi, A012, C26101Br.A00(this).getAbsolutePath());
                }
            }
        }
        C23300zv.A00(this.A09).A04(new C186297xX());
    }

    public final void BZV(C11200ea r2) {
        C185607wO r0 = this.A0D;
        if (r0 == null) {
            this.A0N.add(r2);
        } else {
            r0.A00(r2);
        }
    }

    public final void BZq(Runnable runnable) {
        PendingMediaStoreSerializer.A00(this.A09).A03(runnable);
    }

    public final void BeR() {
        BZq(new C185577wJ(this));
    }

    public final void Bpm(PendingMedia pendingMedia) {
        this.A08.A0D(pendingMedia);
    }

    public final void Bq5(PendingMedia pendingMedia) {
        this.A08.A0E(pendingMedia);
    }

    public final void BtY(PendingMedia pendingMedia) {
        pendingMedia.A0c(ShareType.UNKNOWN);
        C18900sb.A00.A02(pendingMedia.A24, this.A09);
        this.A08.A0F(pendingMedia);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (((p000X.AnonymousClass1HK) r1).onBackPressed() == false) goto L_0x0021;
     */
    public final void onBackPressed() {
        boolean z;
        boolean z2;
        String str;
        C181987pp A012 = C181987pp.A01(this.A09);
        C185557wH r4 = this.A03;
        C185607wO r7 = this.A0D;
        AnonymousClass1HD A0L2 = r4.A01.A0L(C0003R.C0005id.layout_container_main);
        if (A0L2 instanceof AnonymousClass1HK) {
            z = true;
        }
        z = false;
        if (z) {
            z2 = true;
        } else {
            if (((CreationState) r7.A02.peek()) == CreationState.SHARE) {
                C182887rW A013 = C182887rW.A01();
                AnonymousClass0C1 r3 = r4.A04;
                CreationSession creationSession = r4.A03;
                if (creationSession.A0G) {
                    str = "gallery";
                } else if (creationSession.A0M()) {
                    str = "edit_carousel";
                } else if (creationSession.A0N()) {
                    str = "edit_photo";
                } else {
                    str = "edit_video";
                }
                A013.A07(r3, str);
                if (r4.A03.A0G) {
                    ((C184017td) r4.A00).BeR();
                    AnonymousClass5F9.A01(r4.A00, C0003R.string.changes_saved, 0);
                    z2 = true;
                }
            }
            boolean z3 = true;
            if (r7.A02.size() <= 1) {
                z3 = false;
            }
            if (z3) {
                C185947ww.A00(r4.A04, new C145206Is());
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (!z2) {
            int A0I2 = A05().A0I();
            super.onBackPressed();
            if (A0I2 == 0) {
                int i = 4;
                if (A012.A03) {
                    i = 3;
                }
                A012.A05(i);
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C23300zv r1;
        C185907ws r0;
        if (i == 27) {
            r1 = C23300zv.A00(this.A09);
            r0 = C185907ws.A04;
        } else if (i == 80) {
            r1 = C23300zv.A00(this.A09);
            r0 = C185907ws.A01;
        } else if (i == 130) {
            r1 = C23300zv.A00(this.A09);
            r0 = C185907ws.A03;
        } else if (i == 168) {
            r1 = C23300zv.A00(this.A09);
            r0 = C185907ws.A05;
        } else if (i != 169) {
            return super.onKeyDown(i, keyEvent);
        } else {
            r1 = C23300zv.A00(this.A09);
            r0 = C185907ws.A06;
        }
        r1.BXT(r0);
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 130) {
            return super.onKeyUp(i, keyEvent);
        }
        C23300zv.A00(this.A09).BXT(C185907ws.A02);
        return true;
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.A0P.add(Integer.valueOf(i));
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    private void A00() {
        if (AJ7().A09.A06) {
            C185947ww.A00(this.A09, new C186247xS());
        } else {
            C160836td.A00(this.A04, this, false, this, this.A09);
        }
    }

    private void A01(Uri uri, String str) {
        A04(this);
        Context applicationContext = getApplicationContext();
        int intExtra = getIntent().getIntExtra("mediaSource", 2);
        CreationSession AJ7 = AJ7();
        String uri2 = uri.toString();
        PendingMedia A002 = C183677ss.A00(applicationContext, intExtra);
        if (AJ7 != null) {
            AJ7.A0I(uri2);
            AJ7.A0G(A002.A1h);
        }
        A002.A1y = str;
        Bq5(A002);
    }

    public static void A04(MediaCaptureActivity mediaCaptureActivity) {
        mediaCaptureActivity.AJ7().A0C();
        mediaCaptureActivity.A0O.clear();
        if (C26901Fs.A00(mediaCaptureActivity.A09, Constants.ZERO).A00) {
            C187517zX.A03(mediaCaptureActivity.A09, mediaCaptureActivity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r14 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r14 != null) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    public static void A06(MediaCaptureActivity mediaCaptureActivity, String str, Location location, CropInfo cropInfo, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7) {
        C185077vU A002;
        if (C182887rW.A01().A0N) {
            C182887rW.A01().A05(mediaCaptureActivity.A09, "edit_photo");
        }
        PendingMedia A022 = PendingMedia.A02(String.valueOf(System.nanoTime()));
        if (str4 != null) {
            A022.A1b = str4;
        } else {
            if (!(str3 == null || (A002 = C85273n5.A00(str3, mediaCaptureActivity.A09)) == null)) {
                String str8 = A002.A01;
                if (str8 != null) {
                    A022.A1b = str8;
                }
                String str9 = A002.A02;
                if (str9 != null) {
                    A022.A1P = str9;
                } else {
                    A022.A1P = C87453ql.NORMAL.A04;
                }
                str7 = A002.A03;
            }
            if (str5 != null) {
                A022.A1Q = str5;
            }
            if (str6 != null) {
                A022.A1P = str6;
            }
            A022.A2G = C206718ty.A00(str);
            A022.A1m = mediaCaptureActivity.AJ7().A0C;
            A022.A1n = str;
            if (str3 != null) {
                A022.A1o = str3;
            }
            A022.A1y = mediaCaptureActivity.getIntent().getStringExtra(AnonymousClass0C5.$const$string(37));
            if (str2 != null) {
                A022.A1y = str2;
            }
            mediaCaptureActivity.Bpm(A022);
            CreationSession AJ7 = mediaCaptureActivity.AJ7();
            AJ7.A0H(str);
            PhotoSession photoSession = AJ7.A07.A00;
            photoSession.A03 = cropInfo;
            photoSession.A01 = i;
            AJ7.A0E(location);
            AJ7.A02 = i2;
            AJ7.A0G(A022.A1h);
            mediaCaptureActivity.A00();
        }
        A022.A1a = str7;
        if (str5 != null) {
        }
        if (str6 != null) {
        }
        A022.A2G = C206718ty.A00(str);
        A022.A1m = mediaCaptureActivity.AJ7().A0C;
        A022.A1n = str;
        if (str3 != null) {
        }
        A022.A1y = mediaCaptureActivity.getIntent().getStringExtra(AnonymousClass0C5.$const$string(37));
        if (str2 != null) {
        }
        mediaCaptureActivity.Bpm(A022);
        CreationSession AJ72 = mediaCaptureActivity.AJ7();
        AJ72.A0H(str);
        PhotoSession photoSession2 = AJ72.A07.A00;
        photoSession2.A03 = cropInfo;
        photoSession2.A01 = i;
        AJ72.A0E(location);
        AJ72.A02 = i2;
        AJ72.A0G(A022.A1h);
        mediaCaptureActivity.A00();
    }

    public final C06590Pq A0L() {
        return this.A09;
    }

    public final void A8E() {
        if (AnonymousClass1H4.A01(A05())) {
            CreationSession creationSession = this.A04;
            if (creationSession.A0A == Constants.ONE) {
                setResult(-1, new Intent(creationSession.A07()));
                finish();
                return;
            }
            C185947ww.A00(this.A09, new C161146uA());
        }
    }

    public final CreationSession AJ7() {
        return this.A04;
    }

    public final C187057ym AKF() {
        return this.A05;
    }

    public final MediaEditActionBar APl() {
        return (MediaEditActionBar) findViewById(C0003R.C0005id.action_bar);
    }

    public final C185347vv ARX() {
        return this.A07;
    }

    public final AnonymousClass0C1 AZl() {
        return this.A09;
    }

    public final void Apc(Uri uri) {
        A01(uri, uri.getPath());
        C185947ww.A00(this.A09, new C186167xK());
    }

    public final void AuW() {
        onBackPressed();
    }

    public final void Aub() {
        onBackPressed();
    }

    public final void B4e(Uri uri, Location location, CropInfo cropInfo, int i, int i2, String str) {
        A06(this, uri.getPath(), location, cropInfo, i, i2, (String) null, str, (String) null, (String) null, (String) null, (String) null);
    }

    public final void BEG(String str, Location location, int i, int i2) {
        if (AnonymousClass1H4.A01(A05())) {
            PendingMedia A022 = PendingMedia.A02(String.valueOf(System.nanoTime()));
            A022.A2G = C206718ty.A00(str);
            A022.A1o = str;
            Bpm(A022);
            CreationSession AJ7 = AJ7();
            AJ7.A07.A00.A01 = i;
            AJ7.A0E(location);
            AJ7.A02 = i2;
            AJ7.A0G(A022.A1h);
            C26441Dh.A00(this.A09).A03(this, "camera_capture");
            A00();
        }
    }

    public final void BpT(PendingMedia pendingMedia, List list) {
        String A0G2 = pendingMedia.A0G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((PendingMedia) it.next()).A1U = A0G2;
        }
        C17870qw r4 = this.A08;
        r4.A00.A0B(MediaType.PHOTO);
        r4.A00.A0B(MediaType.VIDEO);
        r4.A00.A0D(pendingMedia.A1h, pendingMedia);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PendingMedia pendingMedia2 = (PendingMedia) it2.next();
            r4.A00.A0D(pendingMedia2.A1h, pendingMedia2);
        }
        r4.A01.A01();
    }

    public final void Btb(PendingMedia pendingMedia) {
        pendingMedia.A04 = AJ7().A07.A01.A00;
    }

    public final void finish() {
        super.finish();
        if (((Boolean) AnonymousClass0L6.A02(this.A09, AnonymousClass0L7.MOTION, "modal_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            overridePendingTransition(0, C0003R.anim.modal_slide_down_exit);
        } else if (this.A0A) {
            overridePendingTransition(0, 0);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass1HD A0L2;
        super.onActivityResult(i, i2, intent);
        C27341Hl r0 = this.A02;
        if (r0 != null) {
            r0.onActivityResult(i, i2, intent);
        }
        if (this.A0P.remove(Integer.valueOf(i)) && (A0L2 = A05().A0L(C0003R.C0005id.layout_container_main)) != null) {
            A0L2.onActivityResult(i, i2, intent);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(-1217937685);
        C181987pp A012 = C181987pp.A01(this.A09);
        C181987pp.A02(A012, C181987pp.A00(A012, "ig_feed_gallery_app_background", 2));
        AnonymousClass0Z0.A0A(1115952133, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0Z0.A03(-1933121804);
        C181987pp A012 = C181987pp.A01(this.A09);
        C181987pp.A02(A012, C181987pp.A00(A012, "ig_feed_gallery_app_foreground", 2));
        AnonymousClass0Z0.A0A(-1802357863, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0067, code lost:
        if ((r11 - p000X.C12800hP.A00) < 86400000) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (p000X.AnonymousClass1H3.A04(r4.A09) == false) goto L_0x002e;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        int i;
        CreationState creationState;
        C27341Hl mediaCaptureFragment;
        int A002 = AnonymousClass0Z0.A00(626492978);
        this.A09 = AnonymousClass0J1.A06(getIntent().getExtras());
        if (getIntent().getBooleanExtra("newGalleryEligibleEntryPoint", false)) {
            z = true;
        }
        z = false;
        this.A0A = z;
        C181987pp.A01(this.A09).A04 = true;
        C15330mi.A01(this);
        AnonymousClass0C1 r2 = this.A09;
        if (C12800hP.A0J(r2)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (C12800hP.A00 == -1) {
                C12800hP.A00 = C42251s2.A01(r2).getLong("last_permissions_check", 0);
            }
            z2 = true;
        }
        z2 = false;
        if (z2) {
            C486028s r1 = new C486028s();
            r1.A02 = Constants.A0N;
            r1.A05 = "me/permissions/";
            r1.A03 = C12800hP.A02(r2);
            r1.A04(C185657wT.class);
            C17850qu A012 = r1.A01();
            A012.A00 = new C185617wP(r2);
            C12800hP.A01.schedule(A012);
        }
        getWindow().setFormat(1);
        getWindow().addFlags(4096);
        AnonymousClass1X4.A02(this, AnonymousClass1BA.A01(this, C0003R.attr.statusBarBackgroundColor));
        setContentView((int) C0003R.layout.activity_media_host);
        View view = null;
        if (AnonymousClass1BA.A01(this, C0003R.attr.actionBarShadowVisibility) == 0) {
            view = findViewById(C0003R.C0005id.action_bar_shadow);
        }
        this.A00 = view;
        this.A0B = findViewById(C0003R.C0005id.media_edit_action_bar_wrapper);
        C187057ym r12 = new C187057ym(this, this.A09, this);
        this.A05 = r12;
        this.A06 = new C185567wI(this, this, r12);
        Bundle bundle2 = bundle;
        if (bundle != null) {
            this.A04 = (CreationSession) bundle2.getParcelable("MediaCaptureActivity.CREATION_SESSION");
            CreationSession AJ7 = AJ7();
            if (AJ7.A0N()) {
                IgFilterGroup A052 = AJ7.A05();
                String A072 = AJ7.A07();
                if (A052 != null) {
                    A052.A03 = new C88993tK();
                    C88953tG.A03(this.A09, A052, AHx(A072), AP9(A072));
                }
            }
            Parcelable[] parcelableArray = bundle2.getParcelableArray("MediaCaptureActivity.BUNDLE_STATE");
            A09((CreationState[]) Arrays.copyOf(parcelableArray, parcelableArray.length, CreationState[].class));
        } else {
            this.A04 = new CreationSession();
            synchronized (C182977rh.class) {
                if (C182977rh.A03 != null) {
                    C182977rh.A03 = null;
                }
            }
            Integer num = Constants.ZERO(3)[getIntent().getIntExtra("captureType", 0)];
            CreationSession AJ72 = AJ7();
            AJ72.A0A = num;
            AJ72.A09 = (MediaCaptureConfig) getIntent().getParcelableExtra("captureConfig");
            C16180oA.A00(this.A09).A00.edit().putString("has_flash_on", "off").apply();
        }
        if (((Boolean) AnonymousClass0L6.A03(this.A09, AnonymousClass0L7.PANORAMA_CREATION_CONFIG, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            this.A07 = new C185347vv(AJ7());
        }
        super.onCreate(bundle2);
        this.A08 = C17870qw.A01(this, this.A09, "MediaCaptureActivity");
        if (AJ7().A0A == Constants.ONE) {
            APl().A01 = true;
            AJ7().A06 = C183027rm.SQUARE;
        }
        if (bundle == null) {
            Intent intent = getIntent();
            boolean hasExtra = intent.hasExtra("isCrop");
            boolean booleanExtra = intent.getBooleanExtra("autoCenterCrop", false);
            if (intent.hasExtra("videoFilePath")) {
                if (intent.getParcelableExtra("videoFilePath") == null) {
                    creationState = CreationState.CAPTURE;
                    AnonymousClass5F9.A01(this, C0003R.string.external_video_share_error, 0);
                } else if (booleanExtra) {
                    creationState = CreationState.PREPARE_VIDEO_EDIT;
                } else {
                    creationState = CreationState.VIDEO_CROP;
                }
            } else if (!hasExtra) {
                creationState = CreationState.CAPTURE;
            } else if (booleanExtra) {
                creationState = CreationState.PHOTO_EDIT;
            } else {
                creationState = CreationState.CROP;
            }
            if (creationState == CreationState.CAPTURE) {
                CreationSession AJ73 = AJ7();
                if (AJ73.A09 == null) {
                    AJ73.A09 = new MediaCaptureConfig(new C31161Wr(Constants.ZERO));
                }
            }
            if (creationState == CreationState.PREPARE_VIDEO_EDIT) {
                A09(new CreationState[]{creationState});
                A9k(Collections.singletonList(Medium.A00(new File(((Uri) intent.getParcelableExtra("videoFilePath")).getPath()), 3, 0)), false);
            } else {
                Intent intent2 = getIntent();
                int ordinal = creationState.ordinal();
                String $const$string = AnonymousClass0C5.$const$string(37);
                switch (ordinal) {
                    case 7:
                        if (this.A0A) {
                            C16330oQ.A00.A03();
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("arg_add_to_album", false);
                            mediaCaptureFragment = new GalleryHomeTabbedFragment();
                            mediaCaptureFragment.setArguments(bundle3);
                        } else {
                            C16330oQ.A00.A03();
                            mediaCaptureFragment = new MediaCaptureFragment();
                            Bundle bundle4 = new Bundle();
                            bundle4.putBoolean("standalone_mode", false);
                            mediaCaptureFragment.setArguments(bundle4);
                        }
                        this.A02 = mediaCaptureFragment;
                        break;
                    case 8:
                        C16330oQ.A00.A03();
                        mediaCaptureFragment = new C183397sO();
                        mediaCaptureFragment.setArguments(intent2.getExtras());
                        break;
                    case 9:
                        boolean booleanExtra2 = intent2.getBooleanExtra("videoRectangleCrop", false);
                        A01((Uri) intent2.getParcelableExtra("videoFilePath"), intent2.getStringExtra($const$string));
                        if (booleanExtra2) {
                            AJ7().A06 = C183027rm.RECTANGULAR;
                        }
                        C16330oQ.A00.A03();
                        AnonymousClass0C1 r0 = this.A09;
                        mediaCaptureFragment = new C183167s0();
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("IgSessionManager.SESSION_TOKEN_KEY", r0.getToken());
                        mediaCaptureFragment.setArguments(bundle5);
                        break;
                    case 16:
                        C16330oQ.A00.A03();
                        mediaCaptureFragment = new C186817yO();
                        Bundle bundle6 = new Bundle();
                        bundle6.putBoolean("standalone_mode", false);
                        mediaCaptureFragment.setArguments(bundle6);
                        Uri uri = (Uri) intent2.getParcelableExtra("CropFragment.imageUri");
                        PendingMedia A022 = PendingMedia.A02(String.valueOf(System.nanoTime()));
                        Bpm(A022);
                        A022.A2G = C206718ty.A00(uri.getPath());
                        A022.A1y = intent2.getStringExtra($const$string);
                        int intExtra = intent2.getIntExtra("mediaOrientation", 0);
                        A022.A06 = intExtra;
                        A04(this);
                        CreationSession AJ74 = AJ7();
                        AJ74.A0H(uri.getPath());
                        AJ74.A02 = 2;
                        AJ74.A07.A00.A01 = intExtra;
                        AJ74.A0G(A022.A1h);
                        break;
                    default:
                        mediaCaptureFragment = null;
                        break;
                }
                if (mediaCaptureFragment == null) {
                    finish();
                    i = -1280003574;
                    AnonymousClass0Z0.A07(i, A002);
                }
                A09(new CreationState[]{creationState});
                Bundle bundle7 = mediaCaptureFragment.mArguments;
                if (bundle7 == null) {
                    bundle7 = new Bundle();
                }
                bundle7.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A09.getToken());
                mediaCaptureFragment.setArguments(bundle7);
                AnonymousClass1H6 A0Q = A05().A0Q();
                if (((Boolean) AnonymousClass0L6.A02(this.A09, AnonymousClass0L7.MOTION, AnonymousClass0C5.$const$string(59), false, (AnonymousClass04H) null)).booleanValue()) {
                    overridePendingTransition(C0003R.anim.modal_slide_up_enter, C0003R.anim.modal_empty_animation);
                }
                A0Q.A04(C0003R.C0005id.layout_container_main, mediaCaptureFragment, "MediaCaptureActivity");
                A0Q.A09();
                A05().A0U();
            }
        }
        if (this.A0A) {
            this.A0C = new C183667sr(this, this.A09, AnonymousClass1L8.A00(this), AJ7(), this, this, this, (C182927rc) null);
        }
        Window window = getWindow();
        if (AnonymousClass0PB.A05()) {
            AnonymousClass0PB.A04(window.getAttributes(), "LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER");
        }
        AnonymousClass0Q7.A03().A0B(this);
        A0P();
        i = -1471242184;
        AnonymousClass0Z0.A07(i, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(1287033004);
        super.onDestroy();
        AnonymousClass0Q7.A03().A0D(this);
        if (C26901Fs.A00(this.A09, Constants.ZERO).A00) {
            C187517zX.A03(this.A09, this);
        }
        C23300zv A003 = C23300zv.A00(this.A09);
        A003.A03(C185947ww.class, this.A0D);
        A003.A03(C186077xB.class, this);
        C187057ym r2 = this.A05;
        r2.A03 = true;
        Integer num = r2.A02;
        if (num != null) {
            C187057ym.A01(r2, num);
        }
        AnonymousClass0ZA.A07(r2.A01, (Object) null);
        r2.A01 = null;
        this.A05 = null;
        this.A0O.clear();
        this.A03 = null;
        this.A06.A02();
        this.A06 = null;
        this.A0D = null;
        this.A02 = null;
        AnonymousClass0Z0.A07(-297892077, A002);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        IgFilterGroup A042;
        MediaSession mediaSession;
        ArrayList arrayList;
        int A032 = AnonymousClass0Z0.A03(1970603081);
        C186077xB r13 = (C186077xB) obj;
        int A033 = AnonymousClass0Z0.A03(267407777);
        DraggableContainer draggableContainer = (DraggableContainer) findViewById(C0003R.C0005id.root);
        if (C186197xN.A00.A06()) {
            draggableContainer.A03.A04();
            draggableContainer.A03.setVisibility(4);
            C185587wK r1 = C186197xN.A00;
            r1.A01();
            r1.A05(false);
            r1.A00 = null;
        }
        if (!draggableContainer.A02.isEmpty()) {
            draggableContainer.A02 = new Rect();
        }
        AnonymousClass1D9 r12 = this.A01;
        if (!(r12 == null || (arrayList = A05().A0A) == null)) {
            arrayList.remove(r12);
        }
        C185347vv r5 = this.A07;
        if (r5 != null) {
            CreationSession creationSession = r5.A01;
            if (creationSession.A0H && r13.A01 == CreationState.SHARE && r13.A02 == CreationState.PHOTO_EDIT && (mediaSession = r5.A00) != null) {
                creationSession.A0D();
                creationSession.A0E.add(mediaSession);
                creationSession.A07 = mediaSession;
                creationSession.A0F = false;
                r5.A00 = null;
            }
        }
        CreationState creationState = r13.A02;
        CreationState creationState2 = CreationState.CAPTURE;
        if (creationState != creationState2 && creationState != CreationState.CROP) {
            boolean z = true;
            if (this.A04.A0M()) {
                boolean z2 = r13.A00.A00 instanceof C183637so;
                CreationState creationState3 = r13.A01;
                if (creationState3 != CreationState.GALLERY_PICKER) {
                    z = false;
                }
                if ((creationState == CreationState.ALBUM_EDIT || z2) && (creationState3 == creationState2 || creationState3 == CreationState.VIDEO_EDIT || z || z2)) {
                    if (z) {
                        this.A06.A02();
                    }
                    for (MediaSession mediaSession2 : AJ7().A08()) {
                        Integer num = mediaSession2.A02;
                        if (num == Constants.ZERO) {
                            A07(mediaSession2.A00, z, true);
                        } else if (num == Constants.ONE) {
                            VideoSession videoSession = mediaSession2.A01;
                            PendingMedia ARi = ARi(videoSession.A0A);
                            C185567wI r10 = this.A06;
                            r10.A05.put(videoSession.A0A, new C187467zS(ARi.A1g, r10));
                            if (ARi.A2u && !z) {
                                videoSession.A00(ARi);
                                videoSession.A08 = ARi.A13.A01;
                                videoSession.A03 = ARi.A05;
                                ClipInfo clipInfo = ARi.A0l;
                                videoSession.A02 = clipInfo.A08;
                                videoSession.A01 = clipInfo.A06;
                                videoSession.A0D = ARi.A33;
                            }
                        }
                    }
                    if (z) {
                        CreationSession creationSession2 = this.A04;
                        for (MediaSession mediaSession3 : creationSession2.A0E) {
                            C183867tM r6 = (C183867tM) creationSession2.A0L.get(mediaSession3.A00());
                            if (mediaSession3.A02 == Constants.ZERO) {
                                PhotoSession photoSession = mediaSession3.A00;
                                if (r6 != null) {
                                    IgFilterGroup igFilterGroup = r6.A05;
                                    if (igFilterGroup == null) {
                                        AnonymousClass0QD.A01("MediaSessionState", "Called getFilterGroup() when filter group was null.");
                                        A042 = null;
                                    } else {
                                        A042 = igFilterGroup.A04();
                                    }
                                    if (A042 != null) {
                                        photoSession.A04 = A042;
                                    }
                                }
                            }
                        }
                        creationSession2.A0L.clear();
                    }
                    this.A04.A0F(this);
                }
            } else {
                CreationSession AJ7 = AJ7();
                if (AJ7.A0N()) {
                    boolean z3 = false;
                    if (creationState == CreationState.PHOTO_EDIT) {
                        z3 = true;
                    }
                    boolean z4 = false;
                    if (AU5(AJ7.A07()) != null) {
                        z4 = true;
                    }
                    CreationSession AJ72 = AJ7();
                    if (AJ72.A05() == null) {
                        z = false;
                    }
                    A07(AJ72.A04(AJ72.A07()), false, r13.A00.A00 instanceof C183637so);
                    if (z3) {
                        CreationSession AJ73 = AJ7();
                        if (AJ73.A05() == null) {
                            AnonymousClass0QD.A02("MediaCaptureActivity_InvalidFilterGroup", "Transition: " + r13.A01.ordinal() + " ImageRenderer: " + z4 + " FilterGroup: " + z + " Path: " + AJ73.A07());
                        }
                    }
                }
            }
        } else if (r13.A01 == CreationState.INIT) {
            A04(this);
            this.A06.A02();
        } else {
            C185647wS r14 = new C185647wS(this, r13);
            this.A01 = r14;
            A05().A0r(r14);
        }
        this.A03.A01(r13);
        View view = this.A00;
        if (view != null) {
            CreationState creationState4 = r13.A02;
            if (creationState4 != null) {
                switch (creationState4.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 6:
                    case 10:
                    case C120125Dh.VIEW_TYPE_SPINNER:
                    case C120125Dh.VIEW_TYPE_LINK:
                    case 15:
                    case 16:
                    case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                    case C120125Dh.VIEW_TYPE_BRANDING:
                        view.setVisibility(0);
                        break;
                }
            }
            view.setVisibility(8);
        }
        AnonymousClass0Z0.A0A(842412490, A033);
        AnonymousClass0Z0.A0A(-1284830972, A032);
    }

    public final void onPause() {
        int A002 = AnonymousClass0Z0.A00(45211756);
        super.onPause();
        C11130eT r2 = C11130eT.A01;
        r2.A03(C33441cv.class, this.A0L);
        r2.A03(C33451cw.class, this.A0I);
        r2.A03(C33461cx.class, this.A0M);
        r2.A03(C33471cy.class, this.A0J);
        r2.A03(C33481cz.class, this.A0K);
        AnonymousClass0Z0.A07(-1507695051, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0Z0.A00(-256134851);
        super.onResume();
        PendingMediaStore.A01(this.A09).A0A(getApplicationContext());
        C11130eT r2 = C11130eT.A01;
        r2.A02(C33441cv.class, this.A0L);
        r2.A02(C33451cw.class, this.A0I);
        r2.A02(C33461cx.class, this.A0M);
        r2.A02(C33471cy.class, this.A0J);
        r2.A02(C33481cz.class, this.A0K);
        AnonymousClass0Z0.A07(1296159166, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C185607wO r2 = this.A0D;
        CreationState[] creationStateArr = new CreationState[r2.A02.size()];
        r2.A02.copyInto(creationStateArr);
        bundle.putParcelableArray("MediaCaptureActivity.BUNDLE_STATE", creationStateArr);
        bundle.putParcelable("MediaCaptureActivity.CREATION_SESSION", AJ7());
    }
}
