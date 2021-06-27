package tddbc;

import java.math.BigDecimal;

public class Strawberry {

	/** 品種を表す列挙型. */
	public enum Varieties {
		AMAOU("あまおう"), TODHIOTOME("とちおとめ"), MOUIKKO("もういっこ");

		String name;

		Varieties(String variety) {
			this.name = variety;
		}

	}

	/** サイズを表す列挙型. */
	public enum Sizes {
		S("S"), M("M"), L("L"), LL("LL");

		String name;

		Sizes(String name) {
			this.name = name;
		}

	}

	/** いちごの品種 */
	private Varieties variety;
	/** いちごのサイズ */
	private Sizes size;

	/**
	 * いちごを表すクラス.
	 * @param variety いちごの品種
	 * @param size いちごのサイズ
	 */
	public Strawberry(Varieties variety, Sizes size) {
		this.variety = variety;
		this.size = size;
	}

	/**
	 * いちごを表すクラスを品種と重さを指定して生成する.
	 * @param variety いちごの品種の列挙型
	 * @param weightInGram いちごの重さ
	 */
	public Strawberry(Varieties variety, BigDecimal weightInGram) {
		this.variety = variety;
		if (new BigDecimal(10).compareTo(weightInGram) > 0) {
			this.size = Sizes.S;
		} else if (new BigDecimal(20).compareTo(weightInGram) > 0) {
			this.size = Sizes.M;
		} else if (new BigDecimal(25).compareTo(weightInGram) > 0) {
			this.size = Sizes.L;
		} else {
			this.size = Sizes.LL;
		}
	}

	/**
	 * イチゴの文字列表現(品種: サイズ)を取得します.
	 * @return イチゴの文字列表現
	 */
	public String getVarietyAndSize() {
		return variety.name + ": " + size.name;
	}

	/**
	 * 品種を取得します.
	 * @return 品種(enum)
	 */
	public Varieties getVariety() {
		return variety;
	}

	/**
	 * サイズを取得します.
	 * @return サイズ
	 */
	public Sizes getSize() {
		return size;
	}
}
