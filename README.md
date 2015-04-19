## Legacy Code Refactoring Examples ##

Some Java examples of Dependency Breaking Techniques from Michael Feathers' "Working Effectively with Legacy Code".

Implemented so far:

* Adapt Parameter
* Introduce Instance Delegator


````java
String doTheWork(HttpServletRequest request) {
		String result = null;
		String[] values = request.getParameterValues("someParamName");
		if (values != null && values.length > 0) {
			result = values[0];
		}
		return result;
	}

````
