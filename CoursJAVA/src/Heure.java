
public class Heure {
	private int heure;
	private int minute;
	
	public Heure(int h, int m) {
		setHeure(h);
		setMinute(m);
	}
	public Heure() {
		setHeure((int)java.time.LocalTime.now().getHour());
		setMinute((int)java.time.LocalTime.now().getMinute());
	}
	String HeuretoString(int h, int m) {
		String str = null;
		str = h + ":" + m;
		return str;
	}
	/**
	 * @return the heure
	 */
	public int getHeure() {
		return heure;
	}

	public void avancerMinutes(int min)
	{
		int resteMod = 0;
		int h = 0;
		if (min < 0) 
		{
			min = -min;
			resteMod = min %60;
			h = (min - resteMod)/60;
			h = h %24;
			if ((getHeure()-h)<0) setHeure(getHeure() + 24 - h);
			else setHeure(getHeure() - h);
			if (getMinute() < resteMod)
			{
				setMinute(60 - ( resteMod - getMinute()));
				setHeure(getHeure() -1);
			}else
				setMinute(getMinute() - resteMod);
		}else if (min > 0)
		{
			resteMod = min %60;
			h = (min - resteMod)/60;
			if (resteMod +getMinute()>60 ) h++;
			setMinute( (resteMod + getMinute())%60);
			setHeure((getHeure()+h)%24);
		}
	}
	
	public void setHeuresMinutes(int heure, int minute) {
		setHeure(heure);
		setMinute(minute);
	}
	
	/**
	 * @param heure the heure to set
	 */
	public void setHeure(int heure) {
		if ((heure <24)&&(heure >= 0))
			this.heure = heure;
		else throw new IllegalArgumentException("Heure invalide");
	}

	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute) {
		
		if ((minute <60)&&(minute >= 0))
			this.minute = minute;
		else throw new IllegalArgumentException("Minute invalide");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heure var = new Heure();
		System.out.println(var.HeuretoString(var.getHeure(), var.getMinute()));
		var.avancerMinutes(1000);
		System.out.println(var.HeuretoString(var.getHeure(), var.getMinute()));
	}
	
}
