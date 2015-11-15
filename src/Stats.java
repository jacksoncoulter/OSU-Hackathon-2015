
public class Stats {
	private Skill[] statList;
	private LifeSkill[] lifeStatList;
	
	//the skills are broken into two arrays so that I am able to reach currentValue for the LifeSkills
	public Stats(){
		statList[0] = new Skill("Swords",1,0);
		statList[1] = new Skill("Armor", 1,0);
		statList[2] = new Skill("Magic", 1, 0);
		statList[3] = new Skill("Alchemy",1,0);
		statList[4] = new Skill("Bows", 1, 0);
		statList[5] = new Skill("Daggers", 1, 0);
		lifeStatList[0] = new LifeSkill("Health",10,0,10);
		lifeStatList[1] = new LifeSkill("Mana",3,0,3);
		lifeStatList[2] = new LifeSkill("Stamina",5,0,5);
	}
	
	public Skill getSkill(int skill){
		if (skill>5){
			return lifeStatList[skill%6];
		}
		return statList[skill];
	}
	
	public String getSkillName(int skill){
		if (skill>5){
			return lifeStatList[skill%6].getName();
		}
		
		return statList[skill].getName();
	}
	
	public int getSkillBaseValue(int skill){
		if (skill>5){
			return lifeStatList[skill%6].getBaseValue();
		}
		return statList[skill].getBaseValue();
	}
	
	public int getSkillModifier(int skill){
		if (skill>5){
			return lifeStatList[skill%6].getModifier();
		}
		return statList[skill].getModifier();
	}
	
	public int getSkillCurrentValue(int skill){
		if (skill>5){
			return lifeStatList[skill%6].getCurrentvalue();
		}
		return -1;
	}
	
	public boolean setSkillBaseValue(int skill, int value){
		if (skill>5){
			lifeStatList[skill%6].setBaseValue(value);
		}
		statList[skill].setBaseValue(value);
		return true;
	}
	
	public boolean setSkillModifier(int skill, int value){
		if (skill>5){
			lifeStatList[skill%6].setModifier(value);
		}
		statList[skill].setModifier(value);
		return true;
	}
	
	public boolean setSkillCurrentValue(int skill, int value){
		if (skill>5){
			lifeStatList[skill%6].setCurrentValue(value);
			return true;
		}
		return false;
	}
}
