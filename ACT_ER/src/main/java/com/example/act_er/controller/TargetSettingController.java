package com.example.act_er.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.act_er.entity.ActEmployeeList;
import com.example.act_er.form.TargetSettingForm;
import com.example.act_er.mapper.TargetSettingMapper;
import com.example.act_er.service.TargetSettingResourse;

import lombok.RequiredArgsConstructor;

/**
 * 対象者設定画面のコントローラークラス
 * @author da-okita
 *
 */
@RequestMapping("targetSetting/*")
@RequiredArgsConstructor
@Controller
public class TargetSettingController {

	/** 画面名**/
	final private String screenName = "対象者設定画面";

	@Autowired
	TargetSettingResourse targetSettingResourse;

	@Autowired
	TargetSettingMapper targetSettingMapper;

	@RequestMapping("/home")
	public ModelAndView open(@ModelAttribute TargetSettingForm targetSettingForm, ModelAndView mav) {
		// 遷移先を指定
		mav.setViewName("targetSetting");

		//オブジェクトに値を設定
		mav.addObject("screenName", screenName);
		mav.addObject("employeeList", targetSettingMapper.selectAll());

		System.out.println(targetSettingMapper.selectAll());

		return mav;

	}

	@RequestMapping(path = "search", method = RequestMethod.POST)
	private ModelAndView confirm(@ModelAttribute TargetSettingForm targetSettingForm, ModelAndView mav) {

		// TODO 検索処理
		  List<ActEmployeeList> a = targetSettingResourse.targetSerch(targetSettingForm, "");

		  // 遷移先を指定
		  mav.setViewName("targetSetting");

		//オブジェクトに値を設定
		  mav.addObject("targetUserName", targetSettingForm.getTargetName());
		  mav.addObject("targetTeamName", targetSettingForm.getTeamName());
		  mav.addObject("employeeData", targetSettingForm.getSearchResultList());

		return mav;

	}
}

