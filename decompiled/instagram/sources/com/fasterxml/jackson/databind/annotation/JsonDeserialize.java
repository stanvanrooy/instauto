package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.databind.JsonDeserializer;
import p000X.C27147BzB;
import p000X.C27159BzW;
import p000X.C3k;

public @interface JsonDeserialize {
    /* renamed from: as */
    Class mo49412as() default C27159BzW.class;

    Class builder() default C27159BzW.class;

    Class contentAs() default C27159BzW.class;

    Class contentConverter() default C3k.class;

    Class contentUsing() default JsonDeserializer.None.class;

    Class converter() default C3k.class;

    Class keyAs() default C27159BzW.class;

    Class keyUsing() default C27147BzB.class;

    Class using() default JsonDeserializer.None.class;
}
