/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NewReleases 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4852503820634808609L;
    private List<NewRelease> newRelease;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("NewRelease")
    public List<NewRelease> getNewRelease ( ) { 
        return this.newRelease;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("NewRelease")
    public void setNewRelease (List<NewRelease> value) { 
        this.newRelease = value;
    }
 
}
 