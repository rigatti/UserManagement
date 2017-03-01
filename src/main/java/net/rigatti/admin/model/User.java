package net.rigatti.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String password;
    private int enabled;
    
	protected User() {}

    public User(String name, String password, int enabled) {
        this.name = name;
        this.password = password;
        this.enabled = enabled;    		
    }

	@Override
    public String toString() {
        return String.format(
                "User[id=%d, name='%s', enabled='%s']",
                id, name, enabled);
    }

	public Integer getId() {
		return id;
	}

    public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

    public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
}
