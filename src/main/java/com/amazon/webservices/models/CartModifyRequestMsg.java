/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartModifyRequestMsg 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5237852003803010146L;
    private CartModify body;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public CartModify getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (CartModify value) { 
        this.body = value;
    }
 
}
 