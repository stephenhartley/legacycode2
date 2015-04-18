package legacycode.instancedelegator.logic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import legacycode.instancedelegator.logic.Worker;
import legacycode.instancedelegator.utils.UtilityClass;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class WhenUsingWorker {

	@Mock
	private UtilityClass mockUtilityClass;

	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	public void testAdd() {
		Worker worker = new Worker(mockUtilityClass);
		when(mockUtilityClass.addInstance(anyInt(), anyInt())).thenReturn(29);
		int result = worker.doSomeWork();
		assertThat(result, is(29));
	}
}
