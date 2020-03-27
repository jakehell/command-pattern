package command;

import target.Target;

public class ResistMagic extends Command {

	private Target target;
	@Override
	public void execute(Target target) 
	{
		target.setResistingMagic(true);
		this.target = target;
	}

	@Override
	public void undo() {
		if(target != null)
		{
			target.setResistingMagic(false);
		}
	}

	@Override
	public void redo() {
		undo();
	}

	@Override
	public String toString() {
		return "Resist Magic";
	}

}
