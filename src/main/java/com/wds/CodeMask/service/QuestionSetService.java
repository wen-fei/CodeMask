package com.wds.CodeMask.service;

import com.wds.CodeMask.pojo.QuestionSet;

import java.util.List;

/**
 * @author : TenYun
 * @date : 2020-05-17 18:46
 * @description :
 **/
public interface QuestionSetService {

    /**
     * get all question set by uid
     * @param uid
     * @return
     */
    List<QuestionSet> queryQuestionSetByUser(Long uid);

    /**
     * get all question set by username
     * @param username
     * @return
     */
    List<QuestionSet> queryQuestionSetByUser(String username);
}
