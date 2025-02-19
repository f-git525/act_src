package com.example.act_er.form;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TargetSettingForm {

	/** 社員ID */
	@Getter
	@Setter
	private int employeeID;

	/** 名前*/
	@Getter
	@Setter
	private String employeeName;

	/** 名前カナ*/
	@Getter
	@Setter
	private String employeeNameKana;

	/** 入社日*/
	@Getter
	@Setter
	private String employeeStart;

	/** 年齢*/
	@Getter
	@Setter
	private int employeeAge;

	/** チームID*/
	@Getter
	@Setter
	private int teamID;

	/** 役職ID*/
	@Getter
	@Setter
	private int positionID;

	/** チーム削除フラグ*/
	@Getter
	@Setter
	private int deleteFlog;





}

