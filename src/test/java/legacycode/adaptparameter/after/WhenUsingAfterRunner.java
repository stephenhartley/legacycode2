package legacycode.adaptparameter.after;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.testng.annotations.Test;

@Test
public class WhenUsingAfterRunner {

	public void testDoTheWorkUsingFakeParameterSource() {
		String actual = new AfterRunner().doTheWork(new FakeParameterSource());
		assertThat(actual, is("fakeParamValue"));
	}

}
