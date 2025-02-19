package com.example.act_er.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.act_er.entity.ActEmployeeList;
import com.example.act_er.form.UserSettingForm;
import com.example.act_er.mapper.UserSettingMapper;
import com.example.act_er.service.UserSettingResource;

import lombok.RequiredArgsConstructor;

/**
 * 利用者設定画面のコントローラークラス
 * @author yu-kudo
 *
 */
@RequestMapping("userSetting/*")
@RequiredArgsConstructor
@Controller
public class UserSettingController {

	/** 画面名 */
	final private String screenName = "利用者設定画面";
    @Autowired
    UserSettingResource userSettingResource;
    @Autowired
    UserSettingMapper userSettingMapper;

  @RequestMapping("setting")
  public ModelAndView open(@ModelAttribute UserSettingForm userSettingForm, ModelAndView mav) {
	  // 遷移先を指定
	  mav.setViewName("userSetting");

	//オブジェクトに値を設定
	  mav.addObject("screenName", screenName);
	  mav.addObject("teamList", userSettingResource.selectAll());
	  mav.addObject("employeeList", userSettingResource.selectAll());

	  return mav;
  }

  @RequestMapping(path = "search", method = RequestMethod.POST)
  private ModelAndView confirm(@ModelAttribute UserSettingForm userSettingForm, ModelAndView mav) {

	  // TODO 検索処理
	  List<ActEmployeeList> a = userSettingResource.userSerch(userSettingForm, "");

	  // 遷移先を指定
	  mav.setViewName("userSetting");

	  //オブジェクトに値を設定
	  mav.addObject("userName", userSettingForm.getUserName());
	  mav.addObject("teamName", userSettingForm.getTeamName());
	  mav.addObject("dataList", userSettingForm.getTeamName());
	  mav.addObject("employeeData", userSettingForm.getSearchResultList());

		return mav;
	}

}