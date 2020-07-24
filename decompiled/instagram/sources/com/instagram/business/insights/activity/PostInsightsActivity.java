package com.instagram.business.insights.activity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.base.activity.IgFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass6RX;
import p000X.AnonymousClass6RY;
import p000X.C06590Pq;
import p000X.C11850fm;
import p000X.C16920pO;
import p000X.C193418Ps;
import p000X.C227489qa;
import p000X.C26581Eb;

public class PostInsightsActivity extends IgFragmentActivity implements C11850fm {
    public View.OnClickListener A00 = new AnonymousClass6RY(this);
    public View A01;
    public AnonymousClass1EW A02;
    public C227489qa A03;
    public C06590Pq A04;

    public final C06590Pq A0L() {
        return this.A04;
    }

    public final AnonymousClass1EW AFO() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        String string;
        int A002 = AnonymousClass0Z0.A00(1610636331);
        super.onCreate(bundle);
        this.A04 = AnonymousClass0J1.A00(getIntent().getExtras());
        setContentView((int) C0003R.layout.post_insights_activity);
        this.A02 = new AnonymousClass1EW((ViewGroup) findViewById(C0003R.C0005id.action_bar_container), this.A00);
        findViewById(C0003R.C0005id.action_bar_button_action).setVisibility(8);
        this.A01 = findViewById(C0003R.C0005id.post_insights_loading_container);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0003R.C0005id.post_insights_loading_container);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = getApplicationContext().getResources().getDimensionPixelSize(C0003R.dimen.post_insights_full_screen_peek_height);
        frameLayout.setLayoutParams(layoutParams);
        View view = this.A01;
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            if (view.getHeight() > 0) {
                view.setTranslationY((float) view.getHeight());
                view.animate().translationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).alpha(1.0f);
            } else {
                view.post(new AnonymousClass6RX(view));
            }
        }
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            Bundle bundle2 = new Bundle();
            if (extras == null) {
                string = null;
            } else {
                string = extras.getString("IgSessionManager.SESSION_TOKEN_KEY");
            }
            bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", string);
            bundle2.putString(C193418Ps.$const$string(53), "IgInsightsPostInsightsApp");
            bundle2.putInt(C193418Ps.$const$string(4), 1);
            bundle2.putBundle(C193418Ps.$const$string(54), extras);
            C16920pO.getInstance().getFragmentFactory();
            C227489qa r0 = new C227489qa();
            r0.setArguments(bundle2);
            this.A03 = r0;
            AnonymousClass1H6 A0Q = A05().A0Q();
            A0Q.A03(C0003R.C0005id.layout_container_main, this.A03, "IgInsightsPostInsightsApp");
            A0Q.A09();
        }
        C26581Eb.A00(this, 1);
        AnonymousClass0Z0.A07(1308914071, A002);
    }
}
