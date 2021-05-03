package Services;

import Entities.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void sell(Game game);
}
