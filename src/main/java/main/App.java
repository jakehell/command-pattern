package main;

import command.InvisibilitySpell;
import command.ResistMagic;
import command.ShrinkSpell;
import target.Wizard;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Wizard goodWizard = new Wizard();
    	Wizard badWizard = new Wizard();
    	
    	goodWizard.castSpell(new InvisibilitySpell(), goodWizard);
    	goodWizard.castSpell(new ResistMagic(), goodWizard);
    	badWizard.castSpell(new ShrinkSpell(), goodWizard);
    	
    	goodWizard.castSpell(new ShrinkSpell(), badWizard);
    	
    	System.out.println(goodWizard.toString());
    	System.out.println(badWizard.toString());
    }
}
