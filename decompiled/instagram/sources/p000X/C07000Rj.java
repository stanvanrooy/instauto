package p000X;

/* renamed from: X.0Rj  reason: invalid class name and case insensitive filesystem */
public final class C07000Rj {
    public static final String A00;

    static {
        StringBuilder sb = new StringBuilder();
        if (!"graph.instagram.com".contains("://")) {
            sb.append("https://");
        }
        sb.append("graph.instagram.com");
        sb.append("/logging_client_events");
        A00 = sb.toString();
    }
}
