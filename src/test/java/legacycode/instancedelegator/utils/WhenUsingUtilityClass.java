package legacycode.instancedelegator.utils;

import legacycode.instancedelegator.utils.UtilityClass;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class WhenUsingUtilityClass {
	
  @Test
  public void testAdd() {
	  assertThat(UtilityClass.add(4, 6), is(10));
  }

}
