package tddbc;

import java.util.ArrayList;
import java.util.List;

public class Strawberry {

	/** いちごの品種 */
	public String variety;
	/** いちごのサイズ */
	public String size;

	static List<String> varieties = new ArrayList<String>() {
		{
			add("あまおう");
			add("とちおとめ");
			add("もういっこ");
		}
	};

	/**
	 * いちごを表すクラス.
	 * @param variety いちごの品種
	 * @param size いちごのサイズ
	 */
	public Strawberry(String variety, String size) {
		// 想定外の品種の場合はオブジェクトを生成しない
		if (!varieties.contains(variety))
			throw new IllegalArgumentException("想定外の品種が指定されました: " + variety);
		if ("XL".equals(size))
			throw new IllegalArgumentException("想定外のサイズが指定されました: " + size);
		this.variety = variety;
		this.size = size;
	}

	public String getVarietyAndSize() {
		return variety + ": " + size;
	}
}
