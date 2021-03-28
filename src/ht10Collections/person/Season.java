package ht10Collections.person;

import lombok.Getter;


public enum Season {
    WINTER("12_1_2"),
    SPRING("3_4_5"),
    SUMMER("6_7_8"),
    AUTUMN("9_10_11");

   public String season;

    Season(String season) {
        this.season = season;
    }
}
