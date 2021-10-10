package com.test.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.Optional;

@JsonDeserialize(builder = MeterItem.Builder.class)
public final class MeterItem
{

    private final StringParameter meter;

    private final StringParameter date;

    private final IntegerParameter midnight;

    private final IntegerParameter zeroThirty;

    private final IntegerParameter one;

    private final IntegerParameter oneThirty;

    private final IntegerParameter two;

    private final IntegerParameter twoThirty;

    private final IntegerParameter three;

    private final IntegerParameter threeThirty;

    private final IntegerParameter four;

    private final IntegerParameter fourThirty;

    private final IntegerParameter five;

    private final IntegerParameter fiveThirty;

    private final IntegerParameter six;

    private final IntegerParameter sixThirty;

    private final IntegerParameter seven;

    private final IntegerParameter sevenThirty;

    private final IntegerParameter eight;

    private final IntegerParameter eightThirty;

    private final IntegerParameter nine;

    private final IntegerParameter nineThirty;

    private final IntegerParameter ten;

    private final IntegerParameter tenThirty;

    private final IntegerParameter eleven;

    private final IntegerParameter elevenThirty;

    private final IntegerParameter twelve;

    private final IntegerParameter twelveThirty;

    private final IntegerParameter thirteen;

    private final IntegerParameter thirteenThirty;

    private final IntegerParameter fourteen;

    private final IntegerParameter fourteenThirty;

    private final IntegerParameter fifteen;

    private final IntegerParameter fifteenThirty;

    private final IntegerParameter sixteen;

    private final IntegerParameter sixteenThirty;

    private final IntegerParameter seventeen;

    private final IntegerParameter seventeenThirty;

    private final IntegerParameter eighteen;

    private final IntegerParameter eighteenThirty;

    private final IntegerParameter nineteen;

    private final IntegerParameter nineteenThirty;

    private final IntegerParameter twenty;

    private final IntegerParameter twentyThirty;

    private final IntegerParameter twentyOne;

    private final IntegerParameter twentyOneThirty;

    private final IntegerParameter twentyTwo;

    private final IntegerParameter twentyTwoThirty;

    private final IntegerParameter twentyThree;

    private final IntegerParameter twentyThreeThirty;


    private MeterItem(Builder builder)
    {
        this.meter = builder.meter;
        this.date = builder.date;
        this.midnight = builder.midnight;
        this.zeroThirty = builder.zeroThirty;
        this.one = builder.one;
        this.oneThirty = builder.oneThirty;
        this.two = builder.two;
        this.twoThirty = builder.twoThirty;
        this.three = builder.threeThirty;
        this.threeThirty = builder.threeThirty;
        this.four = builder.four;
        this.fourThirty = builder.fourThirty;
        this.five = builder.five;
        this.fiveThirty = builder.fiveThirty;
        this.six = builder.six;
        this.sixThirty = builder.sixThirty;
        this.seven = builder.seven;
        this.sevenThirty = builder.sevenThirty;
        this.eight = builder.eight;
        this.eightThirty = builder.eightThirty;
        this.nine = builder.nine;
        this.nineThirty = builder.nineThirty;
        this.ten = builder.ten;
        this.tenThirty = builder.tenThirty;
        this.eleven = builder.eleven;
        this.elevenThirty = builder.elevenThirty;
        this.twelve = builder.twelve;
        this.twelveThirty = builder.twelveThirty;
        this.thirteen = builder.thirteen;
        this.thirteenThirty = builder.thirteenThirty;
        this.fourteen = builder.fourteen;
        this.fourteenThirty = builder.fourteenThirty;
        this.fifteen = builder.fifteen;
        this.fifteenThirty = builder.fifteenThirty;
        this.sixteen = builder.sixteen;
        this.sixteenThirty = builder.sixteenThirty;
        this.seventeen = builder.seventeen;
        this.seventeenThirty = builder.seventeenThirty;
        this.eighteen = builder.eighteen;
        this.eighteenThirty = builder.eightThirty;
        this.nineteen = builder.nineteen;
        this.nineteenThirty = builder.nineteenThirty;
        this.twenty = builder.twenty;
        this.twentyThirty = builder.twentyThirty;
        this.twentyOne = builder.twentyOne;
        this.twentyOneThirty = builder.twentyOneThirty;
        this.twentyTwo = builder.twentyTwo;
        this.twentyTwoThirty =builder.twentyTwoThirty;
        this.twentyThree = builder.twentyThree;
        this.twentyThreeThirty = builder.twentyThreeThirty;

    }

