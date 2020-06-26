package mta.service.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
//@JsonIgnoreProperties(value = { "roles" })
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "role_name", nullable = false)
	private String rolename;

	@ManyToMany
	@JoinTable (name = "role_permission",
				joinColumns = {@JoinColumn(name = "id_role")},
				inverseJoinColumns = {@JoinColumn(name = "id_permission")})
	private List<Permission> permissions;
	
	@ManyToMany
	@JoinTable (name = "role_control",
				joinColumns = {@JoinColumn(name = "id_role")},
				inverseJoinColumns = {@JoinColumn(name = "id_control")})
	private List<Control> listControl;
	
//	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles")
//	private List<User> users = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public List<Control> getListControl() {
		return listControl;
	}

	public void setListControl(List<Control> listControl) {
		this.listControl = listControl;
	}

//	public List<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}
	
	
}
