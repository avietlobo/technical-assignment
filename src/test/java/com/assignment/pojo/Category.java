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
public class Category {
    @JsonProperty("CategoryId")
    private Integer categoryId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Path")
    private String path;
    @JsonProperty("CanListAuctions")
    private Boolean canListAuctions;
    @JsonProperty("CanListClassifieds")
    private Boolean canListClassifieds;
    @JsonProperty("CanRelist")
    private Boolean canRelist;
    @JsonProperty("LegalNotice")
    private String legalNotice;
    @JsonProperty("DefaultDuration")
    private Integer defaultDuration;
    @JsonProperty("AllowedDurations")
    private List<Integer> allowedDurations = null;
    @JsonProperty("Fees")
    private Fees fees;
    @JsonProperty("FreePhotoCount")
    private Integer freePhotoCount;
    @JsonProperty("MaximumPhotoCount")
    private Integer maximumPhotoCount;
    @JsonProperty("IsFreeToRelist")
    private Boolean isFreeToRelist;
    @JsonProperty("Promotions")
    private List<Promotion> promotions = null;
    @JsonProperty("EmbeddedContentOptions")
    private List<Object> embeddedContentOptions = null;
    @JsonProperty("MaximumTitleLength")
    private Integer maximumTitleLength;
    @JsonProperty("AreaOfBusiness")
    private Integer areaOfBusiness;
    @JsonProperty("DefaultRelistDuration")
    private Integer defaultRelistDuration;
    @JsonProperty("CanUseCounterOffers")
    private Boolean canUseCounterOffers;
}
