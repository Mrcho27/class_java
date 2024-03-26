package accessModifier;

public class ClassA {
	public int var1;
	int var2;
	protected int var3;
	private int var4;
	
	public ClassA() {}
	
	public ClassA(int var4) {
		this.var4 = var4;
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}

	public int getVar3() {
		return var3;
	}

	public void setVar3(int var3) {
		this.var3 = var3;
	}

	public int getVar4() {
		return var4;
	}

	public void setVar4(int var4) {
		this.var4 = var4;
	}
	
	
	
	
}
