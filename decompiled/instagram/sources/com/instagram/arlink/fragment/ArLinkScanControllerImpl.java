package com.instagram.arlink.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.instagram.arlink.model.ArLinkCandidate;
import com.instagram.arlink.util.ArLinkScanner;
import com.instagram.camera.effect.p016mq.voltron.IgArVoltronModuleLoader;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass281;
import p000X.AnonymousClass2MW;
import p000X.AnonymousClass37O;
import p000X.AnonymousClass3ZG;
import p000X.AnonymousClass8GJ;
import p000X.AnonymousClass8GK;
import p000X.AnonymousClass8GL;
import p000X.AnonymousClass8GM;
import p000X.AnonymousClass8GN;
import p000X.AnonymousClass8GT;
import p000X.AnonymousClass8GU;
import p000X.AnonymousClass8GV;
import p000X.AnonymousClass8GZ;
import p000X.C05760Lv;
import p000X.C05770Lw;
import p000X.C14440kc;
import p000X.C174517cw;
import p000X.C178077j5;
import p000X.C180017mO;
import p000X.C180027mP;
import p000X.C180037mQ;
import p000X.C180047mR;
import p000X.C180067mT;
import p000X.C191398Gb;
import p000X.C191418Gd;
import p000X.C191428Ge;
import p000X.C191438Gf;
import p000X.C191468Gj;
import p000X.C191478Gk;
import p000X.C191488Gl;
import p000X.C194318Tn;
import p000X.C22270y8;
import p000X.C22470yU;
import p000X.C229269xL;
import p000X.C23300zv;
import p000X.C27341Hl;
import p000X.C483127m;
import p000X.C76823Xl;
import p000X.C77393Zq;
import p000X.C85533nX;

public class ArLinkScanControllerImpl {
    public static final long ERROR_DELAY_MS = 5000;
    public static final String MODEL_INIT_NET = "model_init.pb";
    public static final String MODEL_PREDICT_NET = "model.pb";
    public static final int MSG_CLEANUP = 5;
    public static final int MSG_HANDLE_CAMERA_FRAME = 2;
    public static final int MSG_HANDLE_IMAGE_FRAME = 4;
    public static final int MSG_HANDLE_YUV_CAMERA_FRAME = 3;
    public static final int MSG_INIT = 1;
    public static final String OCR_MODEL_INIT_NET = "ocr_model_init.pb";
    public static final String OCR_MODEL_NET = "ocr_model.pb";
    public static final String TAG = "ArLinkScanController";
    public static final int TARGET_IMAGE_SIZE = 720;
    public ArLinkScanner mArLinkScanner;
    public volatile boolean mCameraActive;
    public final C174517cw mCandidateComparator = new C174517cw();
    public final AnonymousClass8GV mConsistencyVerifier = new AnonymousClass8GV();
    public final C85533nX mDelegate;
    public final C27341Hl mFragment;
    public Handler mFrameHandler;
    public final AnonymousClass8GK mFrameHandlerCallback = new AnonymousClass8GK(this);
    public HandlerThread mFrameHandlerThread;
    public final Handler mHandler = new Handler(Looper.getMainLooper());
    public boolean mIsModelLoading;
    public String mModelVersion;
    public int mPreviewHeight;
    public int mPreviewWidth;
    public volatile boolean mProcessingCameraCandidate;
    public volatile boolean mProcessingImageCandidate;
    public final C229269xL mQRCodeDetectionHelper;
    public final AnonymousClass0C1 mUserSession;

    private boolean handleQRCodeResult(AnonymousClass2MW r5) {
        if (r5 != null) {
            switch (((C191468Gj) r5.A00).ordinal()) {
                case 0:
                    AnonymousClass0ZA.A0E(this.mHandler, new C180037mQ(this, r5), 1697824954);
                    return true;
                case 1:
                    requestUserLookup((String) r5.A01, 1.0f, true);
                    return true;
            }
        }
        return false;
    }

    private synchronized void initializeFrameHandler(int i) {
        if (this.mFrameHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread("ArLinkScanController.FrameHandlerThread", i);
            this.mFrameHandlerThread = handlerThread;
            handlerThread.start();
            this.mFrameHandler = new Handler(this.mFrameHandlerThread.getLooper(), this.mFrameHandlerCallback);
        }
    }

