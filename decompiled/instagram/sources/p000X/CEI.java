package p000X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;

/* renamed from: X.CEI */
public final class CEI extends C27341Hl implements AnonymousClass1HM {
    public EditText A00;
    public RecyclerView A01;
    public CD8 A02;
    public CEL A03;
    public C27510CGa A04;
    public CD3 A05;
    public AnonymousClass0C1 A06;
    public final TextWatcher A07 = new CEK(this);
    public final C27517CGh A08 = new C27483CEz(this);
    public final CF1 A09 = new CF1();

    public final String getModuleName() {
        return "promote_search_address";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.promote_create_audience_location_custom_address_label);
        r2.Bg9(C0003R.C0004drawable.instagram_arrow_back_24);
    }

    public final C06590Pq getSession() {
        return this.A06;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1936267091);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_create_audience_search_address, viewGroup, false);
        AnonymousClass0Z0.A09(-394619300, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        CD3 AT6 = ((C945346y) activity).AT6();
        this.A05 = AT6;
        AnonymousClass0C1 r1 = AT6.A0Q;
        this.A06 = r1;
        this.A02 = new CD8(r1, activity, this);
        EditText editText = (EditText) view.findViewById(C0003R.C0005id.search_bar_edit_text);
        this.A00 = editText;
        editText.setHint(C0003R.string.promote_create_audience_location_custom_address_label);
        this.A00.addTextChangedListener(this.A07);
        this.A00.setOnClickListener(new C27494CFk(this));
        this.A01 = (RecyclerView) view.findViewById(C0003R.C0005id.typeahead_recycler_view);
        CEL cel = new CEL(this.A08);
        this.A03 = cel;
        this.A01.setAdapter(cel);
    }
}
