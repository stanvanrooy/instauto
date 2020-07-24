package p000X;

import android.opengl.GLES20;

/* renamed from: X.DOD */
public final class DOD implements Runnable {
    public final int[] A00;

    public final void run() {
        GLES20.glDeleteBuffers(1, this.A00, 0);
    }

    public DOD(int i) {
        this.A00 = new int[]{i};
    }
}
