package com.kn.adapter;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Bike b = new LightBike();
		Moto m = new EMoto();
		Student child = new Student();
		child.gotoSchool(b);
		Student universityStudent = new Student();
		universityStudent.gotoSchool(new MotoAdapter(m));
	}
}
