package com.aristotle.core.persistance.repo;

import java.util.List;

import com.aristotle.core.enums.CampaignType;
import com.aristotle.core.persistance.DonationCampaign;

public interface DonationCampaignDao {

	public abstract DonationCampaign saveDonationCampaign(DonationCampaign donationCampaign);

	public abstract DonationCampaign getDonationCampaignById(Long id);

	public abstract DonationCampaign getDonationCampaignByDonationCampaign(String donationCampaign);
	
	public abstract List<DonationCampaign> getDonationCampaignsByUserId(Long userId);
	
	public abstract DonationCampaign getDonationCampaignByTypeAndUserId(CampaignType campaigntype, Long userId);
	
	public abstract Object[] getOldDonationCampaignInfo(String facebookUserId);

}