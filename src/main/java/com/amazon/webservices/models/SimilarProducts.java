/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SimilarProducts 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4632600719445646391L;
    private List<SimilarProduct> similarProduct;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SimilarProduct")
    public List<SimilarProduct> getSimilarProduct ( ) { 
        return this.similarProduct;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SimilarProduct")
    public void setSimilarProduct (List<SimilarProduct> value) { 
        this.similarProduct = value;
    }
 
}
 