    public StringParameter getMeter() {
        return meter;
    }

    public StringParameter getDate() {
        return date;
    }

    public IntegerParameter getMidnight() {
        return midnight;
    }

    public IntegerParameter getZeroThirty() {
        return zeroThirty;
    }

    public IntegerParameter getOne() {
        return one;
    }

    public IntegerParameter getOneThirty() {
        return oneThirty;
    }

    public IntegerParameter getTwo() {
        return two;
    }

    public IntegerParameter getTwoThirty() {
        return twoThirty;
    }

    public IntegerParameter getThree() {
        return three;
    }

    public IntegerParameter getThreeThirty() {
        return threeThirty;
    }

    public IntegerParameter getFour() {
        return four;
    }

    public IntegerParameter getFourThirty() {
        return fourThirty;
    }

    public IntegerParameter getFive() {
        return five;
    }

    public IntegerParameter getFiveThirty() {
        return fiveThirty;
    }

    public IntegerParameter getSix() {
        return six;
    }

    public IntegerParameter getSixThirty() {
        return sixThirty;
    }

    public IntegerParameter getSeven() {
        return seven;
    }

    public IntegerParameter getSevenThirty() {
        return sevenThirty;
    }

    public IntegerParameter getEight() {
        return eight;
    }

    public IntegerParameter getEightThirty() {
        return eightThirty;
    }

    public IntegerParameter getNine() {
        return nine;
    }

    public IntegerParameter getNineThirty() {
        return nineThirty;
    }

    public IntegerParameter getTen() {
        return ten;
    }

    public IntegerParameter getTenThirty() {
        return tenThirty;
    }

    public IntegerParameter getEleven() {
        return eleven;
    }

    public IntegerParameter getElevenThirty() {
        return elevenThirty;
    }

    public IntegerParameter getTwelve() {
        return twelve;
    }

    public IntegerParameter getTwelveThirty() {
        return twelveThirty;
    }

    public IntegerParameter getThirteen() {
        return thirteen;
    }

    public IntegerParameter getThirteenThirty() {
        return thirteenThirty;
    }

    public IntegerParameter getFourteen() {
        return fourteen;
    }

    public IntegerParameter getFourteenThirty() {
        return fourteenThirty;
    }

    public IntegerParameter getFifteen() {
        return fifteen;
    }

    public IntegerParameter getFifteenThirty() {
        return fifteenThirty;
    }

    public IntegerParameter getSixteen() {
        return sixteen;
    }

    public IntegerParameter getSixteenThirty() {
        return sixteenThirty;
    }

    public IntegerParameter getSeventeen() {
        return seventeen;
    }

    public IntegerParameter getSeventeenThirty() {
        return seventeenThirty;
    }

    public IntegerParameter getEighteen() {
        return eighteen;
    }

    public IntegerParameter getEighteenThirty() {
        return eighteenThirty;
    }

    public IntegerParameter getNineteen() {
        return nineteen;
    }

    public IntegerParameter getNineteenThirty() {
        return nineteenThirty;
    }

    public IntegerParameter getTwenty() {
        return twenty;
    }

    public IntegerParameter getTwentyThirty() {
        return twentyThirty;
    }

    public IntegerParameter getTwentyOne() {
        return twentyOne;
    }

    public IntegerParameter getTwentyOneThirty() {
        return twentyOneThirty;
    }

    public IntegerParameter getTwentyTwo() {
        return twentyTwo;
    }

    public IntegerParameter getTwentyTwoThirty() {
        return twentyTwoThirty;
    }

    public IntegerParameter getTwentyThree() {
        return twentyThree;
    }

    public IntegerParameter getTwentyThreeThirty() {
        return twentyThreeThirty;
    }

