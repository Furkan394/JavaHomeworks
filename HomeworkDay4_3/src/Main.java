import java.sql.Date;

import Entities.Campaign;
import Entities.Game;
import Entities.User;
import Managers.CampaignManager;
import Managers.GameManager;
import Managers.OrderManager;
import Managers.UserManager;
import Managers.UserValidationManager;

public class Main {

	public static void main(String[] args) {
		
		User furkan = new User(1, "Furkan Emre", "Çakıroğlu", "12345678910", new Date(2000-12-12), "furkan@furkan.com");
		UserManager userManager = new UserManager(new UserValidationManager());
		userManager.register(furkan);
		
		
		Game r6Siege = new Game(1, "Rainbow 6 Siege", 120);
		GameManager gameManager = new GameManager();
		gameManager.add(r6Siege);
		
		Campaign campaign = new Campaign(1, "Black Friday", 20);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		OrderManager orderManager = new OrderManager();
		orderManager.order(furkan, r6Siege, campaign);

	}

}
