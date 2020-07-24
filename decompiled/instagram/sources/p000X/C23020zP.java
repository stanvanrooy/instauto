package p000X;

/* renamed from: X.0zP  reason: invalid class name and case insensitive filesystem */
public final class C23020zP implements C06570Po {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public final AnonymousClass0C1 A06;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C23020zP A00(AnonymousClass0C1 r2) {
        return (C23020zP) r2.AVA(C23020zP.class, new C23030zQ(r2));
    }

    public final int A01() {
        if (this.A04 == null) {
            this.A04 = (Integer) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.STORIES_TRAY_RANKING_EXPERIMENTS, "paginated_tray_num_columns", 4, (AnonymousClass04H) null);
        }
        return this.A04.intValue();
    }

    public final int A02() {
        if (this.A05 == null) {
            this.A05 = (Integer) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.STORIES_TRAY_RANKING_EXPERIMENTS, "paginated_tray_num_rows", 2, (AnonymousClass04H) null);
        }
        return this.A05.intValue();
    }

    public final boolean A03() {
        if (this.A01 == null) {
            this.A01 = (Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.STORIES_TRAY_RANKING_EXPERIMENTS, "paginated_tray_enabled", false, (AnonymousClass04H) null);
        }
        return this.A01.booleanValue();
    }

    public final boolean A04() {
        if (this.A02 == null) {
            this.A02 = (Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.STORIES_TRAY_RANKING_EXPERIMENTS, "see_all_enabled", false, (AnonymousClass04H) null);
        }
        return this.A02.booleanValue();
    }

    public final boolean A05() {
        if (this.A03 == null) {
            this.A03 = (Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.STORIES_TRAY_RANKING_EXPERIMENTS, "show_preview_in_tray", false, (AnonymousClass04H) null);
        }
        return this.A03.booleanValue();
    }

    public C23020zP(AnonymousClass0C1 r1) {
        this.A06 = r1;
    }
}
