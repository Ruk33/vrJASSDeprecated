package symbol;

/**
 * Parent of everything
 * 
 * @author Ruke
 */
public class LimboSymbol extends ScopeSymbol {

	protected DependencyDefiner dependencyDefiner;
	
	public LimboSymbol() {
		super(null, null, null, Visibility.PUBLIC, null);
		this.dependencyDefiner = new DependencyDefiner(this);
	}
	
	public DependencyDefiner getDependencyDefiner() {
		return this.dependencyDefiner;
	}

}
