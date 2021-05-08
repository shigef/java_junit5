package tddbc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Strawberry {

	public enum Varieties {
		AMAOU("あまおう"),
		TODHIOTOME("とちおとめ"),
		MOUIKKO("もういっこ");

		String name;
		Varieties(String variety) {
			this.name = variety;
		}
	}

	/** いちごの品種 */
	private Varieties varietyEnum;
	/** いちごの品種 */
	private String variety;
	/** いちごのサイズ */
	private String size;

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
		if (!EnumSet.allOf(Varieties.class).stream()
				.anyMatch(element -> element.name.equals(variety)))
			throw new IllegalArgumentException("想定外の品種が指定されました: " + variety);
		if (!sizes.contains(size))
			throw new IllegalArgumentException("想定外のサイズが指定されました: " + size);
		this.variety = variety;
		this.size = size;
	}

	public Strawberry(String variety, BigDecimal weightInGram) {
		// 想定外の品種の場合はオブジェクトを生成しない
		if (!EnumSet.allOf(Varieties.class).stream()
				.anyMatch(element -> element.name.equals(variety)))
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

	/**
	 * イチゴの文字列表現(品種: サイズ)を取得します.
	 * @return イチゴの文字列表現
	 */
	public String getVarietyAndSize() {
		return varietyEnum.name + ": " + size;
	}

	/**
	 * 品種を取得します.
	 * @return 品種
	 */
	public String getVariety() {
		return varietyEnum.name;
	}

	/**
	 * サイズを取得します.
	 * @return サイズ
	 */
	public String getSize() {
		return size;
	}
}
