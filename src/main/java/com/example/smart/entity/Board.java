package com.example.smart.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name="BOARD")
@Data //시간
@Entity // 테이블과 테이블간의 연결고리
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seqno")
    private int seqno;
    @Column(name = "subject")
    private String subject; //제목
    @Column(name = "content")
    private String content; //본문내용
    @Column(name = "read_cnt")
    private int readCnt; // 조회수
    @Column(name = "writer")
    private String writer; //작성자
    @Column(name = "regist_data")
    private LocalDateTime registDate; //작성일
}
