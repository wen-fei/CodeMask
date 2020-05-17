package com.wds.CodeMask.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author : TenYun
 * @date : 2020-05-17 13:52
 * @description : label
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cm_label")
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lid;

    @Column(name = "label", nullable = false)
    private String label;
}
