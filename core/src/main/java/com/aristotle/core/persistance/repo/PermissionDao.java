package com.aristotle.core.persistance.repo;

import java.util.List;

import com.aristotle.core.enums.AppPermission;
import com.aristotle.core.persistance.Permission;

public interface PermissionDao {

	public abstract Permission savePermission(Permission permission);
	
	public abstract void deletePermission(Permission permission);
	
	public abstract Permission getPermissionById(Long id);
	
	public abstract Permission getPermissionByName(AppPermission name);
	
	public abstract List<Permission> getAllPermissions(int totalItems, int pageNumber);
	
	public abstract List<Permission> getAllPermissions();
	
	public abstract List<Permission> getPermissionItemsAfterId(long permissionId);

}
