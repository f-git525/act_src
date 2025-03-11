package com.example.act_er.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.act_er.form.JudgeResultForm;

import jakarta.servlet.http.HttpSession;

/**
 * 判定結果画面のサービスクラス
 *
 * @author ta-ebihara
 *
 */
@Transactional
@Service
public class JudgeResultResource{

	public   JudgeResultForm Judge(JudgeResultForm judgeResultFrom,Object[] date,HttpSession session){

		int username = (int) session.getAttribute("username");

		if ((int) date[0] < username){
			judgeResultFrom.setHistoryResult("あなたのほうが長いです。");
		}else if((int) date[0] > username) {
			judgeResultFrom.setHistoryResult("あなたのほうが短いです。");
		}
		else {
			judgeResultFrom.setHistoryResult("あなたと同じです。");
		}

		if ((int) date[1] > username){
			judgeResultFrom.setAgeResult("あなたのほうが年上です。");
		}else if((int) date[1] < username) {
			judgeResultFrom.setAgeResult("あなたのほうが年下です。");
		}
		else {
			judgeResultFrom.setAgeResult("あなたと同じです。");
		}

		if ((int) date[2] > username){
			judgeResultFrom.setPositionResult("あなたのほうが役職が上です。");
		}else if((int) date[2] < username) {
			judgeResultFrom.setPositionResult("あなたのほうが役職が下です。");
		}
		else {
			judgeResultFrom.setPositionResult("あなたと役職が同じです。");
		}
		return judgeResultFrom;
	}

}
