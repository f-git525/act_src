package com.example.act_er.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.act_er.entity.ActEmployeeList;
import com.example.act_er.entity.ActTeamMaster;
import com.example.act_er.form.UserSettingForm;
import com.example.act_er.mapper.UserSettingMapper;

import lombok.RequiredArgsConstructor;

/**
 * ユーザー設定画面のサービスクラス
 *
 * @author yu-kudo
 *
 */
@Service
@RequiredArgsConstructor
@Transactional
public class UserSettingResourceImpl implements UserSettingResource {

	private final UserSettingMapper mapper;

	public List<ActEmployeeList> userSerch(@Param("userSettingForm") UserSettingForm userSettingForm,
			@Param("yearSearchValue") String yearSearchValue) {

		userSettingForm.getUserName();

		return mapper.select();
//        return mapper.userSelect(userSettingForm, "");
	}

	public List<ActEmployeeList> selectAll() {

		System.out.println(mapper.selectAll());

		return mapper.selectAll();

	}

	/**
	 *
	 */
	public List<ActTeamMaster> selectTeam() {

		return mapper.selectTeam();

	}

	public void execute() {

	}
}