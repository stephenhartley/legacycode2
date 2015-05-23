package legacycode.instancedelegator.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

@Test
public final class WhenUsingUtilityClass {

    public void testAdd() {
        assertThat(UtilityClass.add(4, 6)).isEqualTo(10);
    }

    public void testAddInstance() {
        assertThat(new UtilityClass().addInstance(5, 2)).isEqualTo(7);
    }

}
