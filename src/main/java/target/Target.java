package target;

import enums.Size;
import enums.Visibility;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames=true)
public abstract class Target {
	private Size size = Size.NORMAL;
	private Visibility visibility = Visibility.VISIBLE;
	private boolean isResistingMagic;
}
