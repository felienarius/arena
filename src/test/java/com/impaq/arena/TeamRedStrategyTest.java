package com.impaq.arena;

import org.junit.Test;

import com.impaq.arena.engine.event.DestroyCastle;
import com.impaq.arena.engine.event.KillBuilders;
import com.impaq.arena.engine.event.AddWarriors;
import com.impaq.arena.engine.event.AddWizards;
import com.impaq.arena.engine.event.SpyBuilders;

public class TeamRedStrategyTest extends AbstractStrategyTest {

	@Override
	public Strategy getStrategy() {
		return new TeamRedStrategy();
	}

	@Test
	public void kill_builders_if_more_then_15(){
		//given
			gameBoard.setOponentBuildersCount(16);
		
		//when
			gameBoard.executeRound();
		
		//than
			AssertionTest(SpyBuilders.class, AddWizards.class, AddWizards.class, KillBuilders.class );
	}

	@Test
	public void destroy_castle_if_less_then_15_builders(){
		//given
			gameBoard.setOponentBuildersCount(10);
		
		//when
			gameBoard.executeRound();
		
		//than
			AssertionTest(SpyBuilders.class, AddWarriors.class, AddWarriors.class, DestroyCastle.class );
	}
	
}
