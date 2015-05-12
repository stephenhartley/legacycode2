package legacycode.adaptparameter.before;

import javax.servlet.http.HttpServletRequest;

public final class Runner {

	String doTheWork(HttpServletRequest request) {
		String result = null;
		String[] values = request.getParameterValues("someParamName");
		if (values != null && values.length > 0) {
			result = values[0];
		}
		return result;
	}

}
