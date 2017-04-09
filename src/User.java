
public class User {
	int idUser;
	String username;
	char[] password;

	public User(String username, char[] inputPassword) {
		super();
		this.username = username;
		this.password = inputPassword;
	}
	
	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUser() {
		return username;
	}

	public void setUser(String user) {
		this.username = user;
	}

	public char[] getPass() {
		return password;
	}

	public void setPass(char[] pass) {
		this.password = pass;
	}

}
