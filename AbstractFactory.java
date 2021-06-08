package designpatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Test {
	public void skill();
}

interface T20 {
	public void luck();
}

class BattingTest implements Test {
	@Override
	public void skill() {
		String s="sss";
		System.out.println(s.chars());
		
		System.out.println(s.chars().mapToObj(val-> (char)val).
		filter(c->"aeiou".contains(c.toString())).count());
		ExecutorService executor=Executors.newFixedThreadPool(3);
		
	}
}

class BowlingTest implements Test {
	@Override
	public void skill() {
		System.out.println("i can bowl");
		try (BufferedReader reader = Files.newBufferedReader
				( Paths.get("myfile.txt"), StandardCharsets.UTF_8)) {
			System.out.println(reader.lines());
			} catch (IOException ex) { }

		String s="sss";
		int[] arr= {1,2,3,2,3};
		Set<Integer> set=new LinkedHashSet<>();
		Arrays.stream(arr).filter(val->val % 2==0).forEach(System.out::println);
		Arrays.stream(arr).filter(val->!set.add(val)).forEach(System.out::println);
		s.chars()
		.mapToObj(v->(char)v).
		forEach(System.out::println);
	}
}

class BattingT20 implements T20 {
	@Override
	public void luck() {
		System.out.println("i can swing");
	}
}

class BowlingT20 implements T20 {
	@Override
	public void luck() {
		System.out.println("batsman rule us");
	}
}

abstract class AbstractCricket {
	public abstract Test getTest(String skill);
	public abstract T20 getT20(String skill);
}

class TestMatchFactory extends AbstractCricket {
	@Override
	public Test getTest(String skill) {
		if (skill.equalsIgnoreCase("BAT")) {
			return new BattingTest();
		} else if (skill.equalsIgnoreCase("BOWL")) {
			return new BowlingTest();
		} else
			return null;
	}

	@Override
	public T20 getT20(String skill) {
		// TODO Auto-generated method stub
		return null;
	}

}

class T20MatchFactory extends AbstractCricket {
	@Override
	public Test getTest(String skill) {
		return null;
	}

	@Override
	public T20 getT20(String skill) {
		if (skill.equalsIgnoreCase("BAT")) {
			return new BattingT20();
		} else if (skill.equalsIgnoreCase("BOWL")) {
			return new BowlingT20();
		} else
			return null;
	}
}
class CricketMatchFactory{
	AbstractCricket getabstractCricket(String format) {
		if(format.equalsIgnoreCase("T20")) {
			return new T20MatchFactory();
		}
		else if(format.equalsIgnoreCase("Test")) {
			return new TestMatchFactory();
		}
		else
			return null;
	}
}
public class AbstractFactory {
	public static void main(String[] args) {
		CricketMatchFactory obj=new CricketMatchFactory();
		TestMatchFactory test=(TestMatchFactory) obj.getabstractCricket("Test");
		BowlingTest bowl=(BowlingTest) test.getTest("BOWL");
		bowl.skill();
		
	}

}
