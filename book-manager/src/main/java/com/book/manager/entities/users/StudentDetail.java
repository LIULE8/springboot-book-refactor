package com.book.manager.entities.users;


import com.book.manager.entities.CommonEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "student_detail")
public class StudentDetail extends CommonEntity {

    @Column(name = "student_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Student student;
    /**
     * 省市区
     */
    private String area;

    /**
     * 学校
     */
    private String school;

    /**
     * 学院
     */
    private String college;

    /**
     * 专业
     */
    private String major;

    /**
     * 班级
     */
    private String clazz;

    /**
     * 学号
     */
    private String studentNumber;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 头像
     */
    private String image;

    private Integer level = 0; //会员等级 只需根据售出商品数量来判断。。不想太复杂
}
