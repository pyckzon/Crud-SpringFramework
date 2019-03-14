package com.csalazar.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	private int id;
	private String name;
	private int age;
	private int lastScore;
	private int hiScore;
	public Long getId() {
		return (long) id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLastScore() {
		return lastScore;
	}
	public void setLastScore(int lastScore) {
		this.lastScore = lastScore;
	}
	public int getHiScore() {
		return hiScore;
	}
	public void setHiScore(int hiScore) {
		this.hiScore = hiScore;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", lastScore=" + lastScore + ", hiScore="
				+ hiScore + "]";
	}
}
