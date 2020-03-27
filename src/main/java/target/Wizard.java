package target;

import command.Command;

public class Wizard extends Target {
	public void castSpell(Command command, Target target)
	{
		command.execute(target);
	}
}
