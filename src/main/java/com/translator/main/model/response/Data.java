
package com.translator.main.model.response;

import java.util.HashMap;
import java.util.List;
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
    "translation",
    "pronunciation",
    "pairs",
    "source"
})
@ToString
public class Data {

    @JsonProperty("translation")
    private String translation;
    @JsonProperty("pronunciation")
    private String pronunciation;
    @JsonProperty("pairs")
    private List<Pair> pairs = null;
    @JsonProperty("source")
    private Source source;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("translation")
    public String getTranslation() {
        return translation;
    }

    @JsonProperty("translation")
    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @JsonProperty("pronunciation")
    public String getPronunciation() {
        return pronunciation;
    }

    @JsonProperty("pronunciation")
    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    @JsonProperty("pairs")
    public List<Pair> getPairs() {
        return pairs;
    }

    @JsonProperty("pairs")
    public void setPairs(List<Pair> pairs) {
        this.pairs = pairs;
    }

    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
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
