package com.facebook.mediastreaming.opt.source;

import android.graphics.SurfaceTexture;
import java.util.List;

public interface SurfaceTextureHolder {
    int getHeight();

    SurfaceTexture getSurfaceTexture();

    List getSurfaceTextures();

    int getWidth();
}
