package com.instagram.creation.photo.edit.surfacecropfilter;

import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.resize.IdentityFilter;
import com.instagram.util.jpeg.JpegBridge;
import com.instagram.util.jpeg.NativeImage;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass81M;
import p000X.AnonymousClass81O;
import p000X.AnonymousClass823;
import p000X.AnonymousClass82C;
import p000X.AnonymousClass82K;
import p000X.AnonymousClass83M;
import p000X.AnonymousClass85B;
import p000X.C183777t3;
import p000X.C1879680v;
import p000X.C1879780w;
import p000X.C1879880x;
import p000X.C1883282h;
import p000X.C89133th;
import p000X.C89433uD;

public class IdentityReadbackFilter extends IdentityFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(309);
    public AnonymousClass81O A00;
    public AnonymousClass82K A01;

    public final void A8Y(C89433uD r3) {
        super.A8Y(r3);
        this.A00.A06.set(true);
        this.A01.A06.set(false);
    }

    public final void Bbg(C89433uD r9, C89133th r10, AnonymousClass85B r11) {
        super.Bbg(r9, r10, r11);
        boolean andSet = this.A00.A06.getAndSet(false);
        boolean andSet2 = this.A01.A06.getAndSet(false);
        if (andSet || andSet2) {
            GLES20.glBindFramebuffer(36160, r11.AMH());
            NativeImage readFramebuffer = JpegBridge.readFramebuffer(r11.getWidth(), r11.getHeight());
            if (readFramebuffer.mBufferId != -1) {
                String A0B = AnonymousClass000.A0B(IdentityReadbackFilter.class.getCanonicalName(), System.currentTimeMillis());
                C1879680v r2 = C183777t3.A00;
                synchronized (r2) {
                    AnonymousClass0a4.A06(readFramebuffer);
                    r2.A00.put(A0B, new C1879780w(r2, readFramebuffer));
                }
                if (andSet) {
                    try {
                        r2.A03(A0B, this.A00);
                        this.A00.A00();
                        AnonymousClass81O.A08.ADc(new AnonymousClass81M(this.A00, readFramebuffer, new AnonymousClass823(this, A0B)));
                    } catch (C1879880x e) {
                        throw new RuntimeException(e);
                    }
                }
                if (andSet2) {
                    C183777t3.A00.A03(A0B, this.A01);
                    this.A01.A00();
                    AnonymousClass82K r3 = this.A01;
                    C1883282h r22 = new C1883282h(this, A0B);
                    r22.onStart();
                    AnonymousClass83M r0 = (AnonymousClass83M) r3.A03.get();
                    if (r0 != null) {
                        r0.onStart();
                    }
                    AnonymousClass82K.A09.ADc(new AnonymousClass82C(r3, readFramebuffer, r22));
                    return;
                }
                return;
            }
            throw new RuntimeException("Could not read frame buffer");
        }
    }

    public IdentityReadbackFilter(Parcel parcel) {
        super(parcel);
    }

    public IdentityReadbackFilter(boolean z) {
        super(z);
    }
}
