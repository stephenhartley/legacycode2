package legacycode.adaptparameter.after;

public final class FakeParameterSource implements ParameterSource {

	@Override
	public String getParameterForName(String paramName) {
		return "fakeParamValue";
	}

}