    public Integer getConsumptionSum()
    {
        return Optional.ofNullable(getMidnight().getValue()).orElse(0)
                + Optional.ofNullable(getZeroThirty().getValue()).orElse(0)
                + Optional.ofNullable(getOne().getValue()).orElse(0)
                + Optional.ofNullable(getOneThirty().getValue()).orElse(0)
                + Optional.ofNullable(getTwo().getValue()).orElse(0)
                + Optional.ofNullable(getTwoThirty().getValue()).orElse(0)
                + Optional.ofNullable(getThree().getValue()).orElse(0)
                + Optional.ofNullable(getThreeThirty().getValue()).orElse(0)
                + Optional.ofNullable(getFour().getValue()).orElse(0)
                + Optional.ofNullable(getFourThirty().getValue()).orElse(0)
                + Optional.ofNullable(getFive().getValue()).orElse(0)
                + Optional.ofNullable(getFiveThirty().getValue()).orElse(0)
                + Optional.ofNullable(getSix().getValue()).orElse(0)
                + Optional.ofNullable(getSixThirty().getValue()).orElse(0)
                + Optional.ofNullable(getSeven().getValue()).orElse(0)
                + Optional.ofNullable(getSevenThirty().getValue()).orElse(0)
                + Optional.ofNullable(getEight().getValue()).orElse(0)
                + Optional.ofNullable(getEightThirty().getValue()).orElse(0)
                + Optional.ofNullable(getNine().getValue()).orElse(0)
                + Optional.ofNullable(getNineThirty().getValue()).orElse(0)
                + Optional.ofNullable(getTen().getValue()).orElse(0)
                + Optional.ofNullable(getTenThirty().getValue()).orElse(0)
                + Optional.ofNullable(getEleven().getValue()).orElse(0)
                + Optional.ofNullable(getElevenThirty().getValue()).orElse(0)
                + Optional.ofNullable(getTwelve().getValue()).orElse(0)
                + Optional.ofNullable(getTwelveThirty().getValue()).orElse(0)
                + Optional.ofNullable(getThirteen().getValue()).orElse(0)
                + Optional.ofNullable(getThirteenThirty().getValue()).orElse(0)
                + Optional.ofNullable(getFourteen().getValue()).orElse(0)
                + Optional.ofNullable(getFourteenThirty().getValue()).orElse(0)
                + Optional.ofNullable(getFifteen().getValue()).orElse(0)
                + Optional.ofNullable(getFifteenThirty().getValue()).orElse(0)
                + Optional.ofNullable(getSixteen().getValue()).orElse(0)
                + Optional.ofNullable(getSixteenThirty().getValue()).orElse(0)
                + Optional.ofNullable(getSeventeen().getValue()).orElse(0)
                + Optional.ofNullable(getSeventeenThirty().getValue()).orElse(0)
                + Optional.ofNullable(getEighteen().getValue()).orElse(0)
                + Optional.ofNullable(getEighteenThirty().getValue()).orElse(0)
                + Optional.ofNullable(getNineteen().getValue()).orElse(0)
                + Optional.ofNullable(getNineteenThirty().getValue()).orElse(0)
                + Optional.ofNullable(getTwenty().getValue()).orElse(0)
                + Optional.ofNullable(getTwentyThirty().getValue()).orElse(0)
                + Optional.ofNullable(getTwentyOne().getValue()).orElse(0)
                + Optional.ofNullable(getTwentyOneThirty().getValue()).orElse(0)
                + Optional.ofNullable(getTwentyTwo().getValue()).orElse(0)
                + Optional.ofNullable(getTwentyTwoThirty().getValue()).orElse(0)
                + Optional.ofNullable(getTwentyThree().getValue()).orElse(0)
                + Optional.ofNullable(getTwentyThreeThirty().getValue()).orElse(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeterItem meterItem = (MeterItem) o;
        return Objects.equal(getMeter(), meterItem.getMeter()) && Objects.equal(getDate(), meterItem.getDate()) && Objects.equal(getMidnight(), meterItem.getMidnight()) && Objects.equal(getZeroThirty(), meterItem.getZeroThirty()) && Objects.equal(getOne(), meterItem.getOne()) && Objects.equal(getOneThirty(), meterItem.getOneThirty()) && Objects.equal(getTwo(), meterItem.getTwo()) && Objects.equal(getTwoThirty(), meterItem.getTwoThirty()) && Objects.equal(getThree(), meterItem.getThree()) && Objects.equal(getThreeThirty(), meterItem.getThreeThirty()) && Objects.equal(getFour(), meterItem.getFour()) && Objects.equal(getFourThirty(), meterItem.getFourThirty()) && Objects.equal(getFive(), meterItem.getFive()) && Objects.equal(getFiveThirty(), meterItem.getFiveThirty()) && Objects.equal(getSix(), meterItem.getSix()) && Objects.equal(getSixThirty(), meterItem.getSixThirty()) && Objects.equal(getSeven(), meterItem.getSeven()) && Objects.equal(getSevenThirty(), meterItem.getSevenThirty()) && Objects.equal(getEight(), meterItem.getEight()) && Objects.equal(getEightThirty(), meterItem.getEightThirty()) && Objects.equal(getNine(), meterItem.getNine()) && Objects.equal(getNineThirty(), meterItem.getNineThirty()) && Objects.equal(getTen(), meterItem.getTen()) && Objects.equal(getTenThirty(), meterItem.getTenThirty()) && Objects.equal(getEleven(), meterItem.getEleven()) && Objects.equal(getElevenThirty(), meterItem.getElevenThirty()) && Objects.equal(getTwelve(), meterItem.getTwelve()) && Objects.equal(getTwelveThirty(), meterItem.getTwelveThirty()) && Objects.equal(getThirteen(), meterItem.getThirteen()) && Objects.equal(getThirteenThirty(), meterItem.getThirteenThirty()) && Objects.equal(getFourteen(), meterItem.getFourteen()) && Objects.equal(getFourteenThirty(), meterItem.getFourteenThirty()) && Objects.equal(getFifteen(), meterItem.getFifteen()) && Objects.equal(getFifteenThirty(), meterItem.getFifteenThirty()) && Objects.equal(getSixteen(), meterItem.getSixteen()) && Objects.equal(getSixteenThirty(), meterItem.getSixteenThirty()) && Objects.equal(getSeventeen(), meterItem.getSeventeen()) && Objects.equal(getSeventeenThirty(), meterItem.getSeventeenThirty()) && Objects.equal(getEighteen(), meterItem.getEighteen()) && Objects.equal(getEighteenThirty(), meterItem.getEighteenThirty()) && Objects.equal(getNineteen(), meterItem.getNineteen()) && Objects.equal(getNineteenThirty(), meterItem.getNineteenThirty()) && Objects.equal(getTwenty(), meterItem.getTwenty()) && Objects.equal(getTwentyThirty(), meterItem.getTwentyThirty()) && Objects.equal(getTwentyOne(), meterItem.getTwentyOne()) && Objects.equal(getTwentyOneThirty(), meterItem.getTwentyOneThirty()) && Objects.equal(getTwentyTwo(), meterItem.getTwentyTwo()) && Objects.equal(getTwentyTwoThirty(), meterItem.getTwentyTwoThirty()) && Objects.equal(getTwentyThree(), meterItem.getTwentyThree()) && Objects.equal(getTwentyThreeThirty(), meterItem.getTwentyThreeThirty());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMeter(), getDate(), getMidnight(), getZeroThirty(), getOne(), getOneThirty(), getTwo(), getTwoThirty(), getThree(), getThreeThirty(), getFour(), getFourThirty(), getFive(), getFiveThirty(), getSix(), getSixThirty(), getSeven(), getSevenThirty(), getEight(), getEightThirty(), getNine(), getNineThirty(), getTen(), getTenThirty(), getEleven(), getElevenThirty(), getTwelve(), getTwelveThirty(), getThirteen(), getThirteenThirty(), getFourteen(), getFourteenThirty(), getFifteen(), getFifteenThirty(), getSixteen(), getSixteenThirty(), getSeventeen(), getSeventeenThirty(), getEighteen(), getEighteenThirty(), getNineteen(), getNineteenThirty(), getTwenty(), getTwentyThirty(), getTwentyOne(), getTwentyOneThirty(), getTwentyTwo(), getTwentyTwoThirty(), getTwentyThree(), getTwentyThreeThirty());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("meter", meter)
                .add("date", date)
                .add("midnight", midnight)
                .add("zeroThirty", zeroThirty)
                .add("one", one)
                .add("oneThirty", oneThirty)
                .add("two", two)
                .add("twoThirty", twoThirty)
                .add("three", three)
                .add("threeThirty", threeThirty)
                .add("four", four)
                .add("fourThirty", fourThirty)
                .add("five", five)
                .add("fiveThirty", fiveThirty)
                .add("six", six)
                .add("sixThirty", sixThirty)
                .add("seven", seven)
                .add("sevenThirty", sevenThirty)
                .add("eight", eight)
                .add("eightThirty", eightThirty)
                .add("nine", nine)
                .add("nineThirty", nineThirty)
                .add("ten", ten)
                .add("tenThirty", tenThirty)
                .add("eleven", eleven)
                .add("elevenThirty", elevenThirty)
                .add("twelve", twelve)
                .add("twelveThirty", twelveThirty)
                .add("thirteen", thirteen)
                .add("thirteenThirty", thirteenThirty)
                .add("fourteen", fourteen)
                .add("fourteenThirty", fourteenThirty)
                .add("fifteen", fifteen)
                .add("fifteenThirty", fifteenThirty)
                .add("sixteen", sixteen)
                .add("sixteenThirty", sixteenThirty)
                .add("seventeen", seventeen)
                .add("seventeenThirty", seventeenThirty)
                .add("eighteen", eighteen)
                .add("eighteenThirty", eighteenThirty)
                .add("nineteen", nineteen)
                .add("nineteenThirty", nineteenThirty)
                .add("twenty", twenty)
                .add("twentyThirty", twentyThirty)
                .add("twentyOne", twentyOne)
                .add("twentyOneThirty", twentyOneThirty)
                .add("twentyTwo", twentyTwo)
                .add("twentyTwoThirty", twentyTwoThirty)
                .add("twentyThree", twentyThree)
                .add("twentyThreeThirty", twentyThreeThirty)
                .toString();
    }

