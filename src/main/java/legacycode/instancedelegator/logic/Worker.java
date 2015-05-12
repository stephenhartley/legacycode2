package legacycode.instancedelegator.logic;

import legacycode.instancedelegator.utils.UtilityClass;

public final class Worker {

	private UtilityClass utilityClass;

	public Worker(UtilityClass utilityClass) {
		super();
		this.utilityClass = utilityClass;
	}

	public int doSomeWork() {
		return utilityClass.addInstance(1, 7);
	}

}
