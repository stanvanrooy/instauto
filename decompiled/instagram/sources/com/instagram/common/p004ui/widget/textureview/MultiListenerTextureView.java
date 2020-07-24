package com.instagram.common.p004ui.widget.textureview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass1XB;

/* renamed from: com.instagram.common.ui.widget.textureview.MultiListenerTextureView */
public class MultiListenerTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public SurfaceTexture A00;
    public boolean A01;
    public boolean A02;
    public final List A03;

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        for (int i3 = 0; i3 < this.A03.size(); i3++) {
            ((TextureView.SurfaceTextureListener) this.A03.get(i3)).onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        for (int i = 0; i < this.A03.size(); i++) {
            ((TextureView.SurfaceTextureListener) this.A03.get(i)).onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void A01() {
        if (this.A01 && this.A02 && this.A00 != null) {
            if (getSurfaceTexture() == null) {
                setSurfaceTexture(this.A00);
            } else {
                AnonymousClass0QD.A01("MultiListenerTextureView", "trying to set a surface texture when we have already set one");
            }
            this.A02 = false;
        }
    }

    public final void A02(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (!this.A03.contains(surfaceTextureListener)) {
            this.A03.add(surfaceTextureListener);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3 = 0;
        if (!this.A01) {
            while (i3 < this.A03.size()) {
                ((TextureView.SurfaceTextureListener) this.A03.get(i3)).onSurfaceTextureAvailable(surfaceTexture, i, i2);
                i3++;
            }
            this.A00 = surfaceTexture;
        } else if (this.A00 == null) {
            this.A00 = surfaceTexture;
            while (i3 < this.A03.size()) {
                ((TextureView.SurfaceTextureListener) this.A03.get(i3)).onSurfaceTextureAvailable(surfaceTexture, i, i2);
                i3++;
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (!this.A01) {
            boolean z = true;
            for (int i = 0; i < this.A03.size(); i++) {
                if (z) {
                    z = true;
                    if (((TextureView.SurfaceTextureListener) this.A03.get(i)).onSurfaceTextureDestroyed(surfaceTexture)) {
                    }
                }
                z = false;
            }
            return z;
        }
        this.A02 = true;
        boolean z2 = true;
        if (this.A00 == null) {
            for (int i2 = 0; i2 < this.A03.size(); i2++) {
                if (z2) {
                    z2 = true;
                    if (((TextureView.SurfaceTextureListener) this.A03.get(i2)).onSurfaceTextureDestroyed(surfaceTexture)) {
                    }
                }
                z2 = false;
            }
        }
        if (this.A00 != null || !z2) {
            return false;
        }
        return true;
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Use addSurfaceTextureListener instead. If you only have one listener, you shouldn't be using this custom view.");
    }

    public MultiListenerTextureView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MultiListenerTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiListenerTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = new CopyOnWriteArrayList();
        this.A01 = false;
        this.A02 = false;
        super.setSurfaceTextureListener(this);
        if (AnonymousClass1XB.A00) {
            AnonymousClass1XB.A00(this);
        }
    }
}
