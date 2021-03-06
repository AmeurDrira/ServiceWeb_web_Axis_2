package tn.iit.model;

public class User {

	private String userLogin;
	private String provider;
	private String name;
	private String email;
	private String password;
	private String uid;
	private boolean accepted;
	private boolean confirm;

	public User() {
		super();

	}

	public User(String userLogin, String provider, String name, String email, String password, String uid,
			boolean accepted, boolean confirm) {
		super();
		this.userLogin = userLogin;
		this.provider = provider;
		this.name = name;
		this.email = email;
		this.password = password;
		this.uid = uid;
		this.accepted = accepted;
		this.confirm = confirm;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public boolean isConfirm() {
		return confirm;
	}

	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}

	@Override
	public String toString() {
		return "User [userLogin=" + userLogin + ", provider=" + provider + ", name=" + name + ", email=" + email
				+ ", password=" + password + ", uid=" + uid + ", accepted=" + accepted + ", confirm=" + confirm + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userLogin == null) ? 0 : userLogin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userLogin == null) {
			if (other.userLogin != null)
				return false;
		} else if (!userLogin.equals(other.userLogin))
			return false;
		return true;
	}

}
