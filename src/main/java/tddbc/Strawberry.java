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
		if ("いちご".equals(variety)) throw new IllegalArgumentException("想定外の品種が指定されました: いちご");
		this.variety = variety;
		this.size = size;
	}

	public String getVarietyAndSize() {
		return variety + ": " + size;
	}
}
