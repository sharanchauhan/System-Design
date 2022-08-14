package CodeForStrategyDesignPattern;

import CodeForStrategyDesignPattern.Kicks.*;
import CodeForStrategyDesignPattern.Punches.*;
import CodeForStrategyDesignPattern.Wrestle.*;

public class Fighter {
	IKickingBehaviour kb;
	IPunchingBehaviour pb;
	IWrestlingBehaviour wb;
	
	Fighter(){
		this.kb = new RoundHouseKick();
		this.wb = new NoWrestle();
		this.pb = new HookPunch();
	}
	
	void fight() {
		pb.punch();
		kb.kick();
		wb.wrestle();
	}
}
