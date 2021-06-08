package codingpractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;

public class Traveller {
public static void main(String[] args) throws ParseException {
	ArrayList<String> pics=new ArrayList<>();
	Map<String,Map<String,String>> maps=new TreeMap<>();
	SimpleDateFormat dateParse=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
	pics.add("pic1.jpg,london,01-JAN-2020 05:30:00");
	pics.add("pic2.jpg,london,01-JAN-2021 05:30:00");
	pics.add("pic1.jpg,london,01-JAN-2022 05:30:00");
	pics.add("pic2.jpg,london,01-JAN-2023 05:30:00");
	pics.add("pic1.jpg,london,01-JAN-2024 05:30:00");
	pics.add("pic2.jpg,london,01-JAN-2025 05:30:00");
	pics.add("pic3.jpg,Chicago,01-JAN-2020 04:30:00");
	pics.add("pic1.jpg,london,01-JAN-2026 05:30:00");
	pics.add("pic2.jpg,london,02-JAN-2027 05:30:00");
	pics.add("pic1.jpg,london,01-JAN-2028 05:30:00");
	pics.add("pic2.jpg,london,01-JAN-2029 05:30:00");
	
	pics.add("pic4.jpg,usa,02-JAN-2020 05:30:00");
	pics.add("pic5.jpg,usa,03-JAN-2020 05:30:00");
	Map<String,String> smallSet=new TreeMap<>();
	int i=0;
	Map<String,Integer> count=new HashMap();
	for(String ss:pics) {
		String[] values=ss.split(",");
		if(count.containsKey(values[1])) {
			count.put(values[1], count.get(values[1])+1);
		}
		else {
			count.put(values[1], 1);
		}
	}
	int maxCountry=0;
	for (Map.Entry<String,Integer> entry : count.entrySet()) {
		if(maxCountry < entry.getValue()) {
			maxCountry=entry.getValue();
		}
    }   
	for(String str:pics) {
		++i;
		String[] values=str.split(",");
		String temp=String.format("%0"+String.valueOf(maxCountry).length()+"d",i );
		smallSet.put(values[2]+"_"+values[1],values[1]+temp);
	}
	System.out.println(smallSet.values());
}
}
