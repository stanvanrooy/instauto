package com.instagram.archive.fragment;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.reels.Reel;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass1ZK;
import p000X.AnonymousClass38Z;
import p000X.AnonymousClass39C;
import p000X.AnonymousClass39D;
import p000X.AnonymousClass39L;
import p000X.AnonymousClass39M;
import p000X.AnonymousClass5NI;
import p000X.AnonymousClass5NK;
import p000X.AnonymousClass5NN;
import p000X.AnonymousClass5O4;
import p000X.AnonymousClass5O5;
import p000X.AnonymousClass5OB;
import p000X.AnonymousClass5OF;
import p000X.AnonymousClass5OG;
import p000X.AnonymousClass5OH;
import p000X.AnonymousClass5OI;
import p000X.AnonymousClass5OK;
import p000X.AnonymousClass5OL;
import p000X.AnonymousClass5OQ;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C168617Hz;
import p000X.C17850qu;
import p000X.C26571Ea;
import p000X.C31581Yw;
import p000X.C36031hK;
import p000X.C39941no;

public class InlineAddHighlightFragment extends AnonymousClass5OQ implements AnonymousClass39C, AnonymousClass39D {
    public AnonymousClass0C1 A00;
    public Integer A01;
    public String A02;
    public int A03;
    public AnonymousClass38Z A04;
    public AnonymousClass5OL A05;
    public boolean A06;
    public boolean A07;
    public TextView mActionButton;
    public CircularImageView mCreateHighlightCoverImage;
    public EditText mCreateHighlightEditText;
    public View mCreateHighlightView;
    public ViewStub mCreateHighlightViewStub;
    public AnonymousClass5OI mDelegate;
    public C26571Ea mHeaderBackButtonStubHolder;
    public TextView mHeaderText;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mTrayRecyclerView;
    public View mView;

    public final void Aya() {
        A02(true);
    }

    public final void BHa(Reel reel, int i, C36031hK r3, Boolean bool) {
    }

    public final void BHb(String str, C39941no r2, int i, List list) {
    }

    public final void BSo(int i) {
    }

    public final String getModuleName() {
        return "inline_add_to_highlight";
    }

    public static void A00(InlineAddHighlightFragment inlineAddHighlightFragment) {
        inlineAddHighlightFragment.mHeaderText.setText(C0003R.string.inline_add_highlight_title);
        inlineAddHighlightFragment.mTrayRecyclerView.setVisibility(0);
        C06220Of.A0F(inlineAddHighlightFragment.mCreateHighlightView);
        inlineAddHighlightFragment.A01(Constants.ZERO);
        C06220Of.A0E(inlineAddHighlightFragment.mView);
        inlineAddHighlightFragment.mHeaderBackButtonStubHolder.A02(8);
    }

    private void A02(boolean z) {
        this.mHeaderText.setText(C0003R.string.create_highlights_title);
        if (this.mCreateHighlightView == null) {
            View inflate = this.mCreateHighlightViewStub.inflate();
            this.mCreateHighlightView = inflate;
            this.mCreateHighlightCoverImage = (CircularImageView) inflate.findViewById(C0003R.C0005id.highlight_cover_image);
            EditText editText = (EditText) this.mCreateHighlightView.findViewById(C0003R.C0005id.highlight_title);
            this.mCreateHighlightEditText = editText;
            editText.addTextChangedListener(new AnonymousClass5O4(editText, (AnonymousClass5O5) null));
        }
        int i = 0;
        this.mCreateHighlightView.setVisibility(0);
        EditText editText2 = this.mCreateHighlightEditText;
        editText2.setText(editText2.getText().toString().trim());
        this.mCreateHighlightEditText.requestFocus();
        C06220Of.A0G(this.mCreateHighlightEditText);
        this.mCreateHighlightCoverImage.setUrl(this.mDelegate.AJ5(), getModuleName());
        this.mCreateHighlightCoverImage.setRotation((float) this.A03);
        if (this.A06) {
            CircularImageView circularImageView = this.mCreateHighlightCoverImage;
            circularImageView.setScaleY(circularImageView.getScaleY() * -1.0f);
        }
        A01(Constants.ONE);
        C26571Ea r0 = this.mHeaderBackButtonStubHolder;
        if (!z) {
            i = 8;
        }
        r0.A02(i);
        this.mTrayRecyclerView.setVisibility(8);
    }

    public final void B6n(List list, List list2, boolean z) {
        this.mLoadingSpinner.setLoadingStatus(C168617Hz.SUCCESS);
        if (list.isEmpty()) {
            A02(false);
            return;
        }
        this.mDelegate.B9c(list, this.A04);
        A00(this);
    }

    public final void BHY(String str, C39941no r6, int i, List list, AnonymousClass1ZK r9, String str2, Integer num) {
        if (((C31581Yw) this.A04.A08.get(str)).A02) {
            this.mDelegate.BHZ(str, true, this, this);
            return;
        }
        this.A02 = str;
        this.A05.A00(!this.A07, (AnonymousClass1NJ) null);
    }

