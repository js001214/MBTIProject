package com.mysite.mbti.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


//채팅방 - 커밋 테스트 4
@Entity
@Table(name = "chat_room")
public class ChatRoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private UserInfoEntity userId;

    //채팅방 이름
    @Column(nullable = false)
    private String title;

    
    //인원수
    @Column(nullable = false)
    private int count;

    //채팅방 비밀번호
    private String password;

    
    //regDate 등록일
    @Column(nullable = false)
    private LocalDateTime regDate;

    private LocalDateTime modifyDate;

    private LocalDateTime deleteDate;

    //ChatRoom을 삭제시 해당 방에 대한 채팅기록도 함께 삭제된다.
    @OneToMany(mappedBy = "chatRoom", cascade = CascadeType.ALL)
    private List<ChatRecordEntity> chatRecords;
    
}

