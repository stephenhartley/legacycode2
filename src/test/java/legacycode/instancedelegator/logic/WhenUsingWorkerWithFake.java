package legacycode.instancedelegator.logic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import legacycode.instancedelegator.utils.FakeUtilityClass;

import org.testng.annotations.Test;

@Test
public class WhenUsingWorkerWithFake {

	public void testDoSomeWork() {
		Worker worker = new Worker(new FakeUtilityClass());
		assertThat(worker.doSomeWork(), is(42));
	}
}
