package com.instagram.filterkit.filter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.math.Matrix4;
import com.instagram.model.filterkit.TextureAsset;
import com.instagram.util.video.GlProgramCompiler;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass83K;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass85G;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U3;
import p000X.AnonymousClass8U4;
import p000X.AnonymousClass8U5;
import p000X.AnonymousClass8U6;
import p000X.AnonymousClass8UE;
import p000X.C1888784z;
import p000X.C1892986r;
import p000X.C43391uK;
import p000X.C89103tc;
import p000X.C89113td;
import p000X.C89123tg;
import p000X.C89133th;
import p000X.C89393u9;
import p000X.C89403uA;
import p000X.C89433uD;
import p000X.C89453uF;
import p000X.C89463uG;

public class VideoFilter extends BaseFilter {
    public static final Class A0m = VideoFilter.class;
    public static final int[] A0n = {33985, 33986, 33987, 33988, 33989, 33990};
    public static final C89463uG A0o = C89453uF.A00();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Matrix4 A06;
    public Matrix4 A07;
    public C89393u9 A08;
    public AnonymousClass8U1 A09;
    public AnonymousClass8U5 A0A;
    public AnonymousClass8U3 A0B;
    public AnonymousClass8U3 A0C;
    public C89463uG A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public float[] A0K;
    public float[] A0L;
    public AnonymousClass8UE A0M;
    public AnonymousClass8UE A0N;
    public AnonymousClass8U4 A0O;
    public AnonymousClass8U4 A0P;
    public AnonymousClass8U6 A0Q;
    public AnonymousClass8U6 A0R;
    public AnonymousClass8U6 A0S;
    public AnonymousClass8U6 A0T;
    public AnonymousClass8U6 A0U;
    public AnonymousClass83K A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public AnonymousClass8U1 A0Z;
    public final int A0a;
    public final IdentityFilter A0b;
    public final boolean A0c;
    public final Rect A0d;
    public final C89123tg A0e;
    public final C89403uA A0f;
    public final C43391uK A0g;
    public final String A0h;
    public final List A0i;
    public final boolean A0j;
    public final Context A0k;
    public final C89133th[] A0l;

    public static float[] A04(int i) {
        return new float[]{((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f};
    }

    public final void invalidate() {
    }

    private void A00() {
        for (C89133th r0 : this.A0l) {
            if (r0 != null) {
                r0.cleanup();
            }
        }
        AnonymousClass83K r02 = this.A0V;
        if (r02 != null) {
            r02.cleanup();
        }
        int i = this.A03;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.A03 = 0;
        }
        int i2 = this.A00;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
            this.A00 = 0;
        }
    }

    public static void A01(VideoFilter videoFilter, int i, int i2) {
        AnonymousClass8U6 r1 = videoFilter.A0T;
        if (r1 != null) {
            r1.A02((float) i);
        }
        AnonymousClass8U6 r12 = videoFilter.A0S;
        if (r12 != null) {
            r12.A02((float) i2);
        }
    }

    public static void A02(VideoFilter videoFilter, Matrix4 matrix4) {
        AnonymousClass8U4 r1;
        AnonymousClass8UE r12 = videoFilter.A0M;
        if (r12 != null) {
            boolean z = false;
            if (matrix4 != null) {
                z = true;
            }
            r12.A02(z);
        }
        if (matrix4 != null && (r1 = videoFilter.A0O) != null) {
            r1.A02(matrix4.A00);
        }
    }

    public static void A03(VideoFilter videoFilter, Matrix4 matrix4) {
        AnonymousClass8U4 r1;
        AnonymousClass8UE r12 = videoFilter.A0N;
        if (r12 != null) {
            boolean z = false;
            if (matrix4 != null) {
                z = true;
            }
            r12.A02(z);
        }
        if (matrix4 != null && (r1 = videoFilter.A0P) != null) {
            r1.A02(matrix4.A00);
        }
    }

