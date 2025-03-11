package com.example.act_er.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.act_er.entity.ActEmployeeList;
import com.example.act_er.form.TargetSettingForm;
import com.example.act_er.mapper.TargetSettingMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class TargetSettingResourseImpl implements TargetSettingResourse {

	final private TargetSettingMapper mapper;

	public List<ActEmployeeList> targetSerch(@Param("targetSettingForm") TargetSettingForm targetSettingForm,
			@Param("yearSearchValue") String yearSearchValue) {

		targetSettingForm.getTargetName();

		return mapper.select();
		//return mapper.userSelect(userSettingForm, "");
	}

	public List<ActEmployeeList> selectAll() {

		System.out.println(mapper.selectAll());

		return mapper.selectAll();
	}

	public void execute() {

	}
}

