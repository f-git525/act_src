package com.example.act_er.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.act_er.form.JudgeResultForm;
import com.example.act_er.service.JudgeResultResource;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

/**
 * 判定結果画面のコントローラークラス
 * @author ta-ebihara
 *
 */
@RequestMapping("judgeResult/*")
@RequiredArgsConstructor
@Controller

public class JudgeResultController {

	/** 画面名 */
	final private String screenName = "結果判定画面";
    @Autowired
    JudgeResultResource judgeResultResource;

  @RequestMapping("setting")
  public ModelAndView open(@ModelAttribute JudgeResultForm judgeResultFrom, ModelAndView mav,HttpServletRequest request) {

	//セッションから値を受け取る
	  HttpSession session = request.getSession();
	// リクエストからデータを取得
	  Object[] date = request.getParameterValues("date");
	// データを使用して上下関係判定
	  judgeResultResource.Judge(judgeResultFrom,date,session);
	// 遷移先を指定
	  mav.setViewName("judgeResult");
	//オブジェクトに値を設定
	  mav.addObject("screenName", screenName);
	  /**mav.addObject("historyResult", judgeResultFrom.historyResult);
	  mav.addObject("ageResult",  judgeResultFrom.ageResult);
	  mav.addObject("positionResult",  judgeResultFrom.positionResult);*/
	  mav.addObject("historyResult", "うえだよーん");
	  mav.addObject("ageResult",  "うえだよーん");
	  mav.addObject("positionResult",  "うえだよーん");
	  return mav;
  }

}
