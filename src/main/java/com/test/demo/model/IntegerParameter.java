package com.test.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = IntegerParameter.Builder.class)
public class IntegerParameter
{
    private final Integer value;

    private IntegerParameter(Builder builder)
    {
        this.value = builder.value;
    }

    public Integer getValue()
    {
        return value;
    }

    public static class Builder
    {
        @JsonProperty("S")
        private Integer value;

        public Builder withValue(String value)
        {
            this.value = Integer.valueOf(value);
            return this;
        }

        public IntegerParameter build() {
            return new IntegerParameter(this);
        }
    }
}
