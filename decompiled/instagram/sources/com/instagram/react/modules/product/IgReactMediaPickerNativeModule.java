package com.instagram.react.modules.product;

import android.app.Activity;
import android.content.Context;
import com.facebook.C0003R;
import com.facebook.fbreact.specs.NativeIGMediaPickerReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.ArrayList;
import p000X.A44;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass5F4;
import p000X.AnonymousClass6A2;
import p000X.AnonymousClass6A4;
import p000X.AnonymousClass6A8;
import p000X.AnonymousClass6AC;
import p000X.C11200ea;
import p000X.C16330oQ;
import p000X.C23300zv;
import p000X.C31151Wq;

@ReactModule(name = "IGMediaPickerNativeModule")
public class IgReactMediaPickerNativeModule extends NativeIGMediaPickerReactModuleSpec {
    public static final String HEIGHT = "height";
    public static final String IG_MEDIA_PICKER_PHOTO_SELECTED = "IGMediaPickerPhotoSelected";
    public static final String MODULE_NAME = "IGMediaPickerNativeModule";
    public static final String URI = "uri";
    public static final String WIDTH = "width";
    public C31151Wq mCaptureFlowHelper;
    public C23300zv mIgEventBus;
    public final C11200ea mImageSelectedEventListener = new AnonymousClass6A4(this);
    public CharSequence[] mOptions;

    public String getName() {
        return MODULE_NAME;
    }

    private CharSequence[] getOptions(Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(context.getString(C0003R.string.react_media_picker_remove_photo));
        }
        arrayList.add(context.getString(C0003R.string.react_media_picker_take_photo));
        arrayList.add(context.getString(C0003R.string.react_media_picker_choose_from_library));
        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
        this.mOptions = charSequenceArr;
        arrayList.toArray(charSequenceArr);
        return this.mOptions;
    }

    public static boolean matches(IgReactMediaPickerNativeModule igReactMediaPickerNativeModule, Context context, int i, int i2) {
        return igReactMediaPickerNativeModule.mOptions[i].equals(context.getString(i2));
    }

    private void removeListener() {
        this.mIgEventBus.A03(AnonymousClass6A8.class, this.mImageSelectedEventListener);
    }

    private void stopCaptureFlow() {
        this.mCaptureFlowHelper.stop();
    }

    public IgReactMediaPickerNativeModule(A44 a44, AnonymousClass0C1 r4) {
        super(a44);
        this.mIgEventBus = C23300zv.A00(r4);
        this.mCaptureFlowHelper = C16330oQ.A00.A04(a44, new AnonymousClass6AC(this), r4);
    }

    public static void onEventCleanup(IgReactMediaPickerNativeModule igReactMediaPickerNativeModule) {
        igReactMediaPickerNativeModule.removeListener();
        igReactMediaPickerNativeModule.stopCaptureFlow();
    }

    public void openNativePhotoPicker(double d, boolean z) {
        Activity currentActivity = getCurrentActivity();
        AnonymousClass11J.A00(currentActivity);
        AnonymousClass11J.A00(currentActivity.getIntent());
        AnonymousClass11J.A00(currentActivity.getIntent().getExtras());
        AnonymousClass6A2 r2 = new AnonymousClass6A2(this, currentActivity);
        AnonymousClass5F4 r1 = new AnonymousClass5F4(currentActivity);
        r1.A0A(getOptions(currentActivity, z), r2);
        r1.A09(true);
        r1.A00().show();
    }
}
