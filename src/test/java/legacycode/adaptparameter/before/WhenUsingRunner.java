package legacycode.adaptparameter.before;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class WhenUsingRunner {

	@Mock
	HttpServletRequest mockRequest;

	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	public void testDoTheWorkUsingAMock() {
		when(mockRequest.getParameterValues("someParamName")).thenReturn(
				new String[] { "hello world" });
		String actual = new Runner().doTheWork(mockRequest);
		assertThat(actual).isEqualTo("hello world");
	}

}
