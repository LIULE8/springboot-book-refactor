package com.book.manager.results;

import com.book.manager.enums.BookGrade;
import com.book.manager.enums.BookStatus;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Getter
@Setter
public class BookSearchResult {
    private Long booKId;
    private Long bookNumber;
    private String[] images;
    private String bookName;
    private String createBy;
    private String updateBy;
    private String bookAuthor;
    private String bookPress;
    private String bookPublishTime;
    private BookGrade bookGrade;
    private BookStatus bookStatus;
    private ZonedDateTime createTimes;
    private ZonedDateTime updateTimes;
    private BigDecimal originalAmount;
    private BigDecimal secondHandAmount;
    private BookCategorySearchResult bookCategorySearchResult;
}
