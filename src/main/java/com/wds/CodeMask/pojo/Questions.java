package com.wds.CodeMask.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
public class Questions {

    @Id
    @GeneratedValue
    private Long qid;

    @Column(nullable = false)
    private String q_desc;

    @Column(nullable = false)
    private String q_answer;

    @Column(nullable = false)
    private Long q_qsid;

    private String q_label;

    @Column(nullable = false)
    private Float q_score;

}
