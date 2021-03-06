package com.aristotle.core.persistance.repo;

import java.util.List;

import com.aristotle.core.persistance.PcRole;

public interface PcRoleDao {

	public abstract PcRole savePcRole(PcRole pcRole);
	
	public abstract void deletePcRole(PcRole pcRole);
	
	public abstract PcRole getPcRoleById(Long id);
	
	public abstract PcRole getPcRoleByPcIdAndRoleId(Long pcId, Long roleId);
	
	public abstract List<PcRole> getAllPcRoles(int totalItems, int pageNumber);
	
	public abstract List<PcRole> getAllPcRoles();
	
	public abstract List<PcRole> getPcRoleItemsAfterId(long pcRoleId);

}
