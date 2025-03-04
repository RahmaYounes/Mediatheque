package mediatheque;

public abstract class Item {
	private String title;

	protected Item(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public abstract void print();

	/*
	New method for pattern visitor
	 */
	public abstract void accept(ItemVisitor visitor);

	@Override
	public String toString() {
		return "titre : " + title;
	}
}