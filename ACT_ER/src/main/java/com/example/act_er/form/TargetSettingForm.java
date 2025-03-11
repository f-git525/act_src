package com.example.act_er.form;

import java.util.List;

import lombok.Data;

@Data
public class TargetSettingForm {


	/** 対象者名*/
	private String targetName;

	/** 利用者名*/
	private String userName;

	/** チーム名*/
	private int teamName;

	private Integer fromEmploymentYears;

	private Integer toEmploymentYears;

	/** 検索結果*/
	private List<String> searchResultList;

	/** エラーメッセージ*/
	private List<String> errorMessage;





}

