package tddbc;

import java.math.BigDecimal;
import java.util.EnumSet;

public class Strawberry {

	/** 品種を表す列挙型. */
	public enum Varieties {
		AMAOU("あまおう"), TODHIOTOME("とちおとめ"), MOUIKKO("もういっこ");

		String name;

		Varieties(String variety) {
			this.name = variety;
		}

		/**
		 * 引数の文字列がVarietiesに含まれるか検査します.
		 * @param variety 品種
		 * @return 含まれる場合trueを返却.
		 */
		static boolean validateName(String variety) {
			return EnumSet.allOf(Varieties.class).stream()
					.anyMatch(element -> element.name.equals(variety));
		}
	}

	/** サイズを表す列挙型. */
	public enum Sizes {
		S("S"), M("M"), L("L"), LL("LL");

		String name;

		Sizes(String name) {
			this.name = name;
		}

		/**
		 * 引数の文字列がSizesに含まれるか検査します.
		 * @param size サイズ
		 * @return 含まれる場合trueを返却.
		 */
		static boolean validateName(String size) {
			return EnumSet.allOf(Sizes.class).stream()
					.anyMatch(element -> element.name.equals(size));
		}
	}

	/** いちごの品種 */
	private Varieties varietyEnum;
	/** いちごのサイズ */
	private Sizes sizeEnum;
	/** いちごの品種 */
	private String variety;
	/** いちごのサイズ */
	private String size;

	/**
	 * いちごを表すクラス.
	 * @param variety いちごの品種
	 * @param size いちごのサイズ
	 */
	public Strawberry(Varieties variety, String size) {
		// 想定外の品種の場合はオブジェクトを生成しない
		if (!Sizes.validateName(size))
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
		if (!Varieties.validateName(variety))
			throw new IllegalArgumentException("想定外の品種が指定されました: " + variety);
		if (!Sizes.validateName(size))
			throw new IllegalArgumentException("想定外のサイズが指定されました: " + size);
		this.variety = variety;
		this.size = size;
	}

	public Strawberry(String variety, BigDecimal weightInGram) {
		// 想定外の品種の場合はオブジェクトを生成しない
		if (!Varieties.validateName(variety))
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
	 * いちごを表すクラスを品種と重さを指定して生成する.
	 * @param variety いちごの品種の列挙型
	 * @param weightInGram いちごの重さ
	 */
	public Strawberry(Varieties variety, BigDecimal weightInGram) {
		this.variety = variety.name;
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
