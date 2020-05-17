package com.wds.CodeMask.service;

import com.wds.CodeMask.pojo.Label;
import com.wds.CodeMask.pojo.QuestionSet;
import com.wds.CodeMask.pojo.Questions;

import java.util.List;

/**
 * @author : TenYun
 * @date : 2020-05-17 15:28
 * @description :
 **/
public interface QuestionService {


    /**
     * create a new question
     * @param desc
     * @param answer
     * @param qsid
     * @param label
     * @param score
     */
    void create(String desc, String answer, String qsid, String label, Float score);


    /**
     * update question's desc and answer
     * @param qid
     * @param desc
     * @param answer
     */
    void updateDescAndAnswer(Long qid, String desc, String answer);

    /**
     * update question's qsid
     * @param qid
     * @param qsid
     */
    void updateQsid(Long qid, Long qsid);

    /**
     * get labels of the question by qid
     * @param qid
     * @return
     */
    List<Label> queryLabelsByQuestion(Long qid);

    /**
     * get all questions by uid
     * @param uid
     * @return
     */
    List<Questions> queryQuestionsByUser(Long uid);

    /**
     * get all questions by username
     * @param username
     * @return
     */
    List<Questions> queryQuestionsByUser(String username);

}
