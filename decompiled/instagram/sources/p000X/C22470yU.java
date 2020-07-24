package p000X;

import com.instagram.camera.effect.p016mq.voltron.IgArVoltronModuleLoader;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0yU  reason: invalid class name and case insensitive filesystem */
public enum C22470yU {
    CAFFE2(IgArVoltronModuleLoader.CAFFE2_VOLTRON_MODULE_NAME, (int) null),
    PYTORCH("pytorch", (int) null),
    DEVELOPER_OPTIONS("devoptions", (int) null),
    DOGFOOD("dogfood", (int) null),
    SLAM("slam", (int) null),
    AR_SERVICES_FOR_HAIR_SEGMENTATION("arservicesforhairsegmentation", Arrays.asList(new C22470yU[]{r4})),
    AR_SERVICES_FOR_PERSON_SEGMENTATION("arservicesforpersonsegmentation", (int) null),
    AR_SERVICES_FOR_BODY_TRACKING("arservicesforbodytracking", Arrays.asList(new C22470yU[]{r9})),
    AR_SERVICES_FOR_MOVING_RECOGNITION_TRACKING("arservicesfortargettracking", Arrays.asList(new C22470yU[]{r9})),
    AR_SERVICES_FOR_WOLF("arservicesforwolf", (int) null);
    
    public List A00;
    public final String A01;

    /* access modifiers changed from: public */
    C22470yU(String str, List list) {
        this.A01 = str;
        this.A00 = list;
    }
}
