package com.facebook.react.modules.camera;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import com.facebook.fbreact.specs.NativeCameraRollManagerSpec;
import com.facebook.flipper.core.StateSummary;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.views.maps.IgStaticMapViewManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.webrtc.MediaStreamTrack;
import p000X.A0k;
import p000X.A1e;
import p000X.A44;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CH;
import p000X.C206658ts;
import p000X.C2102494v;
import p000X.C2102594w;
import p000X.C228259s1;
import p000X.C23043A0y;

@ReactModule(name = "CameraRollManager")
public class CameraRollManager extends NativeCameraRollManagerSpec {
    public static final String ASSET_TYPE_ALL = "All";
    public static final String ASSET_TYPE_PHOTOS = "Photos";
    public static final String ASSET_TYPE_VIDEOS = "Videos";
    public static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    public static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    public static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    public static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final int IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL = 29;
    public static final String NAME = "CameraRollManager";
    public static final String[] PROJECTION_LIST;
    public static final String SELECTION_BUCKET = "bucket_display_name = ?";
    public static final String SELECTION_DATE_TAKEN = "datetaken < ?";
    public static final String SELECTION_MEDIA_SIZE = "_size < ?";

    public void deletePhotos(A1e a1e, C2102594w r2) {
    }

    public String getName() {
        return NAME;
    }

    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"_id", "mime_type", "bucket_display_name", "datetaken", IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.HEIGHT, "_data"}));
        if (Build.VERSION.SDK_INT < 29) {
            arrayList.add(IgStaticMapViewManager.LATITUDE_KEY);
            arrayList.add(IgStaticMapViewManager.LONGITUDE_KEY);
        }
        PROJECTION_LIST = (String[]) arrayList.toArray(new String[0]);
    }

    public static void putEdges(ContentResolver contentResolver, Cursor cursor, C228259s1 r20, int i) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        Cursor cursor2 = cursor;
        cursor2.moveToFirst();
        int columnIndex = cursor2.getColumnIndex("_id");
        int columnIndex2 = cursor2.getColumnIndex("mime_type");
        int columnIndex3 = cursor2.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor2.getColumnIndex("datetaken");
        int columnIndex5 = cursor2.getColumnIndex(IgReactMediaPickerNativeModule.WIDTH);
        int columnIndex6 = cursor2.getColumnIndex(IgReactMediaPickerNativeModule.HEIGHT);
        int columnIndex7 = cursor2.getColumnIndex(IgStaticMapViewManager.LONGITUDE_KEY);
        int columnIndex8 = cursor2.getColumnIndex(IgStaticMapViewManager.LATITUDE_KEY);
        int columnIndex9 = cursor2.getColumnIndex("_data");
        int i2 = 0;
        while (i2 < i && !cursor2.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            if (putImageInfo(contentResolver, cursor2, writableNativeMap2, columnIndex, columnIndex5, columnIndex6, columnIndex9, columnIndex2)) {
                putBasicNodeInfo(cursor2, writableNativeMap2, columnIndex2, columnIndex3, columnIndex4);
                if (Build.VERSION.SDK_INT < 29) {
                    putLocationInfo(cursor2, writableNativeMap2, columnIndex7, columnIndex8);
                }
                writableNativeMap.putMap("node", writableNativeMap2);
                writableNativeArray.pushMap(writableNativeMap);
            } else {
                i2--;
            }
            cursor2.moveToNext();
            i2++;
        }
        r20.putArray("edges", writableNativeArray);
    }

    public static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, C228259s1 r14, int i, int i2, int i3, int i4, int i5) {
        String str;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri parse = Uri.parse(AnonymousClass000.A0E("file://", cursor.getString(i4)));
        writableNativeMap.putString("uri", parse.toString());
        float f = (float) cursor.getInt(i2);
        float f2 = (float) cursor.getInt(i3);
        String string = cursor.getString(i5);
        if (string != null && string.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f2 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    try {
                        f = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        f2 = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    } catch (NumberFormatException e) {
                        AnonymousClass0CH.A09("ReactNative", AnonymousClass000.A0E("Number format exception occurred while trying to fetch video metadata for ", parse.toString()), e);
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        return false;
                    } catch (Throwable th) {
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        throw th;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
            } catch (Exception e2) {
                e = e2;
                str = "Could not get video metadata for ";
            }
        }
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f2 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(parse, "r");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), (Rect) null, options);
                f = (float) options.outWidth;
                f2 = (float) options.outHeight;
                openAssetFileDescriptor2.close();
            } catch (IOException e3) {
                e = e3;
                str = "Could not get width/height for ";
                AnonymousClass0CH.A09("ReactNative", AnonymousClass000.A0E(str, parse.toString()), e);
                return false;
            }
        }
        writableNativeMap.putDouble(IgReactMediaPickerNativeModule.WIDTH, (double) f);
        writableNativeMap.putDouble(IgReactMediaPickerNativeModule.HEIGHT, (double) f2);
        r14.putMap("image", writableNativeMap);
        return true;
    }

    public static void putPageInfo(Cursor cursor, C228259s1 r5, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        boolean z = false;
        if (i < cursor.getCount()) {
            z = true;
        }
        writableNativeMap.putBoolean(StateSummary.$const$string(59), z);
        if (i < cursor.getCount()) {
            cursor.moveToPosition(i - 1);
            writableNativeMap.putString("end_cursor", cursor.getString(cursor.getColumnIndex("datetaken")));
        }
        r5.putMap("page_info", writableNativeMap);
    }

    public void getPhotos(C23043A0y a0y, C2102594w r13) {
        String str;
        String str2;
        String str3;
        Integer num;
        int i = a0y.getInt("first");
        A1e a1e = null;
        if (a0y.hasKey("after")) {
            str = a0y.getString("after");
        } else {
            str = null;
        }
        if (a0y.hasKey("groupName")) {
            str2 = a0y.getString("groupName");
        } else {
            str2 = null;
        }
        if (a0y.hasKey("assetType")) {
            str3 = a0y.getString("assetType");
        } else {
            str3 = ASSET_TYPE_PHOTOS;
        }
        if (a0y.hasKey("maxSize")) {
            num = Integer.valueOf(a0y.getInt("maxSize"));
        } else {
            num = null;
        }
        if (a0y.hasKey("mimeTypes")) {
            a1e = a0y.getArray("mimeTypes");
        }
        if (!a0y.hasKey("groupTypes")) {
            new C2102494v(getReactApplicationContext(), i, str, str2, a1e, str3, num, r13).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new A0k("groupTypes is not supported on Android");
    }

    public void saveToCameraRoll(String str, String str2, C2102594w r6) {
        new C206658ts(getReactApplicationContext(), Uri.parse(str), r6).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static void putBasicNodeInfo(Cursor cursor, C228259s1 r4, int i, int i2, int i3) {
        r4.putString("type", cursor.getString(i));
        r4.putString("group_name", cursor.getString(i2));
        r4.putDouble("timestamp", ((double) cursor.getLong(i3)) / 1000.0d);
    }

    public static void putLocationInfo(Cursor cursor, C228259s1 r7, int i, int i2) {
        double d = cursor.getDouble(i);
        double d2 = cursor.getDouble(i2);
        if (d > 0.0d || d2 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(IgStaticMapViewManager.LONGITUDE_KEY, d);
            writableNativeMap.putDouble(IgStaticMapViewManager.LATITUDE_KEY, d2);
            r7.putMap("location", writableNativeMap);
        }
    }

    public CameraRollManager(A44 a44) {
        super(a44);
    }
}
