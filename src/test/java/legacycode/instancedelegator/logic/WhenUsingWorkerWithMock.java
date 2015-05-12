package legacycode.instancedelegator.logic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import legacycode.instancedelegator.utils.UtilityClass;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public final class WhenUsingWorkerWithMock {

	@Mock
	private UtilityClass mockUtilityClass;

	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	public void testDoSomeWork() {
		Worker worker = new Worker(mockUtilityClass);
		when(mockUtilityClass.addInstance(anyInt(), anyInt())).thenReturn(29);
		assertThat(worker.doSomeWork()).isEqualTo(29);
	}
}