    public static class Builder {

        @JsonProperty("Meter")
        private StringParameter meter;

        @JsonProperty("Date")
        private StringParameter date;

        @JsonProperty("0:00")
        private IntegerParameter midnight;

        @JsonProperty("0:30")
        private IntegerParameter zeroThirty;

        @JsonProperty("1:00")
        private IntegerParameter one;

        @JsonProperty("1:30")
        private IntegerParameter oneThirty;

        @JsonProperty("2:00")
        private IntegerParameter two;

        @JsonProperty("2:30")
        private IntegerParameter twoThirty;

        @JsonProperty("3:00")
        private IntegerParameter three;

        @JsonProperty("3:30")
        private IntegerParameter threeThirty;

        @JsonProperty("4:00")
        private IntegerParameter four;

        @JsonProperty("4:30")
        private IntegerParameter fourThirty;

        @JsonProperty("5:00")
        private IntegerParameter five;

        @JsonProperty("5:30")
        private IntegerParameter fiveThirty;

        @JsonProperty("6:00")
        private IntegerParameter six;

        @JsonProperty("6:30")
        private IntegerParameter sixThirty;

        @JsonProperty("7:00")
        private IntegerParameter seven;

        @JsonProperty("7:30")
        private IntegerParameter sevenThirty;

        @JsonProperty("8:00")
        private IntegerParameter eight;

