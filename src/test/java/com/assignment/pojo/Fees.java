package com.assignment.pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Fees {
    @JsonProperty("Bundle")
    private Integer bundle;
    @JsonProperty("EndDate")
    private Double endDate;
    @JsonProperty("Feature")
    private Integer feature;
    @JsonProperty("Gallery")
    private Integer gallery;
    @JsonProperty("Listing")
    private Integer listing;
    @JsonProperty("Reserve")
    private Double reserve;
    @JsonProperty("Subtitle")
    private Double subtitle;
    @JsonProperty("TenDays")
    private Double tenDays;
    @JsonProperty("ListingFeeTiers")
    private List<ListingFeeTier> listingFeeTiers = null;
    @JsonProperty("SecondCategory")
    private Double secondCategory;
}
