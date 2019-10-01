package com.book.manager.entities.users;


import com.book.manager.entities.CommonEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
public class Student extends CommonEntity {
    private String userName;
    private String password;
    private String phone;
    private String email;
    @OneToOne(fetch = FetchType.LAZY)
    private StudentDetail studentDetailResult;
}
