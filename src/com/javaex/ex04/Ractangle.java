package com.javaex.ex04;

import java.util.Objects;

public class Ractangle {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {
		super(); //Object 부모의 생성자를 물려받음
	}

	public Ractangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	//메소드gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드일반
	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ractangle other = (Ractangle) obj;
		return height == other.height && width == other.width;
	}
}
