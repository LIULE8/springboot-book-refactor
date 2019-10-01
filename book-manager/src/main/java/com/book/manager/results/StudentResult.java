package com.book.manager.results;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResult {
    private String userName;
    private String password;
    private String phone;
    private String email;
    private StudentDetailResult studentDetail;
}
