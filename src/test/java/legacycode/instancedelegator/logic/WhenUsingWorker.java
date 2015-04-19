package legacycode.instancedelegator.logic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import legacycode.instancedelegator.utils.UtilityClass;

import org.testng.annotations.Test;

@Test
public class WhenUsingWorker {

	public void testDoSomeWork() {
		Worker worker = new Worker(new UtilityClass());
		assertThat(worker.doSomeWork(), is(8));
	}
}
