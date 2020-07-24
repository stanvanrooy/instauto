package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.databind.JsonSerializer;
import p000X.C27159BzW;
import p000X.C3k;

public @interface JsonSerialize {
    /* renamed from: as */
    Class mo49424as() default C27159BzW.class;

    Class contentAs() default C27159BzW.class;

    Class contentConverter() default C3k.class;

    Class contentUsing() default JsonSerializer.None.class;

    Class converter() default C3k.class;

    Integer include$REDEX$qOyT0m6UjZk();

    Class keyAs() default C27159BzW.class;

    Class keyUsing() default JsonSerializer.None.class;

    Integer typing$REDEX$W9TkfpVV9xi();

    Class using() default JsonSerializer.None.class;
}
