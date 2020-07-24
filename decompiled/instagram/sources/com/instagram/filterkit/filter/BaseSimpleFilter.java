package com.instagram.filterkit.filter;

import android.opengl.GLES20;
import android.os.Parcel;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.filter.ImageGradientFilter;
import com.instagram.model.filterkit.TextureAsset;
import com.instagram.util.creation.ShaderBridge;
import com.instagram.util.video.GlProgramCompiler;
import java.nio.FloatBuffer;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass839;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass85G;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U3;
import p000X.AnonymousClass8U4;
import p000X.AnonymousClass8U5;
import p000X.AnonymousClass8U6;
import p000X.AnonymousClass8U7;
import p000X.AnonymousClass8UE;
import p000X.C1887884o;
import p000X.C1892986r;
import p000X.C26911Ft;
import p000X.C89013tM;
import p000X.C89103tc;
import p000X.C89113td;
import p000X.C89123tg;
import p000X.C89133th;
import p000X.C89393u9;
import p000X.C89433uD;
import p000X.C89453uF;
import p000X.C89463uG;

public abstract class BaseSimpleFilter extends BaseFilter {
    public static final C89463uG A07 = C89453uF.A00();
    public int A00;
    public C89013tM A01;
    public C89393u9 A02;
    public C1887884o A03;
    public AnonymousClass8U1 A04;
    public C89123tg A05;
    public final boolean A06;

