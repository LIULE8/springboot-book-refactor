package com.book.manager.entities.book;

import com.book.manager.entities.CommonEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "tb_book_cat")
public class BookCategory extends CommonEntity {
    /**
     * 展示的时候，使用树状图显示，需要重组树，所以记录父节点
     */
    @Column(name = "parent_id")
    private Long parentId;
    private String name;
}
