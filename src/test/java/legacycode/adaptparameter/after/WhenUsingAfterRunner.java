package legacycode.adaptparameter.after;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

@Test
public final class WhenUsingAfterRunner {

	public void testDoTheWorkUsingFakeParameterSource() {
		String actual = new AfterRunner().doTheWork(new FakeParameterSource());
		assertThat(actual).isEqualTo("fakeParamValue");
	}

}
