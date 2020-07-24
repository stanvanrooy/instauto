package com.facebook.live.livestreaming.opengl;

import android.opengl.GLES20;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0DB;

public final class Texture2dProgram {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public float[] A0A = new float[9];
    public float[] A0B = {1.0f, 1.0f};
    public float[] A0C;

    public Texture2dProgram(Integer num) {
        String str;
        int A002;
        String str2;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                this.A02 = 3553;
                str = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
                break;
            case 1:
                this.A02 = 36197;
                str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
                break;
            case 2:
                this.A02 = 36197;
                str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n";
                break;
            case 3:
                this.A02 = 36197;
                str = "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n";
                break;
            case 4:
                this.A02 = 36197;
                str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform vec2 uStretchFactor;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec2 scaledCoord = vTextureCoord * uStretchFactor;\n    vec2 scaledCentre = vec2(0.5 , 0.5) * uStretchFactor;\n    float alpha = 1.0 - (smoothstep(0.5, 0.5, distance(scaledCoord, scaledCentre)));\n    gl_FragColor = vec4(texture2D(sTexture, vTextureCoord).rgb * alpha, alpha);\n}\n";
                break;
            case 5:
                this.A02 = 36197;
                str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform vec2 uStretchFactor;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec2 scaledCoord = vTextureCoord * uStretchFactor;\n    vec2 scaledCentre = vec2(0.5 , 0.5) * uStretchFactor;\n    float alpha = 1.0 - max(sign(distance(scaledCoord, scaledCentre) - 0.5), 0.0);\n    gl_FragColor = vec4(texture2D(sTexture, vTextureCoord).rgb * alpha, alpha);\n}\n";
                break;
            default:
                if (num != null) {
                    switch (intValue) {
                        case 1:
                            str2 = "TEXTURE_EXT";
                            break;
                        case 2:
                            str2 = "TEXTURE_EXT_BW";
                            break;
                        case 3:
                            str2 = "TEXTURE_EXT_FILT";
                            break;
                        case 4:
                            str2 = "TEXTURE_EXT_CIRCULAR";
                            break;
                        case 5:
                            str2 = "TEXTURE_EXT_ROUND";
                            break;
                        default:
                            str2 = "TEXTURE_2D";
                            break;
                    }
                } else {
                    str2 = "null";
                }
                throw new RuntimeException(AnonymousClass000.A0E("Unhandled type ", str2));
        }
        int A003 = GLUtil.A00(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        int i = 0;
        if (!(A003 == 0 || (A002 = GLUtil.A00(35632, str)) == 0)) {
            int glCreateProgram = GLES20.glCreateProgram();
            GLUtil.A03("glCreateProgram");
            if (glCreateProgram == 0) {
                AnonymousClass0DB.A0D("com.facebook.live.livestreaming.opengl.GLUtil", "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, A003);
            GLUtil.A03("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, A002);
            GLUtil.A03("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                AnonymousClass0DB.A0D("com.facebook.live.livestreaming.opengl.GLUtil", "Could not link program: ");
                AnonymousClass0DB.A0D("com.facebook.live.livestreaming.opengl.GLUtil", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i = glCreateProgram;
            }
        }
        this.A00 = i;
        if (i != 0) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
            this.A03 = glGetAttribLocation;
            GLUtil.A02(glGetAttribLocation, "aPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A00, "aTextureCoord");
            this.A04 = glGetAttribLocation2;
            GLUtil.A02(glGetAttribLocation2, "aTextureCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.A00, "uMVPMatrix");
            this.A07 = glGetUniformLocation;
            GLUtil.A02(glGetUniformLocation, "uMVPMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.A00, "uTexMatrix");
            this.A08 = glGetUniformLocation2;
            GLUtil.A02(glGetUniformLocation2, "uTexMatrix");
            int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.A00, "uKernel");
            this.A06 = glGetUniformLocation3;
            if (glGetUniformLocation3 < 0) {
                this.A06 = -1;
                this.A09 = -1;
                this.A05 = -1;
            } else {
                int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.A00, "uTexOffset");
                this.A09 = glGetUniformLocation4;
                GLUtil.A02(glGetUniformLocation4, "uTexOffset");
                int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.A00, "uColorAdjust");
                this.A05 = glGetUniformLocation5;
                GLUtil.A02(glGetUniformLocation5, "uColorAdjust");
                System.arraycopy(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER}, 0, this.A0A, 0, 9);
                float f = 1.0f / ((float) 256);
                float f2 = -f;
                this.A0C = new float[]{f2, f2, 0.0f, f2, f, f2, f2, 0.0f, 0.0f, 0.0f, f, 0.0f, f2, f, 0.0f, f, f, f};
            }
            if (num == Constants.A0Y || num == Constants.A0j) {
                int glGetUniformLocation6 = GLES20.glGetUniformLocation(this.A00, "uStretchFactor");
                this.A01 = glGetUniformLocation6;
                GLUtil.A02(glGetUniformLocation6, "uStretchFactor");
                return;
            }
            return;
        }
        throw new RuntimeException("Unable to create program");
    }
}
