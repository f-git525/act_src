package com.example.act_er.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.act_er.entity.ActEmployeeList;
import com.example.act_er.form.TargetSettingForm;

@Mapper
public interface TargetSettingMapper {

	@Select("SELECT * FROM act_er.act_employee_list")
    List<ActEmployeeList> select() ;

	/**
	 * 対象者設定画面で設定された条件に一致するレコードをActEmployeeListテーブから取得
	 * @param targetSettingForm
	 * @return
	 */
    List<ActEmployeeList> TagetSelect(TargetSettingForm targetSettingForm, String yearSearchValue);

    /**
     * ActEmployeeListテーブルから全件取得する
     * @return
     */
    List<ActEmployeeList> selectAll();
}


