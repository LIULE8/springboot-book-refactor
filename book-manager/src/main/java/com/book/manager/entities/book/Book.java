package com.book.manager.entities.book;

import com.book.manager.entities.CommonEntity;
import com.book.manager.enums.BookGrade;
import com.book.manager.enums.BookStatus;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Leo Liu
 */
@Entity
@Getter
@Setter
@Table(name = "tb_book")
public class Book extends CommonEntity {

    /**
     * 书名
     */
    private String bookName;

    /**
     * 原价
     */
    private BigDecimal originalAmount;

    /**
     * 二手价
     */
    private BigDecimal secondHandAmount;

    /**
     * 作者
     */
    private String bookAuthor;

    /**
     * 出版社
     */
    private String bookPress;

    /**
     * 出版时间
     */
    private String bookPublishTime;

    /**
     * 数量
     */
    private Long bookNumber;
    /**
     * 书的状态
     */
    @Enumerated(EnumType.STRING)
    private BookStatus bookStatus;

    /**
     * 书的品相，二手程度
     */
    @Enumerated(EnumType.STRING)
    private BookGrade bookGrade;
    /**
     * 书图片 StringBuilder拼接多个图片 ","分开
     */
    @Column(columnDefinition = "varchar2(500)")
    private String bookImage;
    /**
     * 类别id
     */
    private Long categoryId;
    /**
     * 用户id
     */
    private Long studentId;

    public String[] getImages() {
        if (StringUtils.isNoneBlank(bookImage)) {
            if (bookImage.contains(",")) {
                return bookImage.split(",");
            }
            return new String[]{bookImage};
        }
        return null;
    }
}