    public static C194318Tn createModuleLoadCallback(C14440kc r1, C22470yU r2) {
        return new AnonymousClass8GU(r1, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r0 == null) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    public static void handleImageFrame(ArLinkScanControllerImpl arLinkScanControllerImpl, String str) {
        Bitmap A00;
        AnonymousClass2MW r0;
        ArLinkCandidate arLinkCandidate;
        boolean z;
        String str2 = str;
        if (!TextUtils.isEmpty(str2) && !arLinkScanControllerImpl.mProcessingImageCandidate) {
            File file = new File(str2);
            if (file.exists() && file.canRead() && (A00 = C76823Xl.A00(str2, TARGET_IMAGE_SIZE)) != null) {
                C229269xL r4 = arLinkScanControllerImpl.mQRCodeDetectionHelper;
                if (r4.A04.booleanValue()) {
                    C191398Gb r5 = new C191398Gb();
                    int width = A00.getWidth();
                    int height = A00.getHeight();
                    r5.A00 = A00;
                    C191428Ge r02 = r5.A01;
                    r02.A01 = width;
                    r02.A00 = height;
                    if (r5.A02 == null && A00 == null) {
                        throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                    }
                    r0 = C229269xL.A00(r4, r5);
                    if (r0 == null) {
                        int[] iArr = new int[(A00.getWidth() * A00.getHeight())];
                        A00.getPixels(iArr, 0, A00.getWidth(), 0, 0, A00.getWidth(), A00.getHeight());
                        r0 = C229269xL.A01(r4, new C191478Gk(A00.getWidth(), A00.getHeight(), iArr));
                    }
                    if (!arLinkScanControllerImpl.handleQRCodeResult(r0)) {
                        return;
                    }
                    if (arLinkScanControllerImpl.mArLinkScanner != null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(A00.getAllocationByteCount());
                        A00.copyPixelsToBuffer(allocateDirect);
                        C180067mT.A00(arLinkScanControllerImpl.mUserSession).A01("detect_candidate");
                        List sortCandidates = arLinkScanControllerImpl.sortCandidates(ArLinkScanner.nativeGetCandidatesFromARGBImage(arLinkScanControllerImpl.mArLinkScanner.A00, allocateDirect, A00.getRowBytes(), A00.getWidth(), A00.getHeight()));
                        if (sortCandidates.isEmpty()) {
                            arLinkCandidate = null;
                        } else {
                            arLinkCandidate = (ArLinkCandidate) sortCandidates.get(0);
                        }
                        arLinkScanControllerImpl.notifyCandidateDetected(sortCandidates, false);
                        if (arLinkCandidate != null && !TextUtils.isEmpty(arLinkCandidate.mDetectedText)) {
                            if (!AnonymousClass8GZ.A00(arLinkScanControllerImpl.mUserSession).booleanValue() || ((!(z = arLinkCandidate.mHasLineCode) || arLinkCandidate.mLineCode != 0) && (z || arLinkCandidate.mLineCode <= 0))) {
                                arLinkScanControllerImpl.logCandidateDetected(arLinkCandidate, A00.getWidth(), A00.getHeight(), false);
                                String str3 = arLinkCandidate.mDetectedText;
                                int i = arLinkCandidate.mLineCode;
                                if (!TextUtils.isEmpty(str3)) {
                                    float f = arLinkCandidate.mOCRScore;
                                    if (i > 0) {
                                        arLinkScanControllerImpl.requestUserLookup(str3, i, f, false);
                                        return;
                                    } else {
                                        arLinkScanControllerImpl.requestUserLookup(str3, f, false);
                                        return;
                                    }
                                }
                            } else {
                                AnonymousClass0DB.A0E(TAG, "Line code inconsistency found. Rejecting result.");
                            }
                        }
                    }
                }
                r0 = null;
                if (!arLinkScanControllerImpl.handleQRCodeResult(r0)) {
                }
            }
        }
        arLinkScanControllerImpl.mDelegate.B73();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    public static void initializeScanner(ArLinkScanControllerImpl arLinkScanControllerImpl) {
        String str;
        ArLinkScanControllerImpl arLinkScanControllerImpl2 = arLinkScanControllerImpl;
        Context context = arLinkScanControllerImpl2.mFragment.getContext();
        if (context == null) {
            AnonymousClass0DB.A0D(TAG, "Fragment is no longer attached to activity. Not initializing scanner.");
        } else if (arLinkScanControllerImpl2.mArLinkScanner == null && !arLinkScanControllerImpl2.mIsModelLoading) {
            AnonymousClass281 A00 = C483127m.A00(arLinkScanControllerImpl2.mUserSession);
            if (!A00.Agb(context)) {
                A00.BpH(context, TAG);
                return;
            }
            C180067mT.A00(arLinkScanControllerImpl2.mUserSession).A01("load_arlink_model");
            boolean z = false;
            if (((Boolean) AnonymousClass0L6.A02(arLinkScanControllerImpl2.mUserSession, AnonymousClass0L7.USE_ARD_FOR_NAMETAG, "use_ar_delivery", false, (AnonymousClass04H) null)).booleanValue()) {
                arLinkScanControllerImpl2.mIsModelLoading = true;
                AnonymousClass0C1 r4 = arLinkScanControllerImpl2.mUserSession;
                AnonymousClass37O.A00(context, r4).ADz(Collections.singletonList(VersionedCapability.Nametag), false, new AnonymousClass8GJ(arLinkScanControllerImpl2));
                return;
            }
            String string = C05760Lv.A01.A00.getString("arlink_model_checksum", (String) null);
            arLinkScanControllerImpl2.mModelVersion = C05760Lv.A01.A00.getString("arlink_model_version", (String) null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(arLinkScanControllerImpl2.mModelVersion)) {
                File file = new File(new File(arLinkScanControllerImpl2.mFragment.getContext().getFilesDir(), "ig_arlink_model"), string);
                File file2 = new File(file, MODEL_INIT_NET);
                File file3 = new File(file, MODEL_PREDICT_NET);
                File file4 = new File(file, OCR_MODEL_INIT_NET);
                File file5 = new File(file, OCR_MODEL_NET);
                C14440kc loadModule = arLinkScanControllerImpl2.loadModule(arLinkScanControllerImpl2.mUserSession, C22470yU.CAFFE2);
                if (checkNerualNetModels(file2, file3) && checkNerualNetModels(file4, file5)) {
                    try {
                        if (((Boolean) loadModule.get(5, TimeUnit.MINUTES)).booleanValue()) {
                            String canonicalPath = file2.getCanonicalPath();
                            String canonicalPath2 = file3.getCanonicalPath();
                            String canonicalPath3 = file4.getCanonicalPath();
                            String canonicalPath4 = file5.getCanonicalPath();
                            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(arLinkScanControllerImpl2.mUserSession, AnonymousClass0L7.USE_ARD_FOR_NAMETAG, "use_card_crop", false, (AnonymousClass04H) null)).booleanValue();
                            boolean booleanValue2 = ((Boolean) AnonymousClass0L6.A02(arLinkScanControllerImpl2.mUserSession, AnonymousClass0L7.USE_ARD_FOR_NAMETAG, "reject_multiple_card_regions", true, (AnonymousClass04H) null)).booleanValue();
                            AnonymousClass0C1 r9 = arLinkScanControllerImpl2.mUserSession;
                            AnonymousClass0L7 r8 = AnonymousClass0L7.USE_ARD_FOR_NAMETAG;
                            arLinkScanControllerImpl2.mArLinkScanner = new ArLinkScanner(canonicalPath, canonicalPath2, canonicalPath3, canonicalPath4, booleanValue, booleanValue2, ((Boolean) AnonymousClass0L6.A02(r9, r8, "adaptive_detection", false, (AnonymousClass04H) null)).booleanValue(), ((Integer) AnonymousClass0L6.A02(arLinkScanControllerImpl2.mUserSession, r8, "detection_margin", 20, (AnonymousClass04H) null)).intValue());
                            try {
                                logArlinkModelLoadSuccess(arLinkScanControllerImpl2);
                                z = true;
                            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                                e = e;
                                z = true;
                            } catch (IOException e2) {
                                e = e2;
                                z = true;
                                str = "Unable to access AR Link model files.";
                                AnonymousClass0DB.A0G(TAG, str, e);
                                if (z) {
                                }
                            }
                        }
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        e = e3;
                        str = "Unable to download Caffe2 voltron module.";
                        AnonymousClass0DB.A0G(TAG, str, e);
                        if (z) {
                        }
                    } catch (IOException e4) {
                        e = e4;
                        str = "Unable to access AR Link model files.";
                        AnonymousClass0DB.A0G(TAG, str, e);
                        if (z) {
                        }
                    }
                }
            }
            if (z) {
                C05760Lv.A01.A00.edit().putString("arlink_model_checksum", (String) null).apply();
                C05760Lv.A01.A00.edit().putLong("arlink_model_last_check_timestamp", 0).apply();
                C180067mT A002 = C180067mT.A00(arLinkScanControllerImpl2.mUserSession);
                AnonymousClass0P4 A003 = C77393Zq.A00(Constants.A07);
                A003.A0G("model_version", arLinkScanControllerImpl2.mModelVersion);
                A002.A02("load_arlink_model", A003);
                AnonymousClass0DB.A0D(TAG, "Fail to load AR Link model.");
                C23300zv.A00(arLinkScanControllerImpl2.mUserSession).BXT(new C178077j5());
                A00.BpH(context, TAG);
            }
        }
    }

    private C14440kc loadModule(AnonymousClass0C1 r8, C22470yU r9) {
        C194318Tn r0;
        C14440kc r6 = new C14440kc();
        C22270y8 A01 = C22270y8.A01();
        AnonymousClass8GM r4 = new AnonymousClass8GM(r9);
        r4.A03 = Constants.ONE;
        if (((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.AR_LINK_SCAN_CTRLR_LOADER_MEM_LEAK_FIX, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            r0 = new AnonymousClass8GU(r6, r9);
        } else {
            r0 = new AnonymousClass8GT(this, r6, r9);
        }
        r4.A02 = r0;
        A01.A04(r8, new AnonymousClass8GN(r4));
        return r6;
    }

    public static void logArlinkModelLoadSuccess(ArLinkScanControllerImpl arLinkScanControllerImpl) {
        C180067mT A00 = C180067mT.A00(arLinkScanControllerImpl.mUserSession);
        AnonymousClass0P4 A002 = C77393Zq.A00(Constants.A06);
        A002.A0G("model_version", arLinkScanControllerImpl.mModelVersion);
        A00.A02("load_arlink_model", A002);
    }

    private void logCandidateDetected(ArLinkCandidate arLinkCandidate, int i, int i2, boolean z) {
        AnonymousClass0P4 A00 = C77393Zq.A00(Constants.A0F);
        A00.A0G("model_version", this.mModelVersion);
        A00.A0A("from_camera", Boolean.valueOf(z));
        A00.A0E("image_width", Integer.valueOf(i));
        A00.A0E("image_height", Integer.valueOf(i2));
        A00.A0D("rotation_degree", Float.valueOf(arLinkCandidate.getRotationDegree()));
        A00.A0D("confidence_score", Float.valueOf(arLinkCandidate.mConfidenceScore));
        C180067mT.A00(this.mUserSession).A02("detect_candidate", A00);
    }

    private void notifyCandidateDetected(List list, boolean z) {
        AnonymousClass0ZA.A0E(this.mHandler, new C180047mR(this, list, z), 22421276);
    }

    public static void onModuleLoadSuccess(C14440kc r3, C22470yU r4) {
        if (C22470yU.CAFFE2.equals(r4)) {
            try {
                AnonymousClass0Y1.A09(IgArVoltronModuleLoader.CAFFE2_VOLTRON_MODULE_NAME, 16);
                AnonymousClass0Y1.A09("caffe2_ig_ops", 16);
            } catch (UnsatisfiedLinkError e) {
                AnonymousClass0DB.A0I(TAG, "SoLoader caffe2 library exception:", e);
                r3.A0A(false);
                return;
            }
        }
        r3.A0A(true);
    }

    private List sortCandidates(ArLinkCandidate[] arLinkCandidateArr) {
        List asList;
        if (arLinkCandidateArr == null) {
            asList = Collections.emptyList();
        } else {
            asList = Arrays.asList(arLinkCandidateArr);
        }
        if (!asList.isEmpty()) {
            Collections.sort(asList, this.mCandidateComparator);
            ((ArLinkCandidate) asList.get(0)).getRotationDegree();
        }
        return asList;
    }

    public void cleanup() {
        Handler handler;
        if (this.mFrameHandlerThread != null && (handler = this.mFrameHandler) != null) {
            AnonymousClass0ZA.A07(handler, (Object) null);
            AnonymousClass0ZA.A0B(this.mFrameHandler, 5);
            this.mFrameHandlerThread.quitSafely();
            this.mFrameHandler = null;
            this.mFrameHandlerThread = null;
        }
    }

    public void initialize(int i) {
        if (this.mFrameHandlerThread == null) {
            initializeFrameHandler(i);
        }
        AnonymousClass0ZA.A0B(this.mFrameHandler, 1);
    }

    public void setCameraActive(boolean z, int i, int i2) {
        this.mCameraActive = z;
        if (z) {
            this.mPreviewWidth = i;
            this.mPreviewHeight = i2;
        }
    }

    public void setImageFrame(String str) {
        Handler handler = this.mFrameHandler;
        if (handler != null) {
            AnonymousClass0ZA.A02(handler, 2);
            AnonymousClass0ZA.A02(handler, 3);
            AnonymousClass0ZA.A02(handler, 4);
            AnonymousClass0ZA.A0D(handler, handler.obtainMessage(4, str));
            return;
        }
        this.mDelegate.B73();
    }

    public ArLinkScanControllerImpl(C27341Hl r3, AnonymousClass0C1 r4, C85533nX r5) {
        C180067mT.A00(r4);
        this.mFragment = r3;
        this.mUserSession = r4;
        this.mDelegate = r5;
        this.mQRCodeDetectionHelper = new C229269xL(r3.getContext(), r4);
    }

    public static boolean checkNerualNetModels(File file, File file2) {
        if (!file.canRead() || !file2.canRead() || file.length() <= 0 || file2.length() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        if (r0 == null) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    public static void handleCameraFrame(ArLinkScanControllerImpl arLinkScanControllerImpl, AnonymousClass8GL r16) {
        AnonymousClass2MW r0;
        boolean z;
        ArLinkScanControllerImpl arLinkScanControllerImpl2 = arLinkScanControllerImpl;
        C229269xL r5 = arLinkScanControllerImpl.mQRCodeDetectionHelper;
        AnonymousClass8GL r2 = r16;
        if (r5.A04.booleanValue()) {
            byte[] bArr = r2.A07;
            int length = bArr.length;
            byte[] bArr2 = r2.A05;
            byte[] bArr3 = r2.A06;
            byte[] bArr4 = new byte[(length + bArr2.length + bArr3.length)];
            System.arraycopy(bArr, 0, bArr4, 0, length);
            int length2 = bArr.length;
            int length3 = bArr2.length;
            System.arraycopy(bArr2, 0, bArr4, length2, length3);
            System.arraycopy(bArr3, 0, bArr4, length2 + length3, bArr3.length);
            C191398Gb r8 = new C191398Gb();
            ByteBuffer wrap = ByteBuffer.wrap(bArr4);
            int i = r2.A03;
            int i2 = r2.A00;
            if (wrap == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (wrap.capacity() >= i * i2) {
                r8.A02 = wrap;
                C191428Ge r02 = r8.A01;
                r02.A01 = i;
                r02.A00 = i2;
                if (wrap == null && r8.A00 == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                r0 = C229269xL.A00(r5, r8);
                if (r0 == null) {
                    int i3 = r2.A03;
                    int i4 = r2.A00;
                    r0 = C229269xL.A01(r5, new C191488Gl(bArr4, i3, i4, i3, i4));
                }
                if (arLinkScanControllerImpl2.handleQRCodeResult(r0) && arLinkScanControllerImpl2.mArLinkScanner == null && !arLinkScanControllerImpl2.mCameraActive) {
                    C180067mT.A00(arLinkScanControllerImpl2.mUserSession).A01("detect_candidate");
                    ArLinkScanner arLinkScanner = arLinkScanControllerImpl2.mArLinkScanner;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(r2.A07.length);
                    allocateDirect.put(r2.A07);
                    int i5 = r2.A04;
                    ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(r2.A05.length);
                    allocateDirect2.put(r2.A05);
                    int i6 = r2.A01;
                    ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(r2.A06.length);
                    allocateDirect3.put(r2.A06);
                    List sortCandidates = arLinkScanControllerImpl2.sortCandidates(ArLinkScanner.nativeGetCandidatesFromI444Image(arLinkScanner.A00, allocateDirect, i5, allocateDirect2, i6, allocateDirect3, r2.A02, r2.A03, r2.A00));
                    ArLinkCandidate arLinkCandidate = null;
                    if (!sortCandidates.isEmpty()) {
                        arLinkCandidate = (ArLinkCandidate) sortCandidates.get(0);
                    }
                    if (arLinkCandidate != null && arLinkCandidate.mOCRScore >= 0.99f && !TextUtils.isEmpty(arLinkCandidate.mDetectedText) && arLinkScanControllerImpl2.mCameraActive && !arLinkScanControllerImpl2.mProcessingCameraCandidate && !arLinkScanControllerImpl2.mProcessingImageCandidate) {
                        if (!AnonymousClass8GZ.A00(arLinkScanControllerImpl2.mUserSession).booleanValue() || ((!(z = arLinkCandidate.mHasLineCode) || arLinkCandidate.mLineCode != 0) && (z || arLinkCandidate.mLineCode <= 0))) {
                            arLinkScanControllerImpl2.notifyCandidateDetected(sortCandidates, true);
                            String str = arLinkCandidate.mDetectedText;
                            arLinkScanControllerImpl2.logCandidateDetected(arLinkCandidate, arLinkScanControllerImpl2.mPreviewWidth, arLinkScanControllerImpl2.mPreviewHeight, true);
                            int i7 = arLinkCandidate.mLineCode;
                            if (!arLinkScanControllerImpl2.mConsistencyVerifier.A00(new C191438Gf(str, i7))) {
                                AnonymousClass0DB.A0D(TAG, "OCR Result not consistent. Looking at more frames.");
                                return;
                            } else if (!TextUtils.isEmpty(str)) {
                                float f = arLinkCandidate.mOCRScore;
                                if (i7 > 0) {
                                    arLinkScanControllerImpl2.requestUserLookup(str, i7, f, true);
                                    return;
                                } else {
                                    arLinkScanControllerImpl2.requestUserLookup(str, f, true);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            AnonymousClass0DB.A0E(TAG, "Line code inconsistency found. Rejecting result.");
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw new IllegalArgumentException("Invalid image data size.");
            }
        }
        r0 = null;
        if (arLinkScanControllerImpl2.handleQRCodeResult(r0) && arLinkScanControllerImpl2.mArLinkScanner == null && !arLinkScanControllerImpl2.mCameraActive) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r0 == null) goto L_0x005b;
     */
    public static void handleCameraFrame(ArLinkScanControllerImpl arLinkScanControllerImpl, ByteBuffer byteBuffer) {
        AnonymousClass2MW r0;
        boolean z;
        C229269xL r4 = arLinkScanControllerImpl.mQRCodeDetectionHelper;
        int i = arLinkScanControllerImpl.mPreviewWidth;
        int i2 = arLinkScanControllerImpl.mPreviewHeight;
        if (r4.A04.booleanValue()) {
            C191398Gb r2 = new C191398Gb();
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (byteBuffer.capacity() >= i * i2) {
                r2.A02 = byteBuffer;
                C191428Ge r02 = r2.A01;
                r02.A01 = i;
                r02.A00 = i2;
                if (byteBuffer == null && r2.A00 == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                r0 = C229269xL.A00(r4, r2);
                if (r0 == null) {
                    r0 = C229269xL.A01(r4, new C191488Gl(byteBuffer.array(), i, i2, i, i2));
                }
                if (!arLinkScanControllerImpl.handleQRCodeResult(r0) && arLinkScanControllerImpl.mArLinkScanner != null && byteBuffer != null && arLinkScanControllerImpl.mCameraActive) {
                    C180067mT.A00(arLinkScanControllerImpl.mUserSession).A01("detect_candidate");
                    List sortCandidates = arLinkScanControllerImpl.sortCandidates(ArLinkScanner.nativeGetCandidatesFromNV21Image(arLinkScanControllerImpl.mArLinkScanner.A00, byteBuffer, arLinkScanControllerImpl.mPreviewWidth, arLinkScanControllerImpl.mPreviewHeight));
                    ArLinkCandidate arLinkCandidate = null;
                    if (!sortCandidates.isEmpty()) {
                        arLinkCandidate = (ArLinkCandidate) sortCandidates.get(0);
                    }
                    if (arLinkCandidate != null && arLinkCandidate.mOCRScore >= 0.99f && !TextUtils.isEmpty(arLinkCandidate.mDetectedText) && arLinkScanControllerImpl.mCameraActive && !arLinkScanControllerImpl.mProcessingCameraCandidate && !arLinkScanControllerImpl.mProcessingImageCandidate) {
                        if (!AnonymousClass8GZ.A00(arLinkScanControllerImpl.mUserSession).booleanValue() || ((!(z = arLinkCandidate.mHasLineCode) || arLinkCandidate.mLineCode != 0) && (z || arLinkCandidate.mLineCode <= 0))) {
                            arLinkScanControllerImpl.notifyCandidateDetected(sortCandidates, true);
                            String str = arLinkCandidate.mDetectedText;
                            arLinkScanControllerImpl.logCandidateDetected(arLinkCandidate, arLinkScanControllerImpl.mPreviewWidth, arLinkScanControllerImpl.mPreviewHeight, true);
                            int i3 = arLinkCandidate.mLineCode;
                            if (arLinkScanControllerImpl.mConsistencyVerifier.A00(new C191438Gf(str, i3)) && !TextUtils.isEmpty(str)) {
                                float f = arLinkCandidate.mOCRScore;
                                if (i3 > 0) {
                                    arLinkScanControllerImpl.requestUserLookup(str, i3, f, true);
                                    return;
                                } else {
                                    arLinkScanControllerImpl.requestUserLookup(str, f, true);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            AnonymousClass0DB.A0E(TAG, "Line code inconsistency found. Rejecting result.");
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw new IllegalArgumentException("Invalid image data size.");
            }
        }
        r0 = null;
        if (!arLinkScanControllerImpl.handleQRCodeResult(r0) || arLinkScanControllerImpl.mArLinkScanner != null) {
        }
    }

    private void requestUserLookup(String str, float f, boolean z) {
        AnonymousClass0ZA.A0E(this.mHandler, new C180027mP(this, str, z, f), -1377237960);
    }

    private void requestUserLookup(String str, int i, float f, boolean z) {
        AnonymousClass0ZA.A0E(this.mHandler, new C180017mO(this, str, i, z, f), 1085744042);
    }

    public void setPreviewFrame(AnonymousClass3ZG r13) {
        Bundle bundle;
        C191418Gd[] r2;
        Handler handler = this.mFrameHandler;
        if (handler != null) {
            AnonymousClass0ZA.A02(handler, 3);
            if (C05770Lw.A00().A00.getBoolean("show_nametag_debug_overlay", false) || (!this.mProcessingCameraCandidate && !this.mProcessingImageCandidate)) {
                Message obtainMessage = handler.obtainMessage(3);
                boolean z = false;
                if (r13.A01 == 35) {
                    z = true;
                }
                if (!z || (r2 = r13.A0B) == null || r2.length != 3) {
                    bundle = null;
                } else {
                    C191418Gd r1 = r2[0];
                    byte[] bArr = new byte[r1.A02.remaining()];
                    r1.A02.get(bArr);
                    int i = r1.A01;
                    C191418Gd r12 = r2[1];
                    byte[] bArr2 = new byte[r12.A02.remaining()];
                    r12.A02.get(bArr2);
                    int i2 = r12.A01;
                    C191418Gd r14 = r2[2];
                    byte[] bArr3 = new byte[r14.A02.remaining()];
                    r14.A02.get(bArr3);
                    int i3 = r14.A01;
                    int i4 = r13.A02;
                    int i5 = r13.A00;
                    bundle = new Bundle();
                    bundle.putByteArray("Y_DATA", bArr);
                    bundle.putByteArray("U_DATA", bArr2);
                    bundle.putByteArray("V_DATA", bArr3);
                    bundle.putInt("Y_STRIDE", i);
                    bundle.putInt("U_STRIDE", i2);
                    bundle.putInt("V_STRIDE", i3);
                    bundle.putInt("WIDTH", i4);
                    bundle.putInt(StatusBarModule.HEIGHT_KEY, i5);
                }
                obtainMessage.setData(bundle);
                AnonymousClass0ZA.A0D(handler, obtainMessage);
            }
        }
    }

    public void setPreviewFrame(byte[] bArr) {
        Handler handler = this.mFrameHandler;
        if (handler != null) {
            AnonymousClass0ZA.A02(handler, 2);
            if (C05770Lw.A00().A00.getBoolean("show_nametag_debug_overlay", false) || (!this.mProcessingCameraCandidate && !this.mProcessingImageCandidate)) {
                AnonymousClass0ZA.A0D(handler, handler.obtainMessage(2, ByteBuffer.wrap(bArr)));
            }
        }
    }
}
