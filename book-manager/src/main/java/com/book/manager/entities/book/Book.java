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
    private String name;

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
    private String author;

    /**
     * 出版社
     */
    private String press;

    /**
     * 出版时间
     */
    private String publishTime;

    /**
     * 数量
     */
    private Long number;
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
    private String image;
    /**
     * 类别id
     */
    private Long categoryId;
    /**
     * 用户id
     */
    private Long userId;

    public String[] getImages() {
        if (StringUtils.isNoneBlank(image)) {
            if (image.contains(",")) {
                return image.split(",");
            }
            return new String[]{image};
        }
        return null;
    }
}
