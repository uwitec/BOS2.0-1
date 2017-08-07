package cn.tripod.bos.service.system;

import java.util.List;

import cn.tripod.bos.domain.system.Role;
import cn.tripod.bos.domain.system.User;

public interface RoleService {

	List<Role> findByUser(User user);

	List<Role> findAll();

	void save(Role model, String[] permissionIds, String menuIds);

}