        @JsonProperty("8:30")
        private IntegerParameter eightThirty;

        @JsonProperty("9:00")
        private IntegerParameter nine;

        @JsonProperty("9:30")
        private IntegerParameter nineThirty;

        @JsonProperty("10:00")
        private IntegerParameter ten;

        @JsonProperty("10:30")
        private IntegerParameter tenThirty;

        @JsonProperty("11:00")
        private IntegerParameter eleven;

        @JsonProperty("11:30")
        private IntegerParameter elevenThirty;

        @JsonProperty("12:00")
        private IntegerParameter twelve;

        @JsonProperty("12:30")
        private IntegerParameter twelveThirty;

        @JsonProperty("13:00")
        private IntegerParameter thirteen;

        @JsonProperty("13:30")
        private IntegerParameter thirteenThirty;

        @JsonProperty("14:00")
        private IntegerParameter fourteen;

        @JsonProperty("14:30")
        private IntegerParameter fourteenThirty;

        @JsonProperty("15:00")
        private IntegerParameter fifteen;

        @JsonProperty("15:30")
        private IntegerParameter fifteenThirty;

        @JsonProperty("16:00")
        private IntegerParameter sixteen;

        @JsonProperty("16:30")
        private IntegerParameter sixteenThirty;

        @JsonProperty("17:00")
        private IntegerParameter seventeen;

