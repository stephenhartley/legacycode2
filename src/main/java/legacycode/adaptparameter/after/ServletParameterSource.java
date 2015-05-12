package legacycode.adaptparameter.after;

import javax.servlet.http.HttpServletRequest;

public final class ServletParameterSource implements ParameterSource {

	private HttpServletRequest request;

	public ServletParameterSource(HttpServletRequest request) {
		super();
		this.request = request;
	}

	@Override
	public String getParameterForName(String paramName) {
		String result = null;
		String[] values = request.getParameterValues(paramName);
		if (values != null && values.length > 0) {
			result = values[0];
		}
		return result;
	}

}