    private void A01(Integer num) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (num.intValue()) {
            case 0:
                i3 = C0003R.string.cancel;
                i4 = C0003R.color.igds_primary_text;
                i2 = AnonymousClass1BA.A03(getContext(), C0003R.attr.elevatedBackgroundColor);
                i = AnonymousClass1BA.A03(getContext(), C0003R.attr.backgroundColorSecondary);
                break;
            case 1:
                i3 = C0003R.string.add;
                i4 = C0003R.color.white;
                i2 = C0003R.color.blue_5;
                i = C0003R.color.blue_6;
                break;
            default:
                throw new IllegalArgumentException("Unhandled ActionButtonMode.");
        }
        this.mActionButton.setText(i3);
        this.mActionButton.setTextColor(C019000b.A00(getContext(), i4));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(C019000b.A00(getContext(), i)));
        stateListDrawable.addState(new int[0], new ColorDrawable(C019000b.A00(getContext(), i2)));
        this.mActionButton.setBackground(stateListDrawable);
        this.A01 = num;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1374168497);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A00 = AnonymousClass0J1.A06(bundle2);
        String string = this.mArguments.getString("current_reel_item_media_id");
        int i = this.mArguments.getInt("initial_selected_media_width");
        int i2 = this.mArguments.getInt("initial_selected_media_height");
        if (string != null) {
            AnonymousClass1NJ A023 = AnonymousClass1PZ.A00(this.A00).A02(string);
            boolean z = false;
            if (A023.APx() == MediaType.VIDEO) {
                z = true;
            }
            this.A07 = z;
            this.mDelegate = new AnonymousClass5NK(getContext(), this.A00, getModuleName(), A023, (ImageUrl) this.mArguments.getParcelable("initial_selected_media_url"), (AnonymousClass1OY) this.mArguments.getSerializable("reel_viewer_source"));
        } else {
            String string2 = this.mArguments.getString("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_FILE_PATH");
            this.A07 = this.mArguments.getBoolean("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_IS_VIDEO");
            IngestSessionShim ingestSessionShim = (IngestSessionShim) this.mArguments.getParcelable("InlineAddHighlightsFragment.ARG_INGEST_SESSION");
            if (ingestSessionShim != null) {
                this.mDelegate = new AnonymousClass5NI(this.A00, ingestSessionShim, string2, this.A07, i, i2);
            } else {
                this.mDelegate = new AnonymousClass5NN(this.A00, string2, this.A07, i, i2);
            }
        }
        this.A06 = this.mArguments.getBoolean("InlineAddHighlightsFragment.ARG_IS_MEDIA_MIRRORED");
        this.A03 = this.mArguments.getInt("InlineAddHighlightsFragment.ARG_MEDIA_ROTATION_DEGREES");
        AnonymousClass38Z r2 = new AnonymousClass38Z(getContext(), this.A00, true, this.mArguments.getBoolean("is_in_story_creation_flow_tray", false), false, this, AnonymousClass1OY.PROFILE_HIGHLIGHTS_TRAY);
        this.A04 = r2;
        r2.A00 = this;
        this.A05 = new AnonymousClass5OL(new AnonymousClass5OF(this), new AnonymousClass5OG(this), getContext());
        AnonymousClass0Z0.A09(-741290996, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1411186048);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_inline_add_highlight, viewGroup, false);
        AnonymousClass0Z0.A09(699565540, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-81922871);
        super.onDestroyView();
        InlineAddHighlightFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-80153311, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-410223);
        super.onPause();
        C06220Of.A0E(this.mView);
        AnonymousClass0Z0.A09(26991, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mView = view;
        this.mCreateHighlightViewStub = (ViewStub) view.findViewById(C0003R.C0005id.inline_create_highlight_metadata_stub);
        C26571Ea r1 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.inline_create_highlight_back_button_stub));
        this.mHeaderBackButtonStubHolder = r1;
        r1.A03(new AnonymousClass5OK(this));
        this.mHeaderText = (TextView) view.findViewById(C0003R.C0005id.header_text);
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.action_button);
        this.mActionButton = textView;
        textView.setOnClickListener(new AnonymousClass5OB(this));
        A01(Constants.ZERO);
        this.mTrayRecyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.highlights_reel_tray_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.mTrayRecyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.A0w(true);
        this.mTrayRecyclerView.A0r(new AnonymousClass5OH(this, getResources().getDimensionPixelSize(C0003R.dimen.reel_tray_item_separator)));
        this.mTrayRecyclerView.setAdapter(this.A04);
        this.mTrayRecyclerView.setVisibility(8);
        SpinnerImageView spinnerImageView = (SpinnerImageView) this.mView.findViewById(C0003R.C0005id.loading_spinner);
        this.mLoadingSpinner = spinnerImageView;
        spinnerImageView.setLoadingStatus(C168617Hz.LOADING);
        Context context = getContext();
        AnonymousClass0C1 r3 = this.A00;
        C17850qu A012 = AnonymousClass39L.A01(context, r3, r3.A04(), Constants.A0N, false);
        A012.A00 = new AnonymousClass39M(this.A00, this, true);
        schedule(A012);
    }
}