    public final int A0C() {
        if (this.A03 == 0) {
            try {
                int compileProgram = GlProgramCompiler.compileProgram(this.A0h, this.A0J, this.A0I, this.A0c);
                this.A03 = compileProgram;
                this.A0Z = new AnonymousClass8U1(compileProgram);
                GLES20.glUseProgram(this.A03);
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.A03, "image"), 0);
                AnonymousClass8U6 r1 = (AnonymousClass8U6) this.A0Z.A00("u_filterStrength");
                this.A0Q = r1;
                if (r1 != null) {
                    r1.A02(1.0f);
                }
                this.A0M = (AnonymousClass8UE) this.A0Z.A00("u_enableTransformMatrix");
                this.A0O = (AnonymousClass8U4) this.A0Z.A00("u_transformMatrix");
                Matrix4 matrix4 = this.A06;
                this.A06 = matrix4;
                A02(this, matrix4);
                this.A0N = (AnonymousClass8UE) this.A0Z.A00("u_enableVertexTransform");
                this.A0P = (AnonymousClass8U4) this.A0Z.A00("u_vertexTransform");
                Matrix4 matrix42 = this.A07;
                this.A07 = matrix42;
                A03(this, matrix42);
                this.A0T = (AnonymousClass8U6) this.A0Z.A00("u_min");
                this.A0S = (AnonymousClass8U6) this.A0Z.A00("u_max");
                A01(this, this.A02, this.A01);
                this.A0U = (AnonymousClass8U6) this.A0Z.A00("u_width");
                this.A0R = (AnonymousClass8U6) this.A0Z.A00("u_height");
                this.A0W = GLES20.glGetAttribLocation(this.A03, "position");
                this.A0Y = GLES20.glGetAttribLocation(this.A03, "transformedTextureCoordinate");
                this.A0X = GLES20.glGetAttribLocation(this.A03, "staticTextureCoordinate");
                A0D();
                int i = 0;
                while (i < this.A0i.size()) {
                    TextureAsset textureAsset = (TextureAsset) this.A0i.get(i);
                    int i2 = i + 1;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(this.A03, textureAsset.A00), i2);
                    this.A0l[i] = C1892986r.A01(this.A0k, textureAsset.A01);
                    i = i2;
                }
            } catch (Exception e) {
                AnonymousClass0DB.A08(A0m, "Error initializing %s program: ", this.A0h, e);
            }
        }
        return this.A03;
    }

    public void A0D() {
        C89393u9 r1 = this.A08;
        if (r1 != null) {
            r1.A0B(this.A0Z);
        }
    }

    public void A0E(C89133th r4, AnonymousClass85B r5) {
        C89393u9 r2 = this.A08;
        if (r2 != null) {
            r2.A03(this.A0Z, r4, r5, this.A0l);
        }
    }

    public void A0F(C89133th r7, AnonymousClass85B r8, C89433uD r9) {
        C89393u9 r0 = this.A08;
        if (r0 != null) {
            C89133th r2 = r7;
            r0.A0A(this.A0Z, r2, r8, this.A0l, r9);
        }
    }

    public final void A0G(C89133th r21, AnonymousClass85B r22, boolean z, boolean z2, boolean z3, C89463uG r26, C89433uD r27) {
        int A052;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        AnonymousClass8U6 r1;
        C89133th r13 = r21;
        AnonymousClass85B r5 = r22;
        GLES20.glUseProgram(A0C());
        C89433uD r10 = r27;
        A0F(r13, r5, r10);
        if (!(r22 == null || (r1 = this.A0U) == null || this.A0R == null)) {
            r1.A02((float) r5.AU9());
            this.A0R.A02((float) r5.AU6());
        }
        C89393u9 r0 = this.A08;
        if (r0 == null) {
            A052 = 1;
        } else {
            A052 = r0.A05();
        }
        for (int i = 0; i < A052; i++) {
            C89393u9 r7 = this.A08;
            if (r7 != null) {
                r7.A08(i, this.A0Z);
                C89393u9 r02 = this.A08;
                C89133th A062 = r02.A06(i);
                if (A062 == null) {
                    A062 = r13;
                }
                AnonymousClass85B A072 = r02.A07(i);
                if (A072 != null) {
                    r5 = A072;
                }
                r13 = A062;
            }
            if (this.A0j) {
                GLES20.glActiveTexture(33984);
                if (this.A0J) {
                    GLES20.glBindTexture(36197, r13.getTextureId());
                } else {
                    GLES20.glBindTexture(3553, r13.getTextureId());
                }
            }
            boolean z4 = false;
            if (i >= A052 - 1) {
                z4 = true;
            }
            C89393u9 r03 = this.A08;
            if (r03 != null) {
                int[] A0C2 = r03.A0C(i);
                int i2 = A0C2[0];
                int i3 = A0C2[1];
                if (i3 == 0) {
                    i3 = this.A01;
                }
                A01(this, i2, i3);
            } else {
                A01(this, this.A02, this.A01);
            }
            if (z4 && this.A0c && this.A08 != null) {
                this.A0d.set(this.A02, 0, this.A01, r5.getHeight());
                this.A08.A02(this.A0d);
            }
            if (z2) {
                A03(this, this.A07);
            } else {
                A03(this, (Matrix4) null);
            }
            if (z3) {
                A02(this, this.A06);
            } else {
                A02(this, (Matrix4) null);
            }
            AnonymousClass8U6 r11 = this.A0Q;
            if (r11 != null) {
                if (z) {
                    r11.A02(((float) this.A04) / 100.0f);
                } else {
                    r11.A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
            }
            C89463uG r72 = r26;
            if (z4) {
                floatBuffer = r72.A01;
            } else {
                floatBuffer = A0o.A01;
            }
            GLES20.glEnableVertexAttribArray(this.A0W);
            GLES20.glVertexAttribPointer(this.A0W, 2, 5126, false, 8, floatBuffer);
            if (this.A0F) {
                floatBuffer2 = r72.A00;
            } else {
                floatBuffer2 = r72.A02;
            }
            GLES20.glEnableVertexAttribArray(this.A0Y);
            FloatBuffer floatBuffer3 = floatBuffer2;
            GLES20.glVertexAttribPointer(this.A0Y, 2, 5126, false, 8, floatBuffer3);
            int i4 = this.A0X;
            if (i4 != -1) {
                GLES20.glEnableVertexAttribArray(i4);
                GLES20.glVertexAttribPointer(this.A0X, 2, 5126, false, 8, floatBuffer3);
            }
            GLES20.glBindFramebuffer(36160, r5.AMH());
            C1892986r.A04("VideoFilter.render:glBindFramebuffer");
            for (int i5 = 0; i5 < this.A0l.length; i5++) {
                GLES20.glActiveTexture(A0n[i5]);
                GLES20.glBindTexture(3553, this.A0l[i5].getTextureId());
            }
            AnonymousClass8U6 r73 = this.A0U;
            if (!(r73 == null || this.A0R == null)) {
                r73.A02((float) r5.AU9());
                this.A0R.A02((float) r5.AU6());
            }
            C89123tg r6 = this.A0e;
            r5.AaV(r6);
            GLES20.glViewport(r6.A02, r6.A03, r6.A01, r6.A00);
            this.A0Z.A03("image", r13.getTextureId());
            this.A0Z.A02();
            GLES20.glDrawArrays(5, 0, 4);
            if ((A052 == 1 || i > 0) && r27 != null) {
                r10.A05(r13, (C89103tc) null);
            }
        }
        A0E(r13, r5);
        GLES20.glDisableVertexAttribArray(this.A0W);
        GLES20.glDisableVertexAttribArray(this.A0Y);
        int i6 = this.A0X;
        if (i6 != -1) {
            GLES20.glDisableVertexAttribArray(i6);
        }
    }

    public final void A0H(float[] fArr, float[] fArr2) {
        if (fArr != null && fArr2 != null && fArr.length == 3 && fArr2.length == 3) {
            this.A0H = true;
            this.A0L = (float[]) fArr.clone();
            this.A0K = (float[]) fArr2.clone();
        }
    }

    public final boolean A0I() {
        Matrix4 matrix4 = this.A06;
        if (matrix4 != null) {
            if (!Arrays.equals(matrix4.A01, this.A0g.A0A.A01)) {
                return false;
            }
        }
        Matrix4 matrix42 = this.A07;
        if (matrix42 == null) {
            return true;
        }
        if (Arrays.equals(matrix42.A01, this.A0g.A0B.A01)) {
            return true;
        }
        return false;
    }

    public void Bbg(C89433uD r21, C89133th r22, AnonymousClass85B r23) {
        boolean z;
        boolean z2;
        boolean z3;
        C89463uG r0;
        C89433uD r2 = r21;
        AnonymousClass85B r14 = r23;
        C89133th r13 = r22;
        if (this.A0c) {
            if (A0I()) {
                r0 = this.A0D;
            } else {
                r0 = A0o;
            }
            z = true;
            z2 = false;
            z3 = false;
        } else {
            GLES20.glBindFramebuffer(36160, r14.AMH());
            if (this.A0E) {
                GLES20.glClearColor(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                GLES20.glClear(DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            }
            if (this.A0H || this.A0G) {
                if (this.A0V == null) {
                    this.A0V = new C1888784z(r14.getWidth(), r14.getHeight());
                }
                if (this.A0H) {
                    AnonymousClass83K r3 = this.A0V;
                    GLES20.glBindFramebuffer(36160, r3.AMH());
                    GLES20.glClearColor(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                    GLES20.glClear(DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                    int width = r3.getWidth();
                    int height = r3.getHeight();
                    if (this.A00 == 0) {
                        try {
                            int compileProgram = GlProgramCompiler.compileProgram("GradientBackground", false, this.A0I, this.A0c);
                            this.A00 = compileProgram;
                            this.A09 = new AnonymousClass8U1(compileProgram);
                            GLES20.glUseProgram(this.A00);
                            this.A0C = (AnonymousClass8U3) this.A09.A00("topColor");
                            this.A0B = (AnonymousClass8U3) this.A09.A00("bottomColor");
                            this.A0A = (AnonymousClass8U5) this.A09.A00("resolution");
                            AnonymousClass8U3 r5 = this.A0C;
                            float[] fArr = this.A0L;
                            r5.A02(fArr[0], fArr[1], fArr[2], 1.0f);
                            AnonymousClass8U3 r52 = this.A0B;
                            float[] fArr2 = this.A0K;
                            r52.A02(fArr2[0], fArr2[1], fArr2[2], 1.0f);
                            this.A0A.A02((float) width, (float) height);
                        } catch (Exception e) {
                            AnonymousClass0DB.A08(A0m, "Error initializing %s program: ", "GradientBackground", e);
                        }
                    }
                    GLES20.glUseProgram(this.A00);
                    this.A09.A06("position", this.A0D.A01);
                    this.A09.A02();
                    this.A09.A01();
                    GLES20.glDrawArrays(5, 0, 4);
                }
                if (this.A0G) {
                    AnonymousClass83K r7 = this.A0V;
                    C89133th A022 = C1892986r.A02(this.A05, false);
                    if (A022 != null) {
                        try {
                            boolean glIsEnabled = GLES20.glIsEnabled(3042);
                            if (!glIsEnabled) {
                                GLES20.glEnable(3042);
                            }
                            GLES20.glBlendFunc(1, 771);
                            this.A0b.Bbg(r2, A022, r7);
                            if (!glIsEnabled) {
                                GLES20.glDisable(3042);
                            }
                        } catch (AnonymousClass85G e2) {
                            AnonymousClass0QD.A09("VideoFilter Render exception", e2);
                        } catch (Throwable th) {
                            A022.cleanup();
                            throw th;
                        }
                        A022.cleanup();
                    }
                }
                C89433uD r11 = r2;
                A0G(r13, this.A0V, false, true, false, this.A0D, r11);
                A0G(this.A0V, r14, true, false, false, A0o, r11);
                return;
            }
            z = true;
            z2 = true;
            z3 = false;
            r0 = this.A0D;
        }
        A0G(r13, r14, z, z2, z3, r0, r2);
    }

    public final void finalize() {
        A00();
    }

    public final String toString() {
        return this.A0h;
    }

    public final void A8Y(C89433uD r1) {
        A00();
    }

    public VideoFilter(Context context, AnonymousClass0C1 r7, C89403uA r8, C89393u9 r9) {
        this.A0e = new C89123tg();
        boolean z = false;
        this.A02 = 0;
        this.A01 = Integer.MAX_VALUE;
        this.A0d = new Rect();
        this.A0D = C89453uF.A00();
        this.A0k = context;
        this.A0a = r8.A00;
        this.A0h = r8.A05;
        List list = r8.A06;
        this.A0i = list;
        this.A0l = new C89133th[list.size()];
        this.A04 = 100;
        this.A0F = this.A0a == -1;
        this.A0f = r8;
        this.A08 = r9;
        this.A0c = C89113td.A00(r7);
        this.A0g = new C43391uK(-1, r7);
        this.A0j = (r7 == null || !((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.CAMERA_ANDROID_PARIS_FILTER, "remove_oessampler_check_in_video_filter", false, (AnonymousClass04H) null)).booleanValue()) ? true : z;
        this.A0b = new IdentityFilter(r7);
        Matrix4 matrix4 = new Matrix4();
        matrix4.A02(180.0f);
        this.A0b.A0H(matrix4);
    }

    public VideoFilter(Context context, AnonymousClass0C1 r6, List list) {
        this.A0e = new C89123tg();
        this.A02 = 0;
        this.A01 = Integer.MAX_VALUE;
        this.A0d = new Rect();
        this.A0D = C89453uF.A00();
        this.A0k = context;
        this.A0a = -3;
        this.A0h = "ImageOverlay";
        this.A0i = list;
        this.A0l = new C89133th[list.size()];
        this.A04 = 100;
        this.A0f = null;
        this.A08 = null;
        this.A0g = new C43391uK(-1, r6);
        this.A0c = C89113td.A00(r6);
        this.A0j = !((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.CAMERA_ANDROID_PARIS_FILTER, "remove_oessampler_check_in_video_filter", false, (AnonymousClass04H) null)).booleanValue();
        this.A0b = new IdentityFilter(r6);
        Matrix4 matrix4 = new Matrix4();
        matrix4.A02(180.0f);
        this.A0b.A0H(matrix4);
    }
}
