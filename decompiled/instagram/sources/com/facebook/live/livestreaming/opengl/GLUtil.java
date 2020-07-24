package com.facebook.live.livestreaming.opengl;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0DB;

public final class GLUtil {
    public static final float[] A00;

    public static FloatBuffer A01(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length << 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    static {
        float[] fArr = new float[16];
        A00 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void A02(int i, String str) {
        if (i < 0) {
            throw new RuntimeException(AnonymousClass000.A0J("Unable to locate '", str, "' in program"));
        }
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A03(AnonymousClass000.A05("glCreateShader type=", i));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        AnonymousClass0DB.A0J("com.facebook.live.livestreaming.opengl.GLUtil", "Could not compile shader %d:", Integer.valueOf(i));
        AnonymousClass0DB.A0J("com.facebook.live.livestreaming.opengl.GLUtil", " %s", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void A03(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            AnonymousClass0DB.A0J("com.facebook.live.livestreaming.opengl.GLUtil", "%s: glError %d", str, Integer.valueOf(glGetError));
            throw new RuntimeException(AnonymousClass000.A0G(str, ": glError ", glGetError));
        }
    }
}
