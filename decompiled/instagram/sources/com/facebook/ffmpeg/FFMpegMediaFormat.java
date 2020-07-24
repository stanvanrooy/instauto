package com.facebook.ffmpeg;

import android.media.MediaFormat;
import com.facebook.flipper.core.StateSummary;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p000X.B34;

public class FFMpegMediaFormat {
    public static final B34 ALL_KEYS;
    public final Map mMap = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        Class<String> cls = String.class;
        hashMap.put("mime", cls);
        hashMap.put(StateSummary.$const$string(10), cls);
        Class<Integer> cls2 = Integer.class;
        hashMap.put("sample-rate", cls2);
        hashMap.put("channel-count", cls2);
        hashMap.put(IgReactMediaPickerNativeModule.WIDTH, cls2);
        hashMap.put(IgReactMediaPickerNativeModule.HEIGHT, cls2);
        hashMap.put("max-width", cls2);
        hashMap.put("max-height", cls2);
        hashMap.put("max-input-size", cls2);
        hashMap.put(TraceFieldType.Bitrate, cls2);
        hashMap.put("color-format", cls2);
        hashMap.put("frame-rate", cls2);
        hashMap.put("i-frame-interval", cls2);
        hashMap.put("stride", cls2);
        hashMap.put(StateSummary.$const$string(78), cls2);
        Class<Long> cls3 = Long.class;
        hashMap.put("repeat-previous-frame-after", cls3);
        hashMap.put("push-blank-buffers-on-shutdown", cls2);
        hashMap.put("durationUs", cls3);
        hashMap.put("is-adts", cls2);
        hashMap.put("channel-mask", cls2);
        hashMap.put("aac-profile", cls2);
        hashMap.put("flac-compression-level", cls2);
        hashMap.put("is-autoselect", cls2);
        hashMap.put("is-default", cls2);
        hashMap.put("is-forced-subtitle", cls2);
        hashMap.put("rotation", cls2);
        Class<ByteBuffer> cls4 = ByteBuffer.class;
        hashMap.put("csd-0", cls4);
        hashMap.put("csd-1", cls4);
        ALL_KEYS = new B34(hashMap);
    }

    public static FFMpegMediaFormat toFFMpegMediaFormat(MediaFormat mediaFormat) {
        FFMpegMediaFormat fFMpegMediaFormat = new FFMpegMediaFormat();
        for (Map.Entry entry : ALL_KEYS.entrySet()) {
            String str = (String) entry.getKey();
            Class<ByteBuffer> cls = (Class) entry.getValue();
            if (mediaFormat.containsKey(str)) {
                if (cls == String.class) {
                    fFMpegMediaFormat.setString(str, mediaFormat.getString(str));
                } else if (cls == Integer.class) {
                    fFMpegMediaFormat.setInteger(str, mediaFormat.getInteger(str));
                } else if (cls == Long.class) {
                    fFMpegMediaFormat.setLong(str, mediaFormat.getLong(str));
                } else if (cls == Float.class) {
                    fFMpegMediaFormat.setFloat(str, mediaFormat.getFloat(str));
                } else if (cls == ByteBuffer.class) {
                    fFMpegMediaFormat.setByteBuffer(str, mediaFormat.getByteBuffer(str));
                }
            }
        }
        return fFMpegMediaFormat;
    }

    public final boolean containsKey(String str) {
        return this.mMap.containsKey(str);
    }

    public final ByteBuffer getByteBuffer(String str) {
        return (ByteBuffer) this.mMap.get(str);
    }

    public final float getFloat(String str) {
        return ((Float) this.mMap.get(str)).floatValue();
    }

    public final String getString(String str) {
        return (String) this.mMap.get(str);
    }

    public final void setByteBuffer(String str, ByteBuffer byteBuffer) {
        this.mMap.put(str, byteBuffer);
    }

    public final void setFloat(String str, float f) {
        this.mMap.put(str, new Float(f));
    }

    public final void setInteger(String str, int i) {
        this.mMap.put(str, new Integer(i));
    }

    public final void setLong(String str, long j) {
        this.mMap.put(str, new Long(j));
    }

    public final void setString(String str, String str2) {
        this.mMap.put(str, str2);
    }

    public String toString() {
        return this.mMap.toString();
    }

    public final int getInteger(String str) {
        return ((Integer) this.mMap.get(str)).intValue();
    }

    public final int getInteger(String str, int i) {
        try {
            return getInteger(str);
        } catch (ClassCastException | NullPointerException unused) {
            return i;
        }
    }

    public final long getLong(String str) {
        return ((Long) this.mMap.get(str)).longValue();
    }

    public final long getLong(String str, long j) {
        try {
            return getLong(str);
        } catch (ClassCastException | NullPointerException unused) {
            return j;
        }
    }
}
