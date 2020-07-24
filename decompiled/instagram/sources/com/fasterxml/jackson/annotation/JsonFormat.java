package com.fasterxml.jackson.annotation;

public @interface JsonFormat {
    String locale() default "##default";

    String pattern() default "";

    Integer shape$REDEX$deBCpmRnsy6();

    String timezone() default "##default";
}
