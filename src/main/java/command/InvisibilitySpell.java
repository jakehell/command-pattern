package command;

import enums.Visibility;
import target.Target;

public class InvisibilitySpell extends Command {

	private Target target;
	@Override
	public void execute(Target target) {
		if(target.isResistingMagic())
		{
			return;
		}
		
		target.setVisibility(Visibility.INVISIBLE);
		this.target = target;
	}

	@Override
	public void undo() {
		if(target != null)
		{
			target.setVisibility(Visibility.VISIBLE);
		}
	}

	@Override
	public void redo() {
		undo();
	}

	@Override
	public String toString() {
		return "Invisibility Spell";
	}

}
