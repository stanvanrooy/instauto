package com.instagram.p009ui.widget.gallery;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.inlinegallerysendbutton.InlineGallerySendButton;
import com.instagram.p009ui.widget.mediapicker.MediaPickerItemView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p000X.AnonymousClass0PK;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass3X8;
import p000X.AnonymousClass3XB;
import p000X.C108794mR;
import p000X.C178347jX;
import p000X.C182267qO;
import p000X.C182277qP;
import p000X.C182287qQ;
import p000X.C182317qU;
import p000X.C182327qV;
import p000X.C182347qY;
import p000X.C182357qZ;
import p000X.C26571Ea;
import p000X.C35251g3;
import p000X.C39121mO;
import p000X.C476524w;
import p000X.C476624x;
import p000X.C51742Ly;
import p000X.C84823mM;
import p000X.C84833mN;

/* renamed from: com.instagram.ui.widget.gallery.GalleryView */
public class GalleryView extends FrameLayout {
    public static final Long A0L = 60000L;
    public int A00;
    public int A01;
    public View.OnClickListener A02;
    public AnonymousClass3X8 A03;
    public AnonymousClass3XB A04;
    public C178347jX A05;
    public C108794mR A06;
    public C182277qP A07;
    public C182357qZ A08;
    public boolean A09;
    public boolean A0A;
    public AnonymousClass1L8 A0B;
    public final GridView A0C;
    public final TextView A0D;
    public final C51742Ly A0E;
    public final C26571Ea A0F;
    public final InlineGallerySendButton A0G;
    public final LinkedHashMap A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public void setMaxMultiSelectCount(int i) {
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        if (this.A01 != i) {
            this.A01 = i;
            this.A0D.setText(getResources().getString(C0003R.string.selected_max_items, new Object[]{Integer.valueOf(i)}));
            boolean z2 = false;
            if (this.A04 != null) {
                z2 = true;
            }
            if (z2) {
                AnonymousClass0Z1.A00(this.A07, -685643885);
            }
        }
    }

    public static void A00(GalleryView galleryView) {
        C182327qV r4 = new C182327qV(galleryView);
        Context context = galleryView.getContext();
        C178347jX permissionEmptyStateController = galleryView.getPermissionEmptyStateController();
        permissionEmptyStateController.A04.setText(context.getString(C0003R.string.direct_gallery_permissions_header));
        permissionEmptyStateController.A03.setText(context.getString(C0003R.string.direct_gallery_permissions_description));
        permissionEmptyStateController.A02.setText(C0003R.string.direct_gallery_permissions_link_label);
        permissionEmptyStateController.A02.setOnClickListener(r4);
    }

    private AnonymousClass1L8 getLoaderManager() {
        if (this.A0B == null) {
            this.A0B = AnonymousClass1L8.A00((FragmentActivity) AnonymousClass0PK.A01(getContext(), FragmentActivity.class));
        }
        return this.A0B;
    }

    private C178347jX getPermissionEmptyStateController() {
        if (this.A05 == null) {
            this.A05 = new C178347jX(this, C0003R.layout.gallery_permissions_view);
        }
        return this.A05;
    }

    public final MediaPickerItemView A01(int i) {
        int firstVisiblePosition = this.A0C.getFirstVisiblePosition();
        int lastVisiblePosition = this.A0C.getLastVisiblePosition();
        if (this.A0C.getChildCount() <= 0 || i < firstVisiblePosition || i > lastVisiblePosition) {
            return null;
        }
        return (MediaPickerItemView) this.A0C.getChildAt(i - firstVisiblePosition);
    }