    public AnonymousClass8U1 A0C(C89433uD r9) {
        if (this instanceof IdentityFilter) {
            IdentityFilter identityFilter = (IdentityFilter) this;
            int compileProgram = GlProgramCompiler.compileProgram("Identity", false, true, identityFilter.A06);
            if (compileProgram == 0) {
                return null;
            }
            AnonymousClass8U1 r1 = new AnonymousClass8U1(compileProgram);
            identityFilter.A02 = (AnonymousClass8UE) r1.A00("u_enableVertexTransform");
            identityFilter.A04 = (AnonymousClass8U4) r1.A00("u_vertexTransform");
            identityFilter.A01 = (AnonymousClass8UE) r1.A00("u_enableTransformMatrix");
            identityFilter.A03 = (AnonymousClass8U4) r1.A00("u_transformMatrix");
            return r1;
        } else if (!(this instanceof ImageGradientFilter)) {
            PhotoFilter photoFilter = (PhotoFilter) this;
            int compileProgram2 = ShaderBridge.compileProgram(photoFilter.A0Y, C26911Ft.A00(), false, true, photoFilter.A0P, photoFilter.A06);
            if (compileProgram2 == 0) {
                return null;
            }
            AnonymousClass8U1 r2 = new AnonymousClass8U1(compileProgram2);
            for (int i = 0; i < photoFilter.A0Z.size(); i++) {
                TextureAsset textureAsset = (TextureAsset) photoFilter.A0Z.get(i);
                photoFilter.A0b[i] = r9.A00(photoFilter, textureAsset.A01);
                r2.A03(textureAsset.A00, photoFilter.A0b[i].getTextureId());
            }
            r2.A03("noop", r9.A00(photoFilter, "shared/noop.png").getTextureId());
            photoFilter.A0D = (AnonymousClass8UE) r2.A00("u_enableTextureTransform");
            photoFilter.A0F = (AnonymousClass8U7) r2.A00("u_textureTransform");
            photoFilter.A0B = (AnonymousClass8UE) r2.A00("u_mirrored");
            photoFilter.A0A = (AnonymousClass8UE) r2.A00("u_flipped");
            photoFilter.A0K = (AnonymousClass8U6) r2.A00("u_filterStrength");
            photoFilter.A0O = (AnonymousClass8U6) r2.A00("u_width");
            photoFilter.A0L = (AnonymousClass8U6) r2.A00("u_height");
            photoFilter.A0N = (AnonymousClass8U6) r2.A00("u_min");
            photoFilter.A0M = (AnonymousClass8U6) r2.A00("u_max");
            photoFilter.A0J = (AnonymousClass8U6) r2.A00("brightness_correction_mult");
            photoFilter.A0I = (AnonymousClass8U6) r2.A00("brightness_correction_add");
            photoFilter.A0E = (AnonymousClass8UE) r2.A00("u_enableVertexTransform");
            photoFilter.A0H = (AnonymousClass8U4) r2.A00("u_vertexTransform");
            photoFilter.A0C = (AnonymousClass8UE) r2.A00("u_enableTransformMatrix");
            photoFilter.A0G = (AnonymousClass8U4) r2.A00("u_transformMatrix");
            C89393u9 r0 = photoFilter.A09;
            if (r0 == null) {
                return r2;
            }
            r0.A0B(r2);
            return r2;
        } else {
            ImageGradientFilter imageGradientFilter = (ImageGradientFilter) this;
            int A002 = ShaderBridge.A00(imageGradientFilter.A04 % 180 != 0 ? "ImageHorizontalGradientBackground" : "ImageVerticalGradientBackground");
            if (A002 == 0) {
                return null;
            }
            AnonymousClass8U1 r12 = new AnonymousClass8U1(A002);
            imageGradientFilter.A02 = (AnonymousClass8U3) r12.A00("topColor");
            imageGradientFilter.A01 = (AnonymousClass8U3) r12.A00("bottomColor");
            imageGradientFilter.A00 = (AnonymousClass8U5) r12.A00("resolution");
            return r12;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (com.instagram.creation.photo.edit.effectfilter.PhotoFilter) r2;
     */
    public void A0D(AnonymousClass8U1 r3, C89433uD r4, C89133th r5, AnonymousClass85B r6) {
        PhotoFilter photoFilter;
        C89393u9 r1;
        if ((this instanceof PhotoFilter) && (r1 = photoFilter.A09) != null) {
            r1.A03(r3, r5, r6, photoFilter.A0b);
        }
    }

    public abstract void A0E(AnonymousClass8U1 r1, C89433uD r2, C89133th r3, AnonymousClass85B r4);

    public boolean A0G() {
        if (this instanceof IdentityFilter) {
            return ((IdentityFilter) this).A05;
        }
        if (!(this instanceof PhotoFilter)) {
            return false;
        }
        PhotoFilter photoFilter = (PhotoFilter) this;
        return photoFilter.A0a && !photoFilter.A0R;
    }

    public void A0F(AnonymousClass85B r6) {
        String str;
        if (!(this instanceof IdentityFilter)) {
            if (!(this instanceof ImageGradientFilter)) {
                if (this.A06) {
                    GLES20.glBindFramebuffer(36160, r6.AMH());
                    str = "BaseSimpleFilter.clearFrameBuffer:glBindFramebuffer";
                } else {
                    return;
                }
            } else if (((ImageGradientFilter) this).A03) {
                GLES20.glBindFramebuffer(36160, r6.AMH());
                str = "ImageGradientFilter.clearFrameBuffer:glBindFramebuffer";
            } else {
                return;
            }
            C1892986r.A04(str);
            GLES20.glClearColor(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        } else {
            IdentityFilter identityFilter = (IdentityFilter) this;
            if (identityFilter.A06) {
                GLES20.glBindFramebuffer(36160, r6.AMH());
                C1892986r.A04("IdentityFilter.clearFrameBuffer:glBindFramebuffer");
                float[] fArr = identityFilter.A09;
                GLES20.glClearColor(fArr[0], fArr[1], fArr[2], identityFilter.A00);
            } else {
                return;
            }
        }
        GLES20.glClear(DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
    }

    public void Bbg(C89433uD r12, C89133th r13, AnonymousClass85B r14) {
        int width;
        int height;
        int width2;
        int height2;
        int A052;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        C89393u9 r1;
        if (!r12.A04.contains(this)) {
            if (this.A04 == null) {
                AnonymousClass8U1 A0C = A0C(r12);
                this.A04 = A0C;
                if (A0C != null) {
                    this.A03 = new C1887884o(A0C);
                    r12.A04(this);
                } else {
                    throw new AnonymousClass85G(AnonymousClass000.A0E("Could not create program for ", getClass().getSimpleName()));
                }
            } else {
                throw new AnonymousClass85G(AnonymousClass000.A0E("Filter program already initialized with different glResources ", getClass().getSimpleName()));
            }
        }
        if (r13 == null) {
            width = 0;
        } else {
            width = r13.getWidth();
        }
        if (r13 == null) {
            height = 0;
        } else {
            height = r13.getHeight();
        }
        if (r14 == null) {
            width2 = 0;
        } else {
            width2 = r14.getWidth();
        }
        if (r14 == null) {
            height2 = 0;
        } else {
            height2 = r14.getHeight();
        }
        String.format("%s input %dx%d, output %dx%d", new Object[]{this, Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(width2), Integer.valueOf(height2)});
        A0E(this.A04, r12, r13, r14);
        C1892986r.A04("BaseSimpleFilter.render:setFilterParams");
        C89393u9 r0 = this.A02;
        if (r0 == null) {
            A052 = 1;
        } else {
            A052 = r0.A05();
        }
        for (int i = 0; i < A052; i++) {
            C89393u9 r15 = this.A02;
            if (r15 != null) {
                r15.A08(i, this.A04);
                C89393u9 r16 = this.A02;
                C89133th A062 = r16.A06(i);
                if (A062 != null) {
                    r13 = A062;
                }
                AnonymousClass85B A072 = r16.A07(i);
                if (A072 != null) {
                    r14 = A072;
                }
            }
            C89013tM r8 = this.A01;
            if (r8 != null) {
                PhotoFilter photoFilter = r8.A00;
                C89393u9 r17 = photoFilter.A09;
                boolean z = false;
                if (i >= r17.A05() - 1) {
                    z = true;
                }
                int[] A0C2 = r17.A0C(i);
                AnonymousClass8U6 r18 = photoFilter.A0N;
                if (r18 != null) {
                    r18.A02((float) A0C2[0]);
                }
                PhotoFilter photoFilter2 = r8.A00;
                AnonymousClass8U6 r19 = photoFilter2.A0M;
                if (r19 != null) {
                    int i2 = A0C2[1];
                    if (i2 == 0) {
                        i2 = photoFilter2.A03;
                    }
                    r19.A02((float) i2);
                }
                PhotoFilter photoFilter3 = r8.A00;
                if (!photoFilter3.A06 && (r1 = photoFilter3.A09) != null) {
                    if (i == 0) {
                        r1.A00 = photoFilter3.A01;
                    }
                    int A012 = r1.A01(i);
                    if (A012 != -1) {
                        photoFilter3.A0J(A012);
                        AnonymousClass839.A00(((float) (photoFilter3.A01 + photoFilter3.A05)) + photoFilter3.A00, photoFilter3.A0X);
                        photoFilter3.A0D.A02(true);
                        AnonymousClass8U7 r110 = photoFilter3.A0F;
                        r110.A00 = photoFilter3.A0X.A00;
                        r110.A01();
                    }
                }
                if (z) {
                    PhotoFilter photoFilter4 = r8.A00;
                    if (photoFilter4.A06 && photoFilter4.A09 != null) {
                        photoFilter4.A0W.set(photoFilter4.A04, 0, photoFilter4.A03, r14.getHeight());
                        PhotoFilter photoFilter5 = r8.A00;
                        photoFilter5.A09.A02(photoFilter5.A0W);
                    }
                }
            }
            this.A04.A06("position", A07.A01);
            if (!this.A06) {
                AnonymousClass8U1 r111 = this.A04;
                if (A0G()) {
                    floatBuffer2 = A07.A00;
                } else {
                    floatBuffer2 = A07.A02;
                }
                r111.A06("transformedTextureCoordinate", floatBuffer2);
                this.A04.A06("staticTextureCoordinate", A07.A02);
                C1892986r.A04("BaseSimpleFilter.render:setCoordinates");
                GLES20.glBindFramebuffer(36160, r14.AMH());
                C1892986r.A04("BaseSimpleFilter.render:glBindFramebuffer");
                A0F(r14);
            } else {
                if (A0G()) {
                    floatBuffer = A07.A00;
                } else {
                    floatBuffer = A07.A02;
                }
                this.A04.A06("transformedTextureCoordinate", floatBuffer);
                this.A04.A06("staticTextureCoordinate", floatBuffer);
                C1892986r.A04("BaseSimpleFilter.render:setCoordinates");
                GLES20.glBindFramebuffer(36160, r14.AMH());
                C1892986r.A04("BaseSimpleFilter.render:glBindFramebuffer");
            }
            if (r14 != null) {
                r14.AaV(this.A05);
            }
            if (r13 != null) {
                this.A04.A03("image", r13.getTextureId());
            }
            this.A03.A00(this.A05, this.A00);
            if (A052 == 1 || i > 0) {
                r12.A05(r13, (C89103tc) null);
            }
        }
        AoY();
        A0D(this.A04, r12, r13, r14);
    }

    public void A8Y(C89433uD r2) {
        super.A8Y(r2);
        AnonymousClass8U1 r0 = this.A04;
        if (r0 != null) {
            GLES20.glDeleteProgram(r0.A00);
            this.A04 = null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public BaseSimpleFilter(AnonymousClass0C1 r2) {
        this(C89113td.A00(r2));
    }

    public BaseSimpleFilter(Parcel parcel) {
        super(parcel);
        this.A00 = Integer.MAX_VALUE;
        this.A05 = new C89123tg();
        this.A06 = parcel.readInt() != 1 ? false : true;
    }

    public BaseSimpleFilter(boolean z) {
        this.A00 = Integer.MAX_VALUE;
        this.A05 = new C89123tg();
        this.A06 = z;
    }
}