        @JsonProperty("17:30")
        private IntegerParameter seventeenThirty;

        @JsonProperty("18:00")
        private IntegerParameter eighteen;

        @JsonProperty("18:30")
        private IntegerParameter eighteenThirty;

        @JsonProperty("19:00")
        private IntegerParameter nineteen;

        @JsonProperty("19:30")
        private IntegerParameter nineteenThirty;

        @JsonProperty("20:00")
        private IntegerParameter twenty;

        @JsonProperty("20:30")
        private IntegerParameter twentyThirty;

        @JsonProperty("21:00")
        private IntegerParameter twentyOne;

        @JsonProperty("21:30")
        private IntegerParameter twentyOneThirty;

        @JsonProperty("22:00")
        private IntegerParameter twentyTwo;

        @JsonProperty("22:30")
        private IntegerParameter twentyTwoThirty;

        @JsonProperty("23:00")
        private IntegerParameter twentyThree;

        @JsonProperty("23:30")
        private IntegerParameter twentyThreeThirty;

        public Builder withMeter(StringParameter meter) {
            this.meter = meter;
            return this;
        }

        public Builder withDate(StringParameter date) {
            this.date = date;
            return this;
        }

        public Builder withMidnight(IntegerParameter midnight) {
            this.midnight = midnight;
            return this;
        }

        public Builder withZeroThirty(IntegerParameter zeroThirty) {
            this.zeroThirty = zeroThirty;
            return this;
        }

        public Builder withOne(IntegerParameter one) {
            this.one = one;
            return this;
        }

        public Builder withOneThirty(IntegerParameter oneThirty) {
            this.oneThirty = oneThirty;
            return this;
        }

        public Builder withTwo(IntegerParameter two) {
            this.two = two;
            return this;
        }

        public Builder withTwoThirty(IntegerParameter twoThirty) {
            this.twoThirty = twoThirty;
            return this;
        }

        public Builder withThree(IntegerParameter three) {
            this.three = three;
            return this;
        }

        public Builder withThreeThirty(IntegerParameter threeThirty) {
            this.threeThirty = threeThirty;
            return this;
        }

        public Builder withFour(IntegerParameter four) {
            this.four = four;
            return this;
        }

        public Builder withFourThirty(IntegerParameter fourThirty) {
            this.fourThirty = fourThirty;
            return this;
        }

        public Builder withFive(IntegerParameter five) {
            this.five = five;
            return this;
        }

        public Builder withFiveThirty(IntegerParameter fiveThirty) {
            this.fiveThirty = fiveThirty;
            return this;
        }

        public Builder withSix(IntegerParameter six) {
            this.six = six;
            return this;
        }

        public Builder withSixThirty(IntegerParameter sixThirty) {
            this.sixThirty = sixThirty;
            return this;
        }

        public Builder withSeven(IntegerParameter seven) {
            this.seven = seven;
            return this;
        }

        public Builder withSevenThirty(IntegerParameter sevenThirty) {
            this.sevenThirty = sevenThirty;
            return this;
        }

        public Builder withEight(IntegerParameter eight) {
            this.eight = eight;
            return this;
        }

        public Builder withEightThirty(IntegerParameter eightThirty) {
            this.eightThirty = eightThirty;
            return this;
        }

