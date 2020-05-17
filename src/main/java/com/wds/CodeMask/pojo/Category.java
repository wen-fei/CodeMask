package com.wds.CodeMask.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author : TenYun
 * @date : 2020-05-17 13:54
 * @description : category
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cm_category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @Column(name = "category", nullable = false)
    private String category;
}
