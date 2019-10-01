package com.book.manager.entities.book;

import com.book.manager.entities.ChangeLog;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Leo Liu
 */
@Entity
@Getter
@Setter
@Table(name = "tb_book_desc")
public class BookDescribe extends ChangeLog {
    @Id //对应tb_book中的id
    @Column(name = "book_id")
    private Long bookId;
    @Column(columnDefinition = "varchar2(1000)")
    private String describe;
}
