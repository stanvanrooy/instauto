package com.instagram.debug.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.debug.image.ImageDebugConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p000X.AnonymousClass000;
import p000X.C06220Of;
import p000X.C169377Lu;
import p000X.C51442Kr;

public class DebugOverlayDrawerImpl implements C169377Lu {
    public static final int ERROR_BACKGROUND_COLOR = -1057030144;
    public static final int NORMAL_BACKGROUND_COLOR = -1073741824;
    public final Paint mBackgroundPaint = new Paint();
    public final ImageDebugConfiguration mConfig;
    public final Paint mFramePaint = new Paint();
    public final Paint mTextPaint = new Paint();

    public static int fixScanNum(int i, int i2) {
        return i == -1 ? i2 : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (r3.getHeight() <= (r5 << 1)) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0116  */
    public void drawOverlay(Canvas canvas, ImageView imageView, C51442Kr r14, Bitmap bitmap) {
        boolean z;
        ImageDebugConfiguration imageDebugConfiguration;
        ImageDebugConfiguration imageDebugConfiguration2;
        ImageDebugConfiguration.OverlayDisplayMode overlayDisplayMode;
        String str;
        String str2;
        long j;
        C51442Kr r1;
        Bitmap bitmap2 = bitmap;
        if (this.mConfig.isImageOverlayOn()) {
            if (bitmap == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof BitmapDrawable) {
                    bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            ArrayList arrayList = new ArrayList();
            if (bitmap2 != null) {
                ImageDebugConfiguration imageDebugConfiguration3 = this.mConfig;
                if (imageDebugConfiguration3.mShowRes || imageDebugConfiguration3.mShowResPerc || imageDebugConfiguration3.mShowOffscreenPixelsPerc) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (this.mConfig.mShowRes) {
                        arrayList.add(AnonymousClass000.A01(bitmap2.getWidth(), "x", bitmap2.getHeight()));
                    }
                    if (this.mConfig.mShowResPerc) {
                        arrayList.add(AnonymousClass000.A00(Math.min((bitmap2.getWidth() * 100) / width, (bitmap2.getHeight() * 100) / height), "%"));
                    }
                    if (bitmap2.getWidth() > (width << 1)) {
                        z = true;
                    }
                    z = false;
                    if (this.mConfig.mShowOffscreenPixelsPerc) {
                        arrayList.add(AnonymousClass000.A00(getOffscreenPixelsPerc(imageView, bitmap2), "%"));
                    }
                    imageDebugConfiguration = this.mConfig;
                    C51442Kr r10 = r14;
                    if (imageDebugConfiguration.mShowScans) {
                        if (r14 != null) {
                            r1 = r14;
                        } else {
                            r1 = new C51442Kr();
                        }
                        int i = r1.A02;
                        if (i == -1) {
                            i = 9;
                        }
                        int i2 = r1.A01;
                        if (i2 == -1) {
                            i2 = i;
                        }
                        int i3 = r1.A00;
                        if (i3 == -1) {
                            i3 = i2;
                        }
                        arrayList.add(i3 + "/" + i2 + "/" + i);
                    }
                    if (imageDebugConfiguration.mShowFileSize) {
                        if (r14 != null) {
                            j = r14.A03;
                        } else {
                            j = -1;
                        }
                        arrayList.add(String.format(Locale.US, "%,dB", new Object[]{Long.valueOf(j)}));
                    }
                    imageDebugConfiguration2 = this.mConfig;
                    if (imageDebugConfiguration2.mShowCacheKey) {
                        if (r14 != null) {
                            str2 = r14.A04;
                        } else {
                            str2 = "no cache key";
                        }
                        arrayList.add(str2);
                    }
                    if (imageDebugConfiguration2.mShowLoadSource == ImageDebugConfiguration.LoadSourceDisplayMode.NAME) {
                        if (r14 != null) {
                            str = r14.A05;
                        } else {
                            str = "Unknown";
                        }
                        arrayList.add(AnonymousClass000.A0E("SRC: ", str));
                    }
                    overlayDisplayMode = imageDebugConfiguration2.mOverlayDisplayMode;
                    Canvas canvas2 = canvas;
                    if (overlayDisplayMode != ImageDebugConfiguration.OverlayDisplayMode.NORMAL) {
                        drawNormalOverlay(canvas2, imageView.getContext(), arrayList, z, r10);
                        return;
                    } else if (overlayDisplayMode == ImageDebugConfiguration.OverlayDisplayMode.TINY) {
                        drawTinyOverlay(canvas, arrayList, z, r14);
                        return;
                    } else {
                        return;
                    }
                }
            }
            z = false;
            imageDebugConfiguration = this.mConfig;
            C51442Kr r102 = r14;
            if (imageDebugConfiguration.mShowScans) {
            }
            if (imageDebugConfiguration.mShowFileSize) {
            }
            imageDebugConfiguration2 = this.mConfig;
            if (imageDebugConfiguration2.mShowCacheKey) {
            }
            if (imageDebugConfiguration2.mShowLoadSource == ImageDebugConfiguration.LoadSourceDisplayMode.NAME) {
            }
            overlayDisplayMode = imageDebugConfiguration2.mOverlayDisplayMode;
            Canvas canvas22 = canvas;
            if (overlayDisplayMode != ImageDebugConfiguration.OverlayDisplayMode.NORMAL) {
            }
        }
    }

    private void drawNormalOverlay(Canvas canvas, Context context, ArrayList arrayList, boolean z, C51442Kr r21) {
        Canvas canvas2 = canvas;
        int width = canvas2.getWidth();
        int height = canvas2.getHeight();
        if (this.mConfig.mShowLoadSource == ImageDebugConfiguration.LoadSourceDisplayMode.COLOR) {
            this.mFramePaint.setStrokeWidth((float) (C06220Of.A09(context) / 50));
            this.mFramePaint.setColor(getLoadSourceColor(r21));
            canvas2.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) width, (float) height, this.mFramePaint);
        }
        if (!arrayList.isEmpty()) {
            int i = width;
            if (height < width) {
                i = height;
            }
            float f = (float) (i >> 3);
            float f2 = f / 4.0f;
            this.mTextPaint.setTextSize(f);
            float size = ((float) arrayList.size()) * f;
            float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f3 = Math.max(this.mTextPaint.measureText((String) it.next()), f3);
            }
            Paint paint = this.mBackgroundPaint;
            int i2 = NORMAL_BACKGROUND_COLOR;
            if (z) {
                i2 = ERROR_BACKGROUND_COLOR;
            }
            paint.setColor(i2);
            float f4 = (float) width;
            float f5 = (float) height;
            float f6 = (f5 - size) / 2.0f;
            canvas2.drawRect(((f4 - f3) / 2.0f) - f2, f6, ((f4 + f3) / 2.0f) + f2, ((f5 + size) / 2.0f) + f2, this.mBackgroundPaint);
            float f7 = f6 + f;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                canvas2.drawText((String) it2.next(), (float) (width >> 1), f7, this.mTextPaint);
                f7 += f;
            }
        }
    }

    private void drawTinyOverlay(Canvas canvas, ArrayList arrayList, boolean z, C51442Kr r20) {
        int i;
        Canvas canvas2 = canvas;
        int width = canvas2.getWidth();
        int height = canvas2.getHeight();
        if (height < width) {
            width = height;
        }
        int i2 = width / 20;
        if (this.mConfig.mShowLoadSource == ImageDebugConfiguration.LoadSourceDisplayMode.COLOR) {
            this.mFramePaint.setColor(getLoadSourceColor(r20));
            canvas2.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (height - i2), (float) i2, (float) height, this.mFramePaint);
            i = i2;
        } else {
            i = 0;
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            float f = (float) i2;
            float f2 = f / 4.0f;
            this.mTextPaint.setTextSize(f);
            StringBuilder sb = new StringBuilder((String) arrayList2.get(0));
            for (int i3 = 1; i3 < arrayList2.size(); i3++) {
                sb.append(", ");
                sb.append((String) arrayList2.get(i3));
            }
            String sb2 = sb.toString();
            float measureText = this.mTextPaint.measureText(sb2);
            Paint paint = this.mBackgroundPaint;
            int i4 = NORMAL_BACKGROUND_COLOR;
            if (z) {
                i4 = ERROR_BACKGROUND_COLOR;
            }
            paint.setColor(i4);
            float f3 = (float) i;
            float f4 = (float) height;
            canvas2.drawRect(f3, (float) (height - i2), measureText + f3 + (f2 * 2.0f), f4, this.mBackgroundPaint);
            canvas2.drawText(sb2, f3 + f2, f4 - (((this.mTextPaint.descent() - this.mTextPaint.ascent()) - f) / 2.0f), this.mTextPaint);
        }
    }

    public static int getLoadSourceColor(C51442Kr r5) {
        if (r5 == null) {
            return -7829368;
        }
        String str = r5.A05;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1077756671) {
            if (hashCode != 3083677) {
                if (hashCode == 1843485230 && str.equals("network")) {
                    c = 2;
                }
            } else if (str.equals("disk")) {
                c = 1;
            }
        } else if (str.equals("memory")) {
            c = 0;
        }
        if (c == 0) {
            return -16711936;
        }
        if (c == 1) {
            return -256;
        }
        if (c == 2) {
            return -65536;
        }
        return -7829368;
    }

    public DebugOverlayDrawerImpl(ImageDebugConfiguration imageDebugConfiguration) {
        Paint paint;
        Paint.Style style;
        this.mConfig = imageDebugConfiguration;
        this.mTextPaint.setColor(-1);
        if (this.mConfig.mOverlayDisplayMode == ImageDebugConfiguration.OverlayDisplayMode.TINY) {
            this.mTextPaint.setTextAlign(Paint.Align.LEFT);
            paint = this.mFramePaint;
            style = Paint.Style.FILL;
        } else {
            this.mTextPaint.setTextAlign(Paint.Align.CENTER);
            paint = this.mFramePaint;
            style = Paint.Style.STROKE;
        }
        paint.setStyle(style);
    }

    public static int getOffscreenPixelsPerc(ImageView imageView, Bitmap bitmap) {
        float min = Math.min(((float) bitmap.getWidth()) / ((float) imageView.getWidth()), ((float) bitmap.getHeight()) / ((float) imageView.getHeight()));
        int width = (int) (((float) (imageView.getWidth() * imageView.getHeight())) * min * min);
        int width2 = bitmap.getWidth() * bitmap.getHeight();
        return ((width2 - width) * 100) / width2;
    }
}
