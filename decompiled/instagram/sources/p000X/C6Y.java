package p000X;

/* renamed from: X.C6Y */
public final class C6Y {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public AnonymousClass54G A06;
    public C37171jE A07 = C37171jE.CLOSE_FRIENDS;
    public Integer A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final AnonymousClass0P4 A0E;
    public final AnonymousClass0C1 A0F;

    public final void A00() {
        String str;
        int i;
        if (!this.A0D) {
            this.A0D = true;
            C37171jE r0 = this.A07;
            if (r0 != null) {
                this.A0E.A0G("audience", r0.A00);
            }
            AnonymousClass54G r02 = this.A06;
            if (r02 == null) {
                r02 = AnonymousClass54G.UNKNOWN;
            }
            String str2 = r02.A00;
            Integer num = this.A08;
            if (num == null) {
                num = Constants.A0Y;
            }
            switch (num.intValue()) {
                case 1:
                    str = "cancel_discard";
                    break;
                case 2:
                    str = "cancel_save";
                    break;
                case 3:
                    str = "done";
                    break;
                case 4:
                    str = "unknown";
                    break;
                default:
                    str = "cancel";
                    break;
            }
            if (this.A0C) {
                i = this.A05;
            } else {
                i = -1;
            }
            AnonymousClass0P4 r2 = this.A0E;
            r2.A0E("audience_initial_count", Integer.valueOf(this.A02));
            r2.A0E("audience_added_suggestions_count", Integer.valueOf(this.A01));
            r2.A0E("audience_added_search_count", Integer.valueOf(this.A00));
            r2.A0E("audience_removed_count", Integer.valueOf(this.A03));
            r2.A0E("suggestions_available_count", Integer.valueOf(this.A04));
            r2.A0G("entry_point", str2);
            r2.A0E("suggestions_max_seen_position", Integer.valueOf(i));
            r2.A0G(AnonymousClass40t.$const$string(22), str);
            r2.A0A("did_tap_remove_all", Boolean.valueOf(this.A09));
            r2.A0A("did_tap_remove_all_in_dialog", Boolean.valueOf(this.A0A));
            r2.A0A("did_tap_undo_remove_all", Boolean.valueOf(this.A0B));
            AnonymousClass0WN.A01(this.A0F).BcG(this.A0E);
        }
    }

    public C6Y(AnonymousClass0C1 r2, AnonymousClass0RN r3) {
        this.A0F = r2;
        this.A0E = AnonymousClass0P4.A00("ig_audience_settings_waterfall", r3);
    }
}
