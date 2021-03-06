package com.aristotle.core.persistance.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aristotle.core.persistance.CountryRegionRole;

public interface CountryRegionRoleDao extends JpaRepository<CountryRegionRole, Long> {

	public abstract CountryRegionRole saveCountryRegionRole(CountryRegionRole countryRegionRole);
	
	public abstract void deleteCountryRegionRole(CountryRegionRole countryRegionRole);
	
	public abstract CountryRegionRole getCountryRegionRoleById(Long id);
	
	public abstract CountryRegionRole getCountryRegionRoleByCountryRegionIdAndRoleId(Long countryRegionId, Long roleId);
	
	public abstract List<CountryRegionRole> getAllCountryRegionRoles(int totalItems, int pageNumber);
	
	public abstract List<CountryRegionRole> getAllCountryRegionRoles();
	
	public abstract List<CountryRegionRole> getCountryRegionRoleItemsAfterId(long countryRegionRoleId);

}
