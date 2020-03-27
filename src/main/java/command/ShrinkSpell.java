package command;

import enums.Size;
import target.Target;

public class ShrinkSpell extends Command {

	private Size oldSize;
	private Target target;

	@Override
	public void execute(Target target) {
		if(target.isResistingMagic())
		{
			return;
		}
		
		oldSize = target.getSize();
		target.setSize(Size.SMALL);
		this.target = target;
	}

	@Override
	public void undo() {
		if (oldSize != null && target != null) {
			var temp = target.getSize();
			target.setSize(oldSize);
			oldSize = temp;
		}
	}

	@Override
	public void redo() {
		undo();
	}

	@Override
	public String toString() {
		return "Shrink Spell";
	}
}