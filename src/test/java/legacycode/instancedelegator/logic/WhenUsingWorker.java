package legacycode.instancedelegator.logic;

import static org.assertj.core.api.Assertions.assertThat;
import legacycode.instancedelegator.utils.UtilityClass;

import org.testng.annotations.Test;

@Test
public final class WhenUsingWorker {

    public void testDoSomeWork() {
        Worker worker = new Worker(new UtilityClass());
        assertThat(worker.doSomeWork()).isEqualTo(8);
    }
}
