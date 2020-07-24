package com.fasterxml.jackson.annotation;

import p000X.C27009BwC;
import p000X.C2C;
import p000X.C3l;

public @interface JsonTypeInfo {
    Class defaultImpl() default C3l.class;

    C2C include() default C2C.PROPERTY;

    String property() default "";

    C27009BwC use();

    boolean visible() default false;
}
