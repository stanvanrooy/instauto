package p000X;

import android.opengl.GLES20;

/* renamed from: X.0Nq  reason: invalid class name and case insensitive filesystem */
public final class C06070Nq {
    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A01(AnonymousClass000.A05("glCreateShader type=", i));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        AnonymousClass0DB.A0J("GLProgramUtil", "Could not compile shader %d:", Integer.valueOf(i));
        AnonymousClass0DB.A0J("GLProgramUtil", " %s", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void A01(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            AnonymousClass0DB.A0J("GLProgramUtil", "%s: glError %d", str, Integer.valueOf(glGetError));
            throw new RuntimeException(AnonymousClass000.A0G(str, ": glError ", glGetError));
        }
    }
}
