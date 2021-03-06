package tn.iit.model;

public class Application {

	private String applicationName;
	private String multiCastAddress;
	private String appSKey;
	private String nwkSKey;
	private String userLogin;

	public Application() {
		super();

	}

	public Application(String applicationName, String multiCastAddress, String appSKey, String nwkSKey,
			String userLogin) {
		super();
		this.applicationName = applicationName;
		this.multiCastAddress = multiCastAddress;
		this.appSKey = appSKey;
		this.nwkSKey = nwkSKey;
		this.userLogin = userLogin;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getMultiCastAddress() {
		return multiCastAddress;
	}

	public void setMultiCastAddress(String multiCastAddress) {
		this.multiCastAddress = multiCastAddress;
	}

	public String getAppSKey() {
		return appSKey;
	}

	public void setAppSKey(String appSKey) {
		this.appSKey = appSKey;
	}

	public String getNwkSKey() {
		return nwkSKey;
	}

	public void setNwkSKey(String nwkSKey) {
		this.nwkSKey = nwkSKey;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	@Override
	public String toString() {
		return "Application [applicationName=" + applicationName + ", multiCastAddress=" + multiCastAddress
				+ ", appSKey=" + appSKey + ", nwkSKey=" + nwkSKey + ", userLogin=" + userLogin + "]";
	}

}
