package p000X;

/* renamed from: X.1sK  reason: invalid class name and case insensitive filesystem */
public enum C42421sK {
    DRAFT,
    NOT_UPLOADED,
    CREATED_MEDIA,
    UPLOADED_DECOR_IMAGE,
    UPLOADED_VIDEO,
    UPLOADED,
    CONFIGURING_MULTIPLE_TARGETS,
    CONFIGURED;

    public final boolean A00(C42421sK r4) {
        if (ordinal() < r4.ordinal()) {
            return true;
        }
        return false;
    }
}
