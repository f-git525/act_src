package com.example.act_er.entity;

import lombok.Data;

/**
 * ACT社員マスタのエンティティクラス
 * @author yu-kudo
 *
 */
@Data
public class ActEmployeeList {
	private String employee_id;
	private String employee_name;
	private String employee_kana;
	private String employee_start_date;
	private String employee_age;
	private String employee_teamId;
	private String employee_position;
	private int delete_flag;
	private String update_day;
	private String create_day;
}
