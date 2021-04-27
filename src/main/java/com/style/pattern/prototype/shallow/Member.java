package com.style.pattern.prototype.shallow;

import java.util.List;

/**
 * @author leon
 * @date 2021-04-26 21:32:22
 */
public class Member implements Cloneable{
	private String name;
	private Integer sex;

	private List<String> hobbies;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Member{" +
				"name='" + name + '\'' +
				", sex=" + sex +
				", hobbies=" + hobbies +
				'}';
	}
}
