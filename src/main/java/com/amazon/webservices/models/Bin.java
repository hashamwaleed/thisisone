/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Bin 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4976553145190226696L;
    private String binName;
    private int binItemCount;
    private List<BinParameter> binParameter;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BinName")
    public String getBinName ( ) { 
        return this.binName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BinName")
    public void setBinName (String value) { 
        this.binName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BinItemCount")
    public int getBinItemCount ( ) { 
        return this.binItemCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BinItemCount")
    public void setBinItemCount (int value) { 
        this.binItemCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BinParameter")
    public List<BinParameter> getBinParameter ( ) { 
        return this.binParameter;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BinParameter")
    public void setBinParameter (List<BinParameter> value) { 
        this.binParameter = value;
    }
 
}
 