package Services;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface OrderService {
	void order(User user, Game game, Campaign campaign);
}
