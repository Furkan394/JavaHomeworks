package Managers;

import Entities.Campaign;
import Entities.Game;
import Entities.User;
import Services.OrderService;


public class OrderManager implements OrderService{

	@Override
	public void order(User user, Game game, Campaign campaign) {
		
		System.out.println(user.getFirstName() + " bought " 
		+ game.getName() + " with the " + campaign.getCampaignName());
	
		
	}

}
