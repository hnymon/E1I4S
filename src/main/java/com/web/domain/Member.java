package com.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@Table
public class Member {

	
	@Id
	private String id;
	private String password;
	private String name;
	private String nickName;
	private String phoneNumber;
	private String birth;
	private String email;
	private String domain;
	private String addr;
	
	@Column(insertable = false, updatable =false, columnDefinition = "number default 0")
	private Long point;
	
	@Column(insertable = false, updatable =false, columnDefinition = "number default 0")
	private Long totalPoint;
	
	
	
	
}
