package p000X;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/* renamed from: X.C31 */
public final class C31 {
    public final String A00;
    public final String A01;

    public C31(JsonPOJOBuilder jsonPOJOBuilder) {
        this.A00 = jsonPOJOBuilder.buildMethodName();
        this.A01 = jsonPOJOBuilder.withPrefix();
    }
}
