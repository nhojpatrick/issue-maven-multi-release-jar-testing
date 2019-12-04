package com.github.nhojpatrick.issue;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class BaseClassOverrideByJava11VersionTest {

	@Test
	public void baseClassTest_java11() {
		final BaseClass baseClass = new BaseClass();
		final String actual = baseClass.whatAmI();
		assertThat(actual, is(equalTo("BaseClass.whatAmI() Java11 Version")));
	}

}
