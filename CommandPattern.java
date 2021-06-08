package designpatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

interface Command{
	public void skill();	
}

class BattingCommand implements Command {
	@Override
	public void skill() {
		System.out.println("i can bat");
	}

}

class BowlingCommand implements Command {
	@Override
	public void skill() {
		System.out.println("i can bowl");
	}
}

class BattingSupplier implements Supplier {
	
	public void skill() {
		System.out.println("i can bat");
	}
	@Override
	public Object get() {
		return new BattingSupplier();
	}

}

class BowlingSupplier implements Supplier {
	public void skill() {
		System.out.println("i can bowl");
	}
	@Override
	public Object get() {
		return new BowlingSupplier();
	}
}

public class CommandPattern {
public static void main(String[] args) {
	Map<String,Command> map=new HashMap();
	map.put("BAT", new BattingCommand());
	map.put("BOWL", new BowlingCommand());
	
	Command bat=map.get("BAT");
	bat.skill();
	Command bowl=map.get("BOWL");
	bowl.skill();
	
	Supplier batSupply=()->{
		return new BattingSupplier();
	};
	BattingSupplier batt=(BattingSupplier) batSupply.get();
	batt.skill();
	Supplier bowlSupply=()->{
		return new BowlingSupplier();
	};
	BowlingSupplier bowll=(BowlingSupplier) bowlSupply.get();
	bowll.skill();
}
}
