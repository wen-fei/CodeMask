package com.wds.CodeMask.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author : TenYun
 * @date : 2020-05-17 13:32
 * @description : question info pojo
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cm_questions")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qid;

    @Column(name = "q_desc", nullable = false)
    private String desc;

    @Column(name = "q_answer", nullable = false)
    private String answer;

    @Column(name = "q_qsid", nullable = false)
    private Long qsid;

    @Column(name = "q_label")
    private String label;

    @Column(name = "q_score", nullable = false)
    private Float score;

}
