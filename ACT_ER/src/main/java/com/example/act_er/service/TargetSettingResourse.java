package com.example.act_er.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.act_er.entity.ActEmployeeList;
import com.example.act_er.form.TargetSettingForm;

@Transactional
@Service
public interface TargetSettingResourse {

	List<ActEmployeeList> targetSerch(TargetSettingForm targetSettingForm, String yearSearchValue);
	List<ActEmployeeList> selectAll();
	public void execute();


}

