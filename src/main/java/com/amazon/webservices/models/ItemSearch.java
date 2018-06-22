/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemSearch 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5571904750570284173L;
    private String marketplaceDomain;
    private String aWSAccessKeyId;
    private String associateTag;
    private String xMLEscaping;
    private String validate;
    private ItemSearchRequest shared;
    private List<ItemSearchRequest> request;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MarketplaceDomain")
    public String getMarketplaceDomain ( ) { 
        return this.marketplaceDomain;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MarketplaceDomain")
    public void setMarketplaceDomain (String value) { 
        this.marketplaceDomain = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AWSAccessKeyId")
    public String getAWSAccessKeyId ( ) { 
        return this.aWSAccessKeyId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AWSAccessKeyId")
    public void setAWSAccessKeyId (String value) { 
        this.aWSAccessKeyId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AssociateTag")
    public String getAssociateTag ( ) { 
        return this.associateTag;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AssociateTag")
    public void setAssociateTag (String value) { 
        this.associateTag = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("XMLEscaping")
    public String getXMLEscaping ( ) { 
        return this.xMLEscaping;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("XMLEscaping")
    public void setXMLEscaping (String value) { 
        this.xMLEscaping = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Validate")
    public String getValidate ( ) { 
        return this.validate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Validate")
    public void setValidate (String value) { 
        this.validate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Shared")
    public ItemSearchRequest getShared ( ) { 
        return this.shared;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Shared")
    public void setShared (ItemSearchRequest value) { 
        this.shared = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Request")
    public List<ItemSearchRequest> getRequest ( ) { 
        return this.request;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Request")
    public void setRequest (List<ItemSearchRequest> value) { 
        this.request = value;
    }
 
}
 