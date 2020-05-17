package com.wds.CodeMask.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : TenYun
 * @date : 2020-05-17 13:47
 * @description : question set
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class QuestionSet {

    @Id
    private Long qid;

    @Column(nullable = false)
    private String qs_title;

    @Column(nullable = false)
    private String qs_desc;

    @Column(nullable = false)
    private Long qs_author;

    @Column(nullable = false)
    private Long qs_category;


    private String qs_label;

    @Column(nullable = false)
    private Float qs_score;
}
