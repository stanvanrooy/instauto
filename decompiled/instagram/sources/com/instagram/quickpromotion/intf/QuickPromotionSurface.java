package com.instagram.quickpromotion.intf;

import java.util.HashMap;
import java.util.Map;

public enum QuickPromotionSurface {
    MEGAPHONE(4715),
    TOOLTIP(5858),
    INTERSTITIAL(5734),
    STORIES_TRAY(6319),
    MESSAGE_FOOTER(8034);
    
    public static Map A02;
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        A02 = new HashMap(r3);
        for (QuickPromotionSurface quickPromotionSurface : values()) {
            A02.put(Integer.valueOf(quickPromotionSurface.A00), quickPromotionSurface);
        }
    }

    /* access modifiers changed from: public */
    QuickPromotionSurface(int i) {
        this.A00 = i;
        this.A01 = "Query QuickPromotionSurfaceQuery: Viewer {viewer() {eligible_promotions.trigger_context_v2(<trigger_context_v2>).ig_parameters(<ig_parameters>).trigger_name(<trigger_name>).surface_nux_id(<surface>).external_gating_permitted_qps(<external_gating_permitted_qps>).supports_client_filters(true).include_holdouts(true) {edges {client_ttl_seconds,log_eligibility_waterfall,is_holdout,priority,time_range {start,end},node {id,promotion_id,logging_data,max_impressions,triggers,contextual_filters {clause_type,filters {filter_type,unknown_action,value {name,required,bool_value,int_value,string_value},extra_datas {name,required,bool_value,int_value,string_value}},clauses {clause_type,filters {filter_type,unknown_action,value {name,required,bool_value,int_value,string_value},extra_datas {name,required,bool_value,int_value,string_value}},clauses {clause_type,filters {filter_type,unknown_action,value {name,required,bool_value,int_value,string_value},extra_datas {name,required,bool_value,int_value,string_value}},clauses {clause_type,filters {filter_type,unknown_action,value {name,required,bool_value,int_value,string_value},extra_datas {name,required,bool_value,int_value,string_value}}}}}},is_uncancelable,template {name,parameters {name,required,bool_value,string_value,color_value,}},creatives {title {text},content {text},footer {text},social_context {text},social_context_images,primary_action{title {text},url,limit,dismiss_promotion},secondary_action{title {text},url,limit,dismiss_promotion},dismiss_action{title {text},url,limit,dismiss_promotion},image.scale(<scale>) {uri,width,height}}}}}}}";
    }
}
