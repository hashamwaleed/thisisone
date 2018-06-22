/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Summary 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5144888183866507510L;
    private String promotionId;
    private String message;
    private String category;
    private String startDate;
    private String endDate;
    private String eligibilityRequirementDescription;
    private String benefitDescription;
    private String termsAndConditions;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PromotionId")
    public String getPromotionId ( ) { 
        return this.promotionId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PromotionId")
    public void setPromotionId (String value) { 
        this.promotionId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Category")
    public String getCategory ( ) { 
        return this.category;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Category")
    public void setCategory (String value) { 
        this.category = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("StartDate")
    public String getStartDate ( ) { 
        return this.startDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("StartDate")
    public void setStartDate (String value) { 
        this.startDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EndDate")
    public String getEndDate ( ) { 
        return this.endDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EndDate")
    public void setEndDate (String value) { 
        this.endDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EligibilityRequirementDescription")
    public String getEligibilityRequirementDescription ( ) { 
        return this.eligibilityRequirementDescription;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EligibilityRequirementDescription")
    public void setEligibilityRequirementDescription (String value) { 
        this.eligibilityRequirementDescription = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BenefitDescription")
    public String getBenefitDescription ( ) { 
        return this.benefitDescription;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BenefitDescription")
    public void setBenefitDescription (String value) { 
        this.benefitDescription = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TermsAndConditions")
    public String getTermsAndConditions ( ) { 
        return this.termsAndConditions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TermsAndConditions")
    public void setTermsAndConditions (String value) { 
        this.termsAndConditions = value;
    }
 
}
 