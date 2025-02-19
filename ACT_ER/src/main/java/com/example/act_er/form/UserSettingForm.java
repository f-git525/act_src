package com.example.act_er.form;

import java.util.List;

import lombok.Data;

//private String screenName;;

@Data
public class UserSettingForm {

		private List<String> errorMessage;
		private String userName;
		private String teamName;
		private Integer fromEmploymentYears;
		private Integer toEmploymentYears;
		private List<String> searchResultList;

}