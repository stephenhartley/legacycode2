package legacycode.adaptparameter.after;

public class FakeParameterSource implements ParameterSource {

	@Override
	public String getParameterForName(String paramName) {
		return "fakeParamValue";
	}

}
