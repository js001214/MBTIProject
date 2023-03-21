package com.mysite.mbti.entity;

import java.time.LocalDate;

import javax.management.relation.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//회원정보
@Entity
@Table(name = "user_info")
public class UserInfoEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false)
    private String mbti;

    @Column(nullable = false)
    private LocalDate regDate;

    private LocalDate modifyDate;

    private LocalDate deleteDate;

    
    //권한 Role role에서 String role로 바
    //EnumType.String = 이름을 DB에 저장
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private String role;

    //결제권한
    @Column(nullable = false)
    private boolean payment;

    //회원사진
    private String profile;

}
