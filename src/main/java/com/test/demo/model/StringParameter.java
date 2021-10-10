package com.test.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = StringParameter.Builder.class)
public class StringParameter
{
    private final String value;

    private StringParameter(Builder builder)
    {
        this.value = builder.value;
    }

    public String getValue()
    {
        return value;
    }

    public static class Builder
    {
        @JsonProperty("S")
        private String value;

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }

        public StringParameter build() {
            return new StringParameter(this);
        }
    }
}
