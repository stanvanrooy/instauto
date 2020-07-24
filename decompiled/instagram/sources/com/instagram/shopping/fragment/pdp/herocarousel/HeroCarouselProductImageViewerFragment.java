package com.instagram.shopping.fragment.pdp.herocarousel;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.p004ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.C06590Pq;
import p000X.C102784c6;
import p000X.C102794c7;
import p000X.C26771Ff;
import p000X.C27341Hl;
import p000X.C29821Rj;
import p000X.C29831Rk;
import p000X.C38511lO;

public class HeroCarouselProductImageViewerFragment extends C27341Hl implements C29831Rk {
    public C38511lO A00;
    public C06590Pq A01;
    public ImageUrl A02;
    public C29821Rj A03;
    public SimpleZoomableViewContainer mContainerView;
    public IgImageView mImageView;

    public final boolean BKu(C38511lO r2) {
        return true;
    }

    public final void BL0(C38511lO r1) {
    }

    public final String getModuleName() {
        return "hero_carousel_product_image_viewer";
    }

    public final boolean BKx(C38511lO r4) {
        C29821Rj r2 = this.A03;
        if (!r2.A04()) {
            return true;
        }
        r2.A03(this.mContainerView, this.mImageView, r4);
        return true;
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1457415246);
        super.onCreate(bundle);
        this.A01 = AnonymousClass0J1.A00(this.mArguments);
        Parcelable parcelable = this.mArguments.getParcelable(IgReactNavigatorModule.URL);
        AnonymousClass0a4.A06(parcelable);
        this.A02 = (ExtendedImageUrl) parcelable;
        C38511lO r1 = new C38511lO(getContext());
        this.A00 = r1;
        r1.A00(this);
        C29821Rj r12 = new C29821Rj((ViewGroup) getActivity().getWindow().getDecorView());
        this.A03 = r12;
        registerLifecycleListener(r12);
        AnonymousClass0Z0.A09(-300435175, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(730247275);
        View inflate = layoutInflater.inflate(C0003R.layout.hero_carousel_product_image_viewer, viewGroup, false);
        AnonymousClass0Z0.A09(-1178072781, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1207861827);
        super.onDestroy();
        unregisterLifecycleListener(this.A03);
        AnonymousClass0Z0.A09(282844729, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(321093651);
        super.onDestroyView();
        HeroCarouselProductImageViewerFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-515150060, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mContainerView = (SimpleZoomableViewContainer) view.findViewById(C0003R.C0005id.container);
        IgImageView igImageView = (IgImageView) view.findViewById(C0003R.C0005id.image);
        this.mImageView = igImageView;
        igImageView.setUrl(this.A02, AnonymousClass0C5.$const$string(356));
        this.mImageView.setOnTouchListener(new C102794c7(this));
        ImageView imageView = (ImageView) view.findViewById(C0003R.C0005id.close_button);
        imageView.setColorFilter(C26771Ff.A00(AnonymousClass1BA.A01(imageView.getContext(), C0003R.attr.glyphColorPrimary)));
        imageView.setOnClickListener(new C102784c6(this));
    }
}
