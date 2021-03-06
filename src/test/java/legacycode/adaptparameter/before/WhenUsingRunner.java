package legacycode.adaptparameter.before;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public final class WhenUsingRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(WhenUsingRunner.class);

    @Mock
    HttpServletRequest mockRequest;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    public void testDoTheWorkUsingAMock() {
        LOGGER.info("Just started running the test!");
        when(mockRequest.getParameterValues("someParamName")).thenReturn(
                new String[] { "hello world" });
        String actual = new Runner().doTheWork(mockRequest);
        assertThat(actual).isEqualTo("hello world");
    }

}
