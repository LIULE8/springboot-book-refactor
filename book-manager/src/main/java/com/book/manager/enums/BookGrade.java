package com.book.manager.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookGrade {
    TEN("十品"),
    NINE_FIVE("九五品"),
    NINE("九品"),
    EIGHT_FIVE("八五品"),
    EIGHT("八品"),
    SEVEN_FIVE("七五品"),
    SEVEN("七品");
    private String name;
}
