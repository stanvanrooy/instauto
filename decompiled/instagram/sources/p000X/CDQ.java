package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgEditText;

/* renamed from: X.CDQ */
public final class CDQ extends C27341Hl implements C60962kt, C27522CGm {
    public C27434CDc A00;
    public CD3 A01;
    public IgEditText A02;
    public String A03;
    public CDA A04;
    public AnonymousClass0C1 A05;

    public final boolean A55() {
        return false;
    }

    public final int AIh() {
        return -2;
    }

    public final int AYd() {
        return 0;
    }

    public final float AdY() {
        return 1.0f;
    }

    public final boolean AeS() {
        return true;
    }

    public final boolean AhU() {
        return true;
    }

    public final float Aol() {
        return 1.0f;
    }

    public final void AtY(int i, int i2) {
    }

    public final void B8h() {
    }

    public final void B8j(int i) {
    }

    public final boolean BmS() {
        return true;
    }

    public final String getModuleName() {
        return "promote_rename_settings";
    }

    public final void Aqn() {
        C06220Of.A0E(this.A02);
        this.A04.A09(this.A01, this.A02.getText().toString());
    }

    public final void AtV() {
        C06220Of.A0E(this.A02);
    }

    public final int AGx(Context context) {
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final View AXo() {
        return this.mView;
    }

    public final C06590Pq getSession() {
        return this.A05;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-287894469);
        View inflate = layoutInflater.inflate(C0003R.layout.quick_promote_rename_bottom_sheet_view, viewGroup, false);
        AnonymousClass0Z0.A09(-1617960219, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        CD3 AT6 = ((C945346y) activity).AT6();
        this.A01 = AT6;
        AnonymousClass0a4.A06(activity);
        this.A04 = ((CC9) activity).AT7();
        this.A05 = AT6.A0Q;
        IgEditText igEditText = (IgEditText) view.findViewById(C0003R.C0005id.rename_edit_text);
        this.A02 = igEditText;
        String str = this.A01.A0E.A06;
        if (!AnonymousClass1BX.A00(str)) {
            this.A03 = str;
            igEditText.setText(str);
        }
        this.A02.addTextChangedListener(new CFX(this));
        C27434CDc cDc = new C27434CDc(view, C27398CBr.QUICK_PROMOTE_SAVE_SETTING);
        this.A00 = cDc;
        cDc.A00();
        C27433CDb.A00(this.A00, this, C0003R.string.quick_promote_confirm_button_text);
        this.A00.A02(false);
    }
}
