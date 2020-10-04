
package com.translator.main.model.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "autoCorrected",
    "value",
    "didYouMean"
})
@ToString
public class Text {

    @JsonProperty("autoCorrected")
    private Boolean autoCorrected;
    @JsonProperty("value")
    private String value;
    @JsonProperty("didYouMean")
    private Boolean didYouMean;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("autoCorrected")
    public Boolean getAutoCorrected() {
        return autoCorrected;
    }

    @JsonProperty("autoCorrected")
    public void setAutoCorrected(Boolean autoCorrected) {
        this.autoCorrected = autoCorrected;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("didYouMean")
    public Boolean getDidYouMean() {
        return didYouMean;
    }

    @JsonProperty("didYouMean")
    public void setDidYouMean(Boolean didYouMean) {
        this.didYouMean = didYouMean;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
