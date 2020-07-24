package p000X;

import android.content.Intent;
import android.graphics.Point;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.facebook.smartcapture.view.PhotoReviewActivity;

/* renamed from: X.C4U */
public final class C4U implements Runnable {
    public final /* synthetic */ C27242C4l A00;
    public final /* synthetic */ IdCaptureActivity A01;
    public final /* synthetic */ Point[] A02;

    public C4U(IdCaptureActivity idCaptureActivity, C27242C4l c4l, Point[] pointArr) {
        this.A01 = idCaptureActivity;
        this.A00 = c4l;
        this.A02 = pointArr;
    }

    public final void run() {
        C4L A012 = IdCaptureActivity.A01(this.A00, false);
        C4L A013 = IdCaptureActivity.A01(this.A00, true);
        IdCaptureActivity idCaptureActivity = this.A01;
        C27242C4l c4l = this.A00;
        IdCaptureConfig idCaptureConfig = idCaptureActivity.A01;
        DocumentType documentType = idCaptureActivity.A00;
        Point[] pointArr = this.A02;
        Intent intent = new Intent(idCaptureActivity, PhotoReviewActivity.class);
        intent.putExtra("capture_stage", c4l);
        intent.putExtra("id_capture_config", idCaptureConfig);
        intent.putExtra("preset_document_type", documentType);
        intent.putExtra("previous_step", A012);
        intent.putExtra("skewed_crop_points", pointArr);
        IdCaptureActivity idCaptureActivity2 = this.A01;
        idCaptureActivity2.A02 = A013;
        idCaptureActivity2.startActivityForResult(intent, 1);
    }
}
