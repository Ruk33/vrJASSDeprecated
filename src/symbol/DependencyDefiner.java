package symbol;

import java.util.LinkedList;

/**
 * Some Symbols depend on posible not-yet defined Symbols
 * For example classes that extend, so to mitigate this problem, we simple add 
 * that dependency into a HashMap and when all Symbol were defined, we simple 
 * iterate over the HashMap and define the Symbols
 * 
 * @author Ruke
 */
public class DependencyDefiner {
	
	private class Dependency {
		
		private Symbol symbol;
		private String dependencyName;
		private PrimitiveType dependencyType;
		
		public Dependency(Symbol symbol, String dependencyName, PrimitiveType dependencyType) {
			this.symbol = symbol;
			this.dependencyName = dependencyName;
			this.dependencyType = dependencyType;
		}
		
		public Symbol getSymbol() {
			return this.symbol;
		}
		
		public String getDependencyName() {
			return this.dependencyName;
		}
		
		public PrimitiveType getDependencyType() {
			return this.dependencyType;
		}
		
	}
	
	protected Symbol globalSymbol;
	protected LinkedList<Dependency> dependencies;
	
	public DependencyDefiner(Symbol globalSymbol) {
		this.globalSymbol = globalSymbol;
		this.dependencies = new LinkedList<Dependency>();
	}
	
	public DependencyDefiner add(Symbol symbol, String dependencyName, PrimitiveType dependencyType) {		
		this.dependencies.add(new Dependency(symbol, dependencyName, dependencyType));
		return this;
	}
	
	public DependencyDefiner defineAll() {
		Symbol parent;
		Symbol resolved;
		
		for (Dependency dependency : this.dependencies) {
			parent = dependency.getSymbol().getParent();
			
			if (parent == null) {
				parent = this.globalSymbol;
			}
			
			resolved = parent.resolve(
				dependency.getDependencyName(), 
				dependency.getDependencyType()
			);
			
			dependency.getSymbol().define(resolved);
		}
		
		return this;
	}

}
