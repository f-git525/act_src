package com.example.act_er.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.act_er.entity.ActEmployeeList;
import com.example.act_er.entity.ActTeamMaster;
import com.example.act_er.form.UserSettingForm;

/**
 * 利用者設定画面で使用するDB接続のmapperインターフェース
 * @author yu-kudo
 */
@Mapper
public interface UserSettingMapper {

    @Select("SELECT * FROM act_er.act_employee_list")
    List<ActEmployeeList> select();

	/**
	 * 利用者設定画面のチーム選択プルダウンに使用するチームリスト取得
	 * @return ActTeamMasterリスト
	 */
    List<ActTeamMaster> selectTeam();

	/**
	 * 利用者設定画面で設定された条件に一致するレコードをActEmployeeListテーブから取得
	 * @param userSettingForm
	 * @return
	 */
    List<ActEmployeeList> userSelect(UserSettingForm userSettingForm, String yearSearchValue);

    /**
     * ActEmployeeListテーブルから前件取得する
     * @return
     */
    List<ActEmployeeList> selectAll();
}