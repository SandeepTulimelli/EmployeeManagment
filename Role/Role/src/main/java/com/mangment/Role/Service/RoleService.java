package com.mangment.Role.Service;


import java.util.List;

import com.mangment.Role.Entity.Role;


public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(Integer id);
    Role createRole(Role role);
    Role updateRole(Integer id, Role role);
    void deleteRole(Integer id);
}
