package designpatterns;

import java.util.ArrayList;

interface CricketStrategy {
	public void skill();
}

class BattingStrategy implements CricketStrategy {
	@Override
	public void skill() {
		System.out.println("i can bat");
	}
}

class BowlingStrategy implements CricketStrategy {
	@Override
	public void skill() {
		System.out.println("i can bowl");
	}
}

class FieldingStrategy implements CricketStrategy {
	@Override
	public void skill() {
		System.out.println("i can field");
	}
}

enum CricketFactoryEnum {
	BAT {
		public CricketStrategy getCricketObject() {
			return new BattingStrategy();
		}
	},
	BOWL {
		public CricketStrategy getCricketObject() {
			return new BowlingStrategy();
		}
	};
	public abstract CricketStrategy getCricketObject();
}

public class StrategyEnum {
public static void main(String[] args) {
	CricketStrategy cricketBat=CricketFactoryEnum.valueOf("BAT").getCricketObject();
	CricketStrategy cricketBowl=CricketFactoryEnum.valueOf("BOWL").getCricketObject();
	cricketBat.skill();
	cricketBowl.skill();
	ArrayList on=new ArrayList();
}
}
