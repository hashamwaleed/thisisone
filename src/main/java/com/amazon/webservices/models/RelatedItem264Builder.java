/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class RelatedItem264Builder {
    //the instance to build
    private RelatedItem264 relatedItem264;

    /**
     * Default constructor to initialize the instance
     */
    public RelatedItem264Builder() {
        relatedItem264 = new RelatedItem264();
    }

    public RelatedItem264Builder item(Item253 item) {
        relatedItem264.setItem(item);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RelatedItem264 build() {
        return relatedItem264;
    }
}