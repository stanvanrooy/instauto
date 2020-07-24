package p000X;

/* renamed from: X.C4K */
public final class C4K extends BYN {
    public final void A02(C4L c4l, C4L c4l2) {
        BYN.A00("previous", c4l.A00, "next", c4l2.A00);
    }

    public C4K(BYN byn) {
        super(byn);
    }

    public final void A03(Integer num) {
        String str;
        switch (num.intValue()) {
            case 1:
                str = "expand_full_photo";
                break;
            case 2:
                str = "capture_step_back_button";
                break;
            case 3:
                str = "show_photo_requirements";
                break;
            case 4:
                str = "onboarding_skip";
                break;
            default:
                str = "retake_photo";
                break;
        }
        BYN.A00("button_name", str);
    }
}
