package demo.srammy.springbootwithtoken.service;

import demo.srammy.springbootwithtoken.dao.AuthDao;
import demo.srammy.springbootwithtoken.model.Role;
import demo.srammy.springbootwithtoken.model.SecurityUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value="CustomUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private AuthDao authDao;

	/**
	 * @Description:加载用户信息&权限
	 * @param: username 用户名
	 * @Return: org.springframework.security.core.userdetails.UserDetails
	 */
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		//UsernamePasswordAuthenticationFilter
		SecurityUserDetails userDetail = new SecurityUserDetails(authDao.findByUsername(userName));
		if (userDetail == null) {
			throw new UsernameNotFoundException(String.format("No userDetail found with username '%s'.", userName));
		}
		List<Role> roles = authDao.findRoleByUserId(userDetail.getUserId());
		userDetail.setRoles(roles);
		return userDetail;
	}
}