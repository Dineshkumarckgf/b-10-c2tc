package feb25;
import java.util.EnumSet;
public class EnumDemo {
	enum Gfg { CASH, LEARN, SELLL, MONEY, MOOK };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<Gfg> set1, set2, set3, set4;
		 
        
        set1 = EnumSet.of(Gfg.SELLL, Gfg.MONEY,Gfg.LEARN, Gfg.CASH);
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(Gfg.class);
        set4 = EnumSet.range(Gfg.CASH, Gfg.SELLL);
 
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Set 4: " + set4);
	}
}
