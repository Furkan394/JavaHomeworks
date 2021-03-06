package Managers;

import Entities.Campaign;
import Services.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Campaign added : " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Campaign updated : " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Campaign deleted : " + campaign.getCampaignName());
	}

}
