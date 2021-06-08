package designpatterns;

interface Cricket{
	public void skill();
}
class Batting implements Cricket{
	@Override
	public void skill() {
		System.out.println("i can bat");
	}
}
class Bowling implements Cricket{
	@Override
	public void skill() {
		System.out.println("i can bowl");
	}
}
class Fielding implements Cricket{
	@Override
	public void skill() {
		System.out.println("i can field");
	}
}
class CricketFactory{
	public static Cricket getCricketObject(String skillType) {
		switch(skillType) {
		case "Bat":
			return new Batting();
		case "Bowl":
			return new Bowling();
		default:
			return new Fielding();
		}
	}
}
public class Factory {
	public static void main(String[] args) {
		Cricket cricketBat=CricketFactory.getCricketObject("Bat");
		cricketBat.skill();
		Cricket cricketBowl=CricketFactory.getCricketObject("Bowl");
		cricketBowl.skill();
	}
}
