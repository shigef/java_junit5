package tddbc;

public class Strawberry {

	/** いちごの品種 */
	public String variety;
	/** いちごのサイズ */
	public String size;

	/**
	 * いちごを表すクラス.
	 * @param variety いちごの品種
	 * @param size いちごのサイズ
	 */
	public Strawberry(String variety, String size) {
		this.variety = variety;
		this.size = size;
	}

	public String toString() {
		return variety + ": " + size;
	}
}