    public final void A02() {
        int size = this.A0H.size();
        int childCount = this.A0C.getChildCount();
        if (childCount != 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = this.A0C.getChildAt(i);
                if (childAt instanceof MediaPickerItemView) {
                    ((MediaPickerItemView) childAt).A03();
                }
            }
        }
        this.A0H.clear();
        this.A0G.setVisibility(8);
        this.A0D.setVisibility(8);
        C182357qZ r1 = this.A08;
        if (r1 != null && size > 0) {
            r1.BC2(0, size);
        }
    }

    public final void A03() {
        A02();
        boolean z = false;
        if (this.A04 != null) {
            z = true;
        }
        if (!z) {
            Context context = getContext();
            AnonymousClass3X8 r5 = this.A03;
            if (r5 == null) {
                r5 = AnonymousClass3X8.PHOTO_AND_VIDEO;
            }
            boolean A002 = C84833mN.A00();
            this.A04 = new AnonymousClass3XB(context, getLoaderManager(), r5, Integer.MAX_VALUE, 0, true, false, new C182287qQ(this), A002, false);
            Resources resources = context.getResources();
            int round = Math.round((float) ((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelOffset(C0003R.dimen.direct_gallery_grid_spacing) * (this.A00 - 1))) / this.A00));
            getContext();
            C182277qP r2 = new C182277qP(this, new C84823mM(context, round, round, false, A002));
            this.A07 = r2;
            this.A0C.setAdapter(r2);
            this.A0C.setNumColumns(this.A00);
        }
        Context context2 = getContext();
        if (!C35251g3.A07(context2, "android.permission.READ_EXTERNAL_STORAGE")) {
            C35251g3.A02(getRootActivity(this), this.A0E, "android.permission.READ_EXTERNAL_STORAGE");
            return;
        }
        getContext();
        if (C35251g3.A07(context2, "android.permission.READ_EXTERNAL_STORAGE")) {
            this.A04.A02();
        }
        if (this.A0C.getVisibility() != 0) {
            C476524w A072 = C476624x.A07(this.A0C);
            A072.A0N();
            C476524w A0T = A072.A0T(true);
            A0T.A0K(((float) this.A0C.getHeight()) * ((1.0f / ((float) this.A0C.getNumColumns())) + 1.0f), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A0T.A08 = 0;
            A0T.A0O();
        }
        this.A09 = true;
        C182357qZ r0 = this.A08;
        if (r0 != null) {
            r0.B5m();
        }
    }

    public final void A04() {
        if (this.A05 != null && C35251g3.A07(getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
            C178347jX r0 = this.A05;
            if (r0 != null) {
                r0.A00();
            }
            this.A05 = null;
            this.A04.A02();
            A03();
        }
    }

    public final void A05(String str) {
        this.A0H.clear();
        C182277qP r1 = this.A07;
        if (r1.A01.containsKey(str)) {
            r1.A00 = (C182267qO) r1.A01.get(str);
            AnonymousClass0Z1.A00(r1, 42904362);
        }
        this.A0C.post(new C182347qY(this));
        if (this.A07.getCount() == 0) {
            this.A0F.A02(0);
        } else {
            this.A0F.A02(8);
        }
    }

    public final boolean A06() {
        if (this.A01 != 0) {
            return true;
        }
        return false;
    }

    public List getSelectedItems() {
        return new ArrayList(this.A0H.keySet());
    }

    public final void onMeasure(int i, int i2) {
        if (this.A0K) {
            i = C39121mO.A00(i, i2);
            i2 = i;
        }
        super.onMeasure(i, i2);
    }

    public void setLeftAlignCheckBoxes(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            boolean z2 = false;
            if (this.A04 != null) {
                z2 = true;
            }
            if (z2) {
                AnonymousClass0Z1.A00(this.A07, 1666300967);
            }
        }
    }

    public static Activity getRootActivity(GalleryView galleryView) {
        Activity activity = (Activity) AnonymousClass0PK.A01(galleryView.getContext(), Activity.class);
        if (activity.getParent() != null) {
            return activity.getParent();
        }
        return activity;
    }

    public int getMaxMultiSelectCount() {
        return this.A01;
    }

    public void setColumnCount(int i) {
        this.A00 = i;
    }

    public void setGalleryDataLoadedListener(C108794mR r1) {
        this.A06 = r1;
    }

    public void setLoaderManager(AnonymousClass1L8 r1) {
        this.A0B = r1;
    }

    public void setMode(AnonymousClass3X8 r1) {
        this.A03 = r1;
    }

    public void setOnSendClickListener(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
    }

    public void setUserActionListener(C182357qZ r1) {
        this.A08 = r1;
    }

    public GalleryView(Context context) {
        this(context, (AttributeSet) null);
    }

    public GalleryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public GalleryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0H = new LinkedHashMap();
        this.A0E = new C182317qU(this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1y, 0, 0);
        try {
            this.A0K = obtainStyledAttributes.getBoolean(5, true);
            this.A0J = obtainStyledAttributes.getBoolean(4, true);
            this.A0A = obtainStyledAttributes.getBoolean(1, false);
            this.A0I = obtainStyledAttributes.getBoolean(3, true);
            this.A01 = obtainStyledAttributes.getInteger(2, 10);
            this.A00 = obtainStyledAttributes.getInt(0, 3);
            obtainStyledAttributes.recycle();
            inflate(context, C0003R.layout.composer_layout, this);
            this.A0G = (InlineGallerySendButton) findViewById(C0003R.C0005id.inline_gallery_send_button);
            GridView gridView = (GridView) findViewById(C0003R.C0005id.gallery_grid);
            this.A0C = gridView;
            AnonymousClass1E1.A0h(gridView, AnonymousClass1E1.A0j(this));
            TextView textView = (TextView) findViewById(C0003R.C0005id.max_limit_view);
            this.A0D = textView;
            textView.setText(getResources().getString(C0003R.string.selected_max_items, new Object[]{Integer.valueOf(this.A01)}));
            this.A0F = new C26571Ea((ViewStub) findViewById(C0003R.C0005id.inline_gallery_empty_view_stub));
            setClipChildren(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
