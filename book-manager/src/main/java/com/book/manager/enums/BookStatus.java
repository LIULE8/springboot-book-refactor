package com.book.manager.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookStatus {
    UP_SHELF("上架"),
    DOWN_SHELF("下架"),
    DRAFT("草稿");
    private String name;
}
