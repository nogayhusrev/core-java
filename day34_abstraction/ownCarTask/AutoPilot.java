package day34_abstraction.ownCarTask;

public interface AutoPilot extends AutoPark{
    boolean hasAutoPilot = true;
    void selfDrive();
}
/*
3. Create a child interface of AutoPark named AutoPilot
					hint: interface can inherit from another interface by using extend keyword
			Variables:
				hasAutoPilot
			Abstract method:
				selfDrive();
 */