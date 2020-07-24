package com.instagram.filterkit.filter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.math.Matrix4;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000X.AnonymousClass000;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass206;
import p000X.AnonymousClass20D;
import p000X.AnonymousClass20E;
import p000X.AnonymousClass7YE;
import p000X.AnonymousClass83B;
import p000X.AnonymousClass83C;
import p000X.AnonymousClass85B;
import p000X.C173147aY;
import p000X.C175597el;
import p000X.C1892986r;
import p000X.C205338qh;
import p000X.C89133th;
import p000X.C89433uD;
import p041pl.droidsonroids.gif.GifDecoder;
import p041pl.droidsonroids.gif.InputSource$FileSource;

public class RegionTrackingFilter implements IgFilter, Serializable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(332);
    public int A00;
    public boolean A01;
    public final Matrix4 A02 = new Matrix4();
    public final IdentityFilter A03;
    public final Context A04;
    public final AnonymousClass20D A05 = new AnonymousClass20D();
    public final AnonymousClass0C1 A06;
    public final List A07;
    public final Map A08 = new HashMap();
    public final Map A09 = new HashMap();
    public final Map A0A = new HashMap();
    public final Map A0B = new HashMap();
    public final Map A0C = new HashMap();

    public final boolean Ags() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    private Drawable A00(AnonymousClass206 r5) {
        if (this.A0B.containsKey(r5)) {
            return (Drawable) this.A0B.get(r5);
        }
        Drawable A002 = AnonymousClass7YE.A00(this.A04, r5.A01.A00(), true, this.A06);
        A002.setBounds(0, 0, A002.getIntrinsicWidth(), A002.getIntrinsicHeight());
        this.A0B.put(r5, A002);
        return A002;
    }

    public final void A8Y(C89433uD r3) {
        this.A03.A8Y(r3);
        for (C89133th cleanup : this.A0A.values()) {
            cleanup.cleanup();
        }
        for (C175597el r0 : this.A08.values()) {
            r0.A00.recycle();
        }
        for (AnonymousClass83B r02 : this.A09.values()) {
            r02.A00.recycle();
        }
        this.A0A.clear();
        this.A08.clear();
        this.A09.clear();
        this.A0B.clear();
    }

    public final boolean Ag0() {
        return this.A03.Ag0();
    }

    public final void AoY() {
        this.A03.AoY();
    }

    public final void Bbg(C89433uD r13, C89133th r14, AnonymousClass85B r15) {
        AnonymousClass20D r3;
        Bitmap bitmap;
        if (!this.A01) {
            this.A01 = true;
            for (int i = 0; i < this.A07.size(); i++) {
                AnonymousClass206 r32 = (AnonymousClass206) this.A07.get(i);
                this.A0C.put(r32, new TreeSet(r32.A04));
                switch (r32.A00.ordinal()) {
                    case 0:
                        this.A0A.put(r32, r13.A00(this, r32.A02));
                        break;
                    case 1:
                        String str = r32.A02;
                        boolean exists = new File(str).exists();
                        try {
                            String str2 = r32.A03;
                            if (!exists && str2 != null && ((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.INGEST_GIF_DOWNLOAD, "enable_gif_download", false, (AnonymousClass04H) null)).booleanValue()) {
                                AtomicReference atomicReference = new AtomicReference();
                                CountDownLatch countDownLatch = new CountDownLatch(1);
                                C205338qh.A00(this.A04).A02(str2, new AnonymousClass83C(this, atomicReference, countDownLatch));
                                countDownLatch.await(1, TimeUnit.MINUTES);
                                str = (String) atomicReference.get();
                            }
                            this.A08.put(r32, new C175597el(new GifDecoder(new InputSource$FileSource(str))));
                            break;
                        } catch (IOException | InterruptedException e) {
                            String A0S = AnonymousClass000.A0S("File exists ? ", exists);
                            if (Build.VERSION.SDK_INT >= 21 && str != null) {
                                A0S = AnonymousClass000.A0E(A0S, Environment.getExternalStorageState(new File(str)));
                            }
                            AnonymousClass0QD.A06("failed to render gif", AnonymousClass000.A0J(A0S, ":", str), e);
                            throw new RuntimeException(e);
                        }
                    case 2:
                        this.A09.put(r32, new AnonymousClass83B(A00(r32)));
                        break;
                }
            }
        }
        C89133th r4 = null;
        for (int i2 = 0; i2 < this.A07.size(); i2++) {
            AnonymousClass206 r33 = (AnonymousClass206) this.A07.get(i2);
            AnonymousClass20E r2 = r33.A00;
            boolean z = false;
            if (r2 != AnonymousClass20E.IMAGE) {
                z = true;
            }
            switch (r2.ordinal()) {
                case 0:
                    r4 = (C89133th) this.A0A.get(r33);
                    break;
                case 1:
                    C175597el r0 = (C175597el) this.A08.get(r33);
                    if (r0 != null) {
                        GifDecoder gifDecoder = r0.A01;
                        Bitmap bitmap2 = r0.A00;
                        gifDecoder.seekToTime(this.A00 % gifDecoder.getDuration(), bitmap2);
                        r4 = C1892986r.A02(bitmap2, false);
                        break;
                    }
                    break;
                case 2:
                    Drawable A002 = A00(r33);
                    if (A002 instanceof C173147aY) {
                        ((C173147aY) A002).Bhd(this.A00);
                    }
                    AnonymousClass83B r02 = (AnonymousClass83B) this.A09.get(r33);
                    if (!(r02 == null || (bitmap = r02.A00) == null)) {
                        bitmap.eraseColor(0);
                        A002.draw(new Canvas(bitmap));
                        r4 = C1892986r.A02(bitmap, false);
                        break;
                    }
                default:
                    throw new IllegalStateException("Unhandled image region type");
            }
            NavigableSet navigableSet = (NavigableSet) this.A0C.get(r33);
            AnonymousClass20D r1 = this.A05;
            r1.A0A = this.A00;
            if (navigableSet != null) {
                r3 = (AnonymousClass20D) navigableSet.floor(r1);
            } else {
                r3 = null;
            }
            if (!(r3 == null || r4 == null)) {
                this.A02.A01();
                this.A02.A04(1.0f, -1.0f);
                this.A02.A05((r3.A03 * 2.0f) - 1.0f, (r3.A04 * 2.0f) - 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                float height = ((float) r15.getHeight()) / ((float) r15.getWidth());
                this.A02.A04(height, 1.0f);
                this.A02.A03(r3.A07);
                this.A02.A04(1.0f / height, 1.0f);
                this.A02.A04(r3.A06, r3.A05);
                this.A03.A0H(this.A02);
                boolean glIsEnabled = GLES20.glIsEnabled(3042);
                if (!glIsEnabled) {
                    GLES20.glEnable(3042);
                }
                GLES20.glBlendFunc(1, 771);
                this.A03.Bbg(r13, r4, r15);
                if (!glIsEnabled) {
                    GLES20.glDisable(3042);
                }
            }
            if (z && r4 != null) {
                r4.cleanup();
            }
        }
    }

    public final void Bio(int i) {
        this.A03.Bio(i);
    }

    public final void invalidate() {
        this.A03.invalidate();
    }

    public RegionTrackingFilter(Context context, AnonymousClass0C1 r3, List list) {
        this.A04 = context;
        this.A07 = list;
        this.A03 = new IdentityFilter(r3);
        this.A06 = r3;
    }
}
