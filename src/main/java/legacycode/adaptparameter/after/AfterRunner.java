package legacycode.adaptparameter.after;

public class AfterRunner {
	
	String doTheWork(ParameterSource source) {
		return source.getParameterForName("someParamName");
	}

}
