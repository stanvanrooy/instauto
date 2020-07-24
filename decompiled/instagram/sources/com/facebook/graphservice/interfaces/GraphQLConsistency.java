package com.facebook.graphservice.interfaces;

import p000X.C14490kj;
import p000X.C206218sE;
import p000X.C42261s3;

public interface GraphQLConsistency extends GraphQLBaseConsistency {
    C14490kj applyOptimistic(Tree tree, C42261s3 r2);

    C14490kj applyOptimisticBuilder(C206218sE r1, C42261s3 r2);

    C14490kj publish(Tree tree);

    C14490kj publishBuilder(C206218sE r1);

    C14490kj publishBuilderWithFullConsistency(C206218sE r1);

    C14490kj publishWithFullConsistency(Tree tree);
}
