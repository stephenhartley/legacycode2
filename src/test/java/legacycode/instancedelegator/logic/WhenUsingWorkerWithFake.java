package legacycode.instancedelegator.logic;

import static org.assertj.core.api.Assertions.assertThat;
import legacycode.instancedelegator.utils.FakeUtilityClass;

import org.testng.annotations.Test;

@Test
public final class WhenUsingWorkerWithFake {

	public void testDoSomeWork() {
		Worker worker = new Worker(new FakeUtilityClass());
		assertThat(worker.doSomeWork()).isEqualTo(42);
	}
}
