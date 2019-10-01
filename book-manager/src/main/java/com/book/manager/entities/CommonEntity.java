package com.book.manager.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * @author Leo Liu
 */
@Getter
@Setter
@MappedSuperclass
public class CommonEntity extends ChangeLog {
    private static final long serialVersionUID = 4790352477881010187L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    private Integer isActive;

    @Version
    private long version;
}
