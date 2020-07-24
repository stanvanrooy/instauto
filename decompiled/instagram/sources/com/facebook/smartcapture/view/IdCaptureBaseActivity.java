package com.facebook.smartcapture.view;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.CommonLoggingFields;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.p011ui.IdCaptureUi;
import com.facebook.smartcapture.resources.ResourcesProvider;
import p000X.AnonymousClass0XY;
import p000X.AnonymousClass0Z0;
import p000X.BYN;
import p000X.C27238C4f;
import p000X.C27241C4k;
import p000X.C27242C4l;
import p000X.C27254C5g;
import p000X.C4K;
import p000X.C4L;
import p000X.C5Y;

public abstract class IdCaptureBaseActivity extends FragmentActivity implements C27241C4k {
    public DocumentType A00;
    public IdCaptureConfig A01;
    public C4L A02 = null;
    public C4L A03 = C4L.INITIAL;
    public IdCaptureUi A04;
    public boolean A05;
    public Resources A06;
    public C5Y A07;
    public C4K A08;
    public C27254C5g A09;

    public C4L A0K() {
        return !(this instanceof PhotoReviewActivity) ? !(this instanceof PermissionsActivity) ? ((IdCaptureActivity) this).A03 == C4L.FIRST_PHOTO_CONFIRMATION ? C4L.SECOND_PHOTO_CAPTURE : C4L.FIRST_PHOTO_CAPTURE : C4L.PERMISSIONS : ((C27242C4l) ((PhotoReviewActivity) this).getIntent().getSerializableExtra("capture_stage")) == C27242C4l.ID_FRONT_SIDE ? C4L.FIRST_PHOTO_CONFIRMATION : C4L.SECOND_PHOTO_CONFIRMATION;
    }

    public void onBackPressed() {
        setResult(0);
        finish();
    }

    public final C27238C4f ALd() {
        return this.A01.A01();
    }

    public final Resources getResources() {
        Resources resources = this.A06;
        if (resources != null) {
            return resources;
        }
        return super.getResources();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.A05 = false;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final C27254C5g AKW() {
        return this.A09;
    }

    public final C5Y ALS() {
        return this.A07;
    }

    public final C4K APJ() {
        return this.A08;
    }

    public final IdCaptureUi AZN() {
        return this.A04;
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        int A002 = AnonymousClass0Z0.A00(767907818);
        if (!AnonymousClass0XY.A01().A00(this, this, getIntent())) {
            finish();
            i = -1430302424;
        } else {
            Intent intent = getIntent();
            IdCaptureConfig idCaptureConfig = (IdCaptureConfig) intent.getParcelableExtra("id_capture_config");
            this.A01 = idCaptureConfig;
            if (!(idCaptureConfig == null || (i2 = idCaptureConfig.A00) == 0)) {
                setTheme(i2);
            }
            super.onCreate(bundle);
            IdCaptureConfig idCaptureConfig2 = this.A01;
            this.A04 = idCaptureConfig2.A06;
            ResourcesProvider resourcesProvider = idCaptureConfig2.A05;
            if (resourcesProvider != null) {
                resourcesProvider.Ada(this);
                this.A06 = resourcesProvider.AUW();
                this.A09 = resourcesProvider.AKW();
            }
            IdCaptureConfig idCaptureConfig3 = this.A01;
            SmartCaptureLoggerProvider smartCaptureLoggerProvider = idCaptureConfig3.A04;
            if (smartCaptureLoggerProvider != null) {
                this.A08 = new C4K(smartCaptureLoggerProvider.get(this));
                C27238C4f A012 = idCaptureConfig3.A01();
                IdCaptureConfig idCaptureConfig4 = this.A01;
                new CommonLoggingFields(A012, "v2_id", idCaptureConfig4.A0A, idCaptureConfig4.A0B, idCaptureConfig4.A01);
            } else {
                this.A08 = new C4K((BYN) null);
            }
            IdCaptureExperimentConfigProvider idCaptureExperimentConfigProvider = this.A01.A03;
            if (idCaptureExperimentConfigProvider != null) {
                this.A07 = idCaptureExperimentConfigProvider.get(this);
            }
            if (intent.hasExtra("preset_document_type")) {
                this.A00 = (DocumentType) intent.getSerializableExtra("preset_document_type");
            }
            if (intent.hasExtra("previous_step")) {
                this.A03 = (C4L) intent.getSerializableExtra("previous_step");
            }
            if (this.A03 == null) {
                this.A03 = C4L.INITIAL;
            }
            if (bundle != null) {
                this.A05 = bundle.getBoolean("step_change_logged");
            } else {
                this.A05 = false;
            }
            i = -1156466062;
        }
        AnonymousClass0Z0.A07(i, A002);
    }

    public void onResume() {
        int A002 = AnonymousClass0Z0.A00(1105477442);
        super.onResume();
        if (!this.A05) {
            this.A05 = true;
            C4L c4l = this.A02;
            if (c4l != null) {
                this.A08.A02(c4l, A0K());
                this.A02 = null;
            } else {
                this.A08.A02(this.A03, A0K());
            }
        }
        AnonymousClass0Z0.A07(-597636205, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("step_change_logged", this.A05);
    }
}
