package abs.model;

public abstract class Thing 
{
	private String info;
	
	public Thing()
	{
		info = "";
	}
	
	public String getInfo()
	{
		return info;
	}
	
	public void setInfo(String set)
	{
		info = set;
	}
}
