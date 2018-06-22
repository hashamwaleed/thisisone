/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Image 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5476478916123388539L;
    private String uRL;
    private DecimalWithUnits height;
    private DecimalWithUnits width;
    private String isVerified;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("URL")
    public String getURL ( ) { 
        return this.uRL;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("URL")
    public void setURL (String value) { 
        this.uRL = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Height")
    public DecimalWithUnits getHeight ( ) { 
        return this.height;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Height")
    public void setHeight (DecimalWithUnits value) { 
        this.height = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Width")
    public DecimalWithUnits getWidth ( ) { 
        return this.width;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Width")
    public void setWidth (DecimalWithUnits value) { 
        this.width = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IsVerified")
    public String getIsVerified ( ) { 
        return this.isVerified;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IsVerified")
    public void setIsVerified (String value) { 
        this.isVerified = value;
    }
 
}
 