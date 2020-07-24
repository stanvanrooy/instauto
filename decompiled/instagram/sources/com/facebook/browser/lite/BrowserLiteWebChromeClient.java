package com.facebook.browser.lite;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.view.ViewStub;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.facebook.C0003R;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.facebook.secure.fileprovider.common.FileStatHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000X.ADD;
import p000X.AQ8;
import p000X.AQO;
import p000X.ARQ;
import p000X.ASA;
import p000X.ATK;
import p000X.ATR;
import p000X.ATS;
import p000X.ATT;
import p000X.ATW;
import p000X.ATb;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass40t;
import p000X.C019000b;
import p000X.C193418Ps;
import p000X.C23156AAg;
import p000X.C23619AUb;
import p000X.C23620AUd;
import p000X.C36431i2;

public class BrowserLiteWebChromeClient implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    public int A00 = 0;
    public AlertDialog A01;
    public Intent A02;
    public ValueCallback A03;
    public ValueCallback A04;
    public WebChromeClient.CustomViewCallback A05;
    public WebChromeClient.FileChooserParams A06;
    public FrameLayout A07;
    public VideoView A08;
    public BrowserLiteFragment A09;
    public ARQ A0A;
    public BrowserLiteProgressBar A0B;
    public AQ8 A0C;
    public List A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G;
    public ContentResolver A0H;
    public ValueCallback A0I;

    public static boolean A02(BrowserLiteWebChromeClient browserLiteWebChromeClient, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (!(valueCallback == null || fileChooserParams == null)) {
            ValueCallback valueCallback2 = browserLiteWebChromeClient.A03;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue((Object) null);
                browserLiteWebChromeClient.A03 = null;
            }
            browserLiteWebChromeClient.A03 = valueCallback;
            try {
                browserLiteWebChromeClient.A09.startActivityForResult(fileChooserParams.createIntent(), 2);
                return true;
            } catch (ActivityNotFoundException unused) {
                ATK.A03("failed to resolve activity", new Object[0]);
                browserLiteWebChromeClient.A03 = null;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r11 = new java.lang.StringBuilder(r13.getCanonicalPath());
        r10 = r12.A03.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019b, code lost:
        if (r10.hasNext() == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019d, code lost:
        r11.append(", ");
        r11.append(((java.io.File) ((java.util.Map.Entry) r10.next()).getValue()).getCanonicalPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c6, code lost:
        r10 = new java.lang.SecurityException(p000X.AnonymousClass000.A0E("Resolved path jumped beyond configured direct roots: ", r11.toString()));
     */
    public final void A04(int i, int i2, Intent intent) {
        Uri[] uriArr;
        ArrayList arrayList;
        ValueCallback valueCallback;
        ValueCallback valueCallback2;
        C23620AUd aUd;
        ADD add;
        IOException th;
        FileOutputStream fileOutputStream;
        Uri uri;
        SecurityException securityException;
        int length;
        int i3 = i;
        if (i3 == 1 || i3 == 2) {
            List emptyList = Collections.emptyList();
            Intent intent2 = intent;
            int i4 = i2;
            if (i3 == 1) {
                if (i4 == -1 && intent != null) {
                    emptyList = Collections.singletonList(intent2.getData());
                }
            } else if (i3 == 2) {
                if (Build.VERSION.SDK_INT >= 21) {
                    uriArr = ATW.A00(i4, intent2);
                } else {
                    uriArr = null;
                }
                if (uriArr != null) {
                    emptyList = Arrays.asList(uriArr);
                }
            }
            arrayList = new ArrayList();
            Iterator it = emptyList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Uri uri2 = (Uri) it.next();
                if (uri2 != null) {
                    try {
                        if (!ATb.A01(this.A0H.openFileDescriptor(uri2, "r"))) {
                            arrayList.clear();
                            break;
                        }
                        Activity activity = this.A09.getActivity();
                        Activity activity2 = this.A09.getActivity();
                        AssetFileDescriptor openAssetFileDescriptor = activity2.getContentResolver().openAssetFileDescriptor(uri2, "r");
                        ParcelFileDescriptor parcelFileDescriptor = openAssetFileDescriptor.getParcelFileDescriptor();
                        int myUid = Process.myUid();
                        int i5 = FileStatHelper.statOpenFile(parcelFileDescriptor.getFd()).ownerUid;
                        boolean z = false;
                        if (myUid == i5) {
                            z = true;
                        }
                        if (!z) {
                            try {
                                if (ATb.A01(openAssetFileDescriptor.getParcelFileDescriptor())) {
                                    aUd = C23620AUd.EXTERNAL_CACHE_PATH;
                                } else {
                                    aUd = C23620AUd.CACHE_PATH;
                                }
                                C23620AUd aUd2 = aUd;
                                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(activity2.getContentResolver().getType(uri2));
                                C23619AUb A012 = C23619AUb.A01(activity2, (ProviderInfo) null, new C23156AAg());
                                if (aUd == null) {
                                    add = C23619AUb.A02(A012, C23620AUd.CACHE_PATH);
                                } else {
                                    add = C23619AUb.A02(A012, aUd);
                                }
                                if (add == null) {
                                    th = new IOException(AnonymousClass000.A0E("No shareable directory manager for ", aUd2.A00));
                                    break;
                                }
                                if (extensionFromMimeType != null && !extensionFromMimeType.startsWith(".")) {
                                    extensionFromMimeType = AnonymousClass000.A0E(".", extensionFromMimeType);
                                }
                                File createTempFile = File.createTempFile("inbound", extensionFromMimeType, add.A00());
                                fileOutputStream = new FileOutputStream(createTempFile);
                                FileInputStream createInputStream = openAssetFileDescriptor.createInputStream();
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = createInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.close();
                                openAssetFileDescriptor.close();
                                C23619AUb A013 = C23619AUb.A01(activity, (ProviderInfo) null, new C23156AAg());
                                Map.Entry A052 = A013.A05(createTempFile);
                                if (A052 == null) {
                                    if (!A013.A05) {
                                        securityException = new SecurityException(AnonymousClass000.A0E("Resolved path jumped beyond configured temporary roots: ", createTempFile.getPath()));
                                        break;
                                    }
                                    String canonicalPath = createTempFile.getCanonicalPath();
                                    C23619AUb.A03(A013);
                                    Map.Entry entry = null;
                                    int i6 = 0;
                                    for (Map.Entry entry2 : A013.A03.entrySet()) {
                                        String canonicalPath2 = ((File) entry2.getValue()).getCanonicalPath();
                                        if (canonicalPath.startsWith(canonicalPath2) && (length = canonicalPath2.length()) > i6) {
                                            i6 = length;
                                            entry = entry2;
                                        }
                                    }
                                    if (entry == null) {
                                        break;
                                    }
                                    uri = C23619AUb.A00(A013, ((File) entry.getValue()).getPath(), (String) entry.getKey(), createTempFile.getCanonicalPath(), false);
                                } else {
                                    uri = C23619AUb.A00(A013, ((ADD) A052.getValue()).A00().getPath(), ((C23620AUd) A052.getKey()).A00, createTempFile.getCanonicalPath(), true);
                                }
                                arrayList.add(uri);
                            } catch (Throwable th2) {
                                openAssetFileDescriptor.close();
                                throw th2;
                            }
                        } else {
                            throw new SecurityException("Attempted to retrieve internal file.");
                        }
                    } catch (IOException unused) {
                        ATK.A03("failed to open file from uri = " + uri2, new Object[0]);
                        arrayList.clear();
                    }
                }
            }
            throw securityException;
        }
        return;
        if (arrayList.isEmpty()) {
            ValueCallback valueCallback3 = this.A03;
            if (valueCallback3 != null) {
                valueCallback3.onReceiveValue((Object) null);
                this.A03 = null;
                return;
            }
            return;
        } else if (i3 == 1 && (valueCallback2 = this.A0I) != null) {
            valueCallback2.onReceiveValue(arrayList.get(0));
            this.A0I = null;
            return;
        } else if (i3 == 2 && (valueCallback = this.A03) != null) {
            valueCallback.onReceiveValue(arrayList.toArray(new Uri[0]));
            this.A03 = null;
            return;
        } else {
            return;
        }
        throw th;
    }

    public static void A00(BrowserLiteWebChromeClient browserLiteWebChromeClient, int i) {
        ARQ arq = browserLiteWebChromeClient.A0A;
        if (arq != null) {
            arq.A02.setProgress(i);
        } else {
            browserLiteWebChromeClient.A0B.setProgress(i);
        }
        for (ASA asa : browserLiteWebChromeClient.A0D) {
            BrowserLiteProgressBar browserLiteProgressBar = asa.A00;
            if (browserLiteProgressBar != null) {
                browserLiteProgressBar.setProgress(i);
            }
        }
    }

    public static void A01(BrowserLiteWebChromeClient browserLiteWebChromeClient, boolean z) {
        if (z) {
            browserLiteWebChromeClient.A09.getActivity().getWindow().getDecorView().setSystemUiVisibility(0);
        } else {
            browserLiteWebChromeClient.A09.getActivity().getWindow().getDecorView().setSystemUiVisibility(4);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.A07.removeAllViews();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final void A03() {
        if (this.A07.getVisibility() != 8) {
            VideoView videoView = this.A08;
            if (videoView != null) {
                videoView.stopPlayback();
                this.A08 = null;
            }
            WebChromeClient.CustomViewCallback customViewCallback = this.A05;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
                this.A05 = null;
            }
            this.A07.setVisibility(8);
            A01(this, true);
            this.A07.removeAllViews();
        }
    }

    public final void A05(PermissionRequest permissionRequest) {
        String[] resources;
        int length;
        Intent intent;
        String str;
        Object[] objArr;
        String str2;
        if (permissionRequest != null && Build.VERSION.SDK_INT >= 21 && (resources = permissionRequest.getResources()) != null && (length = resources.length) > 0 && length <= 1) {
            if (this.A0G && "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                Activity activity = this.A09.getActivity();
                if (activity != null) {
                    if (C019000b.A01(activity, "android.permission.CAMERA") != 0) {
                        str = "BrowserLiteWebChromeClient";
                        objArr = new Object[0];
                        str2 = "Does not have camera permission";
                    } else if (!activity.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
                        str = "BrowserLiteWebChromeClient";
                        objArr = new Object[0];
                        str2 = "Does not have camera";
                    } else {
                        this.A0E = true;
                        this.A01 = new AlertDialog.Builder(activity).setMessage(activity.getString(C0003R.string.__external__browser_lite_camera_permission_prompt, new Object[]{permissionRequest.getOrigin().getHost()})).setPositiveButton(activity.getString(C0003R.string.__external__browser_lite_permission_allow), new ATR(this, activity, permissionRequest)).setNegativeButton(activity.getString(C0003R.string.__external__browser_lite_permission_block), new ATT(this, activity, permissionRequest)).setOnCancelListener(new ATS(this, activity, permissionRequest)).show();
                        return;
                    }
                    ATK.A00(str, str2, objArr);
                }
            } else if ("android.webkit.resource.PROTECTED_MEDIA_ID".equals(resources[0]) && (intent = this.A02) != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_RESOURCE_PROTECTED_MEDIA_ID_ENABLED", false)) {
                permissionRequest.grant(resources);
            }
        }
    }

    public boolean onShowFileChooser(AQ8 aq8, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (!this.A0F) {
            return A02(this, valueCallback, fileChooserParams);
        }
        Activity activity = this.A09.getActivity();
        String $const$string = AnonymousClass0C5.$const$string(322);
        if (C019000b.A01(activity, $const$string) != 0) {
            C36431i2.A0B(activity, new String[]{$const$string}, 3);
            this.A04 = valueCallback;
            this.A06 = fileChooserParams;
            return true;
        }
        A02(this, valueCallback, fileChooserParams);
        return true;
    }

    public BrowserLiteWebChromeClient(AQ8 aq8, BrowserLiteFragment browserLiteFragment, ARQ arq, boolean z, ContentResolver contentResolver, boolean z2) {
        this.A0C = aq8;
        this.A09 = browserLiteFragment;
        this.A07 = (FrameLayout) browserLiteFragment.getView().findViewById(C0003R.C0005id.frame_full_screen_video);
        this.A0G = z;
        this.A0D = AQO.A00().A01(ASA.class);
        this.A0A = arq;
        this.A0H = contentResolver;
        this.A0F = z2;
        Activity activity = this.A09.getActivity();
        if (activity != null) {
            this.A02 = activity.getIntent();
        }
        ARQ arq2 = this.A0A;
        if (arq2 != null) {
            arq2.A02.AdT();
            return;
        }
        BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) this.A09.getView().findViewById(C0003R.C0005id.progress_bar);
        this.A0B = browserLiteProgressBar;
        if (browserLiteProgressBar == null) {
            this.A0B = (BrowserLiteProgressBar) ((ViewStub) this.A09.getView().findViewById(C0003R.C0005id.progress_bar_stub)).inflate();
        } else {
            browserLiteProgressBar.setVisibility(0);
        }
        this.A0B.setProgress(0);
        for (ASA asa : this.A0D) {
            boolean z3 = false;
            BrowserLiteProgressBar browserLiteProgressBar2 = (BrowserLiteProgressBar) asa.A02.findViewById(0);
            asa.A00 = browserLiteProgressBar2;
            if (browserLiteProgressBar2 != null && browserLiteProgressBar2.getVisibility() == 0) {
                z3 = true;
                continue;
            }
            if (z3) {
                this.A0B.setVisibility(8);
                return;
            }
        }
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            A03();
        } catch (Throwable unused) {
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            A03();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void openFileChooser(ValueCallback valueCallback, String str) {
        openFileChooser(valueCallback, str, "");
    }

    public void openFileChooser(ValueCallback valueCallback, String str, String str2) {
        this.A0I = valueCallback;
        Intent intent = new Intent(AnonymousClass40t.$const$string(5));
        intent.addCategory(C193418Ps.$const$string(80));
        intent.setType(str);
        try {
            this.A09.startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
