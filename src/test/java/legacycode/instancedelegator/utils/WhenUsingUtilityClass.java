package legacycode.instancedelegator.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.testng.annotations.Test;

@Test
public class WhenUsingUtilityClass {

	public void testAdd() {
		assertThat(UtilityClass.add(4, 6), is(10));
	}

}
