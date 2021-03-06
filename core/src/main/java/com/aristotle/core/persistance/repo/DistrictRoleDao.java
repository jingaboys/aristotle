package com.aristotle.core.persistance.repo;

import java.util.List;

import com.aristotle.core.persistance.DistrictRole;

public interface DistrictRoleDao {

	public abstract DistrictRole saveDistrictRole(DistrictRole districtRole);
	
	public abstract void deleteDistrictRole(DistrictRole districtRole);
	
	public abstract DistrictRole getDistrictRoleById(Long id);
	
	public abstract DistrictRole getDistrictRoleByDistrictIdAndRoleId(Long districtid,Long roleId);
	
	public abstract List<DistrictRole> getAllDistrictRoles(int totalItems, int pageNumber);
	
	public abstract List<DistrictRole> getAllDistrictRoles();
	
	public abstract List<DistrictRole> getDistrictRoleItemsAfterId(long districtRoleId);

}
