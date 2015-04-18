package legacycode.adaptparameter.after;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@Test
public class WhenUsingAfterRunner {
	
	public void testDoTheWorkUsingFakeParamterSource() {
		String actual = new AfterRunner().doTheWork(new FakeParameterSource());
		assertThat(actual, is("fakeParamValue"));
		
	}

}