        public Builder withNine(IntegerParameter nine) {
            this.nine = nine;
            return this;
        }

        public Builder withNineThirty(IntegerParameter nineThirty) {
            this.nineThirty = nineThirty;
            return this;
        }

        public Builder withTen(IntegerParameter ten) {
            this.ten = ten;
            return this;
        }

        public Builder withTenThirty(IntegerParameter tenThirty) {
            this.tenThirty = tenThirty;
            return this;
        }

        public Builder withEleven(IntegerParameter eleven) {
            this.eleven = eleven;
            return this;
        }

        public Builder withElevenThirty(IntegerParameter elevenThirty) {
            this.elevenThirty = elevenThirty;
            return this;
        }

        public Builder withTwelve(IntegerParameter twelve) {
            this.twelve = twelve;
            return this;
        }

        public Builder withTwelveThirty(IntegerParameter twelveThirty) {
            this.twelveThirty = twelveThirty;
            return this;
        }

        public Builder withThirteen(IntegerParameter thirteen) {
            this.thirteen = thirteen;
            return this;
        }

        public Builder withThirteenThirty(IntegerParameter thirteenThirty) {
            this.thirteenThirty = thirteenThirty;
            return this;
        }

        public Builder withFourteen(IntegerParameter fourteen) {
            this.fourteen = fourteen;
            return this;
        }

        public Builder withFourteenThirty(IntegerParameter fourteenThirty) {
            this.fourteenThirty = fourteenThirty;
            return this;
        }

        public Builder withFifteen(IntegerParameter fifteen) {
            this.fifteen = fifteen;
            return this;
        }

        public Builder withFifteenThirty(IntegerParameter fifteenThirty) {
            this.fifteenThirty = fifteenThirty;
            return this;
        }

        public Builder withSixteen(IntegerParameter sixteen) {
            this.sixteen = sixteen;
            return this;
        }

        public Builder withSixteenThirty(IntegerParameter sixteenThirty) {
            this.sixteenThirty = sixteenThirty;
            return this;
        }

        public Builder withSeventeen(IntegerParameter seventeen) {
            this.seventeen = seventeen;
            return this;
        }

        public Builder withSeventeenThirty(IntegerParameter seventeenThirty) {
            this.seventeenThirty = seventeenThirty;
            return this;
        }

        public Builder withEighteen(IntegerParameter eighteen) {
            this.eighteen = eighteen;
            return this;
        }

        public Builder withEighteenThirty(IntegerParameter eighteenThirty) {
            this.eighteenThirty = eighteenThirty;
            return this;
        }

        public Builder withNineteen(IntegerParameter nineteen) {
            this.nineteen = nineteen;
            return this;
        }

        public Builder withNineteenThirty(IntegerParameter nineteenThirty) {
            this.nineteenThirty = nineteenThirty;
            return this;
        }

        public Builder withTwenty(IntegerParameter twenty) {
            this.twenty = twenty;
            return this;
        }

        public Builder withTwentyThirty(IntegerParameter twentyThirty) {
            this.twentyThirty = twentyThirty;
            return this;
        }

        public Builder withTwentyOne(IntegerParameter twentyOne) {
            this.twentyOne = twentyOne;
            return this;
        }

        public Builder withTwentyOneThirty(IntegerParameter twentyOneThirty) {
            this.twentyOneThirty = twentyOneThirty;
            return this;
        }

        public Builder withTwentyTwo(IntegerParameter twentyTwo) {
            this.twentyTwo = twentyTwo;
            return this;
        }

        public Builder withTwentyTwoThirty(IntegerParameter twentyTwoThirty) {
            this.twentyTwoThirty = twentyTwoThirty;
            return this;
        }

        public Builder withTwentyThree(IntegerParameter twentyThree) {
            this.twentyThree = twentyThree;
            return this;
        }

        public Builder withTwentyThreeThirty(IntegerParameter twentyThreeThirty) {
            this.twentyThreeThirty = twentyThreeThirty;
            return this;
        }

        public MeterItem build() {
            return new MeterItem(this);
        }
    }
}
