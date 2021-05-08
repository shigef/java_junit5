package tddbc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Strawberry {

	public enum Varieties {
		AMAOU("あまおう"),
		TODHIOTOME("とちおとめ"),
		MOUIKKO("もういっこ");

		String variety;
		Varieties(String variety) {
			this.variety = variety;
		}
	}

	/** いちごの品種 */
	private Varieties varietyEnum;
	/** いちごの品種 */
	private String variety;
	/** いちごのサイズ */
	private String size;

	static List<String> varieties = new ArrayList<String>() {
		{
			add("あまおう");
			add("とちおとめ");
			add("もういっこ");
		}
	};

	static List<String> sizes = new ArrayList<String>() {
		{
			add("S");
			add("M");
			add("L");
			add("LL");
		}
	};

	/**
	 * いちごを表すクラス.
	 * @param variety いちごの品種
	 * @param size いちごのサイズ
	 */
	public Strawberry(Varieties variety, String size) {
		// 想定外の品種の場合はオブジェクトを生成しない
//		if (!varieties.contains(variety))
//			throw new IllegalArgumentException("想定外の品種が指定されました: " + variety);
		if (!sizes.contains(size))
			throw new IllegalArgumentException("想定外のサイズが指定されました: " + size);
		this.varietyEnum = variety;
		this.size = size;
	}

	/**
	 * いちごを表すクラス.
	 * @param variety いちごの品種
	 * @param size いちごのサイズ
	 */
	public Strawberry(String variety, String size) {
		// 想定外の品種の場合はオブジェクトを生成しない
		if (!varieties.contains(variety))
			throw new IllegalArgumentException("想定外の品種が指定されました: " + variety);
		if (!sizes.contains(size))
			throw new IllegalArgumentException("想定外のサイズが指定されました: " + size);
		this.variety = variety;
		this.size = size;
	}

	public Strawberry(String variety, BigDecimal weightInGram) {
		// 想定外の品種の場合はオブジェクトを生成しない
		if (!varieties.contains(variety))
			throw new IllegalArgumentException("想定外の品種が指定されました: " + variety);
		this.variety = variety;
		if (new BigDecimal(10).compareTo(weightInGram) > 0)
			this.size = "S";
		else if (new BigDecimal(20).compareTo(weightInGram) > 0)
			this.size = "M";
		else if (new BigDecimal(25).compareTo(weightInGram) > 0)
			this.size = "L";
		else
			this.size = "LL";
	}

	public String getVarietyAndSize() {
		return variety + ": " + size;
	}

	public String getVariety() {
		return varietyEnum.variety;
	}

	public String getSize() {
		return size;
	}
}
