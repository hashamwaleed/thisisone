/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartGetRequestMsg 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5623806911657410048L;
    private CartGet body;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public CartGet getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (CartGet value) { 
        this.body = value;
    }
 
}
 