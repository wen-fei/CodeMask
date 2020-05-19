package com.wds.CodeMask.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
@Table(name = "cm_questionset")
public class QuestionSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qid;

    @Column(name = "qs_title", nullable = false)
    private String title;

    @Column(name = "qs_desc", nullable = false)
    private String desc;

    @Column(name = "qs_author", nullable = false)
    private Long category;

    @Column(name = "qs_label")
    private String label;

    @Column(name = "qs_score", nullable = false)
    private Float score;
}
