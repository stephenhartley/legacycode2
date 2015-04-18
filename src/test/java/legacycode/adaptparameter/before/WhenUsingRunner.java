package legacycode.adaptparameter.before;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import javax.servlet.http.HttpServletRequest;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.mockito.Mockito.when;

@Test
public class WhenUsingRunner {
	
	@Mock
	HttpServletRequest mockRequest;
	
	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	public void testDoTheWorkUsingAMock() {
		when(mockRequest.getParameterValues("someParamName")).thenReturn(new String[] {"hello world"});
		String actual = new Runner().doTheWork(mockRequest);
		assertThat(actual, is("hello world"));
	}


}
