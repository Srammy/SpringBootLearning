package demo.srammy.springbootwithtoken.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Description: springsecurity用户权限包装了
 */
public class SecurityUserDetails extends User implements UserDetails {

	public SecurityUserDetails(User user) {
		if(user!=null) {
			this.setUserId(user.getUserId());
			this.setUsername(user.getUsername());
			this.setPassword(user.getPassword());
			this.setRoles(user.getRoles());
		}
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorityList = new ArrayList<>();
		List<Role> roles = this.getRoles();
		if(roles!=null&&roles.size()>0){
			for (Role role : roles) {
				authorityList.add(new SimpleGrantedAuthority(role.getName()));
			}
		}
		return authorityList;
	}


	/**
	 * 账户是否过期
	 * @return
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/**
	 * 是否禁用
	 * @return
	 */
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	/**
	 * 密码是否过期
	 * @return
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/**
	 * 是否启用
	 * @return
	 */
	@Override
	public boolean isEnabled() {
		return true;
	}

}