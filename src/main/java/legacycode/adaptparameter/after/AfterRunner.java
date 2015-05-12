package legacycode.adaptparameter.after;

public final class AfterRunner {

	String doTheWork(ParameterSource source) {
		return source.getParameterForName("someParamName");
	}

}